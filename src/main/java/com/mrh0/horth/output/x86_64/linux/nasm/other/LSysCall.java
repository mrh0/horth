package com.mrh0.horth.output.x86_64.linux.nasm.other;

import com.mrh0.horth.output.Arch;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LSysCall implements LowInst {
    public final Arch.SysCall syscall;

    public LSysCall(Arch.SysCall syscall) {
        this.syscall = syscall;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        switch(syscall.args()) {
            case 0:
                ib      .inst("push").reg(S2)
                        .inst("mov").reg(S2).reg(S1)
                        .inst("mov").reg(S1).imm(syscall.call())
                        .inst("syscall");
                break;
            case 1:
                ib      .inst("mov").reg("rdi").reg(S1)
                        .inst("mov").reg(S1).imm(syscall.call())
                        .inst("syscall");
                break;
            case 2:
                ib      .inst("mov").reg("rdi").reg(S2)
                        .inst("mov").reg("rsi").reg(S1)
                        .inst("mov").reg(S1).imm(syscall.call())
                        .inst("syscall")
                        .inst("pop").reg(S2);
                break;
            case 3:
                ib      .inst("pop").reg("rdi")
                        .inst("mov").reg("rsi").reg(S2)
                        .inst("mov").reg("rdx").reg(S1)
                        .inst("mov").reg(S1).imm(syscall.call())
                        .inst("syscall")
                        .inst("pop").reg(S2);
                break;
            case 4:
                ib      .inst("pop").reg("rdi")
                        .inst("pop").reg("rsi")
                        .inst("mov").reg("rdx").reg(S2)
                        .inst("mov").reg("rcx").reg(S1)
                        .inst("mov").reg(S1).imm(syscall.call())
                        .inst("syscall")
                        .inst("pop").reg(S2);
                break;
            case 5:
                ib      .inst("pop").reg("rdi")
                        .inst("pop").reg("rsi")
                        .inst("pop").reg("rdx")
                        .inst("mov").reg("rcx").reg(S2)
                        .inst("mov").reg("r8").reg(S1)
                        .inst("mov").reg(S1).imm(syscall.call())
                        .inst("syscall")
                        .inst("pop").reg(S2);
                break;
            case 6:
                ib      .inst("pop").reg("rdi")
                        .inst("pop").reg("rsi")
                        .inst("pop").reg("rdx")
                        .inst("pop").reg("rcx")
                        .inst("mov").reg("r8").reg(S2)
                        .inst("mov").reg("r9").reg(S1)
                        .inst("mov").reg(S1).imm(syscall.call())
                        .inst("syscall")
                        .inst("pop").reg(S2);
                break;
        }
    }
}
