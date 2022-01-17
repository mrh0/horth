package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.exceptions.typechecker.TypeStackMismatch;
import com.mrh0.horth.typechecker.types.IType;

import java.util.Stack;

public class VirtualStack {
    public record StackEntry(IType type, ITok token) {}
    public Stack<StackEntry> stack;

    public VirtualStack() {
        stack = new Stack<>();
    }

    public StackEntry pop() throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException();
        return stack.pop();
    }

    public void push(IType type, ITok token) {
        push(new StackEntry(type, token));
    }

    public void push(StackEntry se) {
        stack.push(se);
    }

    public StackEntry peek() throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException();
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }

    public static void equals(VirtualStack expected, VirtualStack actual) throws TypeStackMismatch {
        if(expected.size() != actual.size())
            throw new TypeStackMismatch(expected, actual);
    }
}
