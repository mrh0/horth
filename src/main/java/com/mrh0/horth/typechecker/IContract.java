package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;

public interface IContract {
    void apply(VirtualTypeStack stack, ITok tok) throws BreachOfContractException;
}
