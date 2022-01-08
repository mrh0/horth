package com.mrh0.horth.output.instructions;

import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.x86_64.windows.low.LowInst;

import java.util.List;

public interface InstructionTransformer {
    void transform(List<LowInst> out, HighInst in);
}