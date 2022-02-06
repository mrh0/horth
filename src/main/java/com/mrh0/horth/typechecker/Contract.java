package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.types.TType;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.typechecker.types.GenericType;
import com.mrh0.horth.typechecker.types.IType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contract implements IContract{
    private IType[] pop;
    private IType[] push;

    public static IContract VOID = (s, t) -> {};

    private Contract() {
        this.pop = new IType[0];
        this.push = new IType[0];
    }

    private Contract(IType[] pop, IType[] push) {
        this.pop = pop;
        this.push = push;
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

    @Override
    public void apply(VirtualTypeStack stack, ITok tok) throws BreachOfContractException {
        for(IType t : pop) {
            VirtualTypeStack.StackEntry se = stack.pop(tok);
            if(!IType.equals(t, se.type()))
                throw new BreachOfContractException(tok.getLocation(), t, se.type());
        }
        for(IType t : push) {
            stack.push(t, tok);
        }
    }

    public static IContract from(List<TType> pop, List<TType> push) {
        IType[] pop2 = new IType[pop.size()];
        IType[] push2 = new IType[push.size()];

        for(int i = 0; i < pop.size(); i++)
            pop2[i] = pop.get(i).type;

        for(int i = 0; i < push.size(); i++)
            push2[i] = push.get(i).type;

        return new Contract(pop2, push2);
    }
}
