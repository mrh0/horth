package com.mrh0.horth.ast.nodes.other;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.HSysCall;

import java.util.List;

public class TSysCall extends Tok {
    private String call;

    public TSysCall(String call) {
        this.call = call;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("SysCall(");
        sb.append(call);
        sb.append(")");
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HSysCall(this, call));
    }
}
