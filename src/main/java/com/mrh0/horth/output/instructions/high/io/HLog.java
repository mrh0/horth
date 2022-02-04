package com.mrh0.horth.output.instructions.high.io;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HLog extends HighInst {
    private static final IContract contract = (s, t) -> s.casts(t, AllTypes.STRING);

    public HLog(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}
