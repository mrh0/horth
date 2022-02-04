package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

public class UndefinedPropertyException extends HorthException {
    private final String prop;
    private final IType type;

    public UndefinedPropertyException(Loc location, String prop, IType type) {
        super(location);
        this.prop = prop;
        this.type = type;
    }

    @Override
    public String additional() {
        return "Undefined property '" + prop + "' on type " + AllTypes.stringOf(type) + ".";
    }
}
