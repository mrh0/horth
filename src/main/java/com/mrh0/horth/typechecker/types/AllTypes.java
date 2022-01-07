package com.mrh0.horth.typechecker.types;

public class AllTypes {
    public static CommonType INT64 = () -> "int";
    public static CommonType CHAR = () -> "char";
    public static CommonType STRING = () -> "string";
    public static CommonType ATOM = () -> "atom";
    public static RefType ref(IType type) {return new RefType(type);}
}
