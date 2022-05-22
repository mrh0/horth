// Generated from W:/Development/horth/src/main/antlr4\HorthHeader.g4 by ANTLR 4.9.2
package com.mrh0.horth.antlr.header;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link HorthHeaderVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class HorthHeaderBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements HorthHeaderVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitModule(HorthHeaderParser.ModuleContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProgram(HorthHeaderParser.ProgramContext ctx) { return visitChildren(ctx); }
}