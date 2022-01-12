package com.mrh0.horth.ast.nodes.operands;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.HPutInt;

import java.util.List;

public class TInt extends Tok {
    public final int value;

    public TInt(int value) {
        this.value = value;
    }

    public TInt(String text) {
        this(Integer.parseInt(text));
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
