package com.mrh0.horth.typechecker.types;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.UndefinedPropertyException;

public class BufferType extends NestedType {
    public BufferType(IType nested) {
        super(nested);
    }

    public String getName() {
        return "buf";
    }

    @Override
    public TypeProperty getProperty(Loc location, String name) throws UndefinedPropertyException {
        return super.getProperty(location, name);
    }

    @Override
    public int constructor(Loc location) throws HorthException {
        return 1;
    }
}
