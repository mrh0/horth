package com.mrh0.horth.typechecker;

import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;

public interface ISpecialCheck {
    void check(VirtualStack stack) throws BreachOfContractException;
}
