package com.mrh0.horth.ast.nodes.operators;

import com.mrh0.horth.ast.nodes.Tok;

public class TAdd extends Tok {
    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("+");
        return sb;
    }
}
