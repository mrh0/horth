package com.mrh0.horth.ast.nodes.other;

import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.local.HBLet;
import com.mrh0.horth.instructions.high.local.HLet;

import java.util.ArrayList;
import java.util.List;

public class TLet extends Tok {
    public final List<String> names;
    public final TBlock localBlock;

    public TLet(List<String> names, TBlock localBlock) {
        this.names = names;
        this.localBlock = localBlock;
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
        localBlock.toString(sb);
        sb.append(")");
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        /*var let = new HLet(this);
        space.add(let);
        List<HighInst> lb =  new ArrayList<>();
        localBlock.expand(lb);
        space.addAll(lb);
        space.add(let.getReclaim());*/
        space.add(new HBLet(this));
    }
}
