package com.mrh0.horth.output;

import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Arch {
    private static Map<String, Arch> map = new HashMap<>();

    public abstract String getName();
    public abstract StringBuilder compile(List<HighInst> list) throws CompileException;

    public static void register(Arch arch) {
        map.put(arch.getName(), arch);
    }

    public static Arch get(String name) {
        return map.get(name);
    }
}
