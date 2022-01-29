package com.mrh0.horth.ast.nodes.types;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

public class TType extends Tok {
    public final IType type;

    public TType(IType type) {
        this.type = type;
    }

    public TType(String simpleName) {
        this.type = AllTypes.bySimpleName(simpleName);
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Type(");
        sb.append(AllTypes.stringOf(this.type));
        sb.append(")");
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {}
}
