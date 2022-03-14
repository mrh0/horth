package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.exceptions.typechecker.TypeCheckerException;
import com.mrh0.horth.exceptions.typechecker.TypeStackMismatch;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class VirtualTypeStack {
    public record StackEntry(IType type, ITok token) {
        @Override
        public String toString() {
            return type.getName() + ':' + token.toString();
        }
    }
    public List<StackEntry> stack;
    private int lockIndex = 0;

    public VirtualTypeStack() {
        stack = new ArrayList<>();
    }

    private VirtualTypeStack(VirtualTypeStack other) {
        stack = new ArrayList<>();
        stack.addAll(other.stack);
    }

    private int last() {
        return stack.size()-1;
    }

    private int last(int i) {
        return stack.size()-1-i;
    }

    @Deprecated
    public StackEntry pop() throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException(null, null);
        return stack.remove(last());
    }

    public StackEntry pop(ITok token) throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException(token.getLocation(), null);
        return stack.remove(last());
    }

    public StackEntry check(ITok token, IType type) throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException(token.getLocation(), type);
        if(!IType.equals(stack.get(last()).type(), type))
            throw new BreachOfContractException(token.getLocation(), type, stack.get(last()).type());
        return stack.remove(last());
    }

    @Deprecated
    public StackEntry check(ITok token, Function<IType, Boolean> func) throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException(token.getLocation(), null);
        if(func.apply(stack.get(last()).type()))
            throw new BreachOfContractException(token.getLocation(), null, stack.get(last()).type());
        return stack.remove(last());
    }

    public StackEntry casts(ITok token, IType type) throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException(token.getLocation(), type);
        AllTypes.canCast(token, stack.get(last()).type(), type);
        return stack.remove(last());
    }

    public void nSame(ITok token, int n, Function<IType, Boolean> func) throws BreachOfContractException {
        IType match = null;
        for(int i = 0; i < n; i++) {
            var next =  pop(token).type();
            if(func != null)
                if(!func.apply(next))
                    throw new BreachOfContractException(token.getLocation(), null, next);
            if(match == null)
                match =  next;
            else if(!IType.equals(match, next))
                throw new BreachOfContractException(token.getLocation(), match, next);
        }
        return;
    }

    public void nSame(ITok token, int n) throws BreachOfContractException {
        nSame(token, n, null);
    }

    public void push(IType type, ITok token) {
        push(new StackEntry(type, token));
    }

    public void push(StackEntry se) {
        stack.add(se);
    }

    public StackEntry peek(Loc location) throws BreachOfContractException {
        if(stack.isEmpty())
            throw new BreachOfContractException(location, null);
        return stack.get(last());
    }

    public StackEntry peek(ITok token) throws BreachOfContractException {
        return peek(token.getLocation());
    }

    public int size() {
        return stack.size();
    }

    /*public static void equals(VirtualStack expected, VirtualStack actual) throws TypeStackMismatch {
        if(expected.size() != actual.size())
            throw new TypeStackMismatch(expected, actual);
    }*/

    public VirtualTypeStack snapshot() {
        return new VirtualTypeStack(this);
    }

    public void load(VirtualTypeStack snapshot) {
        stack = new ArrayList<>();
        stack.addAll(snapshot.stack);
    }

    public static void match(VirtualTypeStack expected, VirtualTypeStack actual, Loc location) throws TypeCheckerException {
        if(expected.size() != actual.size())
            throw new TypeStackMismatch(
                    actual.size() == 0 ? location : actual.stack.get(actual.size()-1).token.getLocation(),
                    expected, actual);
        for(int i = expected.size()-1; i >= 0; i--) {
            if (!IType.equals(expected.stack.get(i).type(), actual.stack.get(i).type()))
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
