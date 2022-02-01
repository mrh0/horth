package com.mrh0.horth.output.x86_64.windows.nasm.accessor;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LAccessorLength implements LowInst {
    public final static LAccessorLength INSTANCE = new LAccessorLength();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.inst("mov").reg(S1).vreg(S1, 0);
        ib.inst("and").reg(S1).imm(0xFFFF);
    }
}
