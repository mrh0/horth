package com.mrh0.horth.output.x86_64.linux.nasm.memory;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LClone implements LowInst {
    private int bytes;

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("mov").reg(T1).imm(bytes)

                .lowLabel(0)
                .inst("cmp").reg(T1).imm(0)
                .inst("jl").jlowLabel(1)

                .inst("mov").reg(T2).vreg(S2, 0)
                .inst("mov").vreg(S1, 0).reg(T2)

                .inst("add").reg(S1).imm(1)
                .inst("add").reg(S2).imm(1)
                .inst("sub").reg(T1).imm(1)

                .inst("jmp").jlowLabel(0)
                .lowLabel(1)
                .inst("pop").reg(S1)
                .inst("pop").reg(S2)
                .endLowLabel();
        /*ib      .inst("pop").reg(T1)
                .inst("add").reg(T1).reg(S1)

                .lowLabel(0)
                .inst("cmp").reg(S2).reg(T1)
                .inst("jge").jlowLabel(1)

                .inst("mov").reg(T2).vreg(S2, 0)
                .inst("mov").vreg(S1, 0).reg(T2)

                .inst("add").reg(S1).imm(1)
                .inst("add").reg(S2).imm(1)

                .inst("jmp").jlowLabel(0)
                .lowLabel(1)
                .inst("pop").reg(S1)
                .inst("pop").reg(S2)
                .endLowLabel();*/
    }
}
