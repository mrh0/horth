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
            inst.getContract().apply(stack, inst.token);
        }
    }

    public void end() throws BreachOfContractException {
        if(stack.size() > 0)
            throw new BreachOfContractException();
    }
}
