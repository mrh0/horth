package com.mrh0.horth.output.x86_64.linux.nasm.stackop.put;

import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.instructions.high.stackops.operands.HPutString;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;
import com.mrh0.horth.util.Util;

public class LPutString implements LowInst {

    public final HPutString string;
    private int ref;

    public LPutString(HPutString string) {
        this.string = string;
    }

    @Override
    public void collect(CompileData cd) {
        this.ref = cd.storeString(new Util.RealString(string.str, string.len));
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .inst("push").reg(S2)
                .inst("mov").reg(S2).reg(S1)
                .inst("mov").reg(S1).slabel(ref);
    }
}
