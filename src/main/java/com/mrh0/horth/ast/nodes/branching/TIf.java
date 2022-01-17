package com.mrh0.horth.ast.nodes.branching;

import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.List;

public class TIf extends Tok {

    private List<TBlock> conditions;
    private List<TBlock> doBlocks;
    private TBlock elseBlock;

    public TIf(List<TBlock> conditions, List<TBlock> doBlocks, TBlock elseBlock) {
        this.conditions  = conditions;
        this.doBlocks = doBlocks;
        this.elseBlock = elseBlock;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {

    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("if(");
        sb.append(")");
        return sb;
    }
}
