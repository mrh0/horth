package com.mrh0.horth.output.x86_64.linux.nasm.stackop.put;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.stackops.operands.HPutAtom;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LPutAtom implements LowInst {
    private String ref;

    public LPutAtom(HPutAtom atom) {
        this.ref = atom.getAtom();
    }

    @Override
    public void collect(CompileData cd) {
        cd.storeAtom(this.ref);
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("push").reg(S2)
                .inst("mov").reg(S2).reg(S1)
                .inst("mov").reg(S1).alabel(ref);
    }
}