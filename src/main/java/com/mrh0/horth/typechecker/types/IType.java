package com.mrh0.horth.typechecker.types;

import java.util.List;

public interface IType {
    public static boolean equals(IType a, IType b) {
        if(a instanceof NestedType && b instanceof NestedType)
            return equals(a.getNested(), b.getNested());
        return a == b;
    }

    public default void addGenerics(List<GenericType> list, IType type) {
        if(type instanceof NestedType)
            addGenerics(list, type.getNested());
        else if(type instanceof GenericType)
            if(!list.contains(type))
                list.add((GenericType) type);
        else
            return;
    }

    public default IType getNested() {
        return ((NestedType) this).nested;
    }

    String getName();

    int getSize();
}
