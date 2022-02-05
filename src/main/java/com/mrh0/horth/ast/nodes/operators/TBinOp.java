package com.mrh0.horth.ast.nodes.operators;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.stackops.binop.HAdd;
import com.mrh0.horth.instructions.high.stackops.binop.compare.*;
import com.mrh0.horth.instructions.high.stackops.binop.logical.HAnd;
import com.mrh0.horth.instructions.high.stackops.binop.logical.HOr;
import com.mrh0.horth.instructions.high.stackops.binop.binary.HBinaryAnd;
import com.mrh0.horth.instructions.high.stackops.binop.binary.HBinaryOr;
import com.mrh0.horth.instructions.high.stackops.binop.HSub;

import java.util.List;
import java.util.function.Function;

public class TBinOp extends Tok {
    private static TBinOp ADD = new TBinOp("+", t -> new HAdd(t));
    private static TBinOp SUB = new TBinOp("-", t -> new HSub(t));

    private static TBinOp AND = new TBinOp("and", t -> new HAnd(t));
    private static TBinOp OR = new TBinOp("or", t -> new HOr(t));

    private static TBinOp BINAND = new TBinOp("&", t -> new HBinaryAnd(t));
    private static TBinOp BINOR = new TBinOp("|", t -> new HBinaryOr(t));

    private static TBinOp LT = new TBinOp("<", t -> new HLessThan(t));
    private static TBinOp LTE = new TBinOp("<=", t -> new HLessThanOrEquals(t));
    private static TBinOp GT = new TBinOp(">", t -> new HGreaterThan(t));
    private static TBinOp GTE = new TBinOp(">=", t -> new HGreaterThanOrEquals(t));
    private static TBinOp E = new TBinOp("==", t -> new HEquals(t));
    private static TBinOp NE = new TBinOp("!=", t -> new HNotEquals(t));

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

            case "and":
                return AND;
            case "or":
                return OR;

            case "&":
                return BINAND;
            case "|":
                return BINOR;

            case "<":
                return LT;
            case "<=":
                return LTE;
            case ">":
                return GT;
            case ">=":
                return GTE;
            case "==":
                return E;
            case "!=":
                return NE;
            default:
                return null;
        }
    }
}
