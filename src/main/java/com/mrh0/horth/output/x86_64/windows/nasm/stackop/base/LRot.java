package com.mrh0.horth.output.x86_64.windows.nasm.stackop.base;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LRot implements LowInst {
    public static final LRot INSTANCE = new LRot();
    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("xchg").reg(S1).vreg("rsp", 0);
    }
}
