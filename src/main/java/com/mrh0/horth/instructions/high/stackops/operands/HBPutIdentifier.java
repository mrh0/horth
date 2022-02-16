package com.mrh0.horth.instructions.high.stackops.operands;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.IExpanding;
import com.mrh0.horth.instructions.high.function.HCallFunc;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.AllTypes;

import java.util.List;

public class HBPutIdentifier extends HighInst implements ISpecialCheck, IExpanding {
    public final String name;
    public int offset = 0;
    public final boolean isAddr;
    private Func func;

    private enum IdentifierType {
        VAR, VAR_REF, FUNC, FUNC_REF, CONST, SIGNATURE, UNDEFINED;
    }

    private IdentifierType idt;

    public HBPutIdentifier(ITok token, String name) {
        super(token);
        this.name = name;
        this.isAddr = name.charAt(0) == '@';
        this.idt = IdentifierType.UNDEFINED;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        var ng = cd.getNamedGlobal(name);
        if(ng == CompileData.NamedGlobalTypes.FUNC) {
            idt = IdentifierType.FUNC;
        }//TODO: else if const, sig...
        else if(isAddr) {
            idt = IdentifierType.VAR_REF;
        }
        else {
            idt = IdentifierType.VAR;
        }

        CompileData.LocalEntry le;
        switch(idt) {
            case VAR:
                le = cd.findNamedLocal(token.getLocation(), this.name);
                stack.push(le.type(), token);
                this.offset = le.offset();
                break;
            case VAR_REF:
                le = cd.findNamedLocal(token.getLocation(), this.name.substring(1));
                stack.push(AllTypes.ref(le.type()), token);
                this.offset = le.offset();
                break;
            case FUNC:
                //TODO: Overloads
                var funcs = cd.getFunctions(token.getLocation(), this.name);
                func = funcs.get(0);
                func.getContract().apply(stack, token);
                break;
        }
        throw new CompileException(token.getLocation(), "Unimplemented identifier type.");
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        switch(idt) {
            case VAR:
                space.add(new HPutVar(token, name, offset, false));
                break;
            case VAR_REF:
                space.add(new HPutVar(token, name, offset, true));
                break;
            case FUNC:
                space.add(new HCallFunc(token, func, func.label));
                break;
        }
        throw new CompileException(token.getLocation(), "Unimplemented identifier type.");
    }
}
