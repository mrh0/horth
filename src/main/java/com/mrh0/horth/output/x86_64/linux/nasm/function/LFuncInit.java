package com.mrh0.horth.output.x86_64.linux.nasm.function;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LFuncInit implements LowInst {
    private final int bytes;

    public LFuncInit(int bytes) {
        this.bytes = bytes + 16;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("pop").qword().vreg(LSP, 0)
                .inst("mov").reg(T1).vreg(DSP, 0)
                .inst("mov").vreg(LSP, 8).reg(T1)
                .inst("add").reg(LSP).imm(this.bytes);
    }
}
