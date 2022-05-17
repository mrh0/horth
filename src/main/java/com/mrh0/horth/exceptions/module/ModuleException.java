package com.mrh0.horth.exceptions.module;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.modules.HorthModule;

public class ModuleException extends HorthException {
    private final HorthModule module;
    public ModuleException(Loc loc, HorthModule module) {
        super(loc);
        this.module = module;
    }

    @Override
    public String additional() {
        return "\n\tCannot load module '" + module.getName() + "'.";
    }
}
