package com.mrh0.horth.output.x86_64.linux.nasm.stackop.base;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;

public class LOver implements LowInst {
    public static final LOver INSTANCE = new LOver();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("xchg").reg(S1).reg(S2)
                .inst("push").reg(S1);
    }
}
