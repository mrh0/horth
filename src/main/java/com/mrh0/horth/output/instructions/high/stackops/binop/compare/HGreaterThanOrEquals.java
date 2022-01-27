package com.mrh0.horth.output.instructions.high.stackops.binop.compare;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HGreaterThanOrEquals extends HighInst {
    private static Contract contract = new Contract.Builder().pop(AllTypes.INT64, AllTypes.INT64).push(AllTypes.BOOL).build();

    public HGreaterThanOrEquals(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}
