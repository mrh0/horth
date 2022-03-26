package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;
import com.mrh0.horth.util.Util;

import java.util.ArrayList;
import java.util.List;

public class NoMatchingFunctionOverloadException extends TypeCheckerException {
    private final String name;
    private final IType[] types, push;

    public NoMatchingFunctionOverloadException(Loc location, String name, VirtualTypeStack stack, int count, IType[] push) {
        super(location);
        this.name = name;
        this.push = push;
        if(stack.size() == 0) {
            this.types = new IType[1];
            types[0] = AllTypes.VOID;
        }
        else {
            this.types = new IType[count];
            for(int i = 0; i < count; i++) {
                if(stack.size()-count+i < 0)
                    return;
                types[i] = stack.stack.get(stack.size()-count+i).type();
            }
        }

    }

    @Override
    public String additional() {
        return "\tNo function overload in '" + name + "' matches contract (" + Util.list(types) + " -> " + Util.list(push) + ").";
    }
}
