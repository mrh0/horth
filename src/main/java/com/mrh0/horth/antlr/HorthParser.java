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
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, BOOL=73, NAME=74, 
		KEYED_IDENTIFIER=75, KEYED_IDENTIFIER_DEF=76, ATOM=77, INT=78, HEX=79, 
		BIN=80, CHAR=81, STRING=82, WHITESPACE=83, COMMENT=84, BLOCKCOMMENT=85;
	public static final int
		RULE_identifier = 0, RULE_integer = 1, RULE_simpleDataType = 2, RULE_dataType = 3, 
		RULE_unop = 4, RULE_binop = 5, RULE_keywords = 6, RULE_typefunc = 7, RULE_infix = 8, 
		RULE_staticExpr = 9, RULE_general = 10, RULE_block = 11, RULE_include = 12, 
		RULE_program = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "integer", "simpleDataType", "dataType", "unop", "binop", 
			"keywords", "typefunc", "infix", "staticExpr", "general", "block", "include", 
			"program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'string'", "'char'", "'atom'", "'bool'", "'ref'", "'ref<'", 
			"'>'", "'arr<'", "'any<'", "'func<'", "'->'", "'not'", "'~'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'<'", "'<='", "'>='", "'=='", "'!='", "'&'", 
			"'|'", "'and'", "'or'", "'<<'", "'>>'", "'='", "'dup'", "'dup2'", "'swap'", 
			"'swap2'", "'rot'", "'drop'", "'drop2'", "'drop3'", "'out'", "'throw'", 
			"'exit'", "'break'", "'sizeof('", "')'", "'cast('", "'unsafe'", "'is('", 
			"'('", "'['", "']'", "'{'", "','", "'}'", "'assert('", "'end'", "'static'", 
			"'inline'", "'extern'", "'func'", "'infer'", "'in'", "'let'", "'if'", 
			"'do'", "'elif'", "'else'", "'while'", "'with'", "'const'", "'include'", 
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
			null, "BOOL", "NAME", "KEYED_IDENTIFIER", "KEYED_IDENTIFIER_DEF", "ATOM", 
			"INT", "HEX", "BIN", "CHAR", "STRING", "WHITESPACE", "COMMENT", "BLOCKCOMMENT"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(INT);
				}
				break;
			case HEX:
				_localctx = new IntegerHexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new IntegerBinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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
	public static class DataTypeArrContext extends DataTypeContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DataTypeArrContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterDataTypeArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitDataTypeArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitDataTypeArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataTypeRefContext extends DataTypeContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DataTypeRefContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterDataTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitDataTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitDataTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataTypeAnyContext extends DataTypeContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public DataTypeAnyContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterDataTypeAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitDataTypeAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitDataTypeAny(this);
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				_localctx = new DataTypeSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				simpleDataType();
				}
				break;
			case T__6:
				_localctx = new DataTypeRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__6);
				setState(39);
				dataType();
				setState(40);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new DataTypeArrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(T__8);
				setState(43);
				dataType();
				setState(44);
				match(T__7);
				}
				break;
			case T__9:
				_localctx = new DataTypeAnyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(T__9);
				setState(47);
				match(NAME);
				setState(48);
				match(T__7);
				}
				break;
			case T__10:
				_localctx = new DataTypeFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(T__10);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					{
					setState(50);
					dataType();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(56);
					match(T__11);
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(57);
						dataType();
						}
						}
						setState(60); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
					}
				}

				setState(64);
				match(T__7);
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
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
		enterRule(_localctx, 14, RULE_typefunc);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				_localctx = new TypefuncSizeofContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__43);
				setState(74);
				dataType();
				setState(75);
				match(T__44);
				}
				break;
			case T__45:
				_localctx = new TypefuncCastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__45);
				setState(78);
				dataType();
				setState(79);
				match(T__44);
				}
				break;
			case T__46:
				_localctx = new TypefuncCastUnsafeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(T__46);
				setState(82);
				match(T__45);
				setState(83);
				dataType();
				setState(84);
				match(T__44);
				}
				break;
			case T__47:
				_localctx = new TypefuncIsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(T__47);
				setState(87);
				dataType();
				setState(88);
				match(T__44);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new InfixIdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(93);
				identifier();
				}
				break;
			case ATOM:
				{
				_localctx = new InfixAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(ATOM);
				}
				break;
			case INT:
			case HEX:
			case BIN:
				{
				_localctx = new InfixIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				integer();
				}
				break;
			case BOOL:
				{
				_localctx = new InfixBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(BOOL);
				}
				break;
			case CHAR:
				{
				_localctx = new InfixCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(CHAR);
				}
				break;
			case T__12:
			case T__13:
				{
				_localctx = new InfixUnOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				unop();
				setState(99);
				infix(3);
				}
				break;
			case T__43:
			case T__45:
			case T__46:
			case T__47:
				{
				_localctx = new InfixTypefuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				typefunc();
				}
				break;
			case T__48:
				{
				_localctx = new InfixInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(T__48);
				setState(103);
				infix(0);
				setState(104);
				match(T__44);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixBinOpContext(new InfixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_infix);
					setState(108);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(109);
					binop();
					setState(110);
					infix(5);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 18, RULE_staticExpr);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case HEX:
			case BIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				integer();
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(ATOM);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(CHAR);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				identifier();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				unop();
				}
				break;
			case T__7:
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
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				binop();
				}
				break;
			case T__43:
			case T__45:
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 9);
				{
				setState(125);
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
	public static class GenFuncInferContext extends GeneralContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GenFuncInferContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenFuncInfer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenFuncInfer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenFuncInfer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenFuncLetContext extends GeneralContext {
		public Token NAME;
		public List<Token> names = new ArrayList<Token>();
		public List<TerminalNode> NAME() { return getTokens(HorthParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HorthParser.NAME, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public GenFuncLetContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenFuncLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenFuncLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenFuncLet(this);
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
	public static class GenFuncSignatureContext extends GeneralContext {
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public GenFuncSignatureContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenFuncSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenFuncSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenFuncSignature(this);
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
	public static class GenAccessorContext extends GeneralContext {
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
	public static class GenFuncContext extends GeneralContext {
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
		public GenFuncContext(GeneralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGenFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGenFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGenFunc(this);
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
		enterRule(_localctx, 20, RULE_general);
		int _la;
		try {
			int _alt;
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new GenAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(ATOM);
				}
				break;
			case 2:
				_localctx = new GenIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				integer();
				}
				break;
			case 3:
				_localctx = new GenIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				identifier();
				}
				break;
			case 4:
				_localctx = new GenStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new GenBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(BOOL);
				}
				break;
			case 6:
				_localctx = new GenCharContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				match(CHAR);
				}
				break;
			case 7:
				_localctx = new GenUnopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				unop();
				}
				break;
			case 8:
				_localctx = new GenBinOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				binop();
				}
				break;
			case 9:
				_localctx = new GenKeywordContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				keywords();
				}
				break;
			case 10:
				_localctx = new GenAccessorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(137);
				match(T__49);
				setState(138);
				block();
				setState(139);
				match(T__50);
				}
				break;
			case 11:
				_localctx = new GenArrayContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(141);
				match(T__51);
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(142);
						staticExpr();
						setState(143);
						match(T__52);
						}
						} 
					}
					setState(149);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (BOOL - 73)) | (1L << (NAME - 73)) | (1L << (ATOM - 73)) | (1L << (INT - 73)) | (1L << (HEX - 73)) | (1L << (BIN - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(150);
					staticExpr();
					}
				}

				setState(153);
				match(T__53);
				}
				break;
			case 12:
				_localctx = new GenInfixContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				match(T__48);
				setState(155);
				infix(0);
				setState(156);
				match(T__44);
				}
				break;
			case 13:
				_localctx = new GenAssertContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(158);
				match(T__54);
				setState(159);
				((GenAssertContext)_localctx).message = match(STRING);
				setState(160);
				match(T__44);
				setState(161);
				block();
				setState(162);
				match(T__55);
				}
				break;
			case 14:
				_localctx = new GenStaticAssertContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(164);
				match(T__56);
				setState(165);
				match(T__54);
				setState(166);
				((GenStaticAssertContext)_localctx).message = match(STRING);
				setState(167);
				match(T__44);
				setState(168);
				staticExpr();
				setState(169);
				match(T__55);
				}
				break;
			case 15:
				_localctx = new GenFuncInferContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__57 || _la==T__58) {
					{
					setState(171);
					_la = _input.LA(1);
					if ( !(_la==T__57 || _la==T__58) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(174);
				match(T__59);
				setState(175);
				match(NAME);
				setState(176);
				match(T__60);
				setState(177);
				match(T__61);
				setState(178);
				block();
				setState(179);
				match(T__55);
				}
				break;
			case 16:
				_localctx = new GenFuncContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__57 || _la==T__58) {
					{
					setState(181);
					_la = _input.LA(1);
					if ( !(_la==T__57 || _la==T__58) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(184);
				match(T__59);
				setState(185);
				match(NAME);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					{
					setState(186);
					dataType();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(192);
					match(T__11);
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(193);
						dataType();
						}
						}
						setState(196); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
					}
				}

				setState(200);
				match(T__61);
				setState(201);
				block();
				setState(202);
				match(T__55);
				}
				break;
			case 17:
				_localctx = new GenFuncLetContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__57 || _la==T__58) {
					{
					setState(204);
					_la = _input.LA(1);
					if ( !(_la==T__57 || _la==T__58) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(207);
				match(T__59);
				setState(208);
				match(NAME);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					{
					setState(209);
					dataType();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(215);
					match(T__11);
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(216);
						dataType();
						}
						}
						setState(219); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
					}
				}

				setState(223);
				match(T__62);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					((GenFuncLetContext)_localctx).NAME = match(NAME);
					((GenFuncLetContext)_localctx).names.add(((GenFuncLetContext)_localctx).NAME);
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(229);
				match(T__61);
				setState(230);
				block();
				setState(231);
				match(T__55);
				}
				break;
			case 18:
				_localctx = new GenFuncSignatureContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__57 || _la==T__58) {
					{
					setState(233);
					_la = _input.LA(1);
					if ( !(_la==T__57 || _la==T__58) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(236);
				match(T__59);
				setState(237);
				match(NAME);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					{
					setState(238);
					dataType();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(244);
					match(T__11);
					setState(246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(245);
						dataType();
						}
						}
						setState(248); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
					}
				}

				setState(252);
				match(T__55);
				}
				break;
			case 19:
				_localctx = new GenIfContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(253);
				match(T__63);
				setState(254);
				((GenIfContext)_localctx).block = block();
				((GenIfContext)_localctx).conds.add(((GenIfContext)_localctx).block);
				setState(255);
				match(T__64);
				setState(256);
				((GenIfContext)_localctx).block = block();
				((GenIfContext)_localctx).doBlock.add(((GenIfContext)_localctx).block);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__65) {
					{
					{
					setState(257);
					match(T__65);
					setState(258);
					((GenIfContext)_localctx).block = block();
					((GenIfContext)_localctx).conds.add(((GenIfContext)_localctx).block);
					setState(259);
					match(T__64);
					setState(260);
					((GenIfContext)_localctx).block = block();
					((GenIfContext)_localctx).doBlock.add(((GenIfContext)_localctx).block);
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__66) {
					{
					setState(267);
					match(T__66);
					setState(268);
					((GenIfContext)_localctx).elseBlock = block();
					}
				}

				setState(271);
				match(T__55);
				}
				break;
			case 20:
				_localctx = new GenWhileContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(273);
				match(T__67);
				setState(274);
				((GenWhileContext)_localctx).cond = block();
				setState(275);
				match(T__64);
				setState(276);
				((GenWhileContext)_localctx).doBlock = block();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__66) {
					{
					setState(277);
					match(T__66);
					setState(278);
					((GenWhileContext)_localctx).elseBlock = block();
					}
				}

				setState(281);
				match(T__55);
				}
				break;
			case 21:
				_localctx = new GenLetContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(283);
				match(T__62);
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(284);
					((GenLetContext)_localctx).NAME = match(NAME);
					((GenLetContext)_localctx).names.add(((GenLetContext)_localctx).NAME);
					}
					}
					setState(287); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(289);
				match(T__61);
				setState(290);
				((GenLetContext)_localctx).localBlock = block();
				setState(291);
				match(T__55);
				}
				break;
			case 22:
				_localctx = new GenWithContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(293);
				match(T__68);
				setState(294);
				match(NAME);
				setState(295);
				match(T__64);
				setState(296);
				block();
				setState(297);
				match(T__55);
				}
				break;
			case 23:
				_localctx = new GenConstContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(299);
				match(T__69);
				setState(300);
				match(NAME);
				setState(301);
				staticExpr();
				setState(302);
				match(T__55);
				}
				break;
			case 24:
				_localctx = new GenIntrfuncContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(304);
				typefunc();
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
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (BOOL - 64)) | (1L << (NAME - 64)) | (1L << (ATOM - 64)) | (1L << (INT - 64)) | (1L << (HEX - 64)) | (1L << (BIN - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
				{
				{
				setState(307);
				((BlockContext)_localctx).general = general();
				((BlockContext)_localctx).contents.add(((BlockContext)_localctx).general);
				}
				}
				setState(312);
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
		enterRule(_localctx, 24, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__70);
			setState(314);
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
		public BlockContext main;
		public TerminalNode EOF() { return getToken(HorthParser.EOF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HorthParser.STRING, 0); }
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
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
		enterRule(_localctx, 26, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__71) {
				{
				setState(316);
				match(T__71);
				setState(317);
				match(STRING);
				}
			}

			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__70) {
				{
				{
				setState(320);
				((ProgramContext)_localctx).include = include();
				((ProgramContext)_localctx).includes.add(((ProgramContext)_localctx).include);
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			((ProgramContext)_localctx).main = block();
			setState(327);
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
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u014c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\5\3$\n\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\66"+
		"\n\5\f\5\16\59\13\5\3\5\3\5\6\5=\n\5\r\5\16\5>\5\5A\n\5\3\5\5\5D\n\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t]\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\nm\n\n\3\n\3\n\3\n\3\n\7\ns\n\n\f\n\16\nv\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0094\n\f\f"+
		"\f\16\f\u0097\13\f\3\f\5\f\u009a\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00af\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00b9\n\f\3\f\3\f\3\f\7\f\u00be\n\f\f\f\16\f\u00c1"+
		"\13\f\3\f\3\f\6\f\u00c5\n\f\r\f\16\f\u00c6\5\f\u00c9\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00d0\n\f\3\f\3\f\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\f"+
		"\3\f\6\f\u00dc\n\f\r\f\16\f\u00dd\5\f\u00e0\n\f\3\f\3\f\6\f\u00e4\n\f"+
		"\r\f\16\f\u00e5\3\f\3\f\3\f\3\f\3\f\5\f\u00ed\n\f\3\f\3\f\3\f\7\f\u00f2"+
		"\n\f\f\f\16\f\u00f5\13\f\3\f\3\f\6\f\u00f9\n\f\r\f\16\f\u00fa\5\f\u00fd"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0109\n\f\f\f\16\f\u010c"+
		"\13\f\3\f\3\f\5\f\u0110\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011a"+
		"\n\f\3\f\3\f\3\f\3\f\6\f\u0120\n\f\r\f\16\f\u0121\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0134\n\f\3\r\7\r\u0137"+
		"\n\r\f\r\16\r\u013a\13\r\3\16\3\16\3\16\3\17\3\17\5\17\u0141\n\17\3\17"+
		"\7\17\u0144\n\17\f\17\16\17\u0147\13\17\3\17\3\17\3\17\3\17\2\3\22\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\3\2\3\b\3\2\17\20\4\2\n\n\21"+
		"!\3\2\"-\3\2<=\2\u0187\2\36\3\2\2\2\4#\3\2\2\2\6%\3\2\2\2\bC\3\2\2\2\n"+
		"E\3\2\2\2\fG\3\2\2\2\16I\3\2\2\2\20\\\3\2\2\2\22l\3\2\2\2\24\u0080\3\2"+
		"\2\2\26\u0133\3\2\2\2\30\u0138\3\2\2\2\32\u013b\3\2\2\2\34\u0140\3\2\2"+
		"\2\36\37\7L\2\2\37\3\3\2\2\2 $\7P\2\2!$\7Q\2\2\"$\7R\2\2# \3\2\2\2#!\3"+
		"\2\2\2#\"\3\2\2\2$\5\3\2\2\2%&\t\2\2\2&\7\3\2\2\2\'D\5\6\4\2()\7\t\2\2"+
		")*\5\b\5\2*+\7\n\2\2+D\3\2\2\2,-\7\13\2\2-.\5\b\5\2./\7\n\2\2/D\3\2\2"+
		"\2\60\61\7\f\2\2\61\62\7L\2\2\62D\7\n\2\2\63\67\7\r\2\2\64\66\5\b\5\2"+
		"\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28@\3\2\2\29\67\3\2"+
		"\2\2:<\7\16\2\2;=\5\b\5\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3"+
		"\2\2\2@:\3\2\2\2@A\3\2\2\2AB\3\2\2\2BD\7\n\2\2C\'\3\2\2\2C(\3\2\2\2C,"+
		"\3\2\2\2C\60\3\2\2\2C\63\3\2\2\2D\t\3\2\2\2EF\t\3\2\2F\13\3\2\2\2GH\t"+
		"\4\2\2H\r\3\2\2\2IJ\t\5\2\2J\17\3\2\2\2KL\7.\2\2LM\5\b\5\2MN\7/\2\2N]"+
		"\3\2\2\2OP\7\60\2\2PQ\5\b\5\2QR\7/\2\2R]\3\2\2\2ST\7\61\2\2TU\7\60\2\2"+
		"UV\5\b\5\2VW\7/\2\2W]\3\2\2\2XY\7\62\2\2YZ\5\b\5\2Z[\7/\2\2[]\3\2\2\2"+
		"\\K\3\2\2\2\\O\3\2\2\2\\S\3\2\2\2\\X\3\2\2\2]\21\3\2\2\2^_\b\n\1\2_m\5"+
		"\2\2\2`m\7O\2\2am\5\4\3\2bm\7K\2\2cm\7S\2\2de\5\n\6\2ef\5\22\n\5fm\3\2"+
		"\2\2gm\5\20\t\2hi\7\63\2\2ij\5\22\n\2jk\7/\2\2km\3\2\2\2l^\3\2\2\2l`\3"+
		"\2\2\2la\3\2\2\2lb\3\2\2\2lc\3\2\2\2ld\3\2\2\2lg\3\2\2\2lh\3\2\2\2mt\3"+
		"\2\2\2no\f\6\2\2op\5\f\7\2pq\5\22\n\7qs\3\2\2\2rn\3\2\2\2sv\3\2\2\2tr"+
		"\3\2\2\2tu\3\2\2\2u\23\3\2\2\2vt\3\2\2\2w\u0081\5\4\3\2x\u0081\7O\2\2"+
		"y\u0081\7K\2\2z\u0081\7T\2\2{\u0081\7S\2\2|\u0081\5\2\2\2}\u0081\5\n\6"+
		"\2~\u0081\5\f\7\2\177\u0081\5\20\t\2\u0080w\3\2\2\2\u0080x\3\2\2\2\u0080"+
		"y\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\25\3\2\2\2\u0082\u0134\7O\2\2"+
		"\u0083\u0134\5\4\3\2\u0084\u0134\5\2\2\2\u0085\u0134\7T\2\2\u0086\u0134"+
		"\7K\2\2\u0087\u0134\7S\2\2\u0088\u0134\5\n\6\2\u0089\u0134\5\f\7\2\u008a"+
		"\u0134\5\16\b\2\u008b\u008c\7\64\2\2\u008c\u008d\5\30\r\2\u008d\u008e"+
		"\7\65\2\2\u008e\u0134\3\2\2\2\u008f\u0095\7\66\2\2\u0090\u0091\5\24\13"+
		"\2\u0091\u0092\7\67\2\2\u0092\u0094\3\2\2\2\u0093\u0090\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u009a\5\24\13\2\u0099\u0098\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0134\78\2\2\u009c\u009d\7\63"+
		"\2\2\u009d\u009e\5\22\n\2\u009e\u009f\7/\2\2\u009f\u0134\3\2\2\2\u00a0"+
		"\u00a1\79\2\2\u00a1\u00a2\7T\2\2\u00a2\u00a3\7/\2\2\u00a3\u00a4\5\30\r"+
		"\2\u00a4\u00a5\7:\2\2\u00a5\u0134\3\2\2\2\u00a6\u00a7\7;\2\2\u00a7\u00a8"+
		"\79\2\2\u00a8\u00a9\7T\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ab\5\24\13\2\u00ab"+
		"\u00ac\7:\2\2\u00ac\u0134\3\2\2\2\u00ad\u00af\t\6\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1"+
		"\u00b2\7L\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b4\7@\2\2\u00b4\u00b5\5\30\r"+
		"\2\u00b5\u00b6\7:\2\2\u00b6\u0134\3\2\2\2\u00b7\u00b9\t\6\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb"+
		"\u00bf\7L\2\2\u00bc\u00be\5\b\5\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c8\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c4\7\16\2\2\u00c3\u00c5\5\b\5\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\7@\2\2\u00cb\u00cc\5\30\r\2\u00cc\u00cd\7:\2\2\u00cd"+
		"\u0134\3\2\2\2\u00ce\u00d0\t\6\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d6\7L\2\2\u00d3\u00d5"+
		"\5\b\5\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00df\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\16"+
		"\2\2\u00da\u00dc\5\b\5\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00d9\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\7A\2\2\u00e2"+
		"\u00e4\7L\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8"+
		"\u00e9\5\30\r\2\u00e9\u00ea\7:\2\2\u00ea\u0134\3\2\2\2\u00eb\u00ed\t\6"+
		"\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\7>\2\2\u00ef\u00f3\7L\2\2\u00f0\u00f2\5\b\5\2\u00f1\u00f0\3\2\2"+
		"\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fc"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7\16\2\2\u00f7\u00f9\5\b\5\2"+
		"\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0134\7:\2\2\u00ff\u0100\7B\2\2\u0100\u0101\5\30"+
		"\r\2\u0101\u0102\7C\2\2\u0102\u010a\5\30\r\2\u0103\u0104\7D\2\2\u0104"+
		"\u0105\5\30\r\2\u0105\u0106\7C\2\2\u0106\u0107\5\30\r\2\u0107\u0109\3"+
		"\2\2\2\u0108\u0103\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010f\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7E"+
		"\2\2\u010e\u0110\5\30\r\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\7:\2\2\u0112\u0134\3\2\2\2\u0113\u0114\7F\2"+
		"\2\u0114\u0115\5\30\r\2\u0115\u0116\7C\2\2\u0116\u0119\5\30\r\2\u0117"+
		"\u0118\7E\2\2\u0118\u011a\5\30\r\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7:\2\2\u011c\u0134\3\2\2\2\u011d"+
		"\u011f\7A\2\2\u011e\u0120\7L\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2"+
		"\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124"+
		"\7@\2\2\u0124\u0125\5\30\r\2\u0125\u0126\7:\2\2\u0126\u0134\3\2\2\2\u0127"+
		"\u0128\7G\2\2\u0128\u0129\7L\2\2\u0129\u012a\7C\2\2\u012a\u012b\5\30\r"+
		"\2\u012b\u012c\7:\2\2\u012c\u0134\3\2\2\2\u012d\u012e\7H\2\2\u012e\u012f"+
		"\7L\2\2\u012f\u0130\5\24\13\2\u0130\u0131\7:\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0134\5\20\t\2\u0133\u0082\3\2\2\2\u0133\u0083\3\2\2\2\u0133\u0084\3"+
		"\2\2\2\u0133\u0085\3\2\2\2\u0133\u0086\3\2\2\2\u0133\u0087\3\2\2\2\u0133"+
		"\u0088\3\2\2\2\u0133\u0089\3\2\2\2\u0133\u008a\3\2\2\2\u0133\u008b\3\2"+
		"\2\2\u0133\u008f\3\2\2\2\u0133\u009c\3\2\2\2\u0133\u00a0\3\2\2\2\u0133"+
		"\u00a6\3\2\2\2\u0133\u00ae\3\2\2\2\u0133\u00b8\3\2\2\2\u0133\u00cf\3\2"+
		"\2\2\u0133\u00ec\3\2\2\2\u0133\u00ff\3\2\2\2\u0133\u0113\3\2\2\2\u0133"+
		"\u011d\3\2\2\2\u0133\u0127\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u0132\3\2"+
		"\2\2\u0134\27\3\2\2\2\u0135\u0137\5\26\f\2\u0136\u0135\3\2\2\2\u0137\u013a"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\31\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013c\7I\2\2\u013c\u013d\7T\2\2\u013d\33\3\2\2\2"+
		"\u013e\u013f\7J\2\2\u013f\u0141\7T\2\2\u0140\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0145\3\2\2\2\u0142\u0144\5\32\16\2\u0143\u0142\3\2\2\2"+
		"\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\5\30\r\2\u0149\u014a\7\2\2\3"+
		"\u014a\35\3\2\2\2##\67>@C\\lt\u0080\u0095\u0099\u00ae\u00b8\u00bf\u00c6"+
		"\u00c8\u00cf\u00d6\u00dd\u00df\u00e5\u00ec\u00f3\u00fa\u00fc\u010a\u010f"+
		"\u0119\u0121\u0133\u0138\u0140\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}