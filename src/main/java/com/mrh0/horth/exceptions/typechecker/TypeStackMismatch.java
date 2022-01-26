package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.typechecker.VirtualStack;

public class TypeStackMismatch extends TypeCheckerException {
    private final VirtualStack expected, actual;
    public TypeStackMismatch(Loc location, VirtualStack expected, VirtualStack actual) {
        super(location);
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    public String additional() {
        return  "\tMismatched stacks: " +
                "\n\t\tExpected: " + expected +
                "\n\t\tActual: " + actual;
    }
}
