package com.mrh0.horth.ast;

import org.antlr.v4.runtime.Token;

import java.io.File;

public class Loc {
    public final Token token;
    public final File file;

    public Loc(Token token) {
        this.token = token;
        this.file = null;
    }

    public Loc(Token token, File file) {
        this.token = token;
        this.file = file;
    }

    public String getFileName() {
        return file == null ? "unknown file" : file.getAbsolutePath();
    }

    @Override
    public String toString() {
        return getFileName() + ":" + token.getLine() + ":" + token.getCharPositionInLine() + ":\n" + token.getText();
    }
}
