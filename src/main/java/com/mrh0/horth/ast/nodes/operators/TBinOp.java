package com.mrh0.horth.ast.nodes.operators;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.parser.ParserException;

public class TBinOp extends Tok {
    public static TBinOp ADD = new TBinOp("+");

    private final String op;

    public TBinOp(String op) {
        this.op = op;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(op);
        return sb;
    }

    public static TBinOp getBinOp(String op) /*throws ParserException*/ {
        switch(op) {
            case "+":
                return ADD;
            default:
                return null;
        }
    }
}
