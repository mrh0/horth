package com.mrh0.horth.ast;

import com.mrh0.horth.exceptions.compile.CompileException;

import java.util.HashMap;
import java.util.Map;

public class CompileData {
    public enum NamedGlobalTypes {
        CONST,
        FUNC,
        FUNC_SIG,
        NONE;
    }
    private Map<String, NamedGlobalTypes> namedGlobalsMap;

    public CompileData() {
        namedGlobalsMap = new HashMap<>();
    }

    public void defineNamedGlobal(Loc location, String name, NamedGlobalTypes inType) throws CompileException {
        NamedGlobalTypes type = namedGlobalsMap.getOrDefault(name, NamedGlobalTypes.NONE);
        if(inType == NamedGlobalTypes.FUNC && type != NamedGlobalTypes.FUNC_SIG)
            throw new CompileException(location, "Overwritten function '"+name+"' is not a signature.");
        else if(type != null)
            throw new CompileException(location, "'"+name+"' is already defined as a "+inType.name()+".");
        namedGlobalsMap.put(name, inType);
    }
}
