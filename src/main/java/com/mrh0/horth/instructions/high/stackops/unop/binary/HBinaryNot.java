package com.mrh0.horth.instructions.high.stackops.unop.binary;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HBinaryNot extends HighInst {
    private static Contract contract = new Contract.Builder().pop(AllTypes.INT).push(AllTypes.INT).build();

    public HBinaryNot(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}
