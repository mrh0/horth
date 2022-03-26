package com.mrh0.horth.instructions.high.memory;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

public class HProp extends HighInst implements ISpecialCheck {
    private final String name;
    private IType from, get;
    private int size, offset;
    private boolean isAddr;

    public HProp(ITok token, String name, boolean isAddr) {
        super(token);
        this.name = name;
        this.isAddr = isAddr;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        from = stack.pop(token).type();
        var prop = from.getProperty(token.getLocation(), name);
        get = prop.type();
        size = get.getSize();
        offset = prop.offset();
        stack.push(isAddr ? AllTypes.ref(get) : get, token);
    }

    public int getSize() {
        return size;
    }

    public int getOffset() {
        return offset;
    }

    public boolean isAddr() {
        return isAddr;
    }
}
