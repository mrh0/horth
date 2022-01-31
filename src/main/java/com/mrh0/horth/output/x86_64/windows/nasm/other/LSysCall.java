package com.mrh0.horth.output.x86_64.windows.nasm.other;

import com.mrh0.horth.output.Arch;
import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.instructions.high.stackops.HSysCall;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

public class LSysCall implements LowInst {
    public final Arch.SysCall syscall;

    public LSysCall(Arch.SysCall syscall) {
        this.syscall = syscall;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        switch(syscall.args()) {
            case 0:
                ib.inst("syscall").imm(syscall.call());
                break;
        }
    }
}
