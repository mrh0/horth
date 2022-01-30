package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.ast.Loc;
import org.antlr.v4.runtime.Token;

import java.io.File;

public abstract class Tok implements ITok {
    private Loc location;

    public ITok loc(Token token, File file) {
        location = new Loc(token, file);
        return this;
    }

    /*@Override
    public void expand(List<HighInst> space, CompileData cd) {
        space.add(this);
    }*/

    @Override
    public Loc getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return toString(new StringBuilder()).toString();
    }
}
