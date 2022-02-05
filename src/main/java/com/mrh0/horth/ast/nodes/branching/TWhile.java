package com.mrh0.horth.ast.nodes.branching;

import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.branching.HBWhile;

import java.util.List;

public class TWhile extends Tok {

    public final TBlock condition;
    public final TBlock doBlock;
    public final TBlock elseBlock;

    public TWhile(TBlock condition, TBlock doBlock, TBlock elseBlock) {
        this.condition  = condition;
        this.doBlock = doBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HBWhile(this));
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Branch(");

        sb.append("while(");
        condition.toString(sb);
        sb.append(", ");
        doBlock.toString(sb);
        sb.append(")");

        if(elseBlock != null) {
            sb.append("else(");
            elseBlock.toString(sb);
            sb.append(")");
        }
        sb.append(")");
        return sb;
    }
}
