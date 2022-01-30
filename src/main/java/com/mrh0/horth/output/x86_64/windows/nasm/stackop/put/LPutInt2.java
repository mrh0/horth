package com.mrh0.horth.output.x86_64.windows.nasm.stackop.put;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LPutInt2 implements LowInst {
    private int value1, value2;
    public LPutInt2(LPutInt in1, LPutInt in2) {
        value1 = in1.value;
        value2 = in2.value;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("push").reg(S2)
                .inst("push").reg(S1)
                .inst("mov").reg(S2).imm(value1)
                .inst("mov").reg(S1).imm(value2);
    }
}
