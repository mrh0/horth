package com.mrh0.horth.output.x86_64.windows.nasm.other;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.instructions.high.HighLabel;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class Label implements LowInst {
    private final long i;

    public Label(int i) {
        this.i = i;
    }
    public Label(HighLabel label) {
        this.i = label.id;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.label(i);
    }
}
