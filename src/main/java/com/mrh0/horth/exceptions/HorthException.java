package com.mrh0.horth.exceptions;

import com.mrh0.horth.ast.Loc;

public class HorthException extends Exception {
    private final Loc location;
    private String message = "Unexpected Horth Exception.";

    public HorthException() {
        location = null;
    }
    public HorthException(Loc location) {
        this.location = location;
    }

    @Override
    public String getMessage() {
        return "\n\tat " + (location == null ? "UNKNOWN: " : location.toString() + "\nJava Exception:");
    }
}
