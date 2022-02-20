package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.function.Func;

public class DuplicateFunctionOverloadException extends TypeCheckerException {
    private final Func existing, current;
    public DuplicateFunctionOverloadException(Loc location, Func existing, Func current) {
        super(location);
        this.existing = existing;
        this.current = current;
    }

    @Override
    public String additional() {
        return "\tDuplicate function overload " + existing +
                "\n\t\tis a duplicate of function at " + existing.getLocation();
    }
}
