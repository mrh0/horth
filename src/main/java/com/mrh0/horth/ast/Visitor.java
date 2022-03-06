package com.mrh0.horth.ast;

import com.mrh0.horth.antlr.HorthBaseVisitor;
import com.mrh0.horth.antlr.HorthParser;
import com.mrh0.horth.ast.nodes.*;
import com.mrh0.horth.ast.nodes.accessor.TAccessor;
import com.mrh0.horth.ast.nodes.accessor.TProp;
import com.mrh0.horth.ast.nodes.accessor.TPropAddr;
import com.mrh0.horth.ast.nodes.branching.TIf;
import com.mrh0.horth.ast.nodes.branching.TWhile;
import com.mrh0.horth.ast.nodes.function.TFunc;
import com.mrh0.horth.ast.nodes.infix.TInfixBinOp;
import com.mrh0.horth.ast.nodes.infix.TInfixUnOp;
import com.mrh0.horth.ast.nodes.operands.*;
import com.mrh0.horth.ast.nodes.operators.TBinOp;
import com.mrh0.horth.ast.nodes.operators.TUnOp;
import com.mrh0.horth.ast.nodes.other.TLet;
import com.mrh0.horth.ast.nodes.other.TSeparator;
import com.mrh0.horth.ast.nodes.other.TSysCall;
import com.mrh0.horth.ast.nodes.types.TType;
import com.mrh0.horth.ast.nodes.types.TTypeFuncCast;
import com.mrh0.horth.ast.nodes.types.TTypeFuncIs;
import com.mrh0.horth.ast.nodes.types.TTypeFuncSizeof;
import com.mrh0.horth.function.Func;
import com.mrh0.horth.instructions.high.CompileData;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Visitor extends HorthBaseVisitor<ITok> {
    private File file;
    private CompileData cd;

    public Visitor(File file, CompileData cd) {
        this.file = file;
        this.cd = cd;
    }

    public <T extends ParserRuleContext, O extends ITok> List<O> visit(List<T> list) {
        List<O> t = new ArrayList<>();
        for(T pt : list)
            t.add((O)visit(pt));
        return t;
    }

    public <T extends Token> List<String> tvisit(List<T> list) {
        List<String> t = new ArrayList<>();
        for(T pt : list)
            t.add(pt.getText());
        return t;
    }

    public <T extends ParserRuleContext, O extends ITok> O cvisit(T rule) {
        return rule == null ? null : (O) visit(rule);
    }

    @Override
    public ITok visitProgram(HorthParser.ProgramContext ctx) {
        ctx.include();
        return new TProgram(ctx.moduleName.getText(), visit(ctx.includes), visit(ctx.main))
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitBlock(HorthParser.BlockContext ctx) {
        return new TBlock(visit(ctx.contents))
                .loc(ctx.start, file);
    }

    //Ignores
    @Override
    public ITok visitGenSeparator(HorthParser.GenSeparatorContext ctx) {
        return TSeparator.INSTANCE;
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

    @Override
    public ITok visitGenString(HorthParser.GenStringContext ctx) {
        return new TString(ctx.getText())
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitGenAtom(HorthParser.GenAtomContext ctx) {
        return new TAtom(ctx.getText())
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitIdentifier(HorthParser.IdentifierContext ctx) {
        return new TIdentifier(ctx.getText())
                .loc(ctx.start, file);
    }

    //Keywords
    @Override
    public ITok visitKeywords(HorthParser.KeywordsContext ctx) {
        return new TKeyword(ctx.getText())
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitGenSyscall(HorthParser.GenSyscallContext ctx) {
        return new TSysCall(ctx.sysCallName.getText())
                .loc(ctx.start, file);
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
    public ITok visitTypefuncIs(HorthParser.TypefuncIsContext ctx) {
        return new TTypeFuncIs(visit(ctx.types))
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

    @Override
    public ITok visitInfixTypefunc(HorthParser.InfixTypefuncContext ctx) {
        if(ctx.identifier() == null)
            return visit(ctx.typefunc());
        return new TSpread(visit(ctx.identifier()), visit(ctx.typefunc()))
                .loc(ctx.start, file);
    }

    //Let
    @Override
    public ITok visitGenLet(HorthParser.GenLetContext ctx) {
        return new TLet(tvisit(ctx.names), cvisit(ctx.block()))
                .loc(ctx.start, file);
    }

    //Accessor
    @Override
    public ITok visitGenAccessor(HorthParser.GenAccessorContext ctx) {
        return new TAccessor(cvisit(ctx.accBlock))
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitGenProp(HorthParser.GenPropContext ctx) {
        return new TProp(ctx.prop.getText())
                .loc(ctx.start, file);
    }

    @Override
    public ITok visitGenPropAddr(HorthParser.GenPropAddrContext ctx) {
        return new TPropAddr(ctx.prop.getText())
                .loc(ctx.start, file);
    }

    //Function
    @Override
    public ITok visitMainFunc(HorthParser.MainFuncContext ctx) {
        Func.Prefix prefix = Func.Prefix.NONE;
        if (ctx.funcPrefix != null)
            prefix = Func.Prefix.from(ctx.funcPrefix.getText());
        return new TFunc(cd, ctx.name.getText(), visit(ctx.args), visit(ctx.rets), cvisit(ctx.funcBody), prefix)
                .loc(ctx.start, file);
    }
}
