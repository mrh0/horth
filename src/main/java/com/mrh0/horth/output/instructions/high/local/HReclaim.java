package com.mrh0.horth.output.instructions.high.local;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualStack;

public class HReclaim extends HighInst implements ISpecialCheck {
    public int count, size;

    public HReclaim(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    public void set(int count, int size) {
        this.count = count;
        this.size = size;
    }

    @Override
    public void check(VirtualStack stack, CompileData cd) throws HorthException {
        cd.reclaimLocal();
    }
}
