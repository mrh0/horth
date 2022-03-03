package com.mrh0.horth.output.x86_64.linux.nasm.local;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.local.HLet;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LLet implements LowInst {
    private final int count;
    private final int offset;

    public LLet(HLet let) {
        this.count = let.count;
        this.offset = let.offset;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        //ib.inst("add").reg(LSP).imm(count * 8);
        if(count == 0)
            System.err.println("[Claim] This should never happen.");
        if(count == 1) {
            ib      .inst("mov").vreg(LSP, this.offset).reg(S1)
                    .inst("mov").reg(S1).reg(S2)
                    .inst("pop").reg(S2);
        }
        else if (count >= 2) {
            ib      .inst("mov").vreg(LSP, this.offset).reg(S1)
                    .inst("mov").vreg(LSP, this.offset + 8).reg(S2);

            for(int i = 2; i < count; i++) {
                ib.inst("pop").append("QWORD ").vreg(LSP, this.offset + i*8);
            }
            ib      .inst("pop").reg(S1)
                    .inst("pop").reg(S2);
        }
    }
}
