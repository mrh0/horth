package com.mrh0.horth.output.instructions.high;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.typechecker.types.IType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompileData {
    public enum NamedGlobalTypes {
        CONST,
        FUNC,
        SIGNATURE,
        NONE;

        public boolean isDefined() {
            return this != NONE;
        }
    }

    private class LocalScope {
        public int offset = 0;

        public void incrementOffset(int increment) {
            this.offset += increment;
        }
    }
    public record LocalEntry(String name, IType type, LocalScope scope, int offset) {}

    private Map<String, NamedGlobalTypes> namedGlobalsMap;
    private List<LocalEntry> namedLocalsList;
    private List<LocalScope> localScopeList;

    public CompileData() {
        namedGlobalsMap = new HashMap<>();
        namedLocalsList = new ArrayList<>();
        localScopeList = new ArrayList<>();
    }

    public void defineNamedGlobal(Loc location, String name, NamedGlobalTypes inType) throws CompileException {
        if(name.equals("_"))
            throw new CompileException(location, "Global name for " + inType.name() + " cannot be '_'.");
        NamedGlobalTypes type = getNamedGlobal(name);
        if(inType == NamedGlobalTypes.FUNC && type != NamedGlobalTypes.SIGNATURE)
            throw new CompileException(location, "Overwritten function '" + name + "' is not a signature.");
        else if(type.isDefined())
            throw new CompileException(location, "'" + name + "' is already a defined " + type.name() + ".");
        namedGlobalsMap.put(name, inType);
    }

    public NamedGlobalTypes getNamedGlobal(String name) {
        return namedGlobalsMap.getOrDefault(name, NamedGlobalTypes.NONE);
    }

    public void claimLocal() {
        localScopeList.add(new LocalScope());
    }

    public LocalScope reclaimLocal() {
        return localScopeList.remove(localScopeList.size()-1);
    }

    public LocalScope getCurrentLocalScope() {
        return localScopeList.get(localScopeList.size()-1);
    }

    public void defineNamedLocal(Loc location, String name, IType type) throws CompileException {
        NamedGlobalTypes globalType = getNamedGlobal(name);
        if(globalType.isDefined())
            throw new CompileException(location, "Name '" + name + "' is already a defined " + globalType.name() + ".");
        LocalScope scope = getCurrentLocalScope();
        namedLocalsList.add(new LocalEntry(name, type, scope, scope.offset));
        scope.incrementOffset(type.getSize());
    }

    public LocalEntry findNamedLocal(Loc location, String name) throws CompileException {
        for(int i = namedLocalsList.size()-1; i >= 0; i--) {
            LocalEntry le = namedLocalsList.get(i);
            if(le.name().equals(name)) {
                if(le.scope() != getCurrentLocalScope())
                    throw new CompileException(location, "Out of scope local variable '" + name + "'.");
                return namedLocalsList.get(i);
            }
        }
        throw new CompileException(location, "Unknown local variable '" + name + "'.");
    }
}