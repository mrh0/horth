package com.mrh0.horth.instructions.high;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.typechecker.types.IType;

import java.util.ArrayList;
import java.util.List;

public class LocalContext {
    private int totalSize;

    public record NamedEntry(String name, IType type, int offset) {}

    private List<NamedEntry> namedLocalsList;
    public final Func func;

    public LocalContext(Func func) {
        totalSize = 0;
        namedLocalsList = new ArrayList<>();
        this.func = func;
    }

    public int claim(int bytes) {
        var p = totalSize;
        totalSize += bytes;
        return p;
    }

    public void defineNamed(CompileData cd, Loc location, String name, IType type) throws CompileException {
        CompileData.NamedGlobalTypes globalType = cd.getNamedGlobal(name);
        if(globalType.isDefined())
            throw new CompileException(location, "Name '" + name + "' is already a defined " + globalType.name() + ".");
        if(findNamed(name) != null)
            throw new CompileException(location, "Name '" + name + "' is already a defined LOCAL.");
        namedLocalsList.add(new NamedEntry(name, type, claim(type.getSize())));
    }

    public void dereferenceNamed(int count) {
        for(int i = 0; i < count; i++) {
            namedLocalsList.remove(namedLocalsList.size()-1);
        }
    }

    private NamedEntry findNamed(String name) {
        for(NamedEntry le : namedLocalsList)
            if(le.name.equals(name))
                return le;
        return null;
    }

    public NamedEntry getNamed(Loc location, String name) throws CompileException {
        for(NamedEntry le : namedLocalsList)
            if(le.name.equals(name))
                return le;
        throw new CompileException(location, "Unknown local variable '" + name + "'.");
    }

    public int getClaimedBytes() {
        return totalSize;
    }
}
