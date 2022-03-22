package com.mrh0.horth.output.x86_64.linux.nasm.dyn;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.types.HNew;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LAlloc implements LowInst {
    private final int size;

    public LAlloc(int size) {
        this.size = size;
    }

    public LAlloc(HNew inst) {
        this.size = inst.type.getSize();
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        if(size > 1)
        ib      .inst("shl").reg(S1).imm(size);

        ib      .inst("mov").reg(T1).reg(S1)
                .inst("mov").reg(S1).vreg(DSP, 0)
                .inst("add").vreg(DSP, 0).reg(T1);
    }
}
