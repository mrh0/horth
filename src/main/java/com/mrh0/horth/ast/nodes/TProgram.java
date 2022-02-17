package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.ast.nodes.function.TFunc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.HighInst;

import java.util.ArrayList;
import java.util.List;

public class TProgram extends Tok {
    public final List<ITok> includes;
    public final List<TFunc> main;

    public TProgram(List<ITok> includes, List<TFunc> main) {
        this.includes = includes;
        this.main = main;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        for(ITok tok : main)
            tok.expand(space);
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Program(");
        for(ITok tok : main)
            tok.toString(sb);
        sb.append(")");
        return sb;
    }
}
