package com.mrh0.horth.output.x86_64.linux.nasm.other;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.output.instructions.high.branching.HBreak;
import com.mrh0.horth.output.instructions.high.branching.HJump;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LJump implements LowInst {
    private final long labelId;

    public LJump(HJump in) throws CompileException {
        labelId = in.label.id;
    }

    public LJump(HBreak in) throws CompileException {
        if(in.label == null)
            throw new CompileException(in.token.getLocation(), "Break keyword is outside of a loop.");
        labelId = in.label.id;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.inst("jmp").jlabel(labelId);
    }
}
