package com.mrh0.horth.ast.nodes.operators;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.parser.ParserException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.HAdd;

import java.util.List;
import java.util.function.Function;

public class TBinOp extends Tok {
    public static TBinOp ADD = new TBinOp("+", new HAdd());

    private final String op;
    private final HighInst inst;

    public TBinOp(String op, HighInst inst) {
        this.op = op;
        this.inst = inst;
    }

    @Override
    public void expand(List<HighInst> space, CompileData cd) {

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
