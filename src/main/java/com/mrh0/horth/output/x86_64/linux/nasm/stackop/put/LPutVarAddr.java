package com.mrh0.horth.output.x86_64.linux.nasm.stackop.put;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LPutVarAddr implements LowInst {
    private final int offset;

    public LPutVarAddr(int offset) {
        this.offset = -offset - 8;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("push").reg(S2)
                .inst("mov").reg(S2).reg(S1)
                .inst("mov").reg(S1).reg(LSP)
                .inst("add").reg(S1).imm(offset);
    }
}