package com.mrh0.horth.output.x86_64.windows;

import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.output.instructions.InstructionTransformer;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.HighLabel;
import com.mrh0.horth.output.instructions.high.branching.HBranch;
import com.mrh0.horth.output.instructions.high.branching.HBreak;
import com.mrh0.horth.output.instructions.high.branching.HJump;
import com.mrh0.horth.output.instructions.high.stackops.binop.HAdd;
import com.mrh0.horth.output.instructions.high.stackops.base.*;
import com.mrh0.horth.output.instructions.high.stackops.HExit;
import com.mrh0.horth.output.instructions.high.stackops.binop.HAnd;
import com.mrh0.horth.output.instructions.high.stackops.binop.HOr;
import com.mrh0.horth.output.instructions.high.stackops.binop.compare.*;
import com.mrh0.horth.output.instructions.high.stackops.operands.HPutBool;
import com.mrh0.horth.output.instructions.high.stackops.operands.HPutInt;
import com.mrh0.horth.output.instructions.high.stackops.binop.HSub;
import com.mrh0.horth.output.instructions.high.stackops.unop.HNot;
import com.mrh0.horth.output.x86_64.windows.nasm.branching.LBranch;
import com.mrh0.horth.output.x86_64.windows.nasm.other.LExit;
import com.mrh0.horth.output.x86_64.windows.nasm.other.LJump;
import com.mrh0.horth.output.x86_64.windows.nasm.other.Label;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.base.*;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.binop.LBinary;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.binop.LCompare;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.binop.LAdd;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.binop.LSub;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.put.LPutInt;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.unop.LNot;

import java.util.List;

public class Win64nasmIT implements InstructionTransformer<LowInst> {

    @Override
    public void transform(List<LowInst> out, HighInst in) throws CompileException {
        /*switch(in) {
            case HPut i: put.add(i);
        }*/
        if(in instanceof HPutInt)
            out.add(new LPutInt((HPutInt) in));
        else if(in instanceof HPutBool)
            out.add(new LPutInt((HPutBool) in));
        else if(in instanceof HExit)
            out.add(LExit.INSTANCE);

        else if(in instanceof HAdd)
            out.add(LAdd.INSTANCE);
        else if(in instanceof HSub)
            out.add(LSub.INSTANCE);

        else if(in instanceof HAnd)
            out.add(LBinary.AND);
        else if(in instanceof HOr)
            out.add(LBinary.OR);

        else if(in instanceof HLessThan)
            out.add(LCompare.LESS_THAN);
        else if(in instanceof HLessThanOrEquals)
            out.add(LCompare.LESS_THAN_OR_EQUALS);
        else if(in instanceof HGreaterThan)
            out.add(LCompare.GREATER_THAN);
        else if(in instanceof HGreaterThanOrEquals)
            out.add(LCompare.GREATER_THAN_OR_EQUALS);
        else if(in instanceof HEquals)
            out.add(LCompare.EQUALS);
        else if(in instanceof HNotEquals)
            out.add(LCompare.NOT_EQUALS);

        else if(in instanceof HNot)
            out.add(LNot.INSTANCE);

        else if(in instanceof HDup)
            out.add(LDup.INSTANCE);
        else if(in instanceof HDrop)
            out.add(LDrop.INSTANCE);
        else if(in instanceof HOver)
            out.add(LOver.INSTANCE);
        else if(in instanceof HSwap)
            out.add(LSwap.INSTANCE);

        else if(in instanceof HighLabel)
            out.add(new Label((HighLabel) in));
        else if(in instanceof HBranch)
            out.add(new LBranch((HBranch) in));
        else if(in instanceof HJump)
            out.add(new LJump((HJump) in));
        else if(in instanceof HBreak)
            out.add(new LJump((HBreak) in));
    }
}
