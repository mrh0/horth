package com.mrh0.horth.instructions.high.stackops.base;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;

public class HOver extends HighInst {
    private static IContract contract = (s, t) -> {
        var a = s.pop(t);
        var b = s.pop(t);
        s.push(a);
        s.push(b);
        s.push(a);
    };

    public HOver(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return "HOver";
    }
}