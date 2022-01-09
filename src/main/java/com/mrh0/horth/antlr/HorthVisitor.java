// Generated from W:/Development/horth/src/main/antlr4\Horth.g4 by ANTLR 4.9.2
package com.mrh0.horth.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HorthParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HorthVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HorthParser#unop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnop(HorthParser.UnopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(HorthParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywords(HorthParser.KeywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#intrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntrfunc(HorthParser.IntrfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix(HorthParser.InfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genAtom}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenAtom(HorthParser.GenAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genInt}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenInt(HorthParser.GenIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genIdentifier}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenIdentifier(HorthParser.GenIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genString}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenString(HorthParser.GenStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genUnop}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenUnop(HorthParser.GenUnopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genBinOp}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenBinOp(HorthParser.GenBinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genKeyword}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenKeyword(HorthParser.GenKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genInfix}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenInfix(HorthParser.GenInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genAssert}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenAssert(HorthParser.GenAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genFuncInfer}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenFuncInfer(HorthParser.GenFuncInferContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genFunc}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenFunc(HorthParser.GenFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genFuncSignature}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenFuncSignature(HorthParser.GenFuncSignatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genIf}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenIf(HorthParser.GenIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genWhile}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenWhile(HorthParser.GenWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genLet}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenLet(HorthParser.GenLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genIntrfunc}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenIntrfunc(HorthParser.GenIntrfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HorthParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(HorthParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HorthParser.ProgramContext ctx);
}