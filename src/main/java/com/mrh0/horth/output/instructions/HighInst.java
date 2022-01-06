package com.mrh0.horth.output.instructions;

import com.mrh0.horth.ast.CompileData;

public abstract class HighInst {
    public static final String S1 = "rax";
    public static final String S2 = "rdx";
    public static final String T1 = "r10";
    public static final String T2 = "r11";

    public abstract void asm(StringBuilder sb, CompileData cd);
}
