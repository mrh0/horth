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
                .inst("push").qword().vreg(LSP, 0)
                .inst("sub").reg(LSP).imm(8)
                .inst("ret");

        //Alternative, sub 8 + offset for all lets in func and then add 8 offset to vreg
    }
}
