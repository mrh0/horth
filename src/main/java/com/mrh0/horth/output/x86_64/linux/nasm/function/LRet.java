package com.mrh0.horth.output.x86_64.linux.nasm.function;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LRet implements LowInst {
    private final int bytes;

    public LRet(int bytes) {
        this.bytes = bytes;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .comment("FUNC_RET")
                .inst("sub").reg(LSP).imm(bytes)
                .inst("sub").reg(LSP).imm(16)
                .inst("push").qword().vreg(LSP, 0)
                //.inst("mov").reg(T1).vreg(LSP, 8)
                //.inst("mov").vreg(DSP, 0).reg(T1)
                .inst("ret");

        //Alternative, sub 8 + offset for all lets in func and then add 8 offset to vreg
    }
}
