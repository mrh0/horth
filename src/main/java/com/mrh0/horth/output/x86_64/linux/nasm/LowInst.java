package com.mrh0.horth.output.x86_64.linux.nasm;

import com.mrh0.horth.instructions.high.CompileData;

public interface LowInst {
    String S1 = "rax";  //Stack1
    String S2 = "rbx";  //Stack2
    String T1 = "rcx";  //Temp1
    String T2 = "rdx";  //Temp2
    String LSP = "r15";  //Local Stack Pointer
    String LS = "local_stack";
    String DSP = "dyn_sp";
    String DS = "dyn_stack";

    String S1_32 = "eax";  //Stack1
    String S2_32 = "ebx";  //Stack2
    String T1_32 = "ecx";  //Temp1
    String T2_32 = "edx";  //Temp2

    String S1_16 = "ax";  //Stack1
    String S2_16 = "bx";  //Stack2
    String T1_16 = "cx";  //Temp1
    String T2_16 = "dx";  //Temp2

    String S1_8 = "al";  //Stack1
    String S2_8 = "bl";  //Stack2
    String T1_8 = "cl";  //Temp1
    String T2_8 = "dl";  //Temp2

    static String strLabel(int ref) {
        return "str_"+ref;
    }

    static String atomLabel(String atom) {
        return "atom_"+atom;
    }

    default void collect(CompileData cd) {}

    void asm(InstructionBuilder ib, CompileData cd);
}
