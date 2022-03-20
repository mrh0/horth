package com.mrh0.horth.output.x86_64.linux;

import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.InstructionTransformer;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.HighLabel;
import com.mrh0.horth.instructions.high.accessor.HAccessor;
import com.mrh0.horth.instructions.high.accessor.HAccessorStack;
import com.mrh0.horth.instructions.high.accessor.HProp;
import com.mrh0.horth.instructions.high.branching.HBranch;
import com.mrh0.horth.instructions.high.branching.HBreak;
import com.mrh0.horth.instructions.high.branching.HJump;
import com.mrh0.horth.instructions.high.function.HCallFunc;
import com.mrh0.horth.instructions.high.function.HFunc;
import com.mrh0.horth.instructions.high.function.HRet;
import com.mrh0.horth.instructions.high.io.HLog;
import com.mrh0.horth.instructions.high.local.HClaim;
import com.mrh0.horth.instructions.high.local.HLet;
import com.mrh0.horth.instructions.high.local.HReclaim;
import com.mrh0.horth.instructions.high.stackops.base.HDrop;
import com.mrh0.horth.instructions.high.stackops.base.HDup;
import com.mrh0.horth.instructions.high.stackops.base.HOver;
import com.mrh0.horth.instructions.high.stackops.base.HSwap;
import com.mrh0.horth.instructions.high.stackops.binop.compare.*;
import com.mrh0.horth.instructions.high.stackops.operands.*;
import com.mrh0.horth.instructions.high.stackops.other.HSysCall;
import com.mrh0.horth.instructions.high.stackops.binop.HAdd;
import com.mrh0.horth.instructions.high.stackops.other.HExit;
import com.mrh0.horth.instructions.high.stackops.binop.binary.HBinaryAnd;
import com.mrh0.horth.instructions.high.stackops.other.HVoid;
import com.mrh0.horth.instructions.high.stackops.unop.binary.HBinaryNot;
import com.mrh0.horth.instructions.high.stackops.binop.binary.HBinaryOr;
import com.mrh0.horth.instructions.high.stackops.binop.logical.HAnd;
import com.mrh0.horth.instructions.high.stackops.binop.logical.HOr;
import com.mrh0.horth.instructions.high.stackops.binop.HSub;
import com.mrh0.horth.instructions.high.stackops.unop.logical.HNot;
import com.mrh0.horth.output.x86_64.linux.nasm.accessor.LAccessor;
import com.mrh0.horth.output.x86_64.linux.nasm.accessor.LAccessorStack;
import com.mrh0.horth.output.x86_64.linux.nasm.accessor.LOffset;
import com.mrh0.horth.output.x86_64.linux.nasm.accessor.LRead;
import com.mrh0.horth.output.x86_64.linux.nasm.branching.LBranch;
import com.mrh0.horth.output.x86_64.linux.nasm.function.LCallFunc;
import com.mrh0.horth.output.x86_64.linux.nasm.function.LFuncInit;
import com.mrh0.horth.output.x86_64.linux.nasm.function.LRet;
import com.mrh0.horth.output.x86_64.linux.nasm.io.LLog;
import com.mrh0.horth.output.x86_64.linux.nasm.local.LClaim;
import com.mrh0.horth.output.x86_64.linux.nasm.local.LLet;
import com.mrh0.horth.output.x86_64.linux.nasm.local.LReclaim;
import com.mrh0.horth.output.x86_64.linux.nasm.other.*;
import com.mrh0.horth.output.x86_64.linux.nasm.stackop.base.LDrop;
import com.mrh0.horth.output.x86_64.linux.nasm.stackop.base.LDup;
import com.mrh0.horth.output.x86_64.linux.nasm.stackop.base.LOver;
import com.mrh0.horth.output.x86_64.linux.nasm.stackop.base.LSwap;
import com.mrh0.horth.output.x86_64.linux.nasm.stackop.binop.LBinary;
import com.mrh0.horth.output.x86_64.linux.nasm.stackop.binop.LCompare;
import com.mrh0.horth.output.x86_64.linux.nasm.stackop.binop.LAdd;
import com.mrh0.horth.output.x86_64.linux.nasm.stackop.binop.LSub;
import com.mrh0.horth.output.x86_64.linux.nasm.stackop.put.*;
import com.mrh0.horth.output.x86_64.linux.nasm.LowInst;

import java.util.List;

public class ArchElf64nasmIT implements InstructionTransformer<LowInst> {

    @Override
    public void transform(List<LowInst> out, HighInst in) throws CompileException {
        /*switch(in) {
            case HPut i: put.add(i);
        }*/
        if(in instanceof HPutInt)
            out.add(new LPutInt((HPutInt) in));
        else if(in instanceof HPutBool)
            out.add(new LPutInt((HPutBool) in));
        else if(in instanceof HPutChar)
            out.add(new LPutInt((HPutChar) in));
        else if(in instanceof HPutString)
            out.add(new LPutString((HPutString) in));
        else if(in instanceof HPutAtom)
            out.add(new LPutAtom((HPutAtom) in));
        if(in instanceof HVoid)
            out.add(new LPutInt(0));

        else if(in instanceof HPutVar) {
            var v = ((HPutVar) in);
            if(v.isAddr)
                out.add(new LPutVarAddr(v.offset));
            else
                out.add(new LPutVar(v.offset));
        }
        else if(in instanceof HCallFunc)
            out.add(new LCallFunc((HCallFunc) in));
        else if(in instanceof HFunc)
            out.add(new LFuncInit());
        else if(in instanceof HRet) {
            HRet hr = (HRet) in;
            if(hr.getLocalContext().func.getPrefix() != Func.Prefix.INLINE)
                out.add(new LRet(hr.getLocalContext().getClaimedBytes()));
        }

        else if(in instanceof HExit)
            out.add(LExit.INSTANCE);

        else if(in instanceof HProp) {
            var v = (HProp) in;
            if(v.isAddr())
                out.add(new LOffset(v.getOffset()));
            else
                out.add(new LRead(v));
        }

        else if(in instanceof HLog)
            out.add(LLog.INSTANCE);

        else if(in instanceof HAccessorStack)
            out.add(new LAccessorStack((HAccessorStack) in));
        else if(in instanceof HAccessor)
            out.add(new LAccessor((HAccessor) in));

        else if(in instanceof HSysCall)
            out.add(new LSysCall(((HSysCall)in).getSysCall()));

        else if(in instanceof HAdd)
            out.add(LAdd.INSTANCE);
        else if(in instanceof HSub)
            out.add(LSub.INSTANCE);

        else if(in instanceof HBinaryAnd)
            out.add(LBinary.AND);
        else if(in instanceof HBinaryOr)
            out.add(LBinary.OR);
        else if(in instanceof HBinaryNot)
            out.add(LBinary.NOT);

        else if(in instanceof HAnd)
            out.add(LBinary.AND);
        else if(in instanceof HOr)
            out.add(LBinary.OR);
        else if(in instanceof HNot)
            out.add(LBinary.NOT);

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

        else if(in instanceof HLet)
            out.add(new LLet((HLet)in));
        else if(in instanceof HClaim)
            out.add(new LClaim(((HClaim)in).bytes));
        else if(in instanceof HReclaim)
            out.add(new LReclaim(((HReclaim)in).bytes));
    }
}
