package com.mrh0.horth.typechecker.types;

public abstract class NestedType implements IType {
    public final IType nested;

    public NestedType(IType nested) {
        this.nested = nested;
    }

    @Override
    public String toString() {
        return getName() + "<" + AllTypes.stringOf(getNested()) + ">";
    }
}
