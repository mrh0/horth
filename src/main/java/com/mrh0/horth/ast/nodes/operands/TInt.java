package com.mrh0.horth.ast.nodes.operands;

import com.mrh0.horth.ast.nodes.Tok;

public class TInt extends Tok {
    public final int value;

    public TInt(int value) {
        this.value = value;
    }

    public TInt(String text) {
        this(Integer.parseInt(text));
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(value);
        return sb;
    }
}
