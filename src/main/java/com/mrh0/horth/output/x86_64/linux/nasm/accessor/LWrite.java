package com.mrh0.horth.output.x86_64.linux.nasm.accessor;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.accessor.HProp;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LWrite implements LowInst {
    private final int offset, size;

    public LWrite(int offset, int size) {
        this.offset = offset;
        this.size = size;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        switch(size) {
            case 8:
                ib      .inst("mov").vreg(S2, offset).reg(S1)
                        .inst("pop").reg(S1)
                        .inst("pop").reg(S2);
                break;
            case 4:
                ib      .inst("mov").vreg(S2, offset).reg(S1_32)
                        .inst("pop").reg(S1)
                        .inst("pop").reg(S2);
                break;
            case 2:
                ib      .inst("mov").vreg(S2, offset).reg(S1_16)
                        .inst("pop").reg(S1)
                        .inst("pop").reg(S2);
                break;
            case 1:
                ib      .inst("mov").vreg(S2, offset).reg(S1_8)
                        .inst("pop").reg(S1)
                        .inst("pop").reg(S2);
                break;
        }
    }
}
/*
write64:
mov     [rax], rbx
pop     rax
pop     rbx


write32:
mov     [rax], ebx
pop     rax
pop     rbx


write16:
mov     [rax], bx
pop     rax
pop     rbx

write8:
mov     [rax], lb
pop     rax
pop     rbx
*/