package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.typechecker.VirtualStack;

public class TypeStackMismatch extends TypeCheckerException {



    public TypeStackMismatch(Loc location, VirtualStack expected, VirtualStack actual) {
        super(location);
    }
}
