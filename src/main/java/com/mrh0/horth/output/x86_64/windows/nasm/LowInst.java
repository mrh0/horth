package com.mrh0.horth.output.x86_64.windows.nasm;

import com.mrh0.horth.output.instructions.high.CompileData;

public interface LowInst {
    String S1 = "rax";  //Stack1
    String S2 = "rbx";  //Stack2
    String T1 = "rcx";  //Temp1
    String T2 = "rdx";  //Temp2
    String LSP = "r15";  //Local Stack Pointer

    void asm(InstructionBuilder ib, CompileData cd);
}
