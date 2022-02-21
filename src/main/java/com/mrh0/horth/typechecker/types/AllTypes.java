package com.mrh0.horth.typechecker.types;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.exceptions.typechecker.CannotCastException;
import com.mrh0.horth.exceptions.typechecker.UndefinedPropertyException;

public class AllTypes {
    public static IType INT = new IType() {
        public String getName() {
            return "int";
        }
        public int getSize() {
            return 8;
        }
        public void cast(Loc location, IType to) throws CannotCastException {
            if(isRedundantCast(location, to))
                return;
            else if(isUnsigned(to) || isByte(to))
                return;
            throw new CannotCastException(location, this, to);
        }
    };
    public static IType U64 = new IType() {
        public String getName() {
            return "u64";
        }
        public int getSize() {
            return 8;
        }
    };
    public static IType U32 = new IType() {
        public String getName() {
            return "u32";
        }
        public int getSize() {
            return 4;
        }
    };
    public static IType U16 = new IType() {
        public String getName() {
            return "u16";
        }
        public int getSize() {
            return 2;
        }
    };
    public static IType BYTE = new IType() {
        public String getName() {
            return "byte";
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
            else if(isNumber(to) || to == BYTE)
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
        public void cast(Loc location, IType to) throws CannotCastException {
            if(isRedundantCast(location, to))
                return;
            else if(isNumber(to) || isByte(to))
                return;
            throw new CannotCastException(location, this, to);
        }
    };

    public static IType STRING = new IType() {
        public String getName() {
            return "string";
        }
        public int getSize() {
            return 8;
        }

        @Override
        public TypeProperty getProperty(Loc location, String name) throws UndefinedPropertyException {
            switch(name) {
                case "length":
                    return new TypeProperty(name, INT, 0);
                case "nt":
                    return new TypeProperty(name, ref(CHAR), INT.getSize());
            }
            return IType.super.getProperty(location, name);
        }
    };

    public static IType ATOM = new IType() {
        public String getName() {
            return "atom";
        }
        public int getSize() {
            return 8;
        }
        public void cast(Loc location, IType to) throws CannotCastException {
            if(isRedundantCast(location, to))
                return;
            else if(to == STRING) //Atom value is a string pointer
                return;
            throw new CannotCastException(location, this, to);
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

    public static IType EOF = new IType() {
        public String getName() {
            return "Empty Stack";
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
        else if(type instanceof NestedType)
            return type.toString();
        return type.getName();
    }

    public static IType bySimpleName(String name) {
        switch(name) {
            case "int":
                return INT;
            case "u64":
                return U64;
            case "u32":
                return U32;
            case "u16":
                return U16;
            case "u8":
            case "byte":
                return BYTE;

            case "char":
                return CHAR;

            case "bool":
                return BOOL;

            case "string":
                return STRING;
            case "atom":
                return ATOM;

            case "ref":
                return DEF_REF;

            case "void":
                return VOID;
            default:
                return null;
        }
    }

    public static boolean isNumber(IType type) {
        return type == U64 || type == U32 || type == U16 || type == BYTE || type == INT;
    }

    public static boolean isUnsigned(IType type) {
        return type == U64 || type == U32 || type == U16 || type == BYTE;
    }

    public static boolean isByte(IType type) {
        return type == BYTE || type == CHAR;
    }

    public static void canCast(ITok token, IType type, IType to) throws BreachOfContractException {
        if(IType.equals(type, to))
            return;
        try {
            type.cast(token.getLocation(), to);
        } catch (CannotCastException e) {
            throw new BreachOfContractException(token.getLocation(), to, type);
        }
    }
}
