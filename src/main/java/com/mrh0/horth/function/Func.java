package com.mrh0.horth.function;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfOverloadContractException;
import com.mrh0.horth.exceptions.typechecker.TypeCheckerException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.HighLabel;
import com.mrh0.horth.instructions.high.function.HRet;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.TypeChecker;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.IType;
import com.mrh0.horth.util.Util;

import java.util.List;

public class Func {
    private final String name;
    private final Contract contract;
    private final List<HighInst> body;
    private final Prefix prefix;
    private final ITok token;
    public final HighLabel label;

    public enum Prefix {
        INLINE, EXTERN, START, REC, NONE;

        public static Prefix from(String prefix) {
            switch(prefix) {
                case "inline":
                    return INLINE;
                case "extern":
                    return EXTERN;
                case "start":
                    return START;
                case "rec":
                    return REC;
            }
            return NONE;
        }
    }

    public Func(ITok token, String name, Contract contract, List<HighInst> body, Prefix prefix) {
        this.token = token;
        this.name = name;
        this.contract = contract;
        this.body = body;
        this.prefix = prefix;

        this.label = new HighLabel();
    }

    public String getName() {
        return this.name;
    }

    public Contract getContract() {
        return this.contract;
    }

    public List<HighInst> getBody() {
        return this.body;
    }

    public void validate(VirtualTypeStack stack, CompileData cd) throws HorthException {
        TypeChecker.validOverload(token.getLocation(), cd.getFunctions(token.getLocation(), this.getName()), this);
        for(int i = getContract().getPopList().length-1; i >= 0; i--) {
            stack.push(getContract().getPopList()[i], token);
        }
        if(body.size() == 0)
            return;
        TypeChecker.check(stack, cd, body);
    }

    public void validateRet(VirtualTypeStack stack, CompileData cd) throws HorthException {
        for(int i = getContract().getPushList().length-1; i >= 0; i--) {
            stack.check(token, getContract().getPushList()[i]);
        }
        if(body.size() > 0)
            TypeChecker.end(stack, Util.lastOf(body).token.getLocation());
    }

    public Prefix getPrefix() {
        return this.prefix;
    }

    public Loc getLocation() {
        return this.token.getLocation();
    }

    @Override
    public String toString() {
        return getName() + getContract();
    }
}
