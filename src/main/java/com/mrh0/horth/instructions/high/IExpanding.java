package com.mrh0.horth.instructions.high;

import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.exceptions.HorthException;

import java.util.ArrayList;
import java.util.List;

public interface IExpanding {
    void expand(List<HighInst> space) throws HorthException;

    static void expandAll(List<HighInst> block, List<HighInst> space) throws HorthException {
        for(HighInst hi : block) {
            if (hi instanceof IExpanding)
                ((IExpanding) hi).expand(space);
            else
                space.add(hi);
        }
    }

    static void expandBlocks(List<TBlock> blocks, List<List<HighInst>> lists) throws HorthException {
        for(TBlock block : blocks) {
            List<HighInst> insts = new ArrayList<>();
            block.expand(insts);
            lists.add(insts);
        }
    }
}
