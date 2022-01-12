package com.mrh0.horth.output.x86_64.windows.nasm.other;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class Label implements LowInst {
    private final int i;

    public Label(int i) {
        this.i = i;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.label("_"+i);
    }
}
