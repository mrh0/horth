package com.mrh0.horth.output.instructions.high.types;

import com.mrh0.horth.ast.nodes.types.TTypeFuncCast;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualStack;

public class HCastUnsafe extends HighInst implements ISpecialCheck {

    public HCastUnsafe(TTypeFuncCast token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public String toString() {
        return "HCastUnsafe";
    }

    @Override
    public void check(VirtualStack stack, CompileData cd) throws HorthException {
        var to = ((TTypeFuncCast)token).type;
        stack.pop(token);
        stack.push(to, token);
    }
}
