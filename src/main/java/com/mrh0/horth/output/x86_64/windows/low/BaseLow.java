package com.mrh0.horth.output.x86_64.windows.low;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;

public abstract class BaseLow<T extends HighInst> implements LowInst {
    protected T inst;

    public BaseLow(HighInst in) {
        inst = (T) in;
    }
}
