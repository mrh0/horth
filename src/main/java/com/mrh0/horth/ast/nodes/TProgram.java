package com.mrh0.horth.ast.nodes;

import java.util.List;

public class TProgram extends Tok {
    public final List<ITok> includes;
    public final ITok main;

    public TProgram(List<ITok> includes, ITok main) {
        this.includes = includes;
        this.main = main;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Program(");
        if(main != null)
            main.toString(sb);
        sb.append(")");
        return sb;
    }
}
