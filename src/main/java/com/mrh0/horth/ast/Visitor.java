package com.mrh0.horth.ast;

import com.mrh0.horth.antlr.HorthBaseVisitor;
import com.mrh0.horth.antlr.HorthParser;
import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.TProgram;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class Visitor extends HorthBaseVisitor<ITok> {
    public <T extends ParserRuleContext> List<ITok> visit(List<T> list) {
        List<ITok> t = new ArrayList<>();
        for(T pt : list)
            t.add(visit(pt));
        return t;
    }

    @Override
    public ITok visitProgram(HorthParser.ProgramContext ctx) {
        ctx.include();
        return new TProgram(visit(ctx.includes), visit(ctx.main));
    }
}
