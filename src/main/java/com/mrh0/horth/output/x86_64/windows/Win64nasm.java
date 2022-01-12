package com.mrh0.horth.output.x86_64.windows;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.output.Arch;
import com.mrh0.horth.output.instructions.InstructionTransformer;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;
import com.mrh0.horth.output.x86_64.windows.nasm.Optimizer;

import java.util.ArrayList;
import java.util.List;

public class Win64nasm extends Arch {
    @Override
    public String getName() {
        return "win64nasm";
    }

    @Override
    public StringBuilder compile(List<HighInst> HLIR) throws CompileException {
        StringBuilder sb = new StringBuilder();
        InstructionBuilder ib = new InstructionBuilder(sb);
        CompileData data = new CompileData();

        Win64nasmIT it = new Win64nasmIT();

        List<LowInst> LLIR = new ArrayList<>();
        for(HighInst hi : HLIR)
            it.transform(LLIR, hi);

        System.out.println(LLIR);

        List<LowInst> optimizedHLIR = Optimizer.optimize(LLIR);

        System.out.println(optimizedHLIR);

        for(LowInst li : optimizedHLIR)
            li.asm(ib, data);

        return sb;
    }
}
