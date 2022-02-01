package com.mrh0.horth.output.instructions.high.stackops.operands;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HPutString extends HighInst {
    private static IContract contract = (s, t) -> s.push(AllTypes.STRING, t);
    public final String str;

    public HPutString(ITok token, String str) {
        super(token);
        this.str = str;
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}