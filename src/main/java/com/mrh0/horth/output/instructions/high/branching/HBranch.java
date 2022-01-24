package com.mrh0.horth.output.instructions.high.branching;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;

public class HBranch extends HighInst {
    public final HighInst falsePath;

    public HBranch(ITok token, HighInst falsePath) {
        super(token);
        this.falsePath = falsePath;
    }

    @Override
    public IContract getContract() {
        return new Contract.Builder().pop().build();
    }
}
