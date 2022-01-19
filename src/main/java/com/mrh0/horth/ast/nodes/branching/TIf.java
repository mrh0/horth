package com.mrh0.horth.ast.nodes.branching;

import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.branching.HBIf;

import java.util.List;

public class TIf extends Tok {

    public final List<TBlock> conditions;
    public final List<TBlock> doBlocks;
    public final TBlock elseBlock;

    public TIf(List<TBlock> conditions, List<TBlock> doBlocks, TBlock elseBlock) {
        this.conditions  = conditions;
        this.doBlocks = doBlocks;
        this.elseBlock = elseBlock;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HBIf(this));
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Branch(");
        for(int i = 0; i < conditions.size(); i++) {
            if(i > 0)
                sb.append("el");
            sb.append("if(");
            conditions.get(0).toString(sb);
            sb.append(", ");
            doBlocks.get(0).toString(sb);
            sb.append(")");
        }
        if(elseBlock != null) {
            sb.append("else(");
            elseBlock.toString(sb);
            sb.append(")");
        }
        sb.append(")");
        return sb;
    }
}
