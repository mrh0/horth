package com.mrh0.horth.output.x86_64.windows.nasm.stackop.binop;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LCompare {
    private static LowInst make(String t) {
        return (InstructionBuilder ib, CompileData cd) -> {
            ib.inst("mov").reg(LowInst.T1).imm(0)
                    .inst("mov").reg(LowInst.T2).imm(1)
                    .inst("cmp").reg(LowInst.S2).reg(LowInst.S1)
                    .inst("cmov"+t).reg(LowInst.T1).reg(LowInst.T2)
                    .inst("pop").reg(LowInst.S2)
                    .inst("mov").reg(LowInst.S1).reg(LowInst.T1);
        };
    }
    public static final LowInst LESS_THAN = make("l");
    public static final LowInst LESS_THAN_OR_EQUALS = make("le");
    public static final LowInst GREATER_THAN = make("g");
    public static final LowInst GREATER_THAN_OR_EQUALS = make("ge");
    public static final LowInst EQUALS = make("e");
    public static final LowInst NOT_EQUALS = make("ne");
}
