package com.mrh0.horth.output.x86_64.linux.nasm.stackop.put;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LPutVar implements LowInst {
    private final int offset;

    public  LPutVar(int offset) {
        this.offset = offset;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("push").reg(S2)
                .inst("mov").reg(S2).reg(S1)
                .inst("mov").reg(S1).vreg(LSP, offset);
    }
}
