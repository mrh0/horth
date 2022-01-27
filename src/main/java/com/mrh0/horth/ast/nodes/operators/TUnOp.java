package com.mrh0.horth.ast.nodes.operators;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.unop.HNot;

import java.util.List;
import java.util.function.Function;

public class TUnOp extends Tok {
    private static TUnOp NOT = new TUnOp("not", t -> new HNot(t));

    private final String op;
    private final Function<ITok, HighInst> highInst;

    public TUnOp(String op, Function<ITok, HighInst> highInst) {
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

    public static TUnOp getUnOp(String op) {
        switch(op) {
            case "not":
                return NOT;
            default:
                return null;
        }
    }
}
