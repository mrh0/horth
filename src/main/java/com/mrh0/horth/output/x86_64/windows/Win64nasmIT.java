package com.mrh0.horth.output.x86_64.windows;

import com.mrh0.horth.output.instructions.InstructionTransformer;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.HPutInt;
import com.mrh0.horth.output.x86_64.windows.low.stackop.LPut;
import com.mrh0.horth.output.x86_64.windows.low.LowInst;

import java.util.List;

public class Win64nasmIT implements InstructionTransformer {
    @Override
    public void transform(List<LowInst> out, HighInst in) {
        /*switch(in) {
            case HPut i: put.add(i);
        }*/
        if(in instanceof HPutInt)
            out.add(new LPut(in));
    }
}
