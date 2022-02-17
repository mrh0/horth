package com.mrh0.horth.ast.nodes.function;

import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.Tok;
import com.mrh0.horth.ast.nodes.types.TType;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.CompileData;
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

    private final CompileData cd;

    public TFunc(CompileData cd, String name, List<TType> args, List<TType> rets, TBlock funcBody, Func.Prefix prefix) {
        this.name = name;
        this.args = args;
        this.rets = rets;
        this.funcBody = funcBody;
        this.prefix = prefix;

        this.cd = cd;
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

    private Func createFunction() throws HorthException {
        List<HighInst> body = new ArrayList<>();
        funcBody.expand(body);
        var func = new Func(this, name, Contract.from(args, rets), body, prefix);
        cd.defineNamedGlobal(getLocation(), func.getName(), CompileData.NamedGlobalTypes.FUNC);
        cd.storeFunction(func);
        return func;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        space.add(new HBFunc(this, createFunction()));
    }
}
