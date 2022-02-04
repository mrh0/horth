package com.mrh0.horth.output.instructions.high.accessor;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

public class HAccessor extends HighInst implements ISpecialCheck {
    public int size, offset;

    public HAccessor(ITok token) {
        super(token);
        offset = 8;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        stack.check(token, AllTypes.INT);
        IType type = stack.pop(token).type();
        if(type == AllTypes.STRING) {
            stack.push(AllTypes.CHAR, token);
            size = AllTypes.CHAR.getSize();
        }
        else
            throw new BreachOfContractException(token.getLocation(), null, type);
    }
}
