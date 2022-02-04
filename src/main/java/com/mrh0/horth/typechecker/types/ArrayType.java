package com.mrh0.horth.typechecker.types;

public class ArrayType extends NestedType {
    public ArrayType(IType nested) {
        super(nested);
    }

    @Override
    public String getName() {
        return "array";
    }

    @Override
    public int getSize() {
        return 8;
    }
}
