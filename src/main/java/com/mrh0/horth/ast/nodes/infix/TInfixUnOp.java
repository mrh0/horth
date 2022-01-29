package com.mrh0.horth.ast.nodes.infix;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.List;

public class TInfixUnOp extends Tok {
    private final ITok infix, binOp;

    public TInfixUnOp(ITok infix, ITok binOp) {
        this.infix = infix;
        this.binOp = binOp;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        infix.expand(space);
        binOp.expand(space);
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Infix(");
        binOp.toString(sb);
        sb.append(" ");
        infix.toString(sb);
        sb.append(")");
        return sb;
    }
}
