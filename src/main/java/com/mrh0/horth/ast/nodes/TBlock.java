package com.mrh0.horth.ast.nodes;

import java.util.List;

public class TBlock extends Tok {
    private List<ITok> list;

    public TBlock(List<ITok> list) {
        this.list = list;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("{");
        for(ITok tok : list) {
            if(tok != null)
                tok.toString(sb);
            else
                sb.append("NULL");
            sb.append(",");
        }
        sb.append("}");
        return sb;
    }
}
