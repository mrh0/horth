package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.typechecker.VirtualStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

public class BreachOfContractException extends TypeCheckerException {
    private final IType expected, actual;

    public BreachOfContractException(Loc location) {
        super(location);
        this.expected = null;
        this.actual = null;
    }

    public BreachOfContractException(Loc location, IType expected, IType actual) {
        super(location);
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    public String additional() {
        if(expected == null)
            return "";
        return  "\tUnexpected type on the stack: " +
                "\n\t\tExpected: " + AllTypes.stringOf(expected) +
                "\n\t\tGot: " + (actual == null ? "void" : AllTypes.stringOf(actual));
    }
}
