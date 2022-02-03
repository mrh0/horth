package com.mrh0.horth.output.x86_64.linux.nasm.accessor;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LAccessorLength implements LowInst {
    public final static LAccessorLength INSTANCE = new LAccessorLength();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.inst("xor").reg(T1).reg(T1);
        ib.inst("mov").reg(T1).vreg(S1, 0);
        ib.inst("mov").reg(S1).reg(T1);
    }
}
