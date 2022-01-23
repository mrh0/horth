package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;

public class BreachOfContractException extends TypeCheckerException {
    public BreachOfContractException(Loc location) {
        super(location);
    }
}
