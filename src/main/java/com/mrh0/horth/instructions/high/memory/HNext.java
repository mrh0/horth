package com.mrh0.horth.instructions.high.memory;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.TypeCheckerException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.BufferType;
import com.mrh0.horth.typechecker.types.IType;

public class HNext extends HighInst implements ISpecialCheck {
    private int size;

    public HNext(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        IType t = stack.peek(token).type();
        if(!t.isPointerType())
            throw new TypeCheckerException(token.getLocation());
        if(t instanceof BufferType)
            this.size = t.getNested().getSize();
        else
            this.size = t.getSize();
    }

    public int getSize() {
        return size;
    }
}
