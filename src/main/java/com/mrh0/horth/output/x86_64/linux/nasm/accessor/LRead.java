package com.mrh0.horth.output.x86_64.linux.nasm.accessor;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.accessor.HProp;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LRead implements LowInst {
    private final int offset, size;

    public LRead(int offset, int size) {
        this.offset = offset;
        this.size = size;
    }

    public LRead(HProp prop) {
        this.offset = prop.getOffset();
        this.size = prop.getSize();
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        switch(size) {
            case 8:
                ib      .inst("mov").reg(S1).vreg(S1, offset);
                break;
            case 4:
                ib      .inst("xor").reg(T1).reg(T1)
                        .inst("mov").reg(T1_32).vreg(S1, offset)
                        .inst("mov").reg(S1).reg(T1);
                break;
            case 2:
                ib      .inst("xor").reg(T1).reg(T1)
                        .inst("mov").reg(T1_16).vreg(S1, offset)
                        .inst("mov").reg(S1).reg(T1);
                break;
            case 1:
                ib      .inst("xor").reg(T1).reg(T1)
                        .inst("mov").reg(T1_8).vreg(S1, offset)
                        .inst("mov").reg(S1).reg(T1);
                break;
        }
    }
}
