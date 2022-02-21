package com.mrh0.horth.ast.nodes.accessor;

import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.accessor.HProps;

import java.util.List;

public class TProps extends Tok {
    private final List<String> props;

    public TProps(List<String> props) {
        this.props = props;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(".");
        return sb;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HProps(this, props));
    }
}
