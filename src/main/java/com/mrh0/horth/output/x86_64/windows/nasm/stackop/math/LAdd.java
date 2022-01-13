package com.mrh0.horth.output.x86_64.windows.nasm.stackop.math;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LAdd implements LowInst {
    public static final LAdd INSTANCE = new LAdd();

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("add").reg(S2).reg(S1)
                .inst("pop").reg(S2);
    }
}
