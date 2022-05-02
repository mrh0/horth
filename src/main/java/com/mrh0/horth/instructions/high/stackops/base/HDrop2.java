package com.mrh0.horth.instructions.high.stackops.base;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;

public class HDrop2 extends HighInst {
    private static IContract contract = (s, t) -> {
        s.pop(t);
        s.pop(t);
    };

    public HDrop2(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return "HDrop";
    }
}