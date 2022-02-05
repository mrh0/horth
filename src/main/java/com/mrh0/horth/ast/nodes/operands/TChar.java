package com.mrh0.horth.ast.nodes.operands;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.stackops.operands.HPutChar;

import java.util.List;

public class TChar extends Tok {
    public final char value;

    public TChar(char value) {
        this.value = value;
    }

    public TChar(String text) {
        this.value = parse(text);
    }

    private char parse(String text) {
        switch(text) {
            default:
                return text.charAt(1);
        }
    }

    @Override
    public void expand(List<HighInst> space) {
        space.add(new HPutChar(value, this));
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(value);
        return sb;
    }
}
