package com.mrh0.horth.output.x86_64.linux.nasm.stackop.put;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.instructions.high.stackops.operands.HPutBool;
import com.mrh0.horth.output.instructions.high.stackops.operands.HPutChar;
import com.mrh0.horth.output.instructions.high.stackops.operands.HPutInt;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;

public class LPutInt implements LowInst {
    public final int value;

    public LPutInt(int value) {
        this.value = value;
    }

    public LPutInt(HPutInt inst) {
        this.value = inst.value;
    }

    public LPutInt(HPutBool inst) {
        this.value = inst.value ? 1 : 0;
    }

    public LPutInt(HPutChar inst) {
        this.value = inst.value;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("push").reg(S2)
                .inst("mov").reg(S2).reg(S1)
                .inst("mov").reg(S1).imm(value);
    }
}
