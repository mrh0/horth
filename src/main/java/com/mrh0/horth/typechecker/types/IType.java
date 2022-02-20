package com.mrh0.horth.typechecker.types;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.CannotCastException;
import com.mrh0.horth.exceptions.typechecker.CannotConstructException;
import com.mrh0.horth.exceptions.typechecker.UndefinedPropertyException;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.util.IO;

import java.util.List;
import java.util.Map;

public interface IType {
    record TypeProperty(String name, IType type, int offset) {}

    static boolean equals(IType a, IType b) {
        if(a instanceof NestedType && b instanceof NestedType)
            return equals(a.getNested(), b.getNested());
        return a == b;
    }

    @Deprecated
    static void addGenerics(List<GenericType> list, IType type) {
        if(type instanceof NestedType)
            addGenerics(list, type.getNested());
        else if(type instanceof GenericType)
            if(!list.contains(type))
                list.add((GenericType) type);
        else
            return;
    }

    default IType getNested() {
        return ((NestedType) this).nested;
    }

    String getName();

    int getSize();

    default TypeProperty getProperty(Loc location, String name) throws UndefinedPropertyException {
        throw new UndefinedPropertyException(location, name, this);
    }

    default void cast(Loc location, IType to) throws CannotCastException {
        if(!isRedundantCast(location, to))
            throw new CannotCastException(location, this, to);
    }

    default boolean isRedundantCast(Loc location, IType to) {
        if(IType.equals(this, to)) {
            IO.warn(
                    "Redundant cast from " + AllTypes.stringOf(this) + " to " + AllTypes.stringOf(to) + ".",
                    location);
            return true;
        }
        return false;
    }

    default int constructor(Loc location) throws HorthException {
        throw new CannotConstructException(location, this);
    }

    default IContract getConstructorContract() {
        return Contract.VOID;
    }

    default boolean is64() {
        return getSize() == 8;
    }

    default boolean is32() {
        return getSize() == 4;
    }

    default boolean is16() {
        return getSize() == 2;
    }

    default boolean is8() {
        return getSize() == 1;
    }
}
