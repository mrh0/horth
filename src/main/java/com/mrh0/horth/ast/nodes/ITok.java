package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.parser.ParserException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.IExpanding;

import java.util.List;

public interface ITok extends IExpanding {
    Loc getLocation();

    StringBuilder toString(StringBuilder sb);
}
