package com.mrh0.horth.instructions.high.function;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;

public class HRet extends HighInst {
    public HRet(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }
}
