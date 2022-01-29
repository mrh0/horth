package com.mrh0.horth.exceptions.typechecker;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

public class CannotCastException extends HorthException {
    public final IType from, to;

    public CannotCastException(Loc location, IType from, IType to) {
        super(location);
        this.from = from;
        this.to = to;
    }

    @Override
    public String additional() {
        return "\tCannot cast type '" + AllTypes.stringOf(from) + "' to '" + AllTypes.stringOf(to) + "'.";
    }
}
