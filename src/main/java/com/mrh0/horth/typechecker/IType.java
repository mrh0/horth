package com.mrh0.horth.typechecker;

public interface IType {
    public static boolean equals(IType a, IType b) {
        if(a instanceof NestedType && b instanceof NestedType)
            return equals(a.getNested(), b.getNested());
        return a == b;
    }

    public default IType getNested() {
        return ((NestedType) this).nested;
    }

    String getName();
}
