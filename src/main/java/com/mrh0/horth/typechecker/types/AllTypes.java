package com.mrh0.horth.typechecker.types;

public class AllTypes {
    public static IType INT64 = new IType() {
        public String getName() {
            return "int";
        }
        public int getSize() {
            return 8;
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
    };
    public static IType STRING = new IType() {
        public String getName() {
            return "string";
        }
        public int getSize() {
            return 8;
        }
    };
    public static IType ATOM = new IType() {
        public String getName() {
            return "atom";
        }
        public int getSize() {
            return 8;
        }
    };
    public static RefType ref(IType type) {return new RefType(type);}

    public static String stringOf(IType type) {
        return type.getName();
    }
}
