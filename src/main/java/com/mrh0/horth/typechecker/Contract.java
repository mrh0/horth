package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.typechecker.types.GenericType;
import com.mrh0.horth.typechecker.types.IType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contract {
    private IType[] pop;
    private IType[] push;
    private List<GenericType> generics;

    private Contract() {
        pop = new IType[0];
        push = new IType[0];
    }

    public static class Builder {
        private Contract c;

        public Builder() {
            c = new Contract();
        }

        public static Builder stack() {
            return new Builder();
        }

        public Builder pop(IType...types) {
            c.pop = types;
            return this;
        }

        public Builder push(IType...types) {
            c.push = types;
            return this;
        }

        public Contract build() {
            return c;
        }
    }

    public void apply(VirtualStack stack, ITok tok) throws BreachOfContractException {
        Map<String, IType> genMap = new HashMap<>();

        for(IType t : pop) {
            VirtualStack.StackEntry se = stack.pop();
            if(!IType.equals(t, se.type(), genMap))
                throw new BreachOfContractException();
        }
        for(IType t : push) {
            stack.push(t, tok);
        }
    }
}
