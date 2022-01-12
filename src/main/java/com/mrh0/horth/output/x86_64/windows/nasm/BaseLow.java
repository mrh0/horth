package com.mrh0.horth.output.x86_64.windows.nasm;

import com.mrh0.horth.output.instructions.high.HighInst;

public abstract class BaseLow<T extends HighInst> implements LowInst {
    public final T inst;

    public BaseLow(HighInst in) {
        inst = (T) in;
    }
}
