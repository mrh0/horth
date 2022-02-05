package com.mrh0.horth.output;

import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Arch {
    private static Map<String, Arch> map = new HashMap<>();
    public record SysCall(int call, int args) {}

    public abstract String getName();
    public abstract StringBuilder compile(CompileData data, List<HighInst> list) throws CompileException;

    public static void register(Arch arch) {
        map.put(arch.getName(), arch);
    }

    public static Arch get(String name) {
        return map.get(name);
    }

    public abstract SysCall getSysCallByName(String name) throws HorthException;
}
