package com.mrh0.horth.instructions.high.branching;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighLabel;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;

public class HJump extends HighInst {
    public final HighLabel label;

    public HJump(ITok token, HighLabel label) {
        super(token);
        this.label = label;
    }

    public HJump(HighLabel label) {
        super(null);
        this.label = label;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }
}
