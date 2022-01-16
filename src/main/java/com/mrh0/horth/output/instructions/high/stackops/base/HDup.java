package com.mrh0.horth.output.instructions.high.stackops.base;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HDup extends HighInst {
    private static Contract contract = new Contract.Builder().pop(AllTypes.INT64).push(AllTypes.INT64, AllTypes.INT64).build();

    public HDup(ITok token) {
        super(token);
    }

    @Override
    public Contract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return "HDup";
    }
}