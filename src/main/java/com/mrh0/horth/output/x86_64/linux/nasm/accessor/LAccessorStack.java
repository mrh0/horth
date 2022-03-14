package com.mrh0.horth.output.x86_64.linux.nasm.accessor;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.accessor.HAccessor;
import com.mrh0.horth.instructions.high.accessor.HAccessorStack;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LAccessorStack implements LowInst {
    private final int size, offset;

    public LAccessorStack(int size, int offset) {
        this.size = size;
        this.offset = offset;
    }

    public LAccessorStack(HAccessorStack inst) {
        this(inst.size, inst.offset);
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        switch(size) {
            case 8:
                ib      .inst("shl").reg(S2).imm(size)
                        .inst("add").reg(S1).reg(S2)
                        .inst("mov").reg(S1).vreg(S1, offset)
                        .inst("pop").reg(S2);
                break;
            case 4:
                ib      .inst("shl").reg(S2).imm(size)
                        .inst("add").reg(S1).reg(S2)
                        .inst("xor").reg(S2).reg(S2)
                        .inst("mov").reg(S1_32).vreg(S1, offset)
                        .inst("pop").reg(S2);
                break;
            case 2:
                ib      .inst("shl").reg(S2).imm(size)
                        .inst("add").reg(S1).reg(S2)
                        .inst("xor").reg(S2).reg(S2)
                        .inst("mov").reg(S1_16).vreg(S1, offset)
                        .inst("pop").reg(S2);
                break;
            case 1:
                ib      .inst("add").reg(S1).reg(S2)
                        .inst("xor").reg(S2).reg(S2)
                        .inst("mov").reg(S1_8).vreg(S1, offset)
                        .inst("pop").reg(S2);
                break;
        }
    }
}
