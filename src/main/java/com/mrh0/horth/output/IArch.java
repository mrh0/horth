package com.mrh0.horth.output;

import com.mrh0.horth.exceptions.compile.CompileException;

public interface IArch {
    String getName();
    void compile() throws CompileException;

}
