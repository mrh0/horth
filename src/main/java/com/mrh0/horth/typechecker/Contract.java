package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.types.TType;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.typechecker.types.GenericType;
import com.mrh0.horth.typechecker.types.IType;
import com.mrh0.horth.util.Util;

import java.util.Arrays;
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

    public static Contract from(List<TType> pop, List<TType> push) {
        IType[] pop2 = new IType[pop.size()];
        IType[] push2 = new IType[push.size()];

        //System.out.println("Pop: " + pop + " Push: " + push);

        for(int i = 0; i < pop.size(); i++)
            pop2[i] = pop.get(i).type;

        for(int i = 0; i < push.size(); i++)
            push2[i] = push.get(i).type;

        //System.out.println("Pop2: " + Util.list(pop2) + " Push2: " + Util.list(push2));
        //System.out.println();

        return new Contract(pop2, push2);
    }

    public IType[] getPushList() {
        return this.push;
    }

    public IType[] getPopList() {
        return this.pop;
    }

    @Override
    public String toString() {
        return "(" + Util.list(pop) + " -> " + Util.list(push) + ")";
    }
}
