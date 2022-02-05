package com.mrh0.horth.instructions.high.stackops.binop.compare;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.PrefabContracts;

public class HGreaterThan extends HighInst {
    public HGreaterThan(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return PrefabContracts::compare;
    }
}
