package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.typechecker.types.GenericType;
import com.mrh0.horth.typechecker.types.IType;

import java.util.ArrayList;
import java.util.List;

public class Contract {
    private List<IType> pop;
    private List<IType> push;
    private List<GenericType> generics;

    private Contract() {
        pop = new ArrayList<>();
        push = new ArrayList<>();
    }

    public static class Builder {
        private Contract c;

        public Builder() {
            c = new Contract();
        }

        public static Builder stack() {
            return new Builder();
        }

        public Builder pop(IType type) {
            c.pop.add(type);
            return this;
        }

        public Builder push(IType type) {
            c.push.add(type);
            return this;
        }

        public Contract build() {
            return c;
        }
    }

    public void apply(VirtualStack stack, ITok tok) throws BreachOfContractException {
        for(IType t : pop) {
            VirtualStack.StackEntry se = stack.pop();
            if(!IType.equals(t, se.type()))
                throw new BreachOfContractException();
        }
        for(IType t : push) {
            stack.push(t, tok);
        }
    }
}
