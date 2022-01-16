package com.mrh0.horth.output.x86_64.windows.nasm.stackop.base;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LOver implements LowInst {
    public static final LOver INSTANCE = new LOver();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("xchg").reg(S1).reg(S2)
                .inst("push").reg(S1);
    }
}
