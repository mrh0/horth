package com.mrh0.horth.ast.nodes.types;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.stackops.operands.HPutInt;
import com.mrh0.horth.instructions.high.types.HNew;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

public class TTypeFuncNew extends Tok {
    private final IType type;

    public TTypeFuncNew(TType token) {
        this.type = token.type;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("new(");
        sb.append(AllTypes.stringOf(type));
        sb.append(")");
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HNew(this, type));
    }
}
