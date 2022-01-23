package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;

public class StackTypesException extends TypeCheckerException {
    public StackTypesException(Loc location) {
        super(location);
    }
}
