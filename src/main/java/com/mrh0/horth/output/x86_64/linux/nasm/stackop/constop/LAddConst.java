package com.mrh0.horth.output.x86_64.linux.nasm.stackop.constop;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;
import com.mrh0.horth.output.x86_64.linux.nasm.stackop.binop.LAdd;

public class LAddConst implements LowInst {
    private final int value;

    public LAddConst(int value) {
        this.value = value;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("add").reg(S1).imm(value);
    }
}
