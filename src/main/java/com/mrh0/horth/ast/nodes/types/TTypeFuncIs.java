package com.mrh0.horth.ast.nodes.types;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.types.HCast;
import com.mrh0.horth.output.instructions.high.types.HCastUnsafe;
import com.mrh0.horth.output.instructions.high.types.HIs;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

public class TTypeFuncIs extends Tok {
    public final IType type;

    public TTypeFuncIs(TType token) {
        this.type = token.type;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("is(");
        sb.append(AllTypes.stringOf(type));
        sb.append(")");
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HIs(this));
    }
}
