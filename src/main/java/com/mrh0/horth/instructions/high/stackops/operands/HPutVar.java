package com.mrh0.horth.instructions.high.stackops.operands;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HPutVar extends HighInst implements ISpecialCheck {
    public final String name;
    public int offset = 0;
    public final boolean isAddr;

    public HPutVar(ITok token, String name) {
        super(token);
        this.name = name;
        this.isAddr = name.charAt(0) == '@';
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        CompileData.LocalEntry le;
        if(isAddr) {
            le = cd.findNamedLocal(token.getLocation(), this.name.substring(1));
            stack.push(AllTypes.ref(le.type()), token);
        }
        else {
            le = cd.findNamedLocal(token.getLocation(), this.name);
            stack.push(le.type(), token);
        }
        this.offset = le.offset();
    }
}
