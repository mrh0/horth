package com.mrh0.horth.output.instructions.high.stackops.operands;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HPutChar extends HighInst {
    private static IContract contract = (s, t) -> s.push(AllTypes.CHAR, t);
    public final char value;

    public HPutChar(char value, ITok token) {
        super(token);
        this.value = value;
    }

    @Override
    public IContract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return "HPutChar("+value+")";
    }
}
