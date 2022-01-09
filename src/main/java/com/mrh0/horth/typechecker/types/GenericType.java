package com.mrh0.horth.typechecker.types;

import java.util.Objects;

public class GenericType implements CommonType {
    public final String identifier;

    public GenericType(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getName() {
        return "any<" + identifier + ">";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericType that = (GenericType) o;
        return Objects.equals(identifier, that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }
}
