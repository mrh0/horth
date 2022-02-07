package com.mrh0.horth.instructions.high.function;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.HighLabel;
import com.mrh0.horth.instructions.high.IExpanding;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;

import java.util.List;

public class HBFunc extends HighInst implements ISpecialCheck, IExpanding {
    private final Func func;

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
        func.validate(stack, cd);
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        var label = new HighLabel();
        space.add(new HFunc(token, func, label));
        space.add(label);
        space.addAll(func.getBody());
        space.add(new HRet(token));
    }
}
