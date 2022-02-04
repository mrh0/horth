package com.mrh0.horth.typechecker.types;

public class UserDefinedType implements IType {
    public final int size;

    public UserDefinedType(int size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
