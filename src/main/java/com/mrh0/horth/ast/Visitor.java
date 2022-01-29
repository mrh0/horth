package com.mrh0.horth.ast;

import com.mrh0.horth.antlr.HorthBaseVisitor;
import com.mrh0.horth.antlr.HorthParser;
import com.mrh0.horth.ast.nodes.*;
import com.mrh0.horth.ast.nodes.branching.TIf;
import com.mrh0.horth.ast.nodes.branching.TWhile;
import com.mrh0.horth.ast.nodes.infix.TInfixBinOp;
import com.mrh0.horth.ast.nodes.infix.TInfixUnOp;
import com.mrh0.horth.ast.nodes.operands.TBool;
import com.mrh0.horth.ast.nodes.operands.TChar;
import com.mrh0.horth.ast.nodes.operands.TInt;
import com.mrh0.horth.ast.nodes.operators.TBinOp;
import com.mrh0.horth.ast.nodes.operators.TUnOp;
import com.mrh0.horth.ast.nodes.types.TType;
import com.mrh0.horth.ast.nodes.types.TTypeFuncCast;
import com.mrh0.horth.ast.nodes.types.TTypeFuncSizeof;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Visitor extends HorthBaseVisitor<ITok> {
    private File file;

    public Visitor(File file) {
        this.file = file;
    }

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
        return new TProgram(visit(ctx.includes), visit(ctx.main))
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitBlock(HorthParser.BlockContext ctx) {
        return new TBlock(visit(ctx.contents))
                .loc(ctx.start, file);
    }

    //Operators
    @Override
    public ITok visitBinop(HorthParser.BinopContext ctx) {
        return TBinOp.getBinOp(ctx.getText())
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitGenUnop(HorthParser.GenUnopContext ctx) {
        return TUnOp.getUnOp(ctx.getText())
                .loc(ctx.start, file);
    }

    //Operands
    @Override
    public ITok visitIntegerInt(HorthParser.IntegerIntContext ctx) {
        return new TInt(ctx.getText(), 10)
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitIntegerBin(HorthParser.IntegerBinContext ctx) {
        return new TInt(ctx.getText().substring(2), 2)
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitIntegerHex(HorthParser.IntegerHexContext ctx) {
        return new TInt(ctx.getText().substring(2), 16)
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitGenBool(HorthParser.GenBoolContext ctx) {
        return TBool.get(ctx.getText())
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitGenChar(HorthParser.GenCharContext ctx) {
        return new TChar(ctx.getText())
                .loc(ctx.start, file);
    }

    //Keywords
    @Override
    public ITok visitKeywords(HorthParser.KeywordsContext ctx) {
        return new TKeyword(ctx.getText()).loc(ctx.start, file);
    }

    //Types
    @Override
    public ITok visitDataTypeSimple(HorthParser.DataTypeSimpleContext ctx) {
        return new TType(ctx.getText())
                .loc(ctx.start, file);
    }

    //TypeFuncs
    @Override
    public ITok visitTypefuncSizeof(HorthParser.TypefuncSizeofContext ctx) {
        return new TTypeFuncSizeof(cvisit(ctx.dataType()))
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitTypefuncCast(HorthParser.TypefuncCastContext ctx) {
        return new TTypeFuncCast(cvisit(ctx.dataType()), false)
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitTypefuncCastUnsafe(HorthParser.TypefuncCastUnsafeContext ctx) {
        return new TTypeFuncCast(cvisit(ctx.dataType()), true)
                .loc(ctx.start, file);
    }

    //Branching
    @Override
    public ITok visitGenIf(HorthParser.GenIfContext ctx) {
        return new TIf(visit(ctx.conds), visit(ctx.doBlock), cvisit(ctx.elseBlock))
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitGenWhile(HorthParser.GenWhileContext ctx) {
        return new TWhile(cvisit(ctx.cond), cvisit(ctx.doBlock), cvisit(ctx.elseBlock))
                .loc(ctx.start, file);
    }

    //Infix
    @Override
    public ITok visitGenInfix(HorthParser.GenInfixContext ctx) {
        return cvisit(ctx.infix());
    }

    @Override
    public ITok visitInfixInfix(HorthParser.InfixInfixContext ctx) {
        return cvisit(ctx.infix());
    }

    @Override
    public ITok visitInfixBinOp(HorthParser.InfixBinOpContext ctx) {
        return new TInfixBinOp(cvisit(ctx.infix(0)), cvisit(ctx.infix(1)), cvisit(ctx.binop()))
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitInfixUnOp(HorthParser.InfixUnOpContext ctx) {
        return new TInfixUnOp(cvisit(ctx.infix()), cvisit(ctx.unop()))
                .loc(ctx.start, file);
    }
}
