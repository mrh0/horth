package com.mrh0.horth.output.instructions.high;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.typechecker.IContract;

public class HighLabel extends HighInst {
    public HighLabel(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return (s, t) -> {};
    }
}
