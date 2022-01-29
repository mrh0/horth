package com.mrh0.horth.output.x86_64.windows.nasm.stackop.binop;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LBinary {
    private static LowInst make(String t) {
        return (InstructionBuilder ib, CompileData cd) -> {
            ib      .inst(t).reg(LowInst.S1).reg(LowInst.S2)
                    .inst("pop").reg(LowInst.S2);
        };
    }
    public static final LowInst AND = make("and");
    public static final LowInst OR = make("or");
    public static final LowInst NOT = (InstructionBuilder ib, CompileData cd) ->
            ib.inst("not").reg(LowInst.S1);
}