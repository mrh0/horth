package com.mrh0.horth.ast;

import com.mrh0.horth.antlr.HorthBaseVisitor;
import com.mrh0.horth.antlr.HorthParser;
import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.TKeyword;
import com.mrh0.horth.ast.nodes.TProgram;
import com.mrh0.horth.ast.nodes.branching.TIf;
import com.mrh0.horth.ast.nodes.operands.TInt;
import com.mrh0.horth.ast.nodes.operators.TBinOp;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class Visitor extends HorthBaseVisitor<ITok> {
    public <T extends ParserRuleContext, O extends ITok> List<O> visit(List<T> list) {
        List<O> t = new ArrayList<>();
        for(T pt : list)
            t.add((O)visit(pt));
        return t;
    }

    public <T extends ParserRuleContext, O extends ITok> O cvisit(T rule) {
        return rule == null ? null : (O) visit(rule);
    }

    @Override
    public ITok visitProgram(HorthParser.ProgramContext ctx) {
        ctx.include();
        return new TProgram(visit(ctx.includes), visit(ctx.main));
    }

    @Override
    public ITok visitBlock(HorthParser.BlockContext ctx) {
        return new TBlock(visit(ctx.contents));
    }

    @Override
    public ITok visitBinop(HorthParser.BinopContext ctx) {
        return TBinOp.getBinOp(ctx.getText());
    }

    @Override
    public ITok visitGenInt(HorthParser.GenIntContext ctx) {
        return new TInt(ctx.getText());
    }

    @Override
    public ITok visitKeywords(HorthParser.KeywordsContext ctx) {
        return new TKeyword(ctx.getText());
    }

    @Override
    public ITok visitGenIf(HorthParser.GenIfContext ctx) {
        return new TIf(visit(ctx.conds), visit(ctx.doBlock), cvisit(ctx.elseBlock));
    }
}
