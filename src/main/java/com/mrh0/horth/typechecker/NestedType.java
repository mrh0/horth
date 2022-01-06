package com.mrh0.horth.typechecker;

public abstract class NestedType implements IType {
    public final IType nested;

    public NestedType(IType nested) {
        this.nested = nested;
    }
}
