package com.mrh0.horth.output.instructions.high;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;

public class HighLabel extends HighInst {
    public static long nextId = 0;
    public final long id;

    public HighLabel() {
        super(null);
        id = nextId++;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }
}
