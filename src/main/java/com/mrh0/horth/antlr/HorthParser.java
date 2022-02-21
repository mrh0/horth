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
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, BOOL=82, NAME=83, ATOM=84, INT=85, HEX=86, BIN=87, CHAR=88, 
		STRING=89, STRING_NT=90, WHITESPACE=91, COMMENT=92, BLOCKCOMMENT=93;
	public static final int
		RULE_identifier = 0, RULE_integer = 1, RULE_simpleDataType = 2, RULE_dataType = 3, 
		RULE_userDefinedDataType = 4, RULE_unop = 5, RULE_binop = 6, RULE_keywords = 7, 
		RULE_typefunc = 8, RULE_infix = 9, RULE_staticExpr = 10, RULE_general = 11, 
		RULE_mainBlock = 12, RULE_block = 13, RULE_include = 14, RULE_program = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "integer", "simpleDataType", "dataType", "userDefinedDataType", 
			"unop", "binop", "keywords", "typefunc", "infix", "staticExpr", "general", 
			"mainBlock", "block", "include", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'<'", "'>'", "'func'", "'->'", "'type'", "'as'", "'|'", 
			"'end'", "'not'", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<='", "'>='", 
			"'=='", "'!='", "'&'", "'and'", "'or'", "'<<'", "'>>'", "'='", "'dup'", 
			"'dup2'", "'swap'", "'swap2'", "'drop'", "'drop2'", "'drop3'", "'out'", 
			"'log'", "'error'", "'log^'", "'exit'", "'halt'", "'break'", "'length'", 
			"'here'", "'void'", "'sizeof'", "'('", "')'", "'cast'", "'unsafe'", "'is'", 
			"','", "'.'", "'['", "']'", "']^'", "'{'", "'}'", "'assert'", "'static'", 
			"'const'", "'alloc'", "'in'", "'if'", "'do'", "'elif'", "'else'", "'while'", 
			"'let'", "'with'", "'try'", "'throw'", "'pass'", "'catch'", "'syscall'", 
			"'export'", "'inline'", "'extern'", "'start'", "'rec'", "'throws'", "'include'", 
			"'module'"
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
			null, null, null, null, null, null, null, null, null, null, "BOOL", "NAME", 
			"ATOM", "INT", "HEX", "BIN", "CHAR", "STRING", "STRING_NT", "WHITESPACE", 
			"COMMENT", "BLOCKCOMMENT"
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
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__0);
				setState(33);
				match(NAME);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(NAME);
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

	public static class SimpleDataTypeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public SimpleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterSimpleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitSimpleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitSimpleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDataTypeContext simpleDataType() throws RecognitionException {
		SimpleDataTypeContext _localctx = new SimpleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(NAME);
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
		public SimpleDataTypeContext simpleDataType() {
			return getRuleContext(SimpleDataTypeContext.class,0);
		}
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
	public static class DataTypeGeneralContext extends DataTypeContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public DataTypeGeneralContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterDataTypeGeneral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitDataTypeGeneral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitDataTypeGeneral(this);
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
		enterRule(_localctx, 6, RULE_dataType);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DataTypeSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				simpleDataType();
				}
				break;
			case 2:
				_localctx = new DataTypeGeneralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(NAME);
				setState(46);
				match(T__1);
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					dataType();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 || _la==NAME );
				setState(52);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new DataTypeFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T__3);
				setState(55);
				match(T__1);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3 || _la==NAME) {
					{
					{
					setState(56);
					dataType();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(62);
					match(T__4);
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(63);
						dataType();
						}
						}
						setState(66); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__3 || _la==NAME );
					}
				}

				setState(70);
				match(T__2);
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
		enterRule(_localctx, 8, RULE_userDefinedDataType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__5);
			setState(74);
			match(NAME);
			setState(75);
			match(T__6);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(NAME);
					setState(77);
					dataType();
					setState(78);
					match(T__7);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(85);
			match(NAME);
			setState(86);
			dataType();
			setState(87);
			match(T__8);
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
		enterRule(_localctx, 10, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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
		enterRule(_localctx, 12, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_keywords);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__27);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__28);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(T__29);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(T__30);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				match(T__31);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				match(T__32);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				match(T__33);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				match(T__34);
				setState(102);
				match(T__35);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				match(T__36);
				setState(104);
				match(T__35);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(105);
				match(T__34);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(106);
				match(T__36);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(107);
				match(T__37);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(108);
				match(T__38);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(109);
				match(T__39);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(110);
				match(T__40);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(111);
				match(T__41);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(112);
				match(T__42);
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

	public static class TypefuncContext extends ParserRuleContext {
		public TypefuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefunc; }
	 
		public TypefuncContext() { }
		public void copyFrom(TypefuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypefuncSizeofContext extends TypefuncContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypefuncSizeofContext(TypefuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterTypefuncSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitTypefuncSizeof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitTypefuncSizeof(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypefuncIsContext extends TypefuncContext {
		public DataTypeContext dataType;
		public List<DataTypeContext> types = new ArrayList<DataTypeContext>();
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TypefuncIsContext(TypefuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterTypefuncIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitTypefuncIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitTypefuncIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypefuncCastContext extends TypefuncContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypefuncCastContext(TypefuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterTypefuncCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitTypefuncCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitTypefuncCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypefuncCastUnsafeContext extends TypefuncContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypefuncCastUnsafeContext(TypefuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterTypefuncCastUnsafe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitTypefuncCastUnsafe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitTypefuncCastUnsafe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypefuncContext typefunc() throws RecognitionException {
		TypefuncContext _localctx = new TypefuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typefunc);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new TypefuncSizeofContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__43);
				setState(116);
				match(T__44);
				setState(117);
				dataType();
				setState(118);
				match(T__45);
				}
				break;
			case 2:
				_localctx = new TypefuncSizeofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__43);
				setState(121);
				dataType();
				}
				break;
			case 3:
				_localctx = new TypefuncCastContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(T__46);
				setState(123);
				match(T__44);
				setState(124);
				dataType();
				setState(125);
				match(T__45);
				}
				break;
			case 4:
				_localctx = new TypefuncCastContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(T__6);
				setState(128);
				dataType();
				}
				break;
			case 5:
				_localctx = new TypefuncCastUnsafeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				match(T__47);
				setState(130);
				match(T__46);
				setState(131);
				match(T__44);
				setState(132);
				dataType();
				setState(133);
				match(T__45);
				}
				break;
			case 6:
				_localctx = new TypefuncCastUnsafeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(T__6);
				setState(136);
				match(T__47);
				setState(137);
				dataType();
				}
				break;
			case 7:
				_localctx = new TypefuncIsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				match(T__48);
				setState(139);
				match(T__44);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3 || _la==NAME) {
					{
					{
					setState(140);
					((TypefuncIsContext)_localctx).dataType = dataType();
					((TypefuncIsContext)_localctx).types.add(((TypefuncIsContext)_localctx).dataType);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(T__45);
				}
				break;
			case 8:
				_localctx = new TypefuncIsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				match(T__48);
				setState(148);
				((TypefuncIsContext)_localctx).dataType = dataType();
				((TypefuncIsContext)_localctx).types.add(((TypefuncIsContext)_localctx).dataType);
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
		public TypefuncContext typefunc() {
			return getRuleContext(TypefuncContext.class,0);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_infix, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new InfixIdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152);
				identifier();
				}
				break;
			case 2:
				{
				_localctx = new InfixTypefuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==NAME) {
					{
					setState(153);
					identifier();
					}
				}

				setState(156);
				typefunc();
				}
				break;
			case 3:
				{
				_localctx = new InfixAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(ATOM);
				}
				break;
			case 4:
				{
				_localctx = new InfixIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				integer();
				}
				break;
			case 5:
				{
				_localctx = new InfixBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(BOOL);
				}
				break;
			case 6:
				{
				_localctx = new InfixCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(CHAR);
				}
				break;
			case 7:
				{
				_localctx = new InfixUnOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				unop();
				setState(162);
				infix(2);
				}
				break;
			case 8:
				{
				_localctx = new InfixInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(T__44);
				setState(165);
				infix(0);
				setState(166);
				match(T__45);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixBinOpContext(new InfixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_infix);
					setState(170);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(171);
					binop();
					setState(172);
					infix(4);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TypefuncContext typefunc() {
			return getRuleContext(TypefuncContext.class,0);
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
		enterRule(_localctx, 20, RULE_staticExpr);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case HEX:
			case BIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				integer();
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(ATOM);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(CHAR);
				}
				break;
			case T__0:
			case NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				identifier();
				}
				break;
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				unop();
				}
				break;
			case T__1:
			case T__2:
			case T__7:
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
				setState(186);
				binop();
				}
				break;
			case T__6:
			case T__43:
			case T__46:
			case T__47:
			case T__48:
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				typefunc();
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
	public static class GenPropsContext extends GeneralContext {
		public Token NAME;
		public List<Token> props = new ArrayList<Token>();
		public List<TerminalNode> NAME() { return getTokens(HorthParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HorthParser.NAME, i);
		}
		public GenPropsContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenProps(this);
			else return visitor.visitChildren(this);
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
	public static class GenThrowContext extends GeneralContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GenThrowContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenThrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenThrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenThrow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenArrayContext extends GeneralContext {
		public List<StaticExprContext> staticExpr() {
			return getRuleContexts(StaticExprContext.class);
		}
		public StaticExprContext staticExpr(int i) {
			return getRuleContext(StaticExprContext.class,i);
		}
		public GenArrayContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenWithContext extends GeneralContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GenWithContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenWith(this);
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
	public static class GenCatchContext extends GeneralContext {
		public BlockContext passBlock;
		public BlockContext failBlock;
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public GenCatchContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenCatch(this);
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
	public static class GenTryContext extends GeneralContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public GenTryContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenTry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenTry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenTry(this);
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
	public static class GenAllocStaticContext extends GeneralContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<StaticExprContext> staticExpr() {
			return getRuleContexts(StaticExprContext.class);
		}
		public StaticExprContext staticExpr(int i) {
			return getRuleContext(StaticExprContext.class,i);
		}
		public GenAllocStaticContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenAllocStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenAllocStatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenAllocStatic(this);
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
	public static class GenIntrfuncContext extends GeneralContext {
		public TypefuncContext typefunc() {
			return getRuleContext(TypefuncContext.class,0);
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
	public static class GenAllocContext extends GeneralContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public GenAllocContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenAlloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenAlloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenAlloc(this);
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
	public static class GenAssertContext extends GeneralContext {
		public Token message;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HorthParser.STRING, 0); }
		public GenAssertContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenAssert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenAssert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenAssert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenConstContext extends GeneralContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public StaticExprContext staticExpr() {
			return getRuleContext(StaticExprContext.class,0);
		}
		public GenConstContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenConst(this);
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
	public static class GenStaticAssertContext extends GeneralContext {
		public Token message;
		public StaticExprContext staticExpr() {
			return getRuleContext(StaticExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HorthParser.STRING, 0); }
		public GenStaticAssertContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenStaticAssert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenStaticAssert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenStaticAssert(this);
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
	public static class GenExportContext extends GeneralContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public GenExportContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralContext general() throws RecognitionException {
		GeneralContext _localctx = new GeneralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_general);
		int _la;
		try {
			int _alt;
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new GenSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__49);
				}
				break;
			case 2:
				_localctx = new GenUnopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				unop();
				}
				break;
			case 3:
				_localctx = new GenBinOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				binop();
				}
				break;
			case 4:
				_localctx = new GenKeywordContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				keywords();
				}
				break;
			case 5:
				_localctx = new GenPropsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(T__50);
				{
				setState(195);
				((GenPropsContext)_localctx).NAME = match(NAME);
				((GenPropsContext)_localctx).props.add(((GenPropsContext)_localctx).NAME);
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(196);
						match(T__50);
						{
						setState(197);
						((GenPropsContext)_localctx).NAME = match(NAME);
						((GenPropsContext)_localctx).props.add(((GenPropsContext)_localctx).NAME);
						}
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 6:
				_localctx = new GenAccessorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(T__51);
				setState(204);
				((GenAccessorContext)_localctx).accBlock = block();
				setState(205);
				match(T__52);
				}
				break;
			case 7:
				_localctx = new GenAccessorStrictContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				match(T__51);
				setState(208);
				((GenAccessorStrictContext)_localctx).accBlock = block();
				setState(209);
				match(T__53);
				}
				break;
			case 8:
				_localctx = new GenArrayContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(211);
				match(T__54);
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						staticExpr();
						setState(213);
						match(T__49);
						}
						} 
					}
					setState(219);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__43) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (BOOL - 82)) | (1L << (NAME - 82)) | (1L << (ATOM - 82)) | (1L << (INT - 82)) | (1L << (HEX - 82)) | (1L << (BIN - 82)) | (1L << (CHAR - 82)) | (1L << (STRING - 82)))) != 0)) {
					{
					setState(220);
					staticExpr();
					}
				}

				setState(223);
				match(T__55);
				}
				break;
			case 9:
				_localctx = new GenInfixContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				match(T__44);
				setState(225);
				infix(0);
				setState(226);
				match(T__45);
				}
				break;
			case 10:
				_localctx = new GenAssertContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(228);
				match(T__56);
				setState(230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(229);
					((GenAssertContext)_localctx).message = match(STRING);
					}
					break;
				}
				setState(232);
				block();
				setState(233);
				match(T__8);
				}
				break;
			case 11:
				_localctx = new GenStaticAssertContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(235);
				match(T__57);
				setState(236);
				match(T__56);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(237);
					((GenStaticAssertContext)_localctx).message = match(STRING);
					}
					break;
				}
				setState(240);
				staticExpr();
				setState(241);
				match(T__8);
				}
				break;
			case 12:
				_localctx = new GenAllocStaticContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(243);
				match(T__58);
				setState(244);
				match(NAME);
				setState(245);
				match(T__59);
				setState(246);
				dataType();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(247);
					match(T__13);
					setState(248);
					staticExpr();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(T__8);
				}
				break;
			case 13:
				_localctx = new GenAllocContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(256);
				match(T__59);
				setState(257);
				dataType();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(258);
					match(T__13);
					setState(259);
					block();
					}
				}

				setState(262);
				match(T__60);
				setState(263);
				block();
				setState(264);
				match(T__8);
				}
				break;
			case 14:
				_localctx = new GenIfContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(266);
				match(T__61);
				setState(267);
				((GenIfContext)_localctx).block = block();
				((GenIfContext)_localctx).conds.add(((GenIfContext)_localctx).block);
				setState(268);
				match(T__62);
				setState(269);
				((GenIfContext)_localctx).block = block();
				((GenIfContext)_localctx).doBlock.add(((GenIfContext)_localctx).block);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__63) {
					{
					{
					setState(270);
					match(T__63);
					setState(271);
					((GenIfContext)_localctx).block = block();
					((GenIfContext)_localctx).conds.add(((GenIfContext)_localctx).block);
					setState(272);
					match(T__62);
					setState(273);
					((GenIfContext)_localctx).block = block();
					((GenIfContext)_localctx).doBlock.add(((GenIfContext)_localctx).block);
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__64) {
					{
					setState(280);
					match(T__64);
					setState(281);
					((GenIfContext)_localctx).elseBlock = block();
					}
				}

				setState(284);
				match(T__8);
				}
				break;
			case 15:
				_localctx = new GenWhileContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(286);
				match(T__65);
				setState(287);
				((GenWhileContext)_localctx).cond = block();
				setState(288);
				match(T__62);
				setState(289);
				((GenWhileContext)_localctx).doBlock = block();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__64) {
					{
					setState(290);
					match(T__64);
					setState(291);
					((GenWhileContext)_localctx).elseBlock = block();
					}
				}

				setState(294);
				match(T__8);
				}
				break;
			case 16:
				_localctx = new GenLetContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(296);
				match(T__66);
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297);
					((GenLetContext)_localctx).NAME = match(NAME);
					((GenLetContext)_localctx).names.add(((GenLetContext)_localctx).NAME);
					}
					}
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(302);
				match(T__60);
				setState(303);
				((GenLetContext)_localctx).localBlock = block();
				setState(304);
				match(T__8);
				}
				break;
			case 17:
				_localctx = new GenWithContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(306);
				match(T__67);
				setState(307);
				match(NAME);
				setState(308);
				match(T__62);
				setState(309);
				block();
				setState(310);
				match(T__8);
				}
				break;
			case 18:
				_localctx = new GenConstContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(312);
				match(T__58);
				setState(313);
				match(NAME);
				setState(314);
				staticExpr();
				setState(315);
				match(T__8);
				}
				break;
			case 19:
				_localctx = new GenTryContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(317);
				match(T__68);
				setState(318);
				match(NAME);
				}
				break;
			case 20:
				_localctx = new GenThrowContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(319);
				match(T__69);
				setState(320);
				block();
				setState(321);
				match(T__8);
				}
				break;
			case 21:
				_localctx = new GenCatchContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(323);
				match(T__68);
				setState(324);
				match(NAME);
				setState(325);
				match(T__70);
				setState(326);
				((GenCatchContext)_localctx).passBlock = block();
				setState(327);
				match(T__71);
				setState(328);
				((GenCatchContext)_localctx).failBlock = block();
				setState(329);
				match(T__8);
				}
				break;
			case 22:
				_localctx = new GenCatchContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(331);
				match(T__68);
				setState(332);
				match(NAME);
				setState(333);
				match(T__71);
				setState(334);
				((GenCatchContext)_localctx).failBlock = block();
				setState(335);
				match(T__70);
				setState(336);
				((GenCatchContext)_localctx).passBlock = block();
				setState(337);
				match(T__8);
				}
				break;
			case 23:
				_localctx = new GenSyscallContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(339);
				match(T__72);
				setState(340);
				((GenSyscallContext)_localctx).sysCallName = match(NAME);
				}
				break;
			case 24:
				_localctx = new GenExportContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(341);
				match(T__73);
				setState(342);
				match(NAME);
				}
				break;
			case 25:
				_localctx = new GenIntrfuncContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(343);
				typefunc();
				}
				break;
			case 26:
				_localctx = new GenAtomContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(344);
				match(ATOM);
				}
				break;
			case 27:
				_localctx = new GenIntContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(345);
				integer();
				}
				break;
			case 28:
				_localctx = new GenIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(346);
				identifier();
				}
				break;
			case 29:
				_localctx = new GenStringContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(347);
				match(STRING);
				}
				break;
			case 30:
				_localctx = new GenBoolContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(348);
				match(BOOL);
				}
				break;
			case 31:
				_localctx = new GenCharContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(349);
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
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__76 - 75)) | (1L << (T__77 - 75)))) != 0)) {
				{
				setState(352);
				((MainFuncContext)_localctx).funcPrefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__76 - 75)) | (1L << (T__77 - 75)))) != 0)) ) {
					((MainFuncContext)_localctx).funcPrefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(355);
			match(T__3);
			setState(356);
			((MainFuncContext)_localctx).name = match(NAME);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==NAME) {
				{
				{
				setState(357);
				((MainFuncContext)_localctx).dataType = dataType();
				((MainFuncContext)_localctx).args.add(((MainFuncContext)_localctx).dataType);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(363);
				match(T__4);
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(364);
					((MainFuncContext)_localctx).dataType = dataType();
					((MainFuncContext)_localctx).rets.add(((MainFuncContext)_localctx).dataType);
					}
					}
					setState(367); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 || _la==NAME );
				}
			}

			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__78) {
				{
				setState(371);
				match(T__78);
				setState(372);
				((MainFuncContext)_localctx).thrown = dataType();
				}
			}

			setState(375);
			match(T__60);
			setState(376);
			((MainFuncContext)_localctx).funcBody = block();
			setState(377);
			match(T__8);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (BOOL - 66)) | (1L << (NAME - 66)) | (1L << (ATOM - 66)) | (1L << (INT - 66)) | (1L << (HEX - 66)) | (1L << (BIN - 66)) | (1L << (CHAR - 66)) | (1L << (STRING - 66)))) != 0)) {
				{
				{
				setState(379);
				((BlockContext)_localctx).general = general();
				((BlockContext)_localctx).contents.add(((BlockContext)_localctx).general);
				}
				}
				setState(384);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HorthParser.STRING, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__79);
			setState(386);
			match(STRING);
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
		public IncludeContext include;
		public List<IncludeContext> includes = new ArrayList<IncludeContext>();
		public MainBlockContext mainBlock;
		public List<MainBlockContext> main = new ArrayList<MainBlockContext>();
		public TerminalNode EOF() { return getToken(HorthParser.EOF, 0); }
		public TerminalNode STRING() { return getToken(HorthParser.STRING, 0); }
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
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
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__80) {
				{
				setState(388);
				match(T__80);
				setState(389);
				match(STRING);
				}
			}

			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__79) {
				{
				{
				setState(392);
				((ProgramContext)_localctx).include = include();
				((ProgramContext)_localctx).includes.add(((ProgramContext)_localctx).include);
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__76 - 75)) | (1L << (T__77 - 75)))) != 0)) {
				{
				{
				setState(398);
				((ProgramContext)_localctx).mainBlock = mainBlock();
				((ProgramContext)_localctx).main.add(((ProgramContext)_localctx).mainBlock);
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
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
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u0199\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\5\2&\n\2\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\5\3\5\3\5\3\5\6\5\63\n\5\r"+
		"\5\16\5\64\3\5\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\6\5C\n"+
		"\5\r\5\16\5D\5\5G\n\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6S\n"+
		"\6\f\6\16\6V\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0090\n\n\f\n\16\n\u0093\13\n\3"+
		"\n\3\n\3\n\5\n\u0098\n\n\3\13\3\13\3\13\5\13\u009d\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ab\n\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00bf\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c9"+
		"\n\r\f\r\16\r\u00cc\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00da\n\r\f\r\16\r\u00dd\13\r\3\r\5\r\u00e0\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00e9\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f1\n\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fc\n\r\f\r\16\r\u00ff\13\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0107\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u0116\n\r\f\r\16\r\u0119\13\r\3\r\3\r\5\r\u011d\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0127\n\r\3\r\3\r\3\r\3\r\6\r\u012d"+
		"\n\r\r\r\16\r\u012e\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0161\n\r\3\16\5\16\u0164\n\16\3\16\3\16\3\16\7\16\u0169\n\16\f"+
		"\16\16\16\u016c\13\16\3\16\3\16\6\16\u0170\n\16\r\16\16\16\u0171\5\16"+
		"\u0174\n\16\3\16\3\16\5\16\u0178\n\16\3\16\3\16\3\16\3\16\3\17\7\17\u017f"+
		"\n\17\f\17\16\17\u0182\13\17\3\20\3\20\3\20\3\21\3\21\5\21\u0189\n\21"+
		"\3\21\7\21\u018c\n\21\f\21\16\21\u018f\13\21\3\21\7\21\u0192\n\21\f\21"+
		"\16\21\u0195\13\21\3\21\3\21\3\21\2\3\24\22\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \2\5\3\2\f\r\5\2\4\5\n\n\16\34\3\2MP\2\u01ee\2%\3\2\2\2\4"+
		"*\3\2\2\2\6,\3\2\2\2\bI\3\2\2\2\nK\3\2\2\2\f[\3\2\2\2\16]\3\2\2\2\20s"+
		"\3\2\2\2\22\u0097\3\2\2\2\24\u00aa\3\2\2\2\26\u00be\3\2\2\2\30\u0160\3"+
		"\2\2\2\32\u0163\3\2\2\2\34\u0180\3\2\2\2\36\u0183\3\2\2\2 \u0188\3\2\2"+
		"\2\"#\7\3\2\2#&\7U\2\2$&\7U\2\2%\"\3\2\2\2%$\3\2\2\2&\3\3\2\2\2\'+\7W"+
		"\2\2(+\7X\2\2)+\7Y\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\7U"+
		"\2\2-\7\3\2\2\2.J\5\6\4\2/\60\7U\2\2\60\62\7\4\2\2\61\63\5\b\5\2\62\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\7\5\2\2\67J\3\2\2\289\7\6\2\29=\7\4\2\2:<\5\b\5\2;:\3\2\2\2<?\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>F\3\2\2\2?=\3\2\2\2@B\7\7\2\2AC\5\b\5\2BA\3\2\2\2"+
		"CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2F@\3\2\2\2FG\3\2\2\2GH\3\2\2\2"+
		"HJ\7\5\2\2I.\3\2\2\2I/\3\2\2\2I8\3\2\2\2J\t\3\2\2\2KL\7\b\2\2LM\7U\2\2"+
		"MT\7\t\2\2NO\7U\2\2OP\5\b\5\2PQ\7\n\2\2QS\3\2\2\2RN\3\2\2\2SV\3\2\2\2"+
		"TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7U\2\2XY\5\b\5\2YZ\7\13\2\2"+
		"Z\13\3\2\2\2[\\\t\2\2\2\\\r\3\2\2\2]^\t\3\2\2^\17\3\2\2\2_t\7\35\2\2`"+
		"t\7\36\2\2at\7\37\2\2bt\7 \2\2ct\7!\2\2dt\7\"\2\2et\7#\2\2ft\7$\2\2gh"+
		"\7%\2\2ht\7&\2\2ij\7\'\2\2jt\7&\2\2kt\7%\2\2lt\7\'\2\2mt\7(\2\2nt\7)\2"+
		"\2ot\7*\2\2pt\7+\2\2qt\7,\2\2rt\7-\2\2s_\3\2\2\2s`\3\2\2\2sa\3\2\2\2s"+
		"b\3\2\2\2sc\3\2\2\2sd\3\2\2\2se\3\2\2\2sf\3\2\2\2sg\3\2\2\2si\3\2\2\2"+
		"sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2"+
		"sr\3\2\2\2t\21\3\2\2\2uv\7.\2\2vw\7/\2\2wx\5\b\5\2xy\7\60\2\2y\u0098\3"+
		"\2\2\2z{\7.\2\2{\u0098\5\b\5\2|}\7\61\2\2}~\7/\2\2~\177\5\b\5\2\177\u0080"+
		"\7\60\2\2\u0080\u0098\3\2\2\2\u0081\u0082\7\t\2\2\u0082\u0098\5\b\5\2"+
		"\u0083\u0084\7\62\2\2\u0084\u0085\7\61\2\2\u0085\u0086\7/\2\2\u0086\u0087"+
		"\5\b\5\2\u0087\u0088\7\60\2\2\u0088\u0098\3\2\2\2\u0089\u008a\7\t\2\2"+
		"\u008a\u008b\7\62\2\2\u008b\u0098\5\b\5\2\u008c\u008d\7\63\2\2\u008d\u0091"+
		"\7/\2\2\u008e\u0090\5\b\5\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0098\7\60\2\2\u0095\u0096\7\63\2\2\u0096\u0098\5\b\5\2\u0097"+
		"u\3\2\2\2\u0097z\3\2\2\2\u0097|\3\2\2\2\u0097\u0081\3\2\2\2\u0097\u0083"+
		"\3\2\2\2\u0097\u0089\3\2\2\2\u0097\u008c\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\23\3\2\2\2\u0099\u009a\b\13\1\2\u009a\u00ab\5\2\2\2\u009b\u009d\5\2\2"+
		"\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00ab"+
		"\5\22\n\2\u009f\u00ab\7V\2\2\u00a0\u00ab\5\4\3\2\u00a1\u00ab\7T\2\2\u00a2"+
		"\u00ab\7Z\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\5\24\13\4\u00a5\u00ab\3"+
		"\2\2\2\u00a6\u00a7\7/\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9\7\60\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u0099\3\2\2\2\u00aa\u009c\3\2\2\2\u00aa\u009f\3\2"+
		"\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa"+
		"\u00a3\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab\u00b2\3\2\2\2\u00ac\u00ad\f\5"+
		"\2\2\u00ad\u00ae\5\16\b\2\u00ae\u00af\5\24\13\6\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ac\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\25\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00bf\5\4\3\2\u00b6\u00bf"+
		"\7V\2\2\u00b7\u00bf\7T\2\2\u00b8\u00bf\7[\2\2\u00b9\u00bf\7Z\2\2\u00ba"+
		"\u00bf\5\2\2\2\u00bb\u00bf\5\f\7\2\u00bc\u00bf\5\16\b\2\u00bd\u00bf\5"+
		"\22\n\2\u00be\u00b5\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b7\3\2\2\2\u00be"+
		"\u00b8\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u0161"+
		"\7\64\2\2\u00c1\u0161\5\f\7\2\u00c2\u0161\5\16\b\2\u00c3\u0161\5\20\t"+
		"\2\u00c4\u00c5\7\65\2\2\u00c5\u00ca\7U\2\2\u00c6\u00c7\7\65\2\2\u00c7"+
		"\u00c9\7U\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u0161\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\7\66\2\2\u00ce\u00cf\5\34\17\2\u00cf\u00d0\7\67\2\2\u00d0\u0161"+
		"\3\2\2\2\u00d1\u00d2\7\66\2\2\u00d2\u00d3\5\34\17\2\u00d3\u00d4\78\2\2"+
		"\u00d4\u0161\3\2\2\2\u00d5\u00db\79\2\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8"+
		"\7\64\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00e0\5\26\f\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u0161\7:\2\2\u00e2\u00e3\7/\2\2\u00e3\u00e4"+
		"\5\24\13\2\u00e4\u00e5\7\60\2\2\u00e5\u0161\3\2\2\2\u00e6\u00e8\7;\2\2"+
		"\u00e7\u00e9\7[\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\5\34\17\2\u00eb\u00ec\7\13\2\2\u00ec\u0161\3\2\2"+
		"\2\u00ed\u00ee\7<\2\2\u00ee\u00f0\7;\2\2\u00ef\u00f1\7[\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\5\26\f\2"+
		"\u00f3\u00f4\7\13\2\2\u00f4\u0161\3\2\2\2\u00f5\u00f6\7=\2\2\u00f6\u00f7"+
		"\7U\2\2\u00f7\u00f8\7>\2\2\u00f8\u00fd\5\b\5\2\u00f9\u00fa\7\20\2\2\u00fa"+
		"\u00fc\5\26\f\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3"+
		"\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\7\13\2\2\u0101\u0161\3\2\2\2\u0102\u0103\7>\2\2\u0103\u0106\5\b"+
		"\5\2\u0104\u0105\7\20\2\2\u0105\u0107\5\34\17\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7?\2\2\u0109\u010a\5\34"+
		"\17\2\u010a\u010b\7\13\2\2\u010b\u0161\3\2\2\2\u010c\u010d\7@\2\2\u010d"+
		"\u010e\5\34\17\2\u010e\u010f\7A\2\2\u010f\u0117\5\34\17\2\u0110\u0111"+
		"\7B\2\2\u0111\u0112\5\34\17\2\u0112\u0113\7A\2\2\u0113\u0114\5\34\17\2"+
		"\u0114\u0116\3\2\2\2\u0115\u0110\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011c\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7C\2\2\u011b\u011d\5\34\17\2\u011c\u011a\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\13\2\2\u011f\u0161\3\2\2\2\u0120"+
		"\u0121\7D\2\2\u0121\u0122\5\34\17\2\u0122\u0123\7A\2\2\u0123\u0126\5\34"+
		"\17\2\u0124\u0125\7C\2\2\u0125\u0127\5\34\17\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\13\2\2\u0129\u0161\3"+
		"\2\2\2\u012a\u012c\7E\2\2\u012b\u012d\7U\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0131\7?\2\2\u0131\u0132\5\34\17\2\u0132\u0133\7\13\2\2\u0133"+
		"\u0161\3\2\2\2\u0134\u0135\7F\2\2\u0135\u0136\7U\2\2\u0136\u0137\7A\2"+
		"\2\u0137\u0138\5\34\17\2\u0138\u0139\7\13\2\2\u0139\u0161\3\2\2\2\u013a"+
		"\u013b\7=\2\2\u013b\u013c\7U\2\2\u013c\u013d\5\26\f\2\u013d\u013e\7\13"+
		"\2\2\u013e\u0161\3\2\2\2\u013f\u0140\7G\2\2\u0140\u0161\7U\2\2\u0141\u0142"+
		"\7H\2\2\u0142\u0143\5\34\17\2\u0143\u0144\7\13\2\2\u0144\u0161\3\2\2\2"+
		"\u0145\u0146\7G\2\2\u0146\u0147\7U\2\2\u0147\u0148\7I\2\2\u0148\u0149"+
		"\5\34\17\2\u0149\u014a\7J\2\2\u014a\u014b\5\34\17\2\u014b\u014c\7\13\2"+
		"\2\u014c\u0161\3\2\2\2\u014d\u014e\7G\2\2\u014e\u014f\7U\2\2\u014f\u0150"+
		"\7J\2\2\u0150\u0151\5\34\17\2\u0151\u0152\7I\2\2\u0152\u0153\5\34\17\2"+
		"\u0153\u0154\7\13\2\2\u0154\u0161\3\2\2\2\u0155\u0156\7K\2\2\u0156\u0161"+
		"\7U\2\2\u0157\u0158\7L\2\2\u0158\u0161\7U\2\2\u0159\u0161\5\22\n\2\u015a"+
		"\u0161\7V\2\2\u015b\u0161\5\4\3\2\u015c\u0161\5\2\2\2\u015d\u0161\7[\2"+
		"\2\u015e\u0161\7T\2\2\u015f\u0161\7Z\2\2\u0160\u00c0\3\2\2\2\u0160\u00c1"+
		"\3\2\2\2\u0160\u00c2\3\2\2\2\u0160\u00c3\3\2\2\2\u0160\u00c4\3\2\2\2\u0160"+
		"\u00cd\3\2\2\2\u0160\u00d1\3\2\2\2\u0160\u00d5\3\2\2\2\u0160\u00e2\3\2"+
		"\2\2\u0160\u00e6\3\2\2\2\u0160\u00ed\3\2\2\2\u0160\u00f5\3\2\2\2\u0160"+
		"\u0102\3\2\2\2\u0160\u010c\3\2\2\2\u0160\u0120\3\2\2\2\u0160\u012a\3\2"+
		"\2\2\u0160\u0134\3\2\2\2\u0160\u013a\3\2\2\2\u0160\u013f\3\2\2\2\u0160"+
		"\u0141\3\2\2\2\u0160\u0145\3\2\2\2\u0160\u014d\3\2\2\2\u0160\u0155\3\2"+
		"\2\2\u0160\u0157\3\2\2\2\u0160\u0159\3\2\2\2\u0160\u015a\3\2\2\2\u0160"+
		"\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u015f\3\2\2\2\u0161\31\3\2\2\2\u0162\u0164\t\4\2\2\u0163\u0162"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7\6\2\2\u0166"+
		"\u016a\7U\2\2\u0167\u0169\5\b\5\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0173\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016f\7\7\2\2\u016e\u0170\5\b\5\2\u016f\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0177\3\2"+
		"\2\2\u0175\u0176\7Q\2\2\u0176\u0178\5\b\5\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7?\2\2\u017a\u017b\5\34"+
		"\17\2\u017b\u017c\7\13\2\2\u017c\33\3\2\2\2\u017d\u017f\5\30\r\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\35\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7R\2\2\u0184\u0185"+
		"\7[\2\2\u0185\37\3\2\2\2\u0186\u0187\7S\2\2\u0187\u0189\7[\2\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018d\3\2\2\2\u018a\u018c\5\36\20\2"+
		"\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e"+
		"\3\2\2\2\u018e\u0193\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192\5\32\16\2"+
		"\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\2\2\3\u0197"+
		"!\3\2\2\2&%*\64=DFITs\u0091\u0097\u009c\u00aa\u00b2\u00be\u00ca\u00db"+
		"\u00df\u00e8\u00f0\u00fd\u0106\u0117\u011c\u0126\u012e\u0160\u0163\u016a"+
		"\u0171\u0173\u0177\u0180\u0188\u018d\u0193";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}