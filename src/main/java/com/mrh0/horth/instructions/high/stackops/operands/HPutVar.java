package com.mrh0.horth.instructions.high.stackops.operands;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;

public class HPutVar extends HighInst {
    public final String name;
    public final int offset;
    public final boolean isAddr;

    public HPutVar(ITok token, String name, int offset, boolean addr) {
        super(token);
        this.name = name;
        this.offset = offset;
        this.isAddr = addr;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }
}
