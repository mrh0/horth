package com.mrh0.horth.output.x86_64.linux.nasm.other;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LExit implements LowInst {
    public static final LExit INSTANCE = new LExit();

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("mov").reg("rsp").vreg("init_stack", 0)
                .inst("ret");

        //Convert to syscall?
    }
}
