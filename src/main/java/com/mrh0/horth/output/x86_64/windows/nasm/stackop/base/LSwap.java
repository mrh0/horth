package com.mrh0.horth.output.x86_64.windows.nasm.stackop.base;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LSwap implements LowInst {
    public static final LSwap INSTANCE = new LSwap();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("xchg").reg(S1).reg(S2);
    }
}
