package com.mrh0.horth.output.x86_64.linux.nasm.stackop.base;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LDup2 implements LowInst {
    public static final LDup2 INSTANCE = new LDup2();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("push").reg(S2)
                .inst("push").reg(S1);
    }
}
