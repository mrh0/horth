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
	 * Visit a parse tree produced by {@link HorthParser#simpleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDataType(HorthParser.SimpleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeSimple}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeSimple(HorthParser.DataTypeSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeGeneral}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeGeneral(HorthParser.DataTypeGeneralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeFunc}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeFunc(HorthParser.DataTypeFuncContext ctx);
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
	 * Visit a parse tree produced by the {@code typefuncSizeof}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypefuncSizeof(HorthParser.TypefuncSizeofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typefuncCast}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypefuncCast(HorthParser.TypefuncCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typefuncCastUnsafe}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypefuncCastUnsafe(HorthParser.TypefuncCastUnsafeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typefuncIs}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypefuncIs(HorthParser.TypefuncIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixChar}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixChar(HorthParser.InfixCharContext ctx);
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
	 * Visit a parse tree produced by the {@code genArray}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenArray(HorthParser.GenArrayContext ctx);
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
	 * Visit a parse tree produced by the {@code genStaticAssert}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenStaticAssert(HorthParser.GenStaticAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genAllocStatic}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenAllocStatic(HorthParser.GenAllocStaticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genAlloc}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenAlloc(HorthParser.GenAllocContext ctx);
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
	 * Visit a parse tree produced by the {@code genWith}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenWith(HorthParser.GenWithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genConst}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenConst(HorthParser.GenConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genTry}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenTry(HorthParser.GenTryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genThrow}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenThrow(HorthParser.GenThrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genCatch}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenCatch(HorthParser.GenCatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genSyscall}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenSyscall(HorthParser.GenSyscallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genExport}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenExport(HorthParser.GenExportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genProps}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenProps(HorthParser.GenPropsContext ctx);
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