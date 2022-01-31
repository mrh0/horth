package com.mrh0.horth.ast.nodes.other;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.List;

public class TSeparator extends Tok {
    public static TSeparator INSTANCE = new TSeparator();

    @Override
    public StringBuilder toString(StringBuilder sb) {
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {

    }
}
