package com.mrh0.horth.instructions.high.types;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.CannotConstructException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

public class HNew extends HighInst implements ISpecialCheck {
    public final IType type;

    public HNew(ITok token, IType type) throws HorthException {
        super(token);
        this.type = type;
        IType.validate(this.type, token.getLocation());
    }

    @Override
    public IContract getContract() {
        return type.getConstructorContract();
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        int v = type.constructor(token.getLocation());
        for(int i = 0; i < v; i++)
            stack.check(token, AllTypes.INT);
        stack.push(type, token);
    }
}
