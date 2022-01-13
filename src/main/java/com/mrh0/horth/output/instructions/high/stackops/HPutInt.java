package com.mrh0.horth.output.instructions.high.stackops;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HPutInt extends HighInst {
    private static Contract contract = new Contract.Builder().push(AllTypes.INT64).build();
    public final int value;

    public HPutInt(int value, ITok token) {
        super(token);
        this.value = value;
    }

    @Override
    public Contract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return "HPut("+value+")";
    }
}
