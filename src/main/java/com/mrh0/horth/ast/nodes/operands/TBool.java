package com.mrh0.horth.ast.nodes.operands;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.stackops.operands.HPutBool;

import java.util.List;

public class TBool extends Tok {
    public final boolean value;

    private TBool(boolean value) {
        this.value = value;
    }

    public static TBool get(String text) {
        switch(text) {
            case "true":
                return new TBool(true);
            case "false":
                return new TBool(false);
            default:
                System.err.println("Should Never Get Here: '" + text + "'");
                return null;
        }
    }

    @Override
    public void expand(List<HighInst> space) {
        space.add(new HPutBool(value, this));
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(value);
        return sb;
    }
}
