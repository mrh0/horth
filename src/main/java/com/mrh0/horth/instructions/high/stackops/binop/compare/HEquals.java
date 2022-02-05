package com.mrh0.horth.instructions.high.stackops.binop.compare;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.PrefabContracts;

public class HEquals extends HighInst {
    public HEquals(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return PrefabContracts::compare;
    }
}
