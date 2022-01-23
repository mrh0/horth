package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;

public class TypeCheckerException extends HorthException {
    public TypeCheckerException(Loc location) {
        super(location);
    }
}
