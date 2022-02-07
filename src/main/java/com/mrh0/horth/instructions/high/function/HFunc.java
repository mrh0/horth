package com.mrh0.horth.instructions.high.function;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.HighLabel;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;

public class HFunc extends HighInst {
    public final HighLabel label;
    public final Func func;

    public HFunc(ITok token, Func func, HighLabel label) {
        super(token);
        this.label = label;
        this.func = func;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }
}
