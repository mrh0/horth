package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.parser.ParserException;
import com.mrh0.horth.output.instructions.high.HighInst;

import java.util.List;

public interface ITok {
    Loc getLocation();

    void expand(List<HighInst> space) throws HorthException;

    StringBuilder toString(StringBuilder sb);
}
