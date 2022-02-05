package com.mrh0.horth.ast.nodes.infix;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;

import java.util.List;

public class TInfixBinOp extends Tok {
    private final ITok infix1, infix2, binOp;

    public TInfixBinOp(ITok infix1, ITok infix2, ITok binOp) {
        this.infix1 = infix1;
        this.infix2 = infix2;
        this.binOp = binOp;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        infix1.expand(space);
        infix2.expand(space);
        binOp.expand(space);
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Infix(");
        infix1.toString(sb);
        sb.append(" ");
        binOp.toString(sb);
        sb.append(" ");
        infix2.toString(sb);
        sb.append(")");
        return sb;
    }
}
