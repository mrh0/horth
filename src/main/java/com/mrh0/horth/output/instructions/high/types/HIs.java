package com.mrh0.horth.output.instructions.high.types;

import com.mrh0.horth.ast.nodes.types.TTypeFuncCast;
import com.mrh0.horth.ast.nodes.types.TTypeFuncIs;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

public class HIs extends HighInst implements ISpecialCheck {

    public HIs(TTypeFuncIs token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public String toString() {
        return "HIs";
    }

    @Override
    public void check(VirtualStack stack) throws HorthException {
        var shouldBe = ((TTypeFuncIs)token).type;
        var onStack = stack.pop(token).type();
        if(!IType.equals(onStack, shouldBe, null))
            throw new CompileException(token.getLocation(), "Static type check 'is(" + AllTypes.stringOf(shouldBe) + ")' failed, was of type '" + AllTypes.stringOf(onStack) + "'.");
    }
}
