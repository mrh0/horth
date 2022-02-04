package com.mrh0.horth.typechecker;

import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.CompileData;

public interface ISpecialCheck {
    void check(VirtualTypeStack stack, CompileData cd) throws HorthException;
}
