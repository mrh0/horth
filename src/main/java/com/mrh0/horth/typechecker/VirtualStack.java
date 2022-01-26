package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.exceptions.typechecker.TypeCheckerException;
import com.mrh0.horth.exceptions.typechecker.TypeStackMismatch;
import com.mrh0.horth.typechecker.types.IType;

import java.util.ArrayList;
import java.util.List;

public class VirtualStack {
    public record StackEntry(IType type, ITok token) {
        @Override
        public String toString() {
            return type.getName() + ':' + token.toString();
        }
    }
    public List<StackEntry> stack;

    public VirtualStack() {
        stack = new ArrayList<>();
    }

    private VirtualStack(VirtualStack other) {
        stack = new ArrayList<>();
        stack.addAll(other.stack);
    }

    private int last() {
        return stack.size()-1;
    }

    @Deprecated
    public StackEntry pop() throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException(null);
        return stack.remove(last());
    }

    public StackEntry pop(ITok token) throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException(token.getLocation());
        return stack.remove(last());
    }

    public StackEntry check(ITok token, IType type) throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException(token.getLocation());
        if(!IType.equals(stack.get(last()).type(), type, null))
            throw new BreachOfContractException(token.getLocation(), type, stack.get(last()).type());
        return stack.remove(last());
    }

    public void push(IType type, ITok token) {
        push(new StackEntry(type, token));
    }

    public void push(StackEntry se) {
        stack.add(se);
    }

    public StackEntry peek(ITok token) throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException(token.getLocation());
        return stack.get(last());
    }

    public int size() {
        return stack.size();
    }

    /*public static void equals(VirtualStack expected, VirtualStack actual) throws TypeStackMismatch {
        if(expected.size() != actual.size())
            throw new TypeStackMismatch(expected, actual);
    }*/

    public VirtualStack snapshot() {
        return new VirtualStack(this);
    }

    public void load(VirtualStack snapshot) {
        stack = new ArrayList<>();
        stack.addAll(snapshot.stack);
    }

    public static void match(VirtualStack expected, VirtualStack actual, Loc location) throws TypeCheckerException {
        if(expected.size() != actual.size())
            throw new TypeStackMismatch(
                    actual.size() == 0 ? location : actual.stack.get(actual.size()-1).token.getLocation(),
                    expected, actual);
        for(int i = expected.size()-1; i >= 0; i--) {
            if (!IType.equals(expected.stack.get(i).type(), actual.stack.get(i).type(), null))
                throw new TypeStackMismatch(
                        actual.stack.get(i).token.getLocation(),
                        expected, actual);
        }
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
