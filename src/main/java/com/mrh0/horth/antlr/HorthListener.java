// Generated from W:/Development/horth/src/main/antlr4\Horth.g4 by ANTLR 4.9.2
package com.mrh0.horth.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HorthParser}.
 */
public interface HorthListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HorthParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(HorthParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(HorthParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(HorthParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(HorthParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthParser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(HorthParser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(HorthParser.KeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthParser#intrfunc}.
	 * @param ctx the parse tree
	 */
	void enterIntrfunc(HorthParser.IntrfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#intrfunc}.
	 * @param ctx the parse tree
	 */
	void exitIntrfunc(HorthParser.IntrfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfix(HorthParser.InfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfix(HorthParser.InfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genAtom}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenAtom(HorthParser.GenAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genAtom}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenAtom(HorthParser.GenAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genInt}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenInt(HorthParser.GenIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genInt}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenInt(HorthParser.GenIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genIdentifier}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenIdentifier(HorthParser.GenIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genIdentifier}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenIdentifier(HorthParser.GenIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genString}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenString(HorthParser.GenStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genString}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenString(HorthParser.GenStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genUnop}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenUnop(HorthParser.GenUnopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genUnop}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenUnop(HorthParser.GenUnopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genBinOp}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenBinOp(HorthParser.GenBinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genBinOp}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenBinOp(HorthParser.GenBinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genKeyword}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenKeyword(HorthParser.GenKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genKeyword}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenKeyword(HorthParser.GenKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genInfix}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenInfix(HorthParser.GenInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genInfix}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenInfix(HorthParser.GenInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genAssert}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenAssert(HorthParser.GenAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genAssert}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenAssert(HorthParser.GenAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genFuncInfer}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenFuncInfer(HorthParser.GenFuncInferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genFuncInfer}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenFuncInfer(HorthParser.GenFuncInferContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genFunc}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenFunc(HorthParser.GenFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genFunc}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenFunc(HorthParser.GenFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genFuncSignature}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenFuncSignature(HorthParser.GenFuncSignatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genFuncSignature}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenFuncSignature(HorthParser.GenFuncSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genIf}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenIf(HorthParser.GenIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genIf}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenIf(HorthParser.GenIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genWhile}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenWhile(HorthParser.GenWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genWhile}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenWhile(HorthParser.GenWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genLet}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenLet(HorthParser.GenLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genLet}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenLet(HorthParser.GenLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genIntrfunc}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenIntrfunc(HorthParser.GenIntrfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genIntrfunc}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenIntrfunc(HorthParser.GenIntrfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HorthParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HorthParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(HorthParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(HorthParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HorthParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HorthParser.ProgramContext ctx);
}