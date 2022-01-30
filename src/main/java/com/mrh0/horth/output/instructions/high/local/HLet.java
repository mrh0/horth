package com.mrh0.horth.output.instructions.high.local;

import com.mrh0.horth.ast.nodes.other.TLet;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualStack;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

public class HLet extends HighInst implements ISpecialCheck {

    private List<String> names;
    private HReclaim reclaim;

    public HLet(TLet tok) throws HorthException {
        super(tok);
        this.names = tok.names;
        this.reclaim = new HReclaim(token);
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualStack stack, CompileData cd) throws HorthException {
        cd.claimLocal();
        int size = 0;
        for(int i = names.size()-1; i >= 0; i--) { // Reversed or not?
            IType type = stack.pop(token).type();
            cd.defineNamedLocal(token.getLocation(), names.get(i), type);
            size += type.getSize();
        }
        this.reclaim.set(names.size(), size);
    }

    public HReclaim getReclaim() {
        return this.reclaim;
    }
}
