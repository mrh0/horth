package com.mrh0.horth.exceptions;

import com.mrh0.horth.ast.Loc;

public class HorthException extends Exception {
    private Loc location;
    private String message = "Unexpected Horth Exception.\n";

    public HorthException() {}
    public HorthException(Loc location) {
        this.location = location;
    }

    @Override
    public String getMessage() {
        return (location == null ? "UNKNOWN: " : location.toString()) + message + super.getMessage();
    }
}
