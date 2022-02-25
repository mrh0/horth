package com.mrh0.horth.instructions.high.types;

import com.mrh0.horth.ast.nodes.types.TType;
import com.mrh0.horth.ast.nodes.types.TTypeFuncIs;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

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
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        List<TType> types = ((TTypeFuncIs)token).types;
        for(int i = 0; i < types.size(); i++) {
            var shouldBe = types.get(types.size()-i-1).type;
            var onStack = stack.stack.get(stack.size()-i-1).type();
            System.out.println(i + " Is: " + AllTypes.stringOf(onStack) + " ShouldBe: " + AllTypes.stringOf(shouldBe));
            System.out.println(onStack == shouldBe);
            if(!IType.equals(onStack, shouldBe))
                throw new CompileException(token.getLocation(),
                        "Static type check 'is(" + AllTypes.stringOf(shouldBe) + ")' failed, was of type '"
                                + AllTypes.stringOf(onStack) + "'.");
        }

    }
}
