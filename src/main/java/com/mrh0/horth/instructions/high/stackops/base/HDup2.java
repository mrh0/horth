package com.mrh0.horth.instructions.high.stackops.base;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;

public class HDup2 extends HighInst {
    private static IContract contract = (s, t) -> {
        var a = s.pop(t);
        var b = s.pop(t);
        s.push(b);
        s.push(a);
        s.push(b.type(), t);
        s.push(a.type(), t);
    };

    public HDup2(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return "HDup2";
    }
}