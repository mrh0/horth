package com.mrh0.horth.typechecker.types;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.typechecker.UndefinedPropertyException;

public class RefType extends NestedType {
    public RefType(IType nested) {
        super(nested);
    }

    @Override
    public String getName() {
        return "ref";
    }

    @Override
    public int getSize() {
        return 8;
    }

    @Override
    public TypeProperty getProperty(Loc location, String name) throws UndefinedPropertyException {
        return switch(name) {
            //TODO: should . mean .value? i.e: "" == "value"
            case /*"", */"value" -> new TypeProperty(name, getNested(), 0);
            default -> throw new UndefinedPropertyException(location, name, this);
        };
    }
}
