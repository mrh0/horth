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
	 * Enter a parse tree produced by {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGeneral(HorthParser.GeneralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGeneral(HorthParser.GeneralContext ctx);
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