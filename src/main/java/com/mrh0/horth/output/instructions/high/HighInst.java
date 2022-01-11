package com.mrh0.horth.output.instructions.high;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.typechecker.Contract;

public abstract class HighInst {
    public final ITok token;

    public HighInst(ITok token) {
        this.token = token;
    }

    public abstract Contract getContract();
}
