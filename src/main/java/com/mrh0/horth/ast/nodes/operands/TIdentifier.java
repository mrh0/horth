package com.mrh0.horth.ast.nodes.operands;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.stackops.operands.HPutVar;

import java.util.List;

public class TIdentifier extends Tok {
    public final String name;

    public TIdentifier(String name) {
        this.name = name;
    }

    @Override
    public void expand(List<HighInst> space) {
        space.add(new HPutVar(this, name));
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(name);
        return sb;
    }
}
