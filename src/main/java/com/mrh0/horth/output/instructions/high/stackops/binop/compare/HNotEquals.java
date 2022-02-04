package com.mrh0.horth.output.instructions.high.stackops.binop.compare;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.PrefabContracts;

public class HNotEquals extends HighInst {
    public HNotEquals(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return PrefabContracts::compare;
    }
}