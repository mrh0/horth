package com.mrh0.horth.instructions.high.function;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;

public class HCallFunc extends HighInst {
    public final Func func;

    public HCallFunc(ITok token, Func func) {
        super(token);
        this.func = func;
    }

    @Override
    public IContract getContract() {
        return func.getContract();
    }
}
