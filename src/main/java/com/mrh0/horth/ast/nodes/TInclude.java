package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.List;

public class TInclude extends Tok{
    @Override
    public void expand(List<HighInst> space, CompileData cd) {

    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        return sb;
    }
}
