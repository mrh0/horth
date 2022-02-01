package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.List;

public class TSpread extends Tok {
    ITok[] tokens;

    public TSpread(ITok...tokens) {
        this.tokens = tokens;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        for(ITok tok : tokens) {
            tok.toString(sb);
            sb.append(",");
        }
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        for(ITok tok : tokens)
            tok.expand(space);
    }
}
