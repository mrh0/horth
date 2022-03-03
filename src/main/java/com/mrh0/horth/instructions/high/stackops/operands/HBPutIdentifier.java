package com.mrh0.horth.instructions.high.stackops.operands;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.IExpanding;
import com.mrh0.horth.instructions.high.LocalContext;
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
        VAR, VAR_REF, FUNC, FUNC_INLINE, FUNC_REF, CONST, SIGNATURE, UNDEFINED;
    }

    private IdentifierType idt;

    public HBPutIdentifier(ITok token, String name) {
        super(token);
        this.name = name;
        this.isAddr = name.charAt(name.length()-1) == '@';
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

        LocalContext.NamedEntry ne;
        switch(idt) {
            case VAR:
                ne = cd.local().getNamed(token.getLocation(), this.name);
                stack.push(ne.type(), token);
                this.offset = ne.offset();
                break;
            case VAR_REF:
                ne = cd.local().getNamed(token.getLocation(), this.name.substring(0, this.name.length()-1));
                stack.push(AllTypes.ref(ne.type()), token);
                this.offset = ne.offset();
                break;
            case FUNC:
                //TODO: Overloads
                //var funcs = cd.getFunctions(token.getLocation(), this.name);
                func = cd.getFunction(token.getLocation(), this.name, stack);
                func.getContract().apply(stack, token);
                if(func.getPrefix() == Func.Prefix.INLINE)
                    idt = IdentifierType.FUNC_INLINE;
                break;
            default:
                throw new CompileException(token.getLocation(), "Unimplemented identifier type.");
        }
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
                space.add(new HCallFunc(token, func));
                break;
            case FUNC_INLINE:
                IExpanding.expandAll(func.getBody(), space);
                break;
            default:
                throw new CompileException(token.getLocation(), "Unimplemented identifier type.");
        }
    }
}
