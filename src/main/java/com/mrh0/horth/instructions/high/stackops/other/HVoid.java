package com.mrh0.horth.instructions.high.stackops.other;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HVoid extends HighInst {
    public static final IContract contract = new Contract.Builder().push(AllTypes.VOID).build();

    public HVoid(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}
