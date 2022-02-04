package com.mrh0.horth.typechecker;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.typechecker.types.AllTypes;

public class PrefabContracts {
    public static void compare(VirtualTypeStack s, ITok token) throws BreachOfContractException {
        s.nSame(token, 2);
        s.push(AllTypes.BOOL, token);
    }

    public static void binMath(VirtualTypeStack s, ITok token) throws BreachOfContractException {
        s.nSame(token, 2, AllTypes::isNumber);
        s.push(AllTypes.BOOL, token);
    }
}
