package com.mrh0.horth.output.x86_64.linux.nasm;

import com.mrh0.horth.output.instructions.high.HighInst;
@Deprecated
public abstract class BaseLow<T extends HighInst> implements LowInst {
    public final T inst;

    public BaseLow(HighInst in) {
        inst = (T) in;
    }
}
