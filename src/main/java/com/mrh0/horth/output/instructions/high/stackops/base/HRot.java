package com.mrh0.horth.output.instructions.high.stackops.base;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HRot extends HighInst {
    private static IContract contract = (s, t) -> {
        var a = s.pop();
        var b = s.pop();
        var c = s.pop();
        s.push(a);
        s.push(b);
        s.push(c);
    };

    public HRot(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return "HRot";
    }
}