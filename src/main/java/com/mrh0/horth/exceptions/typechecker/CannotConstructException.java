package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

public class CannotConstructException extends HorthException {
    private final IType type;

    public CannotConstructException(Loc location, IType type) {
        super(location);
        this.type = type;
    }

    @Override
    public String additional() {
        return "Cannot construct type " + AllTypes.stringOf(type) + ".";
    }
}
