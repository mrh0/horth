package com.mrh0.horth.output.instructions.high.stackops.other;

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
    private final String call;
    private Arch.SysCall syscall;

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
        syscall = cd.getSysCallByName(token.getLocation(), call);
        for(int i = 0; i < syscall.args(); i++)
            stack.pop(token);
            //stack.check(token, AllTypes.INT64);
        stack.push(AllTypes.INT, token);
    }

    public Arch.SysCall getSysCall() {
        return syscall;
    }
}
