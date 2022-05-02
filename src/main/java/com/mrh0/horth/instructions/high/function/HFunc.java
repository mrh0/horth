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
    public final int localBytes;

    public HFunc(ITok token, Func func, int localBytes, HighLabel label) {
        super(token);
        this.label = label;
        this.func = func;
        this.localBytes = localBytes;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }
}
