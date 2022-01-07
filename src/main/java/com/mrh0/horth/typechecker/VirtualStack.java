package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.typechecker.TypeStackMismatch;
import com.mrh0.horth.typechecker.types.IType;

import java.util.Stack;

public class VirtualStack {
    public record StackEntry(IType type, ITok token) {}
    public Stack<StackEntry> stack;

    public StackEntry pop() {
        return stack.pop();
    }

    public void push(IType type, ITok token) {
        stack.push(new StackEntry(type, token));
    }

    public int size() {
        return stack.size();
    }

    public static void equals(VirtualStack expected, VirtualStack actual) throws TypeStackMismatch {
        if(expected.size() != actual.size())
            throw new TypeStackMismatch(expected, actual);
    }
}
