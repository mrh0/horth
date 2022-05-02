package com.mrh0.horth.output.x86_64.linux.nasm.local;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;
@Deprecated
public class LClaim implements LowInst {
    private final int bytes;

    public LClaim(int bytes) {
        this.bytes = bytes;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib.comment("CLAIM");
        if(this.bytes > 0)
            ib.inst("add").reg(LSP).imm(this.bytes);
    }
}
