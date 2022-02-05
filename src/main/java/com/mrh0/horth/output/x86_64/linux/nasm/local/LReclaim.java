package com.mrh0.horth.output.x86_64.linux.nasm.local;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LReclaim implements LowInst {
    private final int size;

    public LReclaim(int size) {
        this.size = size;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.inst("sub").reg(LSP).imm(size*8);
    }
}
