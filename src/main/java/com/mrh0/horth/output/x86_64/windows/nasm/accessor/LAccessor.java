package com.mrh0.horth.output.x86_64.windows.nasm.accessor;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LAccessor implements LowInst {
    private final int size, offset;

    public LAccessor(int size, int offset) {
        this.size = size;
        this.offset = offset;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        switch(size) {
            case 8:
                ib      .inst("shl").reg(S1).imm(size)
                        .inst("add").reg(S2).reg(S1)
                        .inst("mov").reg(S1).vreg(S1, offset)
                        .inst("pop").reg(S2);
                break;
            case 4:
                ib      .inst("shl").reg(S1).imm(size)
                        .inst("add").reg(S2).reg(S1)
                        .inst("xor").reg(S1).reg(S1)
                        .inst("mov").reg(S1_32).vreg(S1, offset)
                        .inst("pop").reg(S2);
                break;
            case 2:
                ib      .inst("shl").reg(S1).imm(size)
                        .inst("add").reg(S2).reg(S1)
                        .inst("xor").reg(S1).reg(S1)
                        .inst("mov").reg(S1_16).vreg(S1, offset)
                        .inst("pop").reg(S2);
                break;
            case 1:
                ib      .inst("shl").reg(S1).imm(size)
                        .inst("add").reg(S2).reg(S1)
                        .inst("xor").reg(S1).reg(S1)
                        .inst("mov").reg(S1_8).vreg(S1, offset)
                        .inst("pop").reg(S2);
                break;
        }
    }
}
