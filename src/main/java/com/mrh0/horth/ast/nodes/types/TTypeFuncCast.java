package com.mrh0.horth.ast.nodes.types;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.types.HCast;
import com.mrh0.horth.instructions.high.types.HCastUnsafe;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

public class TTypeFuncCast extends Tok {
    public final IType type;
    public final boolean unsafe;

    public TTypeFuncCast(TType token, boolean unsafe) {
        this.type = token.type;
        this.unsafe = unsafe;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("cast(");
        sb.append(AllTypes.stringOf(type));
        sb.append(")");
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(unsafe ? new HCastUnsafe(this) : new HCast(this));
    }
}
