package com.mrh0.horth.instructions.high.stackops.base;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;

public class HSwap2 extends HighInst {
    private static IContract contract = (s, t) -> {
        var a = s.pop(t);
        var b = s.pop(t);
        var c = s.pop(t);
        var d = s.pop(t);
        s.push(b);
        s.push(a);
        s.push(d);
        s.push(c);
    };

    public HSwap2(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}
