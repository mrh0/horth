package com.mrh0.horth.output.x86_64.linux.nasm.memory;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LOffset implements LowInst {
    private final int offset;

    public LOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.inst("add").reg(S1).imm(offset);
    }
}
