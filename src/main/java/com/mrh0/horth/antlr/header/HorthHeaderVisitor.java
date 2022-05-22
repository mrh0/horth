// Generated from W:/Development/horth/src/main/antlr4\HorthHeader.g4 by ANTLR 4.9.2
package com.mrh0.horth.antlr.header;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HorthHeaderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HorthHeaderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HorthHeaderParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(HorthHeaderParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthHeaderParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HorthHeaderParser.ProgramContext ctx);
}