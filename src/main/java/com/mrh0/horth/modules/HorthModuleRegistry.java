package com.mrh0.horth.modules;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.module.ModuleException;

import java.util.HashMap;
import java.util.Map;

public class HorthModuleRegistry {
    private static final Map<String, HorthModule> registry = new HashMap<>();

    public static void register(Loc location, HorthModule module) throws ModuleException {
        if(registry.containsKey(module.getName()))
            throw new ModuleException(location, module);
        registry.put(module.getName(), module);
    }
}
