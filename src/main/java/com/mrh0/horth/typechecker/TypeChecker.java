package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.exceptions.typechecker.TypeCheckerException;
import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.types.AllTypes;

import java.util.List;

public class TypeChecker {

    public static void check(VirtualStack stack, CompileData cd, List<HighInst> list) throws HorthException {
        for(HighInst inst : list) {
            if(inst instanceof ISpecialCheck)
                ((ISpecialCheck)inst).check(stack, cd);
            else
                inst.getContract().apply(stack, inst.token);
        }
    }

    public static void end(VirtualStack stack, Loc location) throws BreachOfContractException {
        if(stack.size() > 0)
            throw new BreachOfContractException(location, AllTypes.VOID, stack.peek(location).type());
    }
}
