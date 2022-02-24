package com.mrh0.horth.instructions.high.types;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.IExpanding;
import com.mrh0.horth.instructions.high.stackops.operands.HPutAtom;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

public class HBBox extends HighInst implements ISpecialCheck, IExpanding {
    private String atom;

    public HBBox(ITok token) {
        super(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        IType pop = stack.pop(token).type();
        this.atom = pop.getName();
        cd.storeAtom(this.atom);
        stack.push(AllTypes.BOXED, token);
        stack.push(AllTypes.ATOM, token);
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HPutAtom(token, this.atom));
    }
}
