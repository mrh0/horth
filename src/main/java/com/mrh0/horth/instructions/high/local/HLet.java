package com.mrh0.horth.instructions.high.local;

import com.mrh0.horth.ast.nodes.other.TLet;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

public class HLet extends HighInst {

    public int count;
    public int offset;

    public HLet(HBLet let) {
        super(let.token);
        this.count = let.getCount();
        this.offset = let.getOffset();
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public String toString() {
        return "HLet(" + count + ", " + offset + ')';
    }
}
