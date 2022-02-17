package com.mrh0.horth.output.x86_64.linux.nasm.function;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LFuncInit implements LowInst {
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("add").reg(LSP).imm(8)
                .inst("pop").reg(LowInst.LSP);
    }
}
