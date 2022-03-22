package com.mrh0.horth.instructions.high.accessor;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.BufferType;
import com.mrh0.horth.typechecker.types.IType;

public class HWrite extends HighInst implements ISpecialCheck {
    private int size;

    public HWrite(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        IType t = stack.pop(token).type();
        this.size = t.getSize();
        if(this.size > 8)
            throw new CompileException(token.getLocation(), "Cannot write type " + AllTypes.stringOf(t) + " as it is larger than 8 bytes.");
        stack.check(token, new BufferType(t));
    }
}
