package com.mrh0.horth.instructions.high.stackops.operands;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;

public class HPutVar extends HighInst implements ISpecialCheck {
    private final String name;
    public int offset = 0;

    public HPutVar(ITok token, String name) {
        super(token);
        this.name = name;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        CompileData.LocalEntry le = cd.findNamedLocal(token.getLocation(), this.name);
        stack.push(le.type(), token);
        this.offset = le.offset();
    }
}
