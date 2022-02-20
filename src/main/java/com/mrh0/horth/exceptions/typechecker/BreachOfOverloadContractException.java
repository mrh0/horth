package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.util.Util;

public class BreachOfOverloadContractException extends TypeCheckerException {
    private final Contract expected, actual;
    private Type type;
    public enum Type {
        ARG_NUM, PUSH_TYPES
    }

    public BreachOfOverloadContractException(Loc location, Contract expected, Contract actual, Type type) {
        super(location);
        this.expected = expected;
        this.actual = actual;
        this.type = type;
    }

    @Override
    public String additional() {
        return switch (this.type) {
            case ARG_NUM ->
                    "\tUnexpected number of arguments in function overload: " +
                    "\n\t\tExpected: " + expected.getPopList().length + " -> " + expected.getPushList().length +
                    "\n\t\tGot:      " +  actual.getPopList().length + " -> " + actual.getPushList().length;
            case PUSH_TYPES ->
                    "\tUnexpected return types in function overload: " +
                    "\n\t\tExpected: -> " + Util.list(expected.getPushList()) +
                    "\n\t\tGot:      -> " + Util.list(actual.getPushList());
        };
    }
}
