package com.mrh0.horth.output.x86_64.linux.nasm.stackop.base;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;

public class LDrop implements LowInst {
    public static final LDrop INSTANCE = new LDrop();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("mov").reg(S1).reg(S2)
                .inst("pop").reg(S2);
    }
}
