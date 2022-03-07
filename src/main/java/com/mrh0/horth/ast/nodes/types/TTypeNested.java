package com.mrh0.horth.ast.nodes.types;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

public class TTypeNested extends TType {
    public TTypeNested(String nestedName, TType nested) {
        super(AllTypes.byNestedName(nestedName, nested.type));
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
