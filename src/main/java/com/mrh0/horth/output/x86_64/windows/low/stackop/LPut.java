package com.mrh0.horth.output.x86_64.windows.low.stackop;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.HPut;
import com.mrh0.horth.output.x86_64.windows.low.BaseLow;

public class LPut extends BaseLow<HPut> {
    public LPut(HighInst in) {
        super(in);
    }

    @Override
    public void asm(StringBuilder sb, CompileData cd) {

    }
}
