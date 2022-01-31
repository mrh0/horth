package com.mrh0.horth.output.instructions.high.stackops;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.Arch;
import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualStack;
import com.mrh0.horth.typechecker.types.AllTypes;

public class HSysCall extends HighInst implements ISpecialCheck {
    public final String call;

    public HSysCall(ITok token, String call) {
        super(token);
        this.call = call;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualStack stack, CompileData cd) throws HorthException {
        Arch.SysCall sc = cd.getSysCallByName(token.getLocation(), call);
        for(int i = 0; i < sc.args(); i++)
            stack.pop(token);
        stack.push(AllTypes.INT64, token);
    }
}
