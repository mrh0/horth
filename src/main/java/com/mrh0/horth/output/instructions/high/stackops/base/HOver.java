package com.mrh0.horth.output.instructions.high.stackops.base;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HOver extends HighInst {
    private static IContract contract = (s, t) -> {
        var a = s.pop();
        var b = s.pop();
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