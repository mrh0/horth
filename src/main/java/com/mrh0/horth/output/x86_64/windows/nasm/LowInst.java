package com.mrh0.horth.output.x86_64.windows.nasm;

import com.mrh0.horth.output.instructions.high.CompileData;

public interface LowInst {
    String S1 = "rax";  //Stack1
    String S2 = "rbx";  //Stack2
    String T1 = "rcx";  //Temp1
    String T2 = "rdx";  //Temp2
    String LSP = "r15";  //Local Stack Pointer
    String LS = "local_stack";

    static String strLabel(int ref) {
        return "str_"+ref;
    }

    static String r32(String reg) {
        return reg.replace('r', 'e');
    }

    default void collect(CompileData cd) {}

    void asm(InstructionBuilder ib, CompileData cd);
}
