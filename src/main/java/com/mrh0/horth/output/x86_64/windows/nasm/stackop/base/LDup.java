package com.mrh0.horth.output.x86_64.windows.nasm.stackop.base;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;
import com.mrh0.horth.output.x86_64.windows.nasm.other.LExit;

public class LDup implements LowInst {
    public static final LDup INSTANCE = new LDup();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("push").reg(S2)
                .inst("mov").reg(S2).reg(S1);
    }
}
