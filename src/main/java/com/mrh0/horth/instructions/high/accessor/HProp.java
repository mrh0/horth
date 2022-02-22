package com.mrh0.horth.instructions.high.accessor;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.IType;

public class HProp extends HighInst implements ISpecialCheck {
    private final String name;
    private IType from, get;

    public HProp(ITok token, String name) {
        super(token);
        this.name = name;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        from = stack.pop(token).type();
        var prop = from.getProperty(token.getLocation(), name);
        stack.push(prop.type(),token);
    }
}
