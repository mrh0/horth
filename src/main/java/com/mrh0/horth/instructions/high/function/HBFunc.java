package com.mrh0.horth.instructions.high.function;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;

public class HBFunc extends HighInst {
    private IContract contract;

    public HBFunc(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}
