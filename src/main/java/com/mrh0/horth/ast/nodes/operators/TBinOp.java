package com.mrh0.horth.ast.nodes.operators;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.binop.HAdd;
import com.mrh0.horth.output.instructions.high.stackops.binop.HSub;

import java.util.List;
import java.util.function.Function;

public class TBinOp extends Tok {
    private static TBinOp ADD = new TBinOp("+", t -> new HAdd(t));
    private static TBinOp SUB = new TBinOp("-", t -> new HSub(t));

    private final String op;
    private final Function<ITok, HighInst> highInst;

    public TBinOp(String op, Function<ITok, HighInst> highInst) {
        this.op = op;
        this.highInst = highInst;
    }

    @Override
    public void expand(List<HighInst> space) {
        space.add(highInst.apply(this));
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
            case "-":
                return SUB;
            default:
                return null;
        }
    }
}
