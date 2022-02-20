package com.mrh0.horth.instructions.high;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.output.Arch;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.IType;
import com.mrh0.horth.util.Util;

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

    private final Arch arch;

    private Map<String, NamedGlobalTypes> namedGlobalsMap;
    private List<LocalEntry> namedLocalsList;
    private List<LocalScope> localScopeList;
    private List<Func> startFunctions;

    public final List<Util.RealString> strings;
    public final Map<String, Void> atoms;
    public final Map<String, List<Func>> functions;

    public CompileData(Arch arch) {
        this.arch = arch;

        this.namedGlobalsMap = new HashMap<>();
        this.namedLocalsList = new ArrayList<>();
        this.localScopeList = new ArrayList<>();

        this.strings = new ArrayList<>();
        this.atoms = new HashMap<>();
        this.functions = new HashMap<>();
        this.startFunctions = new ArrayList<>();
    }

    public void defineNamedGlobal(Loc location, String name, NamedGlobalTypes inType) throws CompileException {
        if(name.equals("_"))
            throw new CompileException(location, "Global name for " + inType.name() + " cannot be '_'.");
        NamedGlobalTypes type = getNamedGlobal(name);
        if(inType != NamedGlobalTypes.FUNC && type != NamedGlobalTypes.SIGNATURE)
            throw new CompileException(location, "Overwritten function '" + name + "' is not a signature.");
        else if(type.isDefined() && type != inType)
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
        scope.incrementOffset(8);
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

    public Arch.SysCall getSysCallByName(Loc location, String name) throws HorthException {
        Arch.SysCall sc = arch.getSysCallByName(name);
        if(sc == null)
            throw new CompileException(location, "Unknown System-Call '" + name + "'.");
        return sc;
    }

    public int storeString(Util.RealString rstring) {
        strings.add(rstring);
        return strings.size()-1;
    }

    public void storeAtom(String atom) {
        atoms.put(atom, null);
    }

    public void storeFunction(Func func) {
        List<Func> funcs = functions.get(func.getName());
        if(funcs == null)
            functions.put(func.getName(), funcs = new ArrayList<>());
        if(func.getPrefix() == Func.Prefix.START)
            startFunctions.add(func);
        funcs.add(func);
    }

    public List<Func> getFunctions(Loc location, String name) throws HorthException {
        if(!functions.containsKey(name))
            throw new CompileException(location, "Unknown function '" + name + "'.");
        return functions.get(name);
    }

    public Func getFunction(Loc location, String name, VirtualTypeStack stack) throws HorthException {
        getFunctions(location, name);
        return null;
    }

    public List<Func> getStartFunctions() {
        return this.startFunctions;
    }
}
