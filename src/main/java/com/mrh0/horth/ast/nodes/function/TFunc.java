package com.mrh0.horth.ast.nodes.function;

import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.ast.nodes.types.TType;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;

import java.util.ArrayList;
import java.util.List;

public class TFunc extends Tok {
    private final String name;
    private final List<TType> args;
    private final List<TType> rets;
    private final TBlock funcBody;

    public TFunc(String name, List<TType> args, List<TType> rets, TBlock funcBody) {
        this.name = name;
        this.args = args;
        this.rets = rets;
        this.funcBody = funcBody;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Func(");
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

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        List<HighInst> body = new ArrayList<>();
        funcBody.expand(body);
        new Func(name, Contract.from(args, rets), body);
    }
}
