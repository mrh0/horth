package com.mrh0.horth.typechecker.types;

public abstract class PointerType implements IType {
    @Override
    public int getSize() {
        return 8;
    }

    @Override
    public boolean isPointerType() {
        return true;
    }
}
