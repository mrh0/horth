package com.mrh0.horth.exceptions.parser;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;

public class ParserException extends HorthException {
    public String message;

    public ParserException(Loc location, String message) {
        super(location);
        this.message = message;
    }

    @Override
    public String additional() {
        return message;
    }
}
