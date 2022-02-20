package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.exceptions.typechecker.BreachOfOverloadContractException;
import com.mrh0.horth.exceptions.typechecker.TypeCheckerException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

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

    public static void validOverload(Loc location, List<Func> existing, Func func) throws TypeCheckerException {
        if(existing.size() == 0)
            return;

        var ec = existing.get(0).getContract();
        var fc = func.getContract();
        if(ec.getPopList().length != fc.getPopList().length)
            throw new BreachOfOverloadContractException(location, ec, fc, BreachOfOverloadContractException.Type.ARG_NUM);

        if(ec.getPushList().length != func.getContract().getPushList().length)
            throw new BreachOfOverloadContractException(location, ec, fc, BreachOfOverloadContractException.Type.ARG_NUM);

        for(int i = 0; i < ec.getPushList().length; i++) {
            if(!IType.equals(ec.getPushList()[i], fc.getPushList()[i])) {
                throw new BreachOfOverloadContractException(location, ec, fc, BreachOfOverloadContractException.Type.PUSH_TYPES);
            }
        }
    }
}
