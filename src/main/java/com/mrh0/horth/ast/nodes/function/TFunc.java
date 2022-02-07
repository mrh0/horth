package com.mrh0.horth.ast.nodes.function;

import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.ast.nodes.types.TType;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.function.HBFunc;
import com.mrh0.horth.typechecker.Contract;

import java.util.ArrayList;
import java.util.List;

public class TFunc extends Tok {
    private final String name;
    private final List<TType> args;
    private final List<TType> rets;
    private final TBlock funcBody;
    private Func.Prefix prefix;

    public TFunc(String name, List<TType> args, List<TType> rets, TBlock funcBody, Func.Prefix prefix) {
        this.name = name;
        this.args = args;
        this.rets = rets;
        this.funcBody = funcBody;
        this.prefix = prefix;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Func(");
        sb.append(prefix);
        sb.append(", ");
        sb.append(name);
        sb.append(", ");
        sb.append(args);
        sb.append(", ");
        sb.append(rets);
        sb.append(", ");
        funcBody.toString(sb);
        sb.append(")");
        return sb;
    }

    public Func getFunction() throws HorthException {
        List<HighInst> body = new ArrayList<>();
        funcBody.expand(body);
        return new Func(this, name, Contract.from(args, rets), body, prefix);
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HBFunc(this, getFunction()));
    }
}
