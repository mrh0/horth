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
	 * Visit a parse tree produced by {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral(HorthParser.GeneralContext ctx);
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