package com.mrh0.horth.instructions.high.local;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;

public class HReclaim extends HighInst implements ISpecialCheck {
    public int count;

    public HReclaim(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    public void set(int count) {
        this.count = count;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        cd.reclaimLocal();
    }
}
