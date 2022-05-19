// Generated from W:/Development/horth/src/main/antlr4\HorthHeader.g4 by ANTLR 4.9.2
package com.mrh0.horth.antlr.header;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HorthHeaderParser}.
 */
public interface HorthHeaderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HorthHeaderParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(HorthHeaderParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthHeaderParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(HorthHeaderParser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthHeaderParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(HorthHeaderParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthHeaderParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(HorthHeaderParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthHeaderParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HorthHeaderParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthHeaderParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HorthHeaderParser.ProgramContext ctx);
}