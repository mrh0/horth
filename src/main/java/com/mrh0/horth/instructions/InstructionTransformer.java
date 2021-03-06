package com.mrh0.horth.instructions;

import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.instructions.high.HighInst;

import java.util.List;

public interface InstructionTransformer<L> {
    void transform(List<L> out, HighInst in) throws CompileException;
}