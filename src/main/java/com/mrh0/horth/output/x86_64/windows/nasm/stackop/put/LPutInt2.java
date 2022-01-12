package com.mrh0.horth.output.x86_64.windows.nasm.stackop.put;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.HPutInt;
import com.mrh0.horth.output.x86_64.windows.nasm.BaseLow;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LPutInt2 implements LowInst {
    private LPutInt inst1, inst2;
    public LPutInt2(LPutInt in1, LPutInt in2) {
        inst1 = in1;
        inst2 = in2;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("push").reg(S2)
                .inst("push").reg(S1)
                .inst("mov").reg(S2).imm(inst1.inst.value)
                .inst("mov").reg(S1).imm(inst2.inst.value);
    }
}
