// Generated from W:/Development/horth/src/main/antlr4\Horth.g4 by ANTLR 4.9.2
package com.mrh0.horth.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HorthParser}.
 */
public interface HorthListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HorthParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(HorthParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(HorthParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerInt}
	 * labeled alternative in {@link HorthParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterIntegerInt(HorthParser.IntegerIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerInt}
	 * labeled alternative in {@link HorthParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitIntegerInt(HorthParser.IntegerIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerHex}
	 * labeled alternative in {@link HorthParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterIntegerHex(HorthParser.IntegerHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerHex}
	 * labeled alternative in {@link HorthParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitIntegerHex(HorthParser.IntegerHexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerBin}
	 * labeled alternative in {@link HorthParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterIntegerBin(HorthParser.IntegerBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerBin}
	 * labeled alternative in {@link HorthParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitIntegerBin(HorthParser.IntegerBinContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthParser#simpleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDataType(HorthParser.SimpleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#simpleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDataType(HorthParser.SimpleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataTypeSimple}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeSimple(HorthParser.DataTypeSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeSimple}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeSimple(HorthParser.DataTypeSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataTypeGeneral}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeGeneral(HorthParser.DataTypeGeneralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeGeneral}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeGeneral(HorthParser.DataTypeGeneralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataTypeFunc}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeFunc(HorthParser.DataTypeFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeFunc}
	 * labeled alternative in {@link HorthParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeFunc(HorthParser.DataTypeFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthParser#userDefinedDataType}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedDataType(HorthParser.UserDefinedDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#userDefinedDataType}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedDataType(HorthParser.UserDefinedDataTypeContext ctx);
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
	 * Enter a parse tree produced by the {@code typefuncSizeof}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 */
	void enterTypefuncSizeof(HorthParser.TypefuncSizeofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typefuncSizeof}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 */
	void exitTypefuncSizeof(HorthParser.TypefuncSizeofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typefuncCast}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 */
	void enterTypefuncCast(HorthParser.TypefuncCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typefuncCast}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 */
	void exitTypefuncCast(HorthParser.TypefuncCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typefuncCastUnsafe}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 */
	void enterTypefuncCastUnsafe(HorthParser.TypefuncCastUnsafeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typefuncCastUnsafe}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 */
	void exitTypefuncCastUnsafe(HorthParser.TypefuncCastUnsafeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typefuncIs}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 */
	void enterTypefuncIs(HorthParser.TypefuncIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typefuncIs}
	 * labeled alternative in {@link HorthParser#typefunc}.
	 * @param ctx the parse tree
	 */
	void exitTypefuncIs(HorthParser.TypefuncIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixChar}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfixChar(HorthParser.InfixCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixChar}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfixChar(HorthParser.InfixCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixAtom}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfixAtom(HorthParser.InfixAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixAtom}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfixAtom(HorthParser.InfixAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixUnOp}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfixUnOp(HorthParser.InfixUnOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixUnOp}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfixUnOp(HorthParser.InfixUnOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixIdent}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfixIdent(HorthParser.InfixIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixIdent}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfixIdent(HorthParser.InfixIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixTypefunc}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfixTypefunc(HorthParser.InfixTypefuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixTypefunc}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfixTypefunc(HorthParser.InfixTypefuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixInt}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfixInt(HorthParser.InfixIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixInt}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfixInt(HorthParser.InfixIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixInfix}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfixInfix(HorthParser.InfixInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixInfix}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfixInfix(HorthParser.InfixInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixBinOp}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfixBinOp(HorthParser.InfixBinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixBinOp}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfixBinOp(HorthParser.InfixBinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixBool}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfixBool(HorthParser.InfixBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixBool}
	 * labeled alternative in {@link HorthParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfixBool(HorthParser.InfixBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HorthParser#staticExpr}.
	 * @param ctx the parse tree
	 */
	void enterStaticExpr(HorthParser.StaticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HorthParser#staticExpr}.
	 * @param ctx the parse tree
	 */
	void exitStaticExpr(HorthParser.StaticExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genSeparator}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenSeparator(HorthParser.GenSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genSeparator}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenSeparator(HorthParser.GenSeparatorContext ctx);
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
	 * Enter a parse tree produced by the {@code genProps}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenProps(HorthParser.GenPropsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genProps}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenProps(HorthParser.GenPropsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genAccessor}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenAccessor(HorthParser.GenAccessorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genAccessor}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenAccessor(HorthParser.GenAccessorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genAccessorStrict}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenAccessorStrict(HorthParser.GenAccessorStrictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genAccessorStrict}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenAccessorStrict(HorthParser.GenAccessorStrictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genArray}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenArray(HorthParser.GenArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genArray}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenArray(HorthParser.GenArrayContext ctx);
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
	 * Enter a parse tree produced by the {@code genStaticAssert}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenStaticAssert(HorthParser.GenStaticAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genStaticAssert}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenStaticAssert(HorthParser.GenStaticAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genAllocStatic}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenAllocStatic(HorthParser.GenAllocStaticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genAllocStatic}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenAllocStatic(HorthParser.GenAllocStaticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genAlloc}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenAlloc(HorthParser.GenAllocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genAlloc}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenAlloc(HorthParser.GenAllocContext ctx);
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
	 * Enter a parse tree produced by the {@code genWith}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenWith(HorthParser.GenWithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genWith}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenWith(HorthParser.GenWithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genConst}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenConst(HorthParser.GenConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genConst}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenConst(HorthParser.GenConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genTry}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenTry(HorthParser.GenTryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genTry}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenTry(HorthParser.GenTryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genThrow}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenThrow(HorthParser.GenThrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genThrow}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenThrow(HorthParser.GenThrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genCatch}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenCatch(HorthParser.GenCatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genCatch}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenCatch(HorthParser.GenCatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genSyscall}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenSyscall(HorthParser.GenSyscallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genSyscall}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenSyscall(HorthParser.GenSyscallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genExport}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenExport(HorthParser.GenExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genExport}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenExport(HorthParser.GenExportContext ctx);
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
	 * Enter a parse tree produced by the {@code genBool}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenBool(HorthParser.GenBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genBool}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenBool(HorthParser.GenBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genChar}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void enterGenChar(HorthParser.GenCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genChar}
	 * labeled alternative in {@link HorthParser#general}.
	 * @param ctx the parse tree
	 */
	void exitGenChar(HorthParser.GenCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainFunc}
	 * labeled alternative in {@link HorthParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainFunc(HorthParser.MainFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainFunc}
	 * labeled alternative in {@link HorthParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainFunc(HorthParser.MainFuncContext ctx);
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