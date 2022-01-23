package com.mrh0.horth.typechecker;

import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.exceptions.typechecker.TypeCheckerException;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.List;

public class TypeChecker {

    public static void check(VirtualStack stack, List<HighInst> list) throws HorthException {
        for(HighInst inst : list) {
            if(inst instanceof ISpecialCheck)
                ((ISpecialCheck)inst).check(stack);
            else
                inst.getContract().apply(stack, inst.token);
        }
    }

    public static void end(VirtualStack stack) throws BreachOfContractException {
        if(stack.size() > 0)
            throw new BreachOfContractException(null);
    }
}
