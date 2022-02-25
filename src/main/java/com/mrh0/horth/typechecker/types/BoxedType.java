package com.mrh0.horth.typechecker.types;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.typechecker.CannotCastException;
import com.mrh0.horth.exceptions.typechecker.UndefinedPropertyException;

class BoxedType implements IType {
    protected BoxedType() {}

    @Override
    public String getName() {
        return "boxed";
    }

    @Override
    public int getSize() {
        return 8;
    }

    @Override
    public void cast(Loc location, IType to) throws CannotCastException {}
}
