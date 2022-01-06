package com.mrh0.horth.output.instructions.other;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.instructions.HighInst;

public class Label extends HighInst {
    private final int i;

    public Label(int i) {
        this.i = i;
    }

    @Override
    public void asm(StringBuilder sb, CompileData cd) {
        sb.append("_");
        sb.append(i);
        sb.append(":\n");
    }
}
