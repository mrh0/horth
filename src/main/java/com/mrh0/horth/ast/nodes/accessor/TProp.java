package com.mrh0.horth.ast.nodes.accessor;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.memory.HProp;

import java.util.List;

public class TProp extends Tok {
    private final String prop;

    public TProp(String prop) {
        this.prop = prop;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(".");
        sb.append(prop);
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HProp(this, prop, false));
    }
}
