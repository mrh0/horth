package com.mrh0.horth.output.instructions.high.types;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.types.TTypeFuncCast;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualStack;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HCast extends HighInst implements ISpecialCheck {

    public HCast(TTypeFuncCast token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public String toString() {
        return "HCast";
    }

    @Override
    public void check(VirtualStack stack) throws HorthException {
        var to = ((TTypeFuncCast)token).type;
        stack.pop(token).type().cast(token.getLocation(), to);
        stack.push(to, token);
    }
}
