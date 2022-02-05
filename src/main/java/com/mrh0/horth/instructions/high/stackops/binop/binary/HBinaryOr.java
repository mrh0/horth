package com.mrh0.horth.instructions.high.stackops.binop.binary;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HBinaryOr extends HighInst {
    private static Contract contract = new Contract.Builder().pop(AllTypes.INT, AllTypes.INT).push(AllTypes.INT).build();

    public HBinaryOr(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}
