package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.exceptions.typechecker.StackTypesException;
import com.mrh0.horth.exceptions.typechecker.TypeCheckerException;
import com.mrh0.horth.exceptions.typechecker.TypeStackMismatch;
import com.mrh0.horth.typechecker.types.IType;

import java.util.ArrayList;
import java.util.List;

public class VirtualStack {
    public record StackEntry(IType type, ITok token) {}
    public List<StackEntry> stack;

    public VirtualStack() {
        stack = new ArrayList<>();
    }

    private VirtualStack(VirtualStack other) {
        stack = new ArrayList<>();
        stack.addAll(other.stack);
    }

    public StackEntry pop() throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException();
        return stack.remove(stack.size()-1);
    }

    public void push(IType type, ITok token) {
        push(new StackEntry(type, token));
    }

    public void push(StackEntry se) {
        stack.add(se);
    }

    public StackEntry peek() throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException();
        return stack.get(stack.size()-1);
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

    public static void match(VirtualStack expected, VirtualStack actual) throws TypeCheckerException {
        if(expected.size() != actual.size())
            throw new TypeStackMismatch(expected, actual);
        for(int i = expected.size()-1; i >= 0; i--) {
            if (!IType.equals(expected.stack.get(i).type(), actual.stack.get(i).type(), null))
                throw new TypeStackMismatch(expected, actual);
        }
    }
}
