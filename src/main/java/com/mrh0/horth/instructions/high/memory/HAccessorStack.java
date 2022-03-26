package com.mrh0.horth.instructions.high.memory;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

public class HAccessorStack extends HighInst implements ISpecialCheck {
    public int size, offset;

    public HAccessorStack(ITok token) {
        super(token);
        offset = 8;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        IType type = stack.pop(token).type();
        stack.check(token, AllTypes.INT);
        if(type == AllTypes.STRING) {
            stack.push(AllTypes.CHAR, token);
            size = AllTypes.CHAR.getSize();
        }
        else
            throw new BreachOfContractException(token.getLocation(), null, type);
    }
}
