package com.mrh0.horth.instructions.high.stackops.operands;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HPutString extends HighInst {
    private static IContract contract = (s, t) -> s.push(AllTypes.STRING, t);
    public final String str;
    public final int len;

    public HPutString(ITok token, String str, int len) {
        super(token);
        this.str = str;
        this.len = len;
    }

    @Override
    public IContract getContract() {
        return contract;
    }
}
