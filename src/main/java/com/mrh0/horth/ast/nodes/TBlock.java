package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.List;

public class TBlock extends Tok {
    private List<ITok> list;

    public TBlock(List<ITok> list) {
        this.list = list;
    }

    @Override
    public void expand(List<HighInst> space, CompileData cd) throws HorthException {
        for(ITok t : list)
            t.expand(space, cd);
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
