package com.mrh0.horth.output.x86_64.linux.nasm.io;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LLog implements LowInst {
    public static final LLog INSTANCE = new LLog();

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("mov").reg("rdi").imm(1)
                .inst("mov").reg("rsi").reg(S1)
                .inst("add").reg("rsi").imm(8)
                .inst("mov").reg("rdx").vreg(S1, 0)
                .inst("mov").reg("rax").imm(1)
                .inst("syscall")
                .inst("mov").reg(S1).reg(S2)
                .inst("pop").reg(S2);
    }
}
