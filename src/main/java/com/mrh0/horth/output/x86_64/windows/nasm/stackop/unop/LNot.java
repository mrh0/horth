package com.mrh0.horth.output.x86_64.windows.nasm.stackop.unop;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.binop.LAdd;

public class LNot implements LowInst {
    public static final LNot INSTANCE = new LNot();

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("not").reg(S1);
    }
}
