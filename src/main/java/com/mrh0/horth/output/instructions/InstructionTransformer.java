package com.mrh0.horth.output.instructions;

import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

import java.util.List;

public interface InstructionTransformer<L> {
    void transform(List<L> out, HighInst in);
}