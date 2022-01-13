package com.mrh0.horth.output.x86_64.windows.nasm.stackop.put;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.HPutInt;
import com.mrh0.horth.output.x86_64.windows.nasm.BaseLow;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LPutInt implements LowInst {
    public final int value;

    public LPutInt(int value) {
        this.value = value;
    }

    public LPutInt(HPutInt inst) {
        this.value = inst.value;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("push").reg(S2)
                .inst("mov").reg(S2).reg(S1)
                .inst("mov").reg(S1).imm(value);
    }
}
