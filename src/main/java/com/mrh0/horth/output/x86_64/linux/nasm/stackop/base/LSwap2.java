package com.mrh0.horth.output.x86_64.linux.nasm.stackop.base;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LSwap2 implements LowInst {
    public static final LSwap2 INSTANCE = new LSwap2();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("xchg").reg(S1).vreg("rsp", 0)
                .inst("xchg").reg(S1).vreg("rsp", -8);
    }
}
