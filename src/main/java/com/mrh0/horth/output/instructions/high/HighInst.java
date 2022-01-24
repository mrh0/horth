package com.mrh0.horth.output.instructions.high;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.typechecker.IContract;

public abstract class HighInst {
    public final ITok token;
    public static long nextId = 0;
    public final long id = nextId++;

    public HighInst(ITok token) {
        this.token = token;
    }

    public abstract IContract getContract();
}
