package com.mrh0.horth.typechecker;

import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.exceptions.typechecker.TypeCheckerException;

public interface ISpecialCheck {
    void check(VirtualStack stack) throws HorthException;
}
