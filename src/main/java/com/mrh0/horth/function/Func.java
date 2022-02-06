package com.mrh0.horth.function;

import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;

import java.util.List;

public class Func {
    private final String name;
    private final IContract contract;
    private final List<HighInst> body;

    public Func(String name, IContract contract, List<HighInst> body) {
        this.name = name;
        this.contract = contract;
        this.body = body;
    }

    public String getName() {
        return this.name;
    }

    public IContract getContract() {
        return this.contract;
    }

    public List<HighInst> getBody() {
        return this.body;
    }
}
