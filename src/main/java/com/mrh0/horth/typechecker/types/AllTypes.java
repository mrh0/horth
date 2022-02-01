package com.mrh0.horth.typechecker.types;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.typechecker.CannotCastException;

public class AllTypes {
    public static IType INT = new IType() {
        public String getName() {
            return "int";
        }
        public int getSize() {
            return 4;
        }
        public void cast(Loc location, IType to) throws CannotCastException {
            if(isRedundantCast(location, to))
                return;
            else if(to == CHAR)
                return;
            throw new CannotCastException(location, this, to);
        }
    };
    public static IType BOOL = new IType() {
        public String getName() {
            return "bool";
        }
        public int getSize() {
            return 1;
        }
    };
    public static IType CHAR = new IType() {
        public String getName() {
            return "char";
        }
        public int getSize() {
            return 1;
        }
        public void cast(Loc location, IType to) throws CannotCastException {
            if(isRedundantCast(location, to))
                return;
            else if(to == INT)
                return;
            throw new CannotCastException(location, this, to);
        }
    };
    public static IType STRING = new IType() {
        public String getName() {
            return "string";
        }
        public int getSize() {
            return 4;
        }
    };
    public static IType ATOM = new IType() {
        public String getName() {
            return "atom";
        }
        public int getSize() {
            return 4;
        }
    };

    public static IType VOID = new IType() {
        public String getName() {
            return "void";
        }
        public int getSize() {
            return 0;
        }
    };

    public static RefType DEF_REF = new RefType(null);

    public static RefType ref(IType type) {return new RefType(type);}

    public static String stringOf(IType type) {
        if(type == STRING)
            return "string";
        return type.getName();
    }

    public static IType bySimpleName(String name) {
        switch(name) {
            case "int":
                return INT;
            case "bool":
                return BOOL;
            case "char":
                return CHAR;
            case "string":
                return STRING;
            case "atom":
                return ATOM;
            case "void":
                return VOID;
            case "ref":
                return DEF_REF;
            default:
                return null;
        }
    }
}
