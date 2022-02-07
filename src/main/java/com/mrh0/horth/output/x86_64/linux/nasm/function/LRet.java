package com.mrh0.horth.output.x86_64.linux.nasm.function;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LRet implements LowInst {
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.inst("ret");
    }
}
