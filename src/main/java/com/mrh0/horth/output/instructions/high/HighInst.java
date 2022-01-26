package com.mrh0.horth.output.instructions.high;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.typechecker.IContract;

public abstract class HighInst {
    public final ITok token;

    public HighInst(ITok token) {
        this.token = token;
    }

    public abstract IContract getContract();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
