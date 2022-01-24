package com.mrh0.horth.output.x86_64.windows;

import com.mrh0.horth.output.instructions.InstructionTransformer;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.branching.HBranch;
import com.mrh0.horth.output.instructions.high.stackops.HAdd;
import com.mrh0.horth.output.instructions.high.stackops.base.*;
import com.mrh0.horth.output.instructions.high.stackops.HExit;
import com.mrh0.horth.output.instructions.high.stackops.HPutInt;
import com.mrh0.horth.output.x86_64.windows.nasm.branching.LBranch;
import com.mrh0.horth.output.x86_64.windows.nasm.other.LExit;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.base.*;
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
        else if(in instanceof HDup)
            out.add(LDup.INSTANCE);
        else if(in instanceof HDrop)
            out.add(LDrop.INSTANCE);
        else if(in instanceof HOver)
            out.add(LOver.INSTANCE);
        else if(in instanceof HSwap)
            out.add(LSwap.INSTANCE);

        else if(in instanceof HBranch)
            out.add(new LBranch((HBranch) in));
    }
}
