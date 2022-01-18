package com.mrh0.horth.typechecker;

import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.List;

public class TypeChecker {
    private VirtualStack stack;

    public TypeChecker() {
        stack = new VirtualStack();
    }

    public void check(List<HighInst> list) throws BreachOfContractException {
        for(HighInst inst : list) {
            if(inst instanceof ISpecialCheck)
                ((ISpecialCheck)inst).check(stack);
            else
                inst.getContract().apply(stack, inst.token);
        }
    }

    public void end() throws BreachOfContractException {
        if(stack.size() > 0)
            throw new BreachOfContractException();
    }
}
