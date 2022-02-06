package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;

public class BreachOfOverloadContractException extends TypeCheckerException {
    public BreachOfOverloadContractException(Loc location) {
        super(location);
    }
}
