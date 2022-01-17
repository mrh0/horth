package com.mrh0.horth.output.instructions.high.stackops.base;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;

public class HSwap extends HighInst {
    private static IContract contract = (s, t) -> {
        var a = s.pop();
        var b = s.pop();
        s.push(a);
        s.push(b);
    };

    public HSwap(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}
