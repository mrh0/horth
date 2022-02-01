package com.mrh0.horth.ast.nodes.operands;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.operands.HPutString;

import java.util.List;

public class TString extends Tok {
    public final String str;

    public TString(String str) {
        this.str = str.substring(1, str.length()-1); // removes quotes
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append('"');
        sb.append(str);
        sb.append('"');
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HPutString(this, str));
    }
}
