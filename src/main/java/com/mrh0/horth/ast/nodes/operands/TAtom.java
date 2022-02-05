package com.mrh0.horth.ast.nodes.operands;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.stackops.operands.HPutAtom;

import java.util.List;

public class TAtom extends Tok {
    public final String atom;

    public TAtom(String atom) {
        this.atom = atom.substring(1).toLowerCase();
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(':');
        sb.append(atom);
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HPutAtom(this, atom));
    }
}
