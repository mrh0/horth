package com.mrh0.horth.ast.nodes.operands;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.stackops.operands.HPutInt;

import java.util.List;

public class TInt extends Tok {
    public final int value;

    public TInt(int value) {
        this.value = value;
    }

    public TInt(String text, int base) {
        this(Integer.parseInt(text, base));
    }

    @Override
    public void expand(List<HighInst> space) {
        space.add(new HPutInt(value, this));
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(value);
        return sb;
    }
}
