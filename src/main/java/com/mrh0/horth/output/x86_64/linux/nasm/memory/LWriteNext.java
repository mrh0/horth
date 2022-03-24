package com.mrh0.horth.output.x86_64.linux.nasm.memory;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LWriteNext implements LowInst {
    private final int offset, size;

    public LWriteNext(int offset, int size) {
        this.offset = offset;
        this.size = size;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        switch(size) {
            case 8:
                ib      .inst("mov").vreg(S2, offset).reg(S1)
                        .inst("mov").reg(S1).reg(S2)
                        .inst("pop").reg(S2)
                        .inst("add").reg(S1).imm(size);
                break;
            case 4:

                break;
            case 2:

                break;
            case 1:

                break;
        }
    }
}