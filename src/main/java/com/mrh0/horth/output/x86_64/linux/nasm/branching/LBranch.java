package com.mrh0.horth.output.x86_64.linux.nasm.branching;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.branching.HBranch;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LBranch implements LowInst {
    private final HBranch hi;
    public LBranch(HBranch hi) {
        this.hi = hi;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.comment("LBranch").inst("cmp").reg(S1).imm(0)
                .inst("mov").reg(S1).reg(S2)
                .inst("pop").reg(S2)
                .inst("jle").jlabel(hi.label.id);
    }
}
