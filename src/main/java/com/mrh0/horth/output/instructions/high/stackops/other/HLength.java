package com.mrh0.horth.output.instructions.high.stackops.other;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

public class HLength extends HighInst implements ISpecialCheck {
    public HLength(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualStack stack, CompileData cd) throws HorthException {
        //TODO: Check: instanceof array
        if(stack.peek(token).type() != AllTypes.STRING)
            throw new BreachOfContractException(token.getLocation(), AllTypes.STRING, stack.peek(token).type());
        stack.push(AllTypes.INT, token);
    }
}
