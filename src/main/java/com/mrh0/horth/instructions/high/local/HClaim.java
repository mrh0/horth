package com.mrh0.horth.instructions.high.local;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;

public class HClaim extends HighInst {
    public final int bytes;

    public HClaim(ITok token, int bytes) {
        super(token);
        this.bytes = bytes;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public String toString() {
        return "HClaim(" + bytes + ')';
    }
}
