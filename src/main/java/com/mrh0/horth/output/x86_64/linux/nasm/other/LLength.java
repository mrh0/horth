package com.mrh0.horth.output.x86_64.linux.nasm.other;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LLength implements LowInst {
    public final static LLength INSTANCE = new LLength();

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("xor").reg(T1).reg(T1)
                .inst("mov").reg(T1).vreg(S1, 0)
                .inst("push").reg(S2)
                .inst("mov").reg(S2).reg(S1)
                .inst("mov").reg(S1).reg(T1);
    }
}
