package com.mrh0.horth.output.x86_64.linux.nasm.function;

import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.function.HCallFunc;
import com.mrh0.horth.output.x86_64.linux.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

public class LCallFunc implements LowInst {
    private HCallFunc hcf;

    public LCallFunc(HCallFunc hcf) {
        this.hcf = hcf;
    }

    @Override
    public void asm(InstructionBuilder ib, CompileData cd) {
        ib      .comment("FUNC_CALL " + hcf.func.getName())
                .inst("call").jlabel(hcf.func.label.id);
    }
}
