package com.mrh0.horth.output.x86_64.linux.nasm.local;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LClaim implements LowInst {
    private final int count;

    public LClaim(int count) {
        this.count = count;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.inst("add").reg(LSP).imm(count * 8);
        if(count == 0)
            System.err.println("([Claim] This should never happen.");
        if(count == 1) {
            ib      .inst("mov").vreg(LSP, 0).reg(S1)
                    .inst("mov").reg(S1).reg(S2)
                    .inst("pop").reg(S2);
        }
        else if (count >= 2) {
            ib      .inst("mov").vreg(LSP, 0).reg(S1)
                    .inst("mov").vreg(LSP, 8).reg(S2);

            for(int i = 2; i < count; i++) {
                ib.inst("pop").append("QWORD ").vreg(LSP, i*8);
                //ib.inst("pop").reg(T1)
                        //.inst("mov").vreg(LSP, i*8).reg(T1);
            }
            ib      .inst("pop").reg(S1)
                    .inst("pop").reg(S2);
        }
    }
}
