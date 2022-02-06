package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.types.AllTypes;

import java.util.List;

public class TypeChecker {

    public static void check(VirtualTypeStack stack, CompileData cd, List<HighInst> list) throws HorthException {
        for(HighInst inst : list) {
            if(inst instanceof ISpecialCheck)
                ((ISpecialCheck)inst).check(stack, cd);
            else
                inst.getContract().apply(stack, inst.token);
        }
    }

    public static void end(VirtualTypeStack stack, Loc location) throws BreachOfContractException {
        if(stack.size() > 0)
            throw new BreachOfContractException(location, AllTypes.EOF, stack.peek(location).type());
    }
}
