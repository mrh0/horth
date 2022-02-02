package com.mrh0.horth.ast.nodes.accessor;

import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.accessor.HAccessorLength;

import java.util.List;

public class TAccessor extends Tok {

    public final TBlock block;

    public TAccessor(TBlock block) {
        this.block = block;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append('[');
        block.toString(sb);
        sb.append(']');
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        if(block.size() == 0)
            space.add(new HAccessorLength(this));
    }
}
