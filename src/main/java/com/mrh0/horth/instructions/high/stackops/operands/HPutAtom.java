package com.mrh0.horth.instructions.high.stackops.operands;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HPutAtom extends HighInst {
    private static final IContract contract = new Contract.Builder().push(AllTypes.ATOM).build();

    private final String atom;

    public HPutAtom(ITok token, String atom) {
        super(token);
        this.atom = atom;
    }

    @Override
    public IContract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return ":"+atom;
    }

    public String getAtom() {
        return atom;
    }
}
