package com.mrh0.horth.output.instructions.high;

import com.mrh0.horth.ast.nodes.ITok;

public abstract class HighBlock extends HighInst implements IExpanding {

    public HighBlock(ITok token) {
        super(token);
    }
}
