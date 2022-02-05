package com.mrh0.horth.ast.nodes.function;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;

import java.util.List;

public class TFunc extends Tok {

    public TFunc() {

    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Func(");
        sb.append(")");
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {

    }
}
