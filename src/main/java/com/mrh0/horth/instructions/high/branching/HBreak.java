package com.mrh0.horth.instructions.high.branching;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.HighLabel;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;

public class HBreak extends HighInst {
    private static IContract contract = Contract.VOID;
    public HighLabel label = null;

    public HBreak(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return "HBreak";
    }
}