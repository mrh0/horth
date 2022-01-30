package com.mrh0.horth.output.x86_64.windows.nasm.stackop.binop;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LSub implements LowInst {
    public static final LSub INSTANCE = new LSub();

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("xchg").reg(S1).reg(S2)
                .inst("sub").reg(S1).reg(S2)
                .inst("pop").reg(S2);
    }
}
