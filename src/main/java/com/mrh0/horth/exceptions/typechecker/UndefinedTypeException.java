package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;

public class UndefinedTypeException extends TypeCheckerException {
    public UndefinedTypeException(Loc location) {
        super(location);
    }

    @Override
    public String additional() {
        return "\tUndefined type.";
    }
}
