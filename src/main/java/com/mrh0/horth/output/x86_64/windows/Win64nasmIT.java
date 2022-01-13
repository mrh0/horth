package com.mrh0.horth.output.x86_64.windows;

import com.mrh0.horth.output.instructions.InstructionTransformer;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.HAdd;
import com.mrh0.horth.output.instructions.high.stackops.HExit;
import com.mrh0.horth.output.instructions.high.stackops.HPutInt;
import com.mrh0.horth.output.x86_64.windows.nasm.other.LExit;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.math.LAdd;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.put.LPutInt;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;

import java.util.List;

public class Win64nasmIT implements InstructionTransformer {

    @Override
    public void transform(List<LowInst> out, HighInst in) {
        /*switch(in) {
            case HPut i: put.add(i);
        }*/
        if(in instanceof HPutInt)
            out.add(new LPutInt((HPutInt) in));
        else if(in instanceof HExit)
            out.add(LExit.INSTANCE);
        else if(in instanceof HAdd)
            out.add(LAdd.INSTANCE);
    }
}
