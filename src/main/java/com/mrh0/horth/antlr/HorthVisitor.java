// Generated from W:/Development/horth/src/main/antlr4\Horth.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link HorthParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(HorthParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerInt}
	 * labeled alternative in {@link HorthParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerInt(HorthParser.IntegerIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerHex}
	 * labeled alternative in {@link HorthParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerHex(HorthParser.IntegerHexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerBin}
	 * labeled alternative in {@link HorthParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerBin(HorthParser.IntegerBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeNested}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeNested(HorthParser.DataTypeNestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeFunc}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeFunc(HorthParser.DataTypeFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeSimple}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeSimple(HorthParser.DataTypeSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#userDefinedDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserDefinedDataType(HorthParser.UserDefinedDataTypeContext ctx);
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
	 * Visit a parse tree produced by the {@code typeFuncSizeof}
	 * labeled alternative in {@link HorthParser#typeFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFuncSizeof(HorthParser.TypeFuncSizeofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFuncCast}
	 * labeled alternative in {@link HorthParser#typeFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFuncCast(HorthParser.TypeFuncCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFuncCastUnsafe}
	 * labeled alternative in {@link HorthParser#typeFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFuncCastUnsafe(HorthParser.TypeFuncCastUnsafeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFuncIs}
	 * labeled alternative in {@link HorthParser#typeFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFuncIs(HorthParser.TypeFuncIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFuncNew}
	 * labeled alternative in {@link HorthParser#typeFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFuncNew(HorthParser.TypeFuncNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixChar}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixChar(HorthParser.InfixCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixFunc}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixFunc(HorthParser.InfixFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixAtom}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixAtom(HorthParser.InfixAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixUnOp}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixUnOp(HorthParser.InfixUnOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixIdent}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixIdent(HorthParser.InfixIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixTypefunc}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixTypefunc(HorthParser.InfixTypefuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixInt}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixInt(HorthParser.InfixIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixInfix}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixInfix(HorthParser.InfixInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixBinOp}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixBinOp(HorthParser.InfixBinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixBool}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixBool(HorthParser.InfixBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#staticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticExpr(HorthParser.StaticExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#switchCaseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseExpr(HorthParser.SwitchCaseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genSeparator}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenSeparator(HorthParser.GenSeparatorContext ctx);
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
	 * Visit a parse tree produced by the {@code genProp}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenProp(HorthParser.GenPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genPropAddr}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenPropAddr(HorthParser.GenPropAddrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genAccessor}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenAccessor(HorthParser.GenAccessorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genAccessorStrict}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenAccessorStrict(HorthParser.GenAccessorStrictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genInfix}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenInfix(HorthParser.GenInfixContext ctx);
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
	 * Visit a parse tree produced by the {@code genSyscall}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenSyscall(HorthParser.GenSyscallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genIntrfunc}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenIntrfunc(HorthParser.GenIntrfuncContext ctx);
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
	 * Visit a parse tree produced by the {@code genBool}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenBool(HorthParser.GenBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genChar}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenChar(HorthParser.GenCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainFunc}
	 * labeled alternative in {@link HorthParser#mainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunc(HorthParser.MainFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HorthParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(HorthParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HorthParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HorthParser.ProgramContext ctx);
}