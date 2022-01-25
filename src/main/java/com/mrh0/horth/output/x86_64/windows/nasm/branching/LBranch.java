package com.mrh0.horth.output.x86_64.windows.nasm.branching;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.instructions.high.branching.HBranch;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LBranch implements LowInst {
    private final HBranch hi;
    public LBranch(HBranch hi) {
        this.hi = hi;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.inst("cmp").reg(S1).imm(0)
                .inst("mov").reg(S1).reg(S2)
                .inst("pop").reg(S2)
                .inst("jle").ilabel(hi.label.id);
    }
}
