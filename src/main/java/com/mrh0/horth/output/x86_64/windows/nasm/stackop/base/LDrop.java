package com.mrh0.horth.output.x86_64.windows.nasm.stackop.base;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LDrop implements LowInst {
    public static final LDrop INSTANCE = new LDrop();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("mov").reg(S1).reg(S2)
                .inst("pop").reg(S2);
    }
}
