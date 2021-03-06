package com.mrh0.horth.output.x86_64.linux.nasm.local;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;
@Deprecated
public class LReclaim implements LowInst {
    private final int bytes;

    public LReclaim(int bytes) {
        this.bytes = bytes;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        if(this.bytes > 0)
            ib.inst("sub").reg(LSP).imm(this.bytes);
    }
}
