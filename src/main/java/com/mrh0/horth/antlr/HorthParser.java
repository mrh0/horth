// Generated from W:/Development/horth/src/main/antlr4\Horth.g4 by ANTLR 4.9.2
package com.mrh0.horth.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HorthParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, BOOL=75, NAME=76, ATOM=77, INT=78, HEX=79, BIN=80, CHAR=81, 
		STRING=82, WHITESPACE=83, COMMENT=84, BLOCKCOMMENT=85;
	public static final int
		RULE_identifier = 0, RULE_integer = 1, RULE_dataType = 2, RULE_userDefinedDataType = 3, 
		RULE_unop = 4, RULE_binop = 5, RULE_keywords = 6, RULE_typeFunc = 7, RULE_infix = 8, 
		RULE_staticExpr = 9, RULE_switchCaseExpr = 10, RULE_general = 11, RULE_mainBlock = 12, 
		RULE_block = 13, RULE_module = 14, RULE_program = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "integer", "dataType", "userDefinedDataType", "unop", "binop", 
			"keywords", "typeFunc", "infix", "staticExpr", "switchCaseExpr", "general", 
			"mainBlock", "block", "module", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'<'", "'>'", "'func'", "'->'", "'type'", "'|'", "'not'", 
			"'!'", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'divmod'", "'<='", 
			"'>='", "'=='", "'!='", "'&'", "'and'", "'or'", "'<<'", "'>>'", "'='", 
			"'dup'", "'dup2'", "'swap'", "'swap2'", "'drop'", "'drop2'", "'drop3'", 
			"'next'", "'out'", "'log'", "'error'", "'read'", "'write'", "'copy'", 
			"'clone'", "'ret'", "'break'", "'here'", "'box'", "'void'", "'sizeof'", 
			"'('", "')'", "'as'", "'unsafe'", "'is'", "'new'", "','", "'.'", "'['", 
			"']'", "']^'", "'if'", "'do'", "'elif'", "'else'", "'end'", "'while'", 
			"'let'", "'in'", "'syscall'", "'inline'", "'ext'", "'start'", "'rec'", 
			"'throws'", "'module'", "'include'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BOOL", "NAME", "ATOM", "INT", "HEX", "BIN", "CHAR", 
			"STRING", "WHITESPACE", "COMMENT", "BLOCKCOMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Horth.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HorthParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(NAME);
				setState(33);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(NAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	 
		public IntegerContext() { }
		public void copyFrom(IntegerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerHexContext extends IntegerContext {
		public TerminalNode HEX() { return getToken(HorthParser.HEX, 0); }
		public IntegerHexContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterIntegerHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitIntegerHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitIntegerHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerBinContext extends IntegerContext {
		public TerminalNode BIN() { return getToken(HorthParser.BIN, 0); }
		public IntegerBinContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterIntegerBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitIntegerBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitIntegerBin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerIntContext extends IntegerContext {
		public TerminalNode INT() { return getToken(HorthParser.INT, 0); }
		public IntegerIntContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterIntegerInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitIntegerInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitIntegerInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_integer);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(INT);
				}
				break;
			case HEX:
				_localctx = new IntegerHexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new IntegerBinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(BIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataTypeSimpleContext extends DataTypeContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public DataTypeSimpleContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterDataTypeSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitDataTypeSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitDataTypeSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataTypeNestedContext extends DataTypeContext {
		public Token nestedName;
		public DataTypeContext nested;
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DataTypeNestedContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterDataTypeNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitDataTypeNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitDataTypeNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataTypeFuncContext extends DataTypeContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public DataTypeFuncContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterDataTypeFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitDataTypeFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitDataTypeFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dataType);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DataTypeNestedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((DataTypeNestedContext)_localctx).nestedName = match(NAME);
				setState(43);
				match(T__1);
				setState(44);
				((DataTypeNestedContext)_localctx).nested = dataType();
				setState(45);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new DataTypeFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(T__3);
				setState(48);
				match(T__1);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3 || _la==NAME) {
					{
					{
					setState(49);
					dataType();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(55);
					match(T__4);
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(56);
						dataType();
						}
						}
						setState(59); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__3 || _la==NAME );
					}
				}

				setState(63);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new DataTypeSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(NAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserDefinedDataTypeContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(HorthParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HorthParser.NAME, i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public UserDefinedDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterUserDefinedDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitUserDefinedDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitUserDefinedDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedDataTypeContext userDefinedDataType() throws RecognitionException {
		UserDefinedDataTypeContext _localctx = new UserDefinedDataTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_userDefinedDataType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__5);
			setState(68);
			match(NAME);
			setState(69);
			match(T__4);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					match(NAME);
					setState(71);
					dataType();
					setState(72);
					match(T__6);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(79);
			match(NAME);
			setState(80);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnopContext extends ParserRuleContext {
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitUnop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitUnop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinopContext extends ParserRuleContext {
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordsContext extends ParserRuleContext {
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitKeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeFuncContext extends ParserRuleContext {
		public TypeFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunc; }
	 
		public TypeFuncContext() { }
		public void copyFrom(TypeFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeFuncCastContext extends TypeFuncContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypeFuncCastContext(TypeFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterTypeFuncCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitTypeFuncCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitTypeFuncCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeFuncNewContext extends TypeFuncContext {
		public DataTypeContext type;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypeFuncNewContext(TypeFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterTypeFuncNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitTypeFuncNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitTypeFuncNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeFuncCastUnsafeContext extends TypeFuncContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypeFuncCastUnsafeContext(TypeFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterTypeFuncCastUnsafe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitTypeFuncCastUnsafe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitTypeFuncCastUnsafe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeFuncIsContext extends TypeFuncContext {
		public DataTypeContext dataType;
		public List<DataTypeContext> types = new ArrayList<DataTypeContext>();
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TypeFuncIsContext(TypeFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterTypeFuncIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitTypeFuncIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitTypeFuncIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeFuncSizeofContext extends TypeFuncContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypeFuncSizeofContext(TypeFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterTypeFuncSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitTypeFuncSizeof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitTypeFuncSizeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFuncContext typeFunc() throws RecognitionException {
		TypeFuncContext _localctx = new TypeFuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeFunc);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new TypeFuncSizeofContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__46);
				setState(89);
				match(T__47);
				setState(90);
				dataType();
				setState(91);
				match(T__48);
				}
				break;
			case 2:
				_localctx = new TypeFuncSizeofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__46);
				setState(94);
				dataType();
				}
				break;
			case 3:
				_localctx = new TypeFuncCastContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__49);
				setState(96);
				dataType();
				}
				break;
			case 4:
				_localctx = new TypeFuncCastUnsafeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(T__49);
				setState(98);
				match(T__50);
				setState(99);
				dataType();
				}
				break;
			case 5:
				_localctx = new TypeFuncCastUnsafeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				match(T__49);
				setState(101);
				match(T__8);
				setState(102);
				dataType();
				}
				break;
			case 6:
				_localctx = new TypeFuncIsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				match(T__51);
				setState(104);
				match(T__47);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3 || _la==NAME) {
					{
					{
					setState(105);
					((TypeFuncIsContext)_localctx).dataType = dataType();
					((TypeFuncIsContext)_localctx).types.add(((TypeFuncIsContext)_localctx).dataType);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__48);
				}
				break;
			case 7:
				_localctx = new TypeFuncIsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				match(T__51);
				setState(113);
				((TypeFuncIsContext)_localctx).dataType = dataType();
				((TypeFuncIsContext)_localctx).types.add(((TypeFuncIsContext)_localctx).dataType);
				}
				break;
			case 8:
				_localctx = new TypeFuncNewContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				match(T__52);
				setState(115);
				((TypeFuncNewContext)_localctx).type = dataType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixContext extends ParserRuleContext {
		public InfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix; }
	 
		public InfixContext() { }
		public void copyFrom(InfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InfixCharContext extends InfixContext {
		public TerminalNode CHAR() { return getToken(HorthParser.CHAR, 0); }
		public InfixCharContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInfixChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInfixChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInfixChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixAtomContext extends InfixContext {
		public TerminalNode ATOM() { return getToken(HorthParser.ATOM, 0); }
		public InfixAtomContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInfixAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInfixAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInfixAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixUnOpContext extends InfixContext {
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public InfixUnOpContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInfixUnOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInfixUnOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInfixUnOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixIdentContext extends InfixContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InfixIdentContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInfixIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInfixIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInfixIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixTypefuncContext extends InfixContext {
		public TypeFuncContext typeFunc() {
			return getRuleContext(TypeFuncContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InfixTypefuncContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInfixTypefunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInfixTypefunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInfixTypefunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixIntContext extends InfixContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public InfixIntContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInfixInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInfixInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInfixInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public InfixInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInfixInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInfixInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInfixInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixBinOpContext extends InfixContext {
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public InfixBinOpContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInfixBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInfixBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInfixBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixBoolContext extends InfixContext {
		public TerminalNode BOOL() { return getToken(HorthParser.BOOL, 0); }
		public InfixBoolContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInfixBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInfixBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInfixBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixContext infix() throws RecognitionException {
		return infix(0);
	}

	private InfixContext infix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixContext _localctx = new InfixContext(_ctx, _parentState);
		InfixContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_infix, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new InfixIdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				identifier();
				}
				break;
			case 2:
				{
				_localctx = new InfixTypefuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(120);
					identifier();
					}
				}

				setState(123);
				typeFunc();
				}
				break;
			case 3:
				{
				_localctx = new InfixAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(ATOM);
				}
				break;
			case 4:
				{
				_localctx = new InfixIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				integer();
				}
				break;
			case 5:
				{
				_localctx = new InfixBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(BOOL);
				}
				break;
			case 6:
				{
				_localctx = new InfixCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(CHAR);
				}
				break;
			case 7:
				{
				_localctx = new InfixUnOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				unop();
				setState(129);
				infix(2);
				}
				break;
			case 8:
				{
				_localctx = new InfixInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T__47);
				setState(132);
				infix(0);
				setState(133);
				match(T__48);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixBinOpContext(new InfixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_infix);
					setState(137);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(138);
					binop();
					setState(139);
					infix(4);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StaticExprContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode ATOM() { return getToken(HorthParser.ATOM, 0); }
		public TerminalNode BOOL() { return getToken(HorthParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(HorthParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(HorthParser.CHAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TypeFuncContext typeFunc() {
			return getRuleContext(TypeFuncContext.class,0);
		}
		public StaticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterStaticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitStaticExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitStaticExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticExprContext staticExpr() throws RecognitionException {
		StaticExprContext _localctx = new StaticExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_staticExpr);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case HEX:
			case BIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				integer();
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(ATOM);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(CHAR);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				identifier();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				unop();
				}
				break;
			case T__1:
			case T__2:
			case T__6:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				binop();
				}
				break;
			case T__46:
			case T__49:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 9);
				{
				setState(154);
				typeFunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseExprContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode ATOM() { return getToken(HorthParser.ATOM, 0); }
		public TerminalNode BOOL() { return getToken(HorthParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(HorthParser.CHAR, 0); }
		public SwitchCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterSwitchCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitSwitchCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitSwitchCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseExprContext switchCaseExpr() throws RecognitionException {
		SwitchCaseExprContext _localctx = new SwitchCaseExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_switchCaseExpr);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case HEX:
			case BIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				integer();
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(ATOM);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(BOOL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralContext extends ParserRuleContext {
		public GeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general; }
	 
		public GeneralContext() { }
		public void copyFrom(GeneralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GenKeywordContext extends GeneralContext {
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public GenKeywordContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenIntrfuncContext extends GeneralContext {
		public TypeFuncContext typeFunc() {
			return getRuleContext(TypeFuncContext.class,0);
		}
		public GenIntrfuncContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenIntrfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenIntrfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenIntrfunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenStringContext extends GeneralContext {
		public TerminalNode STRING() { return getToken(HorthParser.STRING, 0); }
		public GenStringContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenSeparatorContext extends GeneralContext {
		public GenSeparatorContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenSeparator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenAtomContext extends GeneralContext {
		public TerminalNode ATOM() { return getToken(HorthParser.ATOM, 0); }
		public GenAtomContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenSyscallContext extends GeneralContext {
		public Token sysCallName;
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public GenSyscallContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenSyscall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenSyscall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenSyscall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenBinOpContext extends GeneralContext {
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public GenBinOpContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenLetContext extends GeneralContext {
		public Token NAME;
		public List<Token> names = new ArrayList<Token>();
		public BlockContext localBlock;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(HorthParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HorthParser.NAME, i);
		}
		public GenLetContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenCharContext extends GeneralContext {
		public TerminalNode CHAR() { return getToken(HorthParser.CHAR, 0); }
		public GenCharContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenBoolContext extends GeneralContext {
		public TerminalNode BOOL() { return getToken(HorthParser.BOOL, 0); }
		public GenBoolContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenAccessorStrictContext extends GeneralContext {
		public BlockContext accBlock;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GenAccessorStrictContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenAccessorStrict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenAccessorStrict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenAccessorStrict(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenIdentifierContext extends GeneralContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenIdentifierContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenIfContext extends GeneralContext {
		public BlockContext block;
		public List<BlockContext> conds = new ArrayList<BlockContext>();
		public List<BlockContext> doBlock = new ArrayList<BlockContext>();
		public BlockContext elseBlock;
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public GenIfContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenPropAddrContext extends GeneralContext {
		public Token prop;
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public GenPropAddrContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenPropAddr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenPropAddr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenPropAddr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenAccessorContext extends GeneralContext {
		public BlockContext accBlock;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GenAccessorContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenAccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenAccessor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenIntContext extends GeneralContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public GenIntContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenUnopContext extends GeneralContext {
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public GenUnopContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenUnop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenUnop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenInfixContext extends GeneralContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public GenInfixContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenPropContext extends GeneralContext {
		public Token prop;
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public GenPropContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenProp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenWhileContext extends GeneralContext {
		public BlockContext cond;
		public BlockContext doBlock;
		public BlockContext elseBlock;
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public GenWhileContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralContext general() throws RecognitionException {
		GeneralContext _localctx = new GeneralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_general);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new GenSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__53);
				}
				break;
			case 2:
				_localctx = new GenUnopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				unop();
				}
				break;
			case 3:
				_localctx = new GenBinOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				binop();
				}
				break;
			case 4:
				_localctx = new GenKeywordContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				keywords();
				}
				break;
			case 5:
				_localctx = new GenPropContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				match(T__54);
				setState(168);
				((GenPropContext)_localctx).prop = match(NAME);
				}
				break;
			case 6:
				_localctx = new GenPropAddrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(T__54);
				setState(170);
				((GenPropAddrContext)_localctx).prop = match(NAME);
				setState(171);
				match(T__0);
				}
				break;
			case 7:
				_localctx = new GenAccessorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				match(T__55);
				setState(173);
				((GenAccessorContext)_localctx).accBlock = block();
				setState(174);
				match(T__56);
				}
				break;
			case 8:
				_localctx = new GenAccessorStrictContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				match(T__55);
				setState(177);
				((GenAccessorStrictContext)_localctx).accBlock = block();
				setState(178);
				match(T__57);
				}
				break;
			case 9:
				_localctx = new GenInfixContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(180);
				match(T__47);
				setState(181);
				infix(0);
				setState(182);
				match(T__48);
				}
				break;
			case 10:
				_localctx = new GenIfContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(184);
				match(T__58);
				setState(185);
				((GenIfContext)_localctx).block = block();
				((GenIfContext)_localctx).conds.add(((GenIfContext)_localctx).block);
				setState(186);
				match(T__59);
				setState(187);
				((GenIfContext)_localctx).block = block();
				((GenIfContext)_localctx).doBlock.add(((GenIfContext)_localctx).block);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__60) {
					{
					{
					setState(188);
					match(T__60);
					setState(189);
					((GenIfContext)_localctx).block = block();
					((GenIfContext)_localctx).conds.add(((GenIfContext)_localctx).block);
					setState(190);
					match(T__59);
					setState(191);
					((GenIfContext)_localctx).block = block();
					((GenIfContext)_localctx).doBlock.add(((GenIfContext)_localctx).block);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__61) {
					{
					setState(198);
					match(T__61);
					setState(199);
					((GenIfContext)_localctx).elseBlock = block();
					}
				}

				setState(202);
				match(T__62);
				}
				break;
			case 11:
				_localctx = new GenWhileContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(204);
				match(T__63);
				setState(205);
				((GenWhileContext)_localctx).cond = block();
				setState(206);
				match(T__59);
				setState(207);
				((GenWhileContext)_localctx).doBlock = block();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__61) {
					{
					setState(208);
					match(T__61);
					setState(209);
					((GenWhileContext)_localctx).elseBlock = block();
					}
				}

				setState(212);
				match(T__62);
				}
				break;
			case 12:
				_localctx = new GenLetContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(214);
				match(T__64);
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215);
					((GenLetContext)_localctx).NAME = match(NAME);
					((GenLetContext)_localctx).names.add(((GenLetContext)_localctx).NAME);
					}
					}
					setState(218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(220);
				match(T__65);
				setState(221);
				((GenLetContext)_localctx).localBlock = block();
				}
				break;
			case 13:
				_localctx = new GenSyscallContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(222);
				match(T__66);
				setState(223);
				((GenSyscallContext)_localctx).sysCallName = match(NAME);
				}
				break;
			case 14:
				_localctx = new GenIntrfuncContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(224);
				typeFunc();
				}
				break;
			case 15:
				_localctx = new GenAtomContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(225);
				match(ATOM);
				}
				break;
			case 16:
				_localctx = new GenIntContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(226);
				integer();
				}
				break;
			case 17:
				_localctx = new GenIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(227);
				identifier();
				}
				break;
			case 18:
				_localctx = new GenStringContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(228);
				match(STRING);
				}
				break;
			case 19:
				_localctx = new GenBoolContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(229);
				match(BOOL);
				}
				break;
			case 20:
				_localctx = new GenCharContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(230);
				match(CHAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainBlockContext extends ParserRuleContext {
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
	 
		public MainBlockContext() { }
		public void copyFrom(MainBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainFuncContext extends MainBlockContext {
		public Token funcPrefix;
		public Token name;
		public DataTypeContext dataType;
		public List<DataTypeContext> args = new ArrayList<DataTypeContext>();
		public List<DataTypeContext> rets = new ArrayList<DataTypeContext>();
		public DataTypeContext thrown;
		public BlockContext funcBody;
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public MainFuncContext(MainBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterMainFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitMainFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitMainFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mainBlock);
		int _la;
		try {
			_localctx = new MainFuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)))) != 0)) {
				{
				setState(233);
				((MainFuncContext)_localctx).funcPrefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)))) != 0)) ) {
					((MainFuncContext)_localctx).funcPrefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(236);
			match(T__3);
			setState(237);
			((MainFuncContext)_localctx).name = match(NAME);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==NAME) {
				{
				{
				setState(238);
				((MainFuncContext)_localctx).dataType = dataType();
				((MainFuncContext)_localctx).args.add(((MainFuncContext)_localctx).dataType);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(244);
				match(T__4);
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(245);
					((MainFuncContext)_localctx).dataType = dataType();
					((MainFuncContext)_localctx).rets.add(((MainFuncContext)_localctx).dataType);
					}
					}
					setState(248); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 || _la==NAME );
				}
			}

			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__71) {
				{
				setState(252);
				match(T__71);
				setState(253);
				((MainFuncContext)_localctx).thrown = dataType();
				}
			}

			setState(256);
			match(T__65);
			setState(257);
			((MainFuncContext)_localctx).funcBody = block();
			setState(258);
			match(T__62);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public GeneralContext general;
		public List<GeneralContext> contents = new ArrayList<GeneralContext>();
		public List<GeneralContext> general() {
			return getRuleContexts(GeneralContext.class);
		}
		public GeneralContext general(int i) {
			return getRuleContext(GeneralContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					((BlockContext)_localctx).general = general();
					((BlockContext)_localctx).contents.add(((BlockContext)_localctx).general);
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(HorthParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HorthParser.NAME, i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(NAME);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__54) {
				{
				{
				setState(267);
				match(T__54);
				setState(268);
				match(NAME);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ModuleContext moduleName;
		public ModuleContext module;
		public List<ModuleContext> includes = new ArrayList<ModuleContext>();
		public MainBlockContext mainBlock;
		public List<MainBlockContext> main = new ArrayList<MainBlockContext>();
		public TerminalNode EOF() { return getToken(HorthParser.EOF, 0); }
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public List<MainBlockContext> mainBlock() {
			return getRuleContexts(MainBlockContext.class);
		}
		public MainBlockContext mainBlock(int i) {
			return getRuleContext(MainBlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__72) {
				{
				setState(274);
				match(T__72);
				setState(275);
				((ProgramContext)_localctx).moduleName = module();
				}
			}

			setState(278);
			match(T__73);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(279);
				((ProgramContext)_localctx).module = module();
				((ProgramContext)_localctx).includes.add(((ProgramContext)_localctx).module);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(T__62);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)))) != 0)) {
				{
				{
				setState(286);
				((ProgramContext)_localctx).mainBlock = mainBlock();
				((ProgramContext)_localctx).main.add(((ProgramContext)_localctx).mainBlock);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return infix_sempred((InfixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean infix_sempred(InfixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\5\2&\n\2\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\65"+
		"\n\4\f\4\16\48\13\4\3\4\3\4\6\4<\n\4\r\4\16\4=\5\4@\n\4\3\4\3\4\5\4D\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"w\n\t\3\n\3\n\3\n\5\n|\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u008a\n\n\3\n\3\n\3\n\3\n\7\n\u0090\n\n\f\n\16\n\u0093\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\f\3\f\3"+
		"\f\3\f\5\f\u00a4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u00c4\n\r\f\r\16\r\u00c7\13\r\3\r\3\r\5\r\u00cb\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00d5\n\r\3\r\3\r\3\r\3\r\6\r\u00db\n\r\r\r\16"+
		"\r\u00dc\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ea\n\r\3\16"+
		"\5\16\u00ed\n\16\3\16\3\16\3\16\7\16\u00f2\n\16\f\16\16\16\u00f5\13\16"+
		"\3\16\3\16\6\16\u00f9\n\16\r\16\16\16\u00fa\5\16\u00fd\n\16\3\16\3\16"+
		"\5\16\u0101\n\16\3\16\3\16\3\16\3\16\3\17\7\17\u0108\n\17\f\17\16\17\u010b"+
		"\13\17\3\20\3\20\3\20\7\20\u0110\n\20\f\20\16\20\u0113\13\20\3\21\3\21"+
		"\5\21\u0117\n\21\3\21\3\21\7\21\u011b\n\21\f\21\16\21\u011e\13\21\3\21"+
		"\3\21\7\21\u0122\n\21\f\21\16\21\u0125\13\21\3\21\3\21\3\21\2\3\22\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2\n\f\5\2\4\5\t\t\r\34"+
		"\3\2\35\60\3\2FI\2\u015e\2%\3\2\2\2\4*\3\2\2\2\6C\3\2\2\2\bE\3\2\2\2\n"+
		"T\3\2\2\2\fV\3\2\2\2\16X\3\2\2\2\20v\3\2\2\2\22\u0089\3\2\2\2\24\u009d"+
		"\3\2\2\2\26\u00a3\3\2\2\2\30\u00e9\3\2\2\2\32\u00ec\3\2\2\2\34\u0109\3"+
		"\2\2\2\36\u010c\3\2\2\2 \u0116\3\2\2\2\"#\7N\2\2#&\7\3\2\2$&\7N\2\2%\""+
		"\3\2\2\2%$\3\2\2\2&\3\3\2\2\2\'+\7P\2\2(+\7Q\2\2)+\7R\2\2*\'\3\2\2\2*"+
		"(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\7N\2\2-.\7\4\2\2./\5\6\4\2/\60\7\5\2"+
		"\2\60D\3\2\2\2\61\62\7\6\2\2\62\66\7\4\2\2\63\65\5\6\4\2\64\63\3\2\2\2"+
		"\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67?\3\2\2\28\66\3\2\2\29;\7\7"+
		"\2\2:<\5\6\4\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?9\3\2"+
		"\2\2?@\3\2\2\2@A\3\2\2\2AD\7\5\2\2BD\7N\2\2C,\3\2\2\2C\61\3\2\2\2CB\3"+
		"\2\2\2D\7\3\2\2\2EF\7\b\2\2FG\7N\2\2GN\7\7\2\2HI\7N\2\2IJ\5\6\4\2JK\7"+
		"\t\2\2KM\3\2\2\2LH\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3"+
		"\2\2\2QR\7N\2\2RS\5\6\4\2S\t\3\2\2\2TU\t\2\2\2U\13\3\2\2\2VW\t\3\2\2W"+
		"\r\3\2\2\2XY\t\4\2\2Y\17\3\2\2\2Z[\7\61\2\2[\\\7\62\2\2\\]\5\6\4\2]^\7"+
		"\63\2\2^w\3\2\2\2_`\7\61\2\2`w\5\6\4\2ab\7\64\2\2bw\5\6\4\2cd\7\64\2\2"+
		"de\7\65\2\2ew\5\6\4\2fg\7\64\2\2gh\7\13\2\2hw\5\6\4\2ij\7\66\2\2jn\7\62"+
		"\2\2km\5\6\4\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2"+
		"\2\2qw\7\63\2\2rs\7\66\2\2sw\5\6\4\2tu\7\67\2\2uw\5\6\4\2vZ\3\2\2\2v_"+
		"\3\2\2\2va\3\2\2\2vc\3\2\2\2vf\3\2\2\2vi\3\2\2\2vr\3\2\2\2vt\3\2\2\2w"+
		"\21\3\2\2\2xy\b\n\1\2y\u008a\5\2\2\2z|\5\2\2\2{z\3\2\2\2{|\3\2\2\2|}\3"+
		"\2\2\2}\u008a\5\20\t\2~\u008a\7O\2\2\177\u008a\5\4\3\2\u0080\u008a\7M"+
		"\2\2\u0081\u008a\7S\2\2\u0082\u0083\5\n\6\2\u0083\u0084\5\22\n\4\u0084"+
		"\u008a\3\2\2\2\u0085\u0086\7\62\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7"+
		"\63\2\2\u0088\u008a\3\2\2\2\u0089x\3\2\2\2\u0089{\3\2\2\2\u0089~\3\2\2"+
		"\2\u0089\177\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0082"+
		"\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u0091\3\2\2\2\u008b\u008c\f\5\2\2\u008c"+
		"\u008d\5\f\7\2\u008d\u008e\5\22\n\6\u008e\u0090\3\2\2\2\u008f\u008b\3"+
		"\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\23\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u009e\5\4\3\2\u0095\u009e\7O\2\2"+
		"\u0096\u009e\7M\2\2\u0097\u009e\7T\2\2\u0098\u009e\7S\2\2\u0099\u009e"+
		"\5\2\2\2\u009a\u009e\5\n\6\2\u009b\u009e\5\f\7\2\u009c\u009e\5\20\t\2"+
		"\u009d\u0094\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0097"+
		"\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\25\3\2\2\2\u009f\u00a4\5\4\3"+
		"\2\u00a0\u00a4\7O\2\2\u00a1\u00a4\7M\2\2\u00a2\u00a4\7S\2\2\u00a3\u009f"+
		"\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\27\3\2\2\2\u00a5\u00ea\78\2\2\u00a6\u00ea\5\n\6\2\u00a7\u00ea\5\f\7\2"+
		"\u00a8\u00ea\5\16\b\2\u00a9\u00aa\79\2\2\u00aa\u00ea\7N\2\2\u00ab\u00ac"+
		"\79\2\2\u00ac\u00ad\7N\2\2\u00ad\u00ea\7\3\2\2\u00ae\u00af\7:\2\2\u00af"+
		"\u00b0\5\34\17\2\u00b0\u00b1\7;\2\2\u00b1\u00ea\3\2\2\2\u00b2\u00b3\7"+
		":\2\2\u00b3\u00b4\5\34\17\2\u00b4\u00b5\7<\2\2\u00b5\u00ea\3\2\2\2\u00b6"+
		"\u00b7\7\62\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00b9\7\63\2\2\u00b9\u00ea"+
		"\3\2\2\2\u00ba\u00bb\7=\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\7>\2\2\u00bd"+
		"\u00c5\5\34\17\2\u00be\u00bf\7?\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c1"+
		"\7>\2\2\u00c1\u00c2\5\34\17\2\u00c2\u00c4\3\2\2\2\u00c3\u00be\3\2\2\2"+
		"\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9\u00cb\5\34\17\2"+
		"\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd"+
		"\7A\2\2\u00cd\u00ea\3\2\2\2\u00ce\u00cf\7B\2\2\u00cf\u00d0\5\34\17\2\u00d0"+
		"\u00d1\7>\2\2\u00d1\u00d4\5\34\17\2\u00d2\u00d3\7@\2\2\u00d3\u00d5\5\34"+
		"\17\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\7A\2\2\u00d7\u00ea\3\2\2\2\u00d8\u00da\7C\2\2\u00d9\u00db\7N\2"+
		"\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7D\2\2\u00df\u00ea\5\34\17\2"+
		"\u00e0\u00e1\7E\2\2\u00e1\u00ea\7N\2\2\u00e2\u00ea\5\20\t\2\u00e3\u00ea"+
		"\7O\2\2\u00e4\u00ea\5\4\3\2\u00e5\u00ea\5\2\2\2\u00e6\u00ea\7T\2\2\u00e7"+
		"\u00ea\7M\2\2\u00e8\u00ea\7S\2\2\u00e9\u00a5\3\2\2\2\u00e9\u00a6\3\2\2"+
		"\2\u00e9\u00a7\3\2\2\2\u00e9\u00a8\3\2\2\2\u00e9\u00a9\3\2\2\2\u00e9\u00ab"+
		"\3\2\2\2\u00e9\u00ae\3\2\2\2\u00e9\u00b2\3\2\2\2\u00e9\u00b6\3\2\2\2\u00e9"+
		"\u00ba\3\2\2\2\u00e9\u00ce\3\2\2\2\u00e9\u00d8\3\2\2\2\u00e9\u00e0\3\2"+
		"\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9"+
		"\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2"+
		"\2\2\u00ea\31\3\2\2\2\u00eb\u00ed\t\5\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\6\2\2\u00ef\u00f3\7N\2\2\u00f0"+
		"\u00f2\5\6\4\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fc\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f8\7\7\2\2\u00f7\u00f9\5\6\4\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f6\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00ff\7J"+
		"\2\2\u00ff\u0101\5\6\4\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\7D\2\2\u0103\u0104\5\34\17\2\u0104\u0105\7"+
		"A\2\2\u0105\33\3\2\2\2\u0106\u0108\5\30\r\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\35\3\2\2"+
		"\2\u010b\u0109\3\2\2\2\u010c\u0111\7N\2\2\u010d\u010e\79\2\2\u010e\u0110"+
		"\7N\2\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\37\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7K\2\2"+
		"\u0115\u0117\5\36\20\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u011c\7L\2\2\u0119\u011b\5\36\20\2\u011a\u0119\3\2\2\2"+
		"\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0123\7A\2\2\u0120\u0122\5\32\16\2"+
		"\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\2\2\3\u0127"+
		"!\3\2\2\2\37%*\66=?CNnv{\u0089\u0091\u009d\u00a3\u00c5\u00ca\u00d4\u00dc"+
		"\u00e9\u00ec\u00f3\u00fa\u00fc\u0100\u0109\u0111\u0116\u011c\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}