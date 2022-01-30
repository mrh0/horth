package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.output.instructions.high.IExpanding;

public interface ITok extends IExpanding {
    Loc getLocation();

    StringBuilder toString(StringBuilder sb);
}
