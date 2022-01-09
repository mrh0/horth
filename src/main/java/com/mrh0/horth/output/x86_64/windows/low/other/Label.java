package com.mrh0.horth.output.x86_64.windows.low.other;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.x86_64.windows.low.LowInst;

public class Label implements LowInst {
    private final int i;

    public Label(int i) {
        this.i = i;
    }

    @Override
    public void asm(StringBuilder sb, CompileData cd) {
        sb.append("\n_");
        sb.append(i);
        sb.append(":");
    }
}
