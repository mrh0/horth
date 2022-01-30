package com.mrh0.horth.ast.nodes.other;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.ast.nodes.types.TType;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.List;

public class TLet extends Tok {
    private final List<String> names;
    private final TBlock block;

    public TLet(List<String> names, TBlock block) {
        this.names = names;
        this.block = block;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Let(");
        sb.append("[");
        for(String name : names) {
            sb.append(name);
            sb.append(", ");
        }
        sb.append("]");
        sb.append(", ");
        block.toString(sb);
        sb.append(")");
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {

    }
}
