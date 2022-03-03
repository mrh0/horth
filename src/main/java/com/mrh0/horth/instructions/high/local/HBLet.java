package com.mrh0.horth.instructions.high.local;

import com.mrh0.horth.ast.nodes.other.TLet;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.IExpanding;
import com.mrh0.horth.typechecker.*;
import com.mrh0.horth.typechecker.types.IType;

import java.util.ArrayList;
import java.util.List;

public class HBLet extends HighInst implements ISpecialCheck, IExpanding {

    private final List<String> names;
    public final List<HighInst> localBlock;
    private int offset = 0;

    public HBLet(TLet tok) throws HorthException {
        super(tok);
        this.names = tok.names;
        this.localBlock = new ArrayList<>();
        tok.localBlock.expand(this.localBlock);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        offset = cd.local().getClaimedBytes();
        for(int i = names.size()-1; i >= 0; i--) { // Reversed or not?
            IType type = stack.pop(token).type();
            cd.local().defineNamed(cd, token.getLocation(), names.get(i), type);
        }
        TypeChecker.check(stack, cd, this.localBlock);
        cd.local().dereferenceNamed(getCount());
    }

    public int getCount() {
        return names.size();
    }

    public int getOffset() {
        return this.offset;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HLet(this));
        IExpanding.expandAll(this.localBlock, space);
    }
}
