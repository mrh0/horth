package com.mrh0.horth.instructions.high.stackops.binop.logical;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HOr extends HighInst {
    private static Contract contract = new Contract.Builder().pop(AllTypes.BOOL, AllTypes.BOOL).push(AllTypes.BOOL).build();

    public HOr(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}
