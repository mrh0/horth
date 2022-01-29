package com.mrh0.horth.typechecker.types;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.typechecker.CannotCastException;
import com.mrh0.horth.util.IO;

import java.util.List;
import java.util.Map;

public interface IType {
    public static boolean equals(IType a, IType b, Map<String, IType> generics) {
        if(a instanceof NestedType && b instanceof NestedType)
            return equals(a.getNested(), b.getNested(), generics);
        return a == b;
    }

    public static void addGenerics(List<GenericType> list, IType type) {
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

    default void cast(Loc location, IType to) throws CannotCastException {
        if(!isRedundantCast(location, to))
            throw new CannotCastException(location, this, to);
    }

    default boolean isRedundantCast(Loc location, IType to) {
        if(IType.equals(this, to, null)) {
            IO.warn(
                    "Redundant cast of '" + AllTypes.stringOf(this) + "' to '" + AllTypes.stringOf(to) + "'.",
                    location);
            return true;
        }
        return false;
    }
}
