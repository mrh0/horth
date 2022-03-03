package com.mrh0.horth.instructions.high.function;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.HighLabel;
import com.mrh0.horth.instructions.high.IExpanding;
import com.mrh0.horth.instructions.high.local.HClaim;
import com.mrh0.horth.instructions.high.local.HReclaim;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;

import java.util.List;

public class HBFunc extends HighInst implements ISpecialCheck, IExpanding {
    private final Func func;
    private int localBytes = 0;

    public HBFunc(ITok token, Func func) {
        super(token);
        this.func = func;
    }

    @Override
    public IContract getContract() {
        return func.getContract();
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        cd.createLocalContext();
        if(func.getPrefix() == Func.Prefix.START) {
            if (func.getContract().getPushList().length != 1)
                throw new CompileException(token.getLocation(), "Start function must conform to contract <any... -> byte>.");
            try {
                func.getContract().getPushList()[0].cast(token.getLocation(), AllTypes.BYTE);
            }
            catch(HorthException e) {
                throw new CompileException(token.getLocation(), "Start function must conform to contract <any... -> number>.");
            }
        }
        func.validate(stack, cd);
        localBytes = cd.local().getClaimedBytes();
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        if(func.getPrefix() == Func.Prefix.INLINE)
            return;
        var label = func.label;
        space.add(label);
        space.add(new HFunc(token, func, label));
        space.add(new HClaim(token, localBytes));
        IExpanding.expandAll(func.getBody(), space);

        space.add(new HReclaim(token, localBytes));
        space.add(new HRet(token));
    }
}
