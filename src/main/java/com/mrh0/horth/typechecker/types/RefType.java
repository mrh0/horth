package com.mrh0.horth.typechecker.types;

public class RefType extends NestedType {
    public RefType(IType nested) {
        super(nested);
    }

    @Override
    public String getName() {
        return "ref";
    }
}
