package com.mrh0.horth.output.x86_64.linux.nasm.stackop.base;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LDrop2 implements LowInst {
    public static final LDrop2 INSTANCE = new LDrop2();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("pop").reg(S1)
                .inst("pop").reg(S2);
    }
}
