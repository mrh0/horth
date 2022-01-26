package com.mrh0.horth.output.x86_64.windows.nasm.other;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.instructions.high.branching.HJump;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LJump implements LowInst {
    private final long labelId;

    public LJump(HJump in) {
        labelId = in.label.id;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.inst("jmp").ilabel(labelId);
    }
}
