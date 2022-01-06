package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.ast.Loc;

import java.util.List;

public interface ITok {
    Loc getLocation();

    void expand(List<ITok> space, CompileData cd);

    StringBuilder toString(StringBuilder sb);
}
