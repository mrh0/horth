package com.mrh0.horth.exceptions.compile;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;

public class CompileException extends HorthException {
    private final String info;
    public CompileException(Loc location, String info) {
        super(location);
        this.info = info;
    }

    @Override
    public String additional() {
        return info;
    }
}
