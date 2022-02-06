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
		T__80=81, T__81=82, T__82=83, T__83=84, BOOL=85, NAME=86, ATOM=87, INT=88, 
		HEX=89, BIN=90, CHAR=91, STRING=92, STRING_NT=93, WHITESPACE=94, COMMENT=95, 
		BLOCKCOMMENT=96;
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
			null, "'@'", "'.'", "'<'", "'>'", "'ref<'", "'arr<'", "'func<'", "'->'", 
			"'*'", "'atom<'", "'|'", "'type'", "'as'", "'end'", "'not'", "'~'", "'+'", 
			"'-'", "'/'", "'%'", "'<='", "'>='", "'=='", "'!='", "'&'", "'and'", 
			"'or'", "'<<'", "'>>'", "'='", "'dup'", "'dup2'", "'swap'", "'swap2'", 
			"'drop'", "'drop2'", "'drop3'", "'out'", "'log'", "'error'", "'log^'", 
			"'exit'", "'halt'", "'break'", "'length'", "'here'", "'void'", "'sizeof'", 
			"'('", "')'", "'cast'", "'unsafe'", "'is'", "','", "'['", "']'", "']^'", 
			"'{'", "'}'", "'assert'", "'static'", "'const'", "'alloc'", "'in'", "'if'", 
			"'do'", "'elif'", "'else'", "'while'", "'let'", "'with'", "'try'", "'throw'", 
			"'pass'", "'catch'", "'syscall'", "'export'", "'inline'", "'extern'", 
			"'start'", "'func'", "'throws'", "'include'", "'module'"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BOOL", "NAME", "ATOM", "INT", "HEX", "BIN", "CHAR", "STRING", 
			"STRING_NT", "WHITESPACE", "COMMENT", "BLOCKCOMMENT"
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
		public List<TerminalNode> NAME() { return getTokens(HorthParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HorthParser.NAME, i);
		}
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
		int _la;
		try {
			int _alt;
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__0);
				setState(33);
				match(NAME);
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(37);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(34);
							match(T__1);
							}
							}
							setState(39);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(40);
						match(NAME);
						}
						} 
					}
					setState(45);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(NAME);
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(50);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(47);
							match(T__1);
							}
							}
							setState(52);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(53);
						match(NAME);
						}
						} 
					}
					setState(58);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(59);
						match(T__1);
						}
						} 
					}
					setState(64);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(INT);
				}
				break;
			case HEX:
				_localctx = new IntegerHexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new IntegerBinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
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
			setState(72);
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
	public static class DataTypeManyContext extends DataTypeContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public StaticExprContext staticExpr() {
			return getRuleContext(StaticExprContext.class,0);
		}
		public DataTypeManyContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterDataTypeMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitDataTypeMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitDataTypeMany(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataTypeAtomsContext extends DataTypeContext {
		public List<TerminalNode> ATOM() { return getTokens(HorthParser.ATOM); }
		public TerminalNode ATOM(int i) {
			return getToken(HorthParser.ATOM, i);
		}
		public DataTypeAtomsContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterDataTypeAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitDataTypeAtoms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitDataTypeAtoms(this);
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
		return dataType(0);
	}

	private DataTypeContext dataType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DataTypeContext _localctx = new DataTypeContext(_ctx, _parentState);
		DataTypeContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_dataType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new DataTypeSimpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				simpleDataType();
				}
				break;
			case 2:
				{
				_localctx = new DataTypeGeneralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(NAME);
				setState(77);
				match(T__2);
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					dataType(0);
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9))) != 0) || _la==NAME );
				setState(83);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new DataTypeRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(T__4);
				setState(86);
				dataType(0);
				setState(87);
				match(T__3);
				}
				break;
			case 4:
				{
				_localctx = new DataTypeArrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(T__5);
				setState(90);
				dataType(0);
				setState(91);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new DataTypeFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(T__6);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9))) != 0) || _la==NAME) {
					{
					{
					setState(94);
					dataType(0);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(100);
					match(T__7);
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(101);
						dataType(0);
						}
						}
						setState(104); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9))) != 0) || _la==NAME );
					}
				}

				setState(108);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new DataTypeAtomsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__9);
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						match(ATOM);
						setState(111);
						match(T__10);
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(117);
				match(ATOM);
				setState(118);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DataTypeManyContext(new DataTypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_dataType);
					setState(121);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(122);
					match(T__8);
					setState(123);
					staticExpr();
					}
					} 
				}
				setState(128);
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
			setState(129);
			match(T__11);
			setState(130);
			match(NAME);
			setState(131);
			match(T__12);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					match(NAME);
					setState(133);
					dataType(0);
					setState(134);
					match(T__10);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(141);
			match(NAME);
			setState(142);
			dataType(0);
			setState(143);
			match(T__13);
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
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(T__33);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(T__34);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(T__35);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(T__36);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				match(T__37);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(157);
				match(T__38);
				setState(158);
				match(T__39);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(159);
				match(T__40);
				setState(160);
				match(T__39);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				match(T__38);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(162);
				match(T__40);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(163);
				match(T__41);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(164);
				match(T__42);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(165);
				match(T__43);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(166);
				match(T__44);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(167);
				match(T__45);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(168);
				match(T__46);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new TypefuncSizeofContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__47);
				setState(172);
				match(T__48);
				setState(173);
				dataType(0);
				setState(174);
				match(T__49);
				}
				break;
			case 2:
				_localctx = new TypefuncSizeofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__47);
				setState(177);
				dataType(0);
				}
				break;
			case 3:
				_localctx = new TypefuncCastContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(T__50);
				setState(179);
				match(T__48);
				setState(180);
				dataType(0);
				setState(181);
				match(T__49);
				}
				break;
			case 4:
				_localctx = new TypefuncCastContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(T__12);
				setState(184);
				dataType(0);
				}
				break;
			case 5:
				_localctx = new TypefuncCastUnsafeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(T__51);
				setState(186);
				match(T__50);
				setState(187);
				match(T__48);
				setState(188);
				dataType(0);
				setState(189);
				match(T__49);
				}
				break;
			case 6:
				_localctx = new TypefuncCastUnsafeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				match(T__12);
				setState(192);
				match(T__51);
				setState(193);
				dataType(0);
				}
				break;
			case 7:
				_localctx = new TypefuncIsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				match(T__52);
				setState(195);
				match(T__48);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9))) != 0) || _la==NAME) {
					{
					{
					setState(196);
					((TypefuncIsContext)_localctx).dataType = dataType(0);
					((TypefuncIsContext)_localctx).types.add(((TypefuncIsContext)_localctx).dataType);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				match(T__49);
				}
				break;
			case 8:
				_localctx = new TypefuncIsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				match(T__52);
				setState(204);
				((TypefuncIsContext)_localctx).dataType = dataType(0);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new InfixIdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(208);
				identifier();
				}
				break;
			case 2:
				{
				_localctx = new InfixTypefuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==NAME) {
					{
					setState(209);
					identifier();
					}
				}

				setState(212);
				typefunc();
				}
				break;
			case 3:
				{
				_localctx = new InfixAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(ATOM);
				}
				break;
			case 4:
				{
				_localctx = new InfixIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				integer();
				}
				break;
			case 5:
				{
				_localctx = new InfixBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(BOOL);
				}
				break;
			case 6:
				{
				_localctx = new InfixCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(CHAR);
				}
				break;
			case 7:
				{
				_localctx = new InfixUnOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				unop();
				setState(218);
				infix(2);
				}
				break;
			case 8:
				{
				_localctx = new InfixInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(T__48);
				setState(221);
				infix(0);
				setState(222);
				match(T__49);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixBinOpContext(new InfixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_infix);
					setState(226);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(227);
					binop();
					setState(228);
					infix(4);
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case HEX:
			case BIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				integer();
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(ATOM);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(CHAR);
				}
				break;
			case T__0:
			case NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				identifier();
				}
				break;
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				unop();
				}
				break;
			case T__2:
			case T__3:
			case T__8:
			case T__10:
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
				enterOuterAlt(_localctx, 8);
				{
				setState(242);
				binop();
				}
				break;
			case T__12:
			case T__47:
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 9);
				{
				setState(243);
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
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new GenAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(ATOM);
				}
				break;
			case 2:
				_localctx = new GenIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				integer();
				}
				break;
			case 3:
				_localctx = new GenIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				identifier();
				}
				break;
			case 4:
				_localctx = new GenStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new GenBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(BOOL);
				}
				break;
			case 6:
				_localctx = new GenCharContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(CHAR);
				}
				break;
			case 7:
				_localctx = new GenSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				match(T__53);
				}
				break;
			case 8:
				_localctx = new GenUnopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
				unop();
				}
				break;
			case 9:
				_localctx = new GenBinOpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
				binop();
				}
				break;
			case 10:
				_localctx = new GenKeywordContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(255);
				keywords();
				}
				break;
			case 11:
				_localctx = new GenAccessorContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(256);
				match(T__54);
				setState(257);
				((GenAccessorContext)_localctx).accBlock = block();
				setState(258);
				match(T__55);
				}
				break;
			case 12:
				_localctx = new GenAccessorStrictContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(260);
				match(T__54);
				setState(261);
				((GenAccessorStrictContext)_localctx).accBlock = block();
				setState(262);
				match(T__56);
				}
				break;
			case 13:
				_localctx = new GenArrayContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(264);
				match(T__57);
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(265);
						staticExpr();
						setState(266);
						match(T__53);
						}
						} 
					}
					setState(272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__47) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (BOOL - 85)) | (1L << (NAME - 85)) | (1L << (ATOM - 85)) | (1L << (INT - 85)) | (1L << (HEX - 85)) | (1L << (BIN - 85)) | (1L << (CHAR - 85)) | (1L << (STRING - 85)))) != 0)) {
					{
					setState(273);
					staticExpr();
					}
				}

				setState(276);
				match(T__58);
				}
				break;
			case 14:
				_localctx = new GenInfixContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(277);
				match(T__48);
				setState(278);
				infix(0);
				setState(279);
				match(T__49);
				}
				break;
			case 15:
				_localctx = new GenAssertContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(281);
				match(T__59);
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(282);
					((GenAssertContext)_localctx).message = match(STRING);
					}
					break;
				}
				setState(285);
				block();
				setState(286);
				match(T__13);
				}
				break;
			case 16:
				_localctx = new GenStaticAssertContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(288);
				match(T__60);
				setState(289);
				match(T__59);
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(290);
					((GenStaticAssertContext)_localctx).message = match(STRING);
					}
					break;
				}
				setState(293);
				staticExpr();
				setState(294);
				match(T__13);
				}
				break;
			case 17:
				_localctx = new GenAllocStaticContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(296);
				match(T__61);
				setState(297);
				match(NAME);
				setState(298);
				match(T__62);
				setState(299);
				dataType(0);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(300);
					match(T__8);
					setState(301);
					staticExpr();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
				match(T__13);
				}
				break;
			case 18:
				_localctx = new GenAllocContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(309);
				match(T__62);
				setState(310);
				dataType(0);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(311);
					match(T__8);
					setState(312);
					block();
					}
				}

				setState(315);
				match(T__63);
				setState(316);
				block();
				setState(317);
				match(T__13);
				}
				break;
			case 19:
				_localctx = new GenIfContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(319);
				match(T__64);
				setState(320);
				((GenIfContext)_localctx).block = block();
				((GenIfContext)_localctx).conds.add(((GenIfContext)_localctx).block);
				setState(321);
				match(T__65);
				setState(322);
				((GenIfContext)_localctx).block = block();
				((GenIfContext)_localctx).doBlock.add(((GenIfContext)_localctx).block);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__66) {
					{
					{
					setState(323);
					match(T__66);
					setState(324);
					((GenIfContext)_localctx).block = block();
					((GenIfContext)_localctx).conds.add(((GenIfContext)_localctx).block);
					setState(325);
					match(T__65);
					setState(326);
					((GenIfContext)_localctx).block = block();
					((GenIfContext)_localctx).doBlock.add(((GenIfContext)_localctx).block);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__67) {
					{
					setState(333);
					match(T__67);
					setState(334);
					((GenIfContext)_localctx).elseBlock = block();
					}
				}

				setState(337);
				match(T__13);
				}
				break;
			case 20:
				_localctx = new GenWhileContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(339);
				match(T__68);
				setState(340);
				((GenWhileContext)_localctx).cond = block();
				setState(341);
				match(T__65);
				setState(342);
				((GenWhileContext)_localctx).doBlock = block();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__67) {
					{
					setState(343);
					match(T__67);
					setState(344);
					((GenWhileContext)_localctx).elseBlock = block();
					}
				}

				setState(347);
				match(T__13);
				}
				break;
			case 21:
				_localctx = new GenLetContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(349);
				match(T__69);
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(350);
					((GenLetContext)_localctx).NAME = match(NAME);
					((GenLetContext)_localctx).names.add(((GenLetContext)_localctx).NAME);
					}
					}
					setState(353); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(355);
				match(T__63);
				setState(356);
				((GenLetContext)_localctx).localBlock = block();
				setState(357);
				match(T__13);
				}
				break;
			case 22:
				_localctx = new GenWithContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(359);
				match(T__70);
				setState(360);
				match(NAME);
				setState(361);
				match(T__65);
				setState(362);
				block();
				setState(363);
				match(T__13);
				}
				break;
			case 23:
				_localctx = new GenConstContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(365);
				match(T__61);
				setState(366);
				match(NAME);
				setState(367);
				staticExpr();
				setState(368);
				match(T__13);
				}
				break;
			case 24:
				_localctx = new GenTryContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(370);
				match(T__71);
				setState(371);
				match(NAME);
				}
				break;
			case 25:
				_localctx = new GenThrowContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(372);
				match(T__72);
				setState(373);
				block();
				setState(374);
				match(T__13);
				}
				break;
			case 26:
				_localctx = new GenCatchContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(376);
				match(T__71);
				setState(377);
				match(NAME);
				setState(378);
				match(T__73);
				setState(379);
				((GenCatchContext)_localctx).passBlock = block();
				setState(380);
				match(T__74);
				setState(381);
				((GenCatchContext)_localctx).failBlock = block();
				setState(382);
				match(T__13);
				}
				break;
			case 27:
				_localctx = new GenCatchContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(384);
				match(T__71);
				setState(385);
				match(NAME);
				setState(386);
				match(T__74);
				setState(387);
				((GenCatchContext)_localctx).failBlock = block();
				setState(388);
				match(T__73);
				setState(389);
				((GenCatchContext)_localctx).passBlock = block();
				setState(390);
				match(T__13);
				}
				break;
			case 28:
				_localctx = new GenSyscallContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(392);
				match(T__75);
				setState(393);
				((GenSyscallContext)_localctx).sysCallName = match(NAME);
				}
				break;
			case 29:
				_localctx = new GenExportContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(394);
				match(T__76);
				setState(395);
				match(NAME);
				}
				break;
			case 30:
				_localctx = new GenIntrfuncContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(396);
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
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)))) != 0)) {
				{
				setState(399);
				((MainFuncContext)_localctx).funcPrefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)))) != 0)) ) {
					((MainFuncContext)_localctx).funcPrefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(402);
			match(T__80);
			setState(403);
			((MainFuncContext)_localctx).name = match(NAME);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9))) != 0) || _la==NAME) {
				{
				{
				setState(404);
				((MainFuncContext)_localctx).dataType = dataType(0);
				((MainFuncContext)_localctx).args.add(((MainFuncContext)_localctx).dataType);
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(410);
				match(T__7);
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(411);
					((MainFuncContext)_localctx).dataType = dataType(0);
					((MainFuncContext)_localctx).rets.add(((MainFuncContext)_localctx).dataType);
					}
					}
					setState(414); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9))) != 0) || _la==NAME );
				}
			}

			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__81) {
				{
				setState(418);
				match(T__81);
				setState(419);
				((MainFuncContext)_localctx).thrown = dataType(0);
				}
			}

			setState(422);
			match(T__63);
			setState(423);
			((MainFuncContext)_localctx).funcBody = block();
			setState(424);
			match(T__13);
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
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__72 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (BOOL - 65)) | (1L << (NAME - 65)) | (1L << (ATOM - 65)) | (1L << (INT - 65)) | (1L << (HEX - 65)) | (1L << (BIN - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
				{
				{
				setState(426);
				((BlockContext)_localctx).general = general();
				((BlockContext)_localctx).contents.add(((BlockContext)_localctx).general);
				}
				}
				setState(431);
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
			setState(432);
			match(T__82);
			setState(433);
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
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(435);
				match(T__83);
				setState(436);
				match(STRING);
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__82) {
				{
				{
				setState(439);
				((ProgramContext)_localctx).include = include();
				((ProgramContext)_localctx).includes.add(((ProgramContext)_localctx).include);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (T__80 - 78)))) != 0)) {
				{
				{
				setState(445);
				((ProgramContext)_localctx).mainBlock = mainBlock();
				((ProgramContext)_localctx).main.add(((ProgramContext)_localctx).mainBlock);
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
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
		case 3:
			return dataType_sempred((DataTypeContext)_localctx, predIndex);
		case 9:
			return infix_sempred((InfixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dataType_sempred(DataTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean infix_sempred(InfixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u01c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\7\2\63"+
		"\n\2\f\2\16\2\66\13\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\5\2D\n\2\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\6\5"+
		"R\n\5\r\5\16\5S\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5b\n"+
		"\5\f\5\16\5e\13\5\3\5\3\5\6\5i\n\5\r\5\16\5j\5\5m\n\5\3\5\3\5\3\5\3\5"+
		"\7\5s\n\5\f\5\16\5v\13\5\3\5\3\5\5\5z\n\5\3\5\3\5\3\5\7\5\177\n\5\f\5"+
		"\16\5\u0082\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008b\n\6\f\6\16\6\u008e"+
		"\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c8\n\n\f\n\16\n\u00cb\13\n\3\n\3\n\3"+
		"\n\5\n\u00d0\n\n\3\13\3\13\3\13\5\13\u00d5\n\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e3\n\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00e9\n\13\f\13\16\13\u00ec\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00f7\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u010f\n\r\f\r\16\r\u0112"+
		"\13\r\3\r\5\r\u0115\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011e\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0126\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u0131\n\r\f\r\16\r\u0134\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u013c\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u014b\n\r\f"+
		"\r\16\r\u014e\13\r\3\r\3\r\5\r\u0152\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u015c\n\r\3\r\3\r\3\r\3\r\6\r\u0162\n\r\r\r\16\r\u0163\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0190\n\r\3\16\5\16\u0193\n\16\3\16\3\16\3\16"+
		"\7\16\u0198\n\16\f\16\16\16\u019b\13\16\3\16\3\16\6\16\u019f\n\16\r\16"+
		"\16\16\u01a0\5\16\u01a3\n\16\3\16\3\16\5\16\u01a7\n\16\3\16\3\16\3\16"+
		"\3\16\3\17\7\17\u01ae\n\17\f\17\16\17\u01b1\13\17\3\20\3\20\3\20\3\21"+
		"\3\21\5\21\u01b8\n\21\3\21\7\21\u01bb\n\21\f\21\16\21\u01be\13\21\3\21"+
		"\7\21\u01c1\n\21\f\21\16\21\u01c4\13\21\3\21\3\21\3\21\2\4\b\24\22\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\21\22\6\2\5\6\13\13\r\r\23"+
		" \3\2PR\2\u0225\2C\3\2\2\2\4H\3\2\2\2\6J\3\2\2\2\by\3\2\2\2\n\u0083\3"+
		"\2\2\2\f\u0093\3\2\2\2\16\u0095\3\2\2\2\20\u00ab\3\2\2\2\22\u00cf\3\2"+
		"\2\2\24\u00e2\3\2\2\2\26\u00f6\3\2\2\2\30\u018f\3\2\2\2\32\u0192\3\2\2"+
		"\2\34\u01af\3\2\2\2\36\u01b2\3\2\2\2 \u01b7\3\2\2\2\"#\7\3\2\2#-\7X\2"+
		"\2$&\7\4\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3"+
		"\2\2\2*,\7X\2\2+\'\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.D\3\2\2\2/-\3"+
		"\2\2\2\60:\7X\2\2\61\63\7\4\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2"+
		"\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\679\7X\2\28\64\3\2\2\2"+
		"9<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2\2\2=?\7\4\2\2>=\3\2\2\2"+
		"?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C\"\3\2\2\2C\60\3\2"+
		"\2\2D\3\3\2\2\2EI\7Z\2\2FI\7[\2\2GI\7\\\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2"+
		"\2\2I\5\3\2\2\2JK\7X\2\2K\7\3\2\2\2LM\b\5\1\2Mz\5\6\4\2NO\7X\2\2OQ\7\5"+
		"\2\2PR\5\b\5\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\6"+
		"\2\2Vz\3\2\2\2WX\7\7\2\2XY\5\b\5\2YZ\7\6\2\2Zz\3\2\2\2[\\\7\b\2\2\\]\5"+
		"\b\5\2]^\7\6\2\2^z\3\2\2\2_c\7\t\2\2`b\5\b\5\2a`\3\2\2\2be\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2dl\3\2\2\2ec\3\2\2\2fh\7\n\2\2gi\5\b\5\2hg\3\2\2\2ij\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lf\3\2\2\2lm\3\2\2\2mn\3\2\2\2nz\7"+
		"\6\2\2ot\7\f\2\2pq\7Y\2\2qs\7\r\2\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7Y\2\2xz\7\6\2\2yL\3\2\2\2yN\3\2\2\2yW\3"+
		"\2\2\2y[\3\2\2\2y_\3\2\2\2yo\3\2\2\2z\u0080\3\2\2\2{|\f\4\2\2|}\7\13\2"+
		"\2}\177\5\26\f\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\t\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\16\2\2\u0084"+
		"\u0085\7X\2\2\u0085\u008c\7\17\2\2\u0086\u0087\7X\2\2\u0087\u0088\5\b"+
		"\5\2\u0088\u0089\7\r\2\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7X\2\2\u0090\u0091\5\b\5\2\u0091"+
		"\u0092\7\20\2\2\u0092\13\3\2\2\2\u0093\u0094\t\2\2\2\u0094\r\3\2\2\2\u0095"+
		"\u0096\t\3\2\2\u0096\17\3\2\2\2\u0097\u00ac\7!\2\2\u0098\u00ac\7\"\2\2"+
		"\u0099\u00ac\7#\2\2\u009a\u00ac\7$\2\2\u009b\u00ac\7%\2\2\u009c\u00ac"+
		"\7&\2\2\u009d\u00ac\7\'\2\2\u009e\u00ac\7(\2\2\u009f\u00a0\7)\2\2\u00a0"+
		"\u00ac\7*\2\2\u00a1\u00a2\7+\2\2\u00a2\u00ac\7*\2\2\u00a3\u00ac\7)\2\2"+
		"\u00a4\u00ac\7+\2\2\u00a5\u00ac\7,\2\2\u00a6\u00ac\7-\2\2\u00a7\u00ac"+
		"\7.\2\2\u00a8\u00ac\7/\2\2\u00a9\u00ac\7\60\2\2\u00aa\u00ac\7\61\2\2\u00ab"+
		"\u0097\3\2\2\2\u00ab\u0098\3\2\2\2\u00ab\u0099\3\2\2\2\u00ab\u009a\3\2"+
		"\2\2\u00ab\u009b\3\2\2\2\u00ab\u009c\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab"+
		"\u009e\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a3\3\2"+
		"\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab"+
		"\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\7\62\2\2\u00ae\u00af\7\63\2\2\u00af"+
		"\u00b0\5\b\5\2\u00b0\u00b1\7\64\2\2\u00b1\u00d0\3\2\2\2\u00b2\u00b3\7"+
		"\62\2\2\u00b3\u00d0\5\b\5\2\u00b4\u00b5\7\65\2\2\u00b5\u00b6\7\63\2\2"+
		"\u00b6\u00b7\5\b\5\2\u00b7\u00b8\7\64\2\2\u00b8\u00d0\3\2\2\2\u00b9\u00ba"+
		"\7\17\2\2\u00ba\u00d0\5\b\5\2\u00bb\u00bc\7\66\2\2\u00bc\u00bd\7\65\2"+
		"\2\u00bd\u00be\7\63\2\2\u00be\u00bf\5\b\5\2\u00bf\u00c0\7\64\2\2\u00c0"+
		"\u00d0\3\2\2\2\u00c1\u00c2\7\17\2\2\u00c2\u00c3\7\66\2\2\u00c3\u00d0\5"+
		"\b\5\2\u00c4\u00c5\7\67\2\2\u00c5\u00c9\7\63\2\2\u00c6\u00c8\5\b\5\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d0\7\64\2\2\u00cd"+
		"\u00ce\7\67\2\2\u00ce\u00d0\5\b\5\2\u00cf\u00ad\3\2\2\2\u00cf\u00b2\3"+
		"\2\2\2\u00cf\u00b4\3\2\2\2\u00cf\u00b9\3\2\2\2\u00cf\u00bb\3\2\2\2\u00cf"+
		"\u00c1\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\23\3\2\2"+
		"\2\u00d1\u00d2\b\13\1\2\u00d2\u00e3\5\2\2\2\u00d3\u00d5\5\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00e3\5\22"+
		"\n\2\u00d7\u00e3\7Y\2\2\u00d8\u00e3\5\4\3\2\u00d9\u00e3\7W\2\2\u00da\u00e3"+
		"\7]\2\2\u00db\u00dc\5\f\7\2\u00dc\u00dd\5\24\13\4\u00dd\u00e3\3\2\2\2"+
		"\u00de\u00df\7\63\2\2\u00df\u00e0\5\24\13\2\u00e0\u00e1\7\64\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00d1\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e2\u00d7\3\2"+
		"\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2"+
		"\u00db\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\u00ea\3\2\2\2\u00e4\u00e5\f\5"+
		"\2\2\u00e5\u00e6\5\16\b\2\u00e6\u00e7\5\24\13\6\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\25\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f7\5\4\3\2\u00ee\u00f7"+
		"\7Y\2\2\u00ef\u00f7\7W\2\2\u00f0\u00f7\7^\2\2\u00f1\u00f7\7]\2\2\u00f2"+
		"\u00f7\5\2\2\2\u00f3\u00f7\5\f\7\2\u00f4\u00f7\5\16\b\2\u00f5\u00f7\5"+
		"\22\n\2\u00f6\u00ed\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6"+
		"\u00f0\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\27\3\2\2\2\u00f8\u0190"+
		"\7Y\2\2\u00f9\u0190\5\4\3\2\u00fa\u0190\5\2\2\2\u00fb\u0190\7^\2\2\u00fc"+
		"\u0190\7W\2\2\u00fd\u0190\7]\2\2\u00fe\u0190\78\2\2\u00ff\u0190\5\f\7"+
		"\2\u0100\u0190\5\16\b\2\u0101\u0190\5\20\t\2\u0102\u0103\79\2\2\u0103"+
		"\u0104\5\34\17\2\u0104\u0105\7:\2\2\u0105\u0190\3\2\2\2\u0106\u0107\7"+
		"9\2\2\u0107\u0108\5\34\17\2\u0108\u0109\7;\2\2\u0109\u0190\3\2\2\2\u010a"+
		"\u0110\7<\2\2\u010b\u010c\5\26\f\2\u010c\u010d\78\2\2\u010d\u010f\3\2"+
		"\2\2\u010e\u010b\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\5\26"+
		"\f\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0190\7=\2\2\u0117\u0118\7\63\2\2\u0118\u0119\5\24\13\2\u0119\u011a\7"+
		"\64\2\2\u011a\u0190\3\2\2\2\u011b\u011d\7>\2\2\u011c\u011e\7^\2\2\u011d"+
		"\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\5\34"+
		"\17\2\u0120\u0121\7\20\2\2\u0121\u0190\3\2\2\2\u0122\u0123\7?\2\2\u0123"+
		"\u0125\7>\2\2\u0124\u0126\7^\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2"+
		"\2\u0126\u0127\3\2\2\2\u0127\u0128\5\26\f\2\u0128\u0129\7\20\2\2\u0129"+
		"\u0190\3\2\2\2\u012a\u012b\7@\2\2\u012b\u012c\7X\2\2\u012c\u012d\7A\2"+
		"\2\u012d\u0132\5\b\5\2\u012e\u012f\7\13\2\2\u012f\u0131\5\26\f\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7\20\2\2\u0136"+
		"\u0190\3\2\2\2\u0137\u0138\7A\2\2\u0138\u013b\5\b\5\2\u0139\u013a\7\13"+
		"\2\2\u013a\u013c\5\34\17\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\7B\2\2\u013e\u013f\5\34\17\2\u013f\u0140\7"+
		"\20\2\2\u0140\u0190\3\2\2\2\u0141\u0142\7C\2\2\u0142\u0143\5\34\17\2\u0143"+
		"\u0144\7D\2\2\u0144\u014c\5\34\17\2\u0145\u0146\7E\2\2\u0146\u0147\5\34"+
		"\17\2\u0147\u0148\7D\2\2\u0148\u0149\5\34\17\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0145\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u0151\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7F\2\2\u0150"+
		"\u0152\5\34\17\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3"+
		"\2\2\2\u0153\u0154\7\20\2\2\u0154\u0190\3\2\2\2\u0155\u0156\7G\2\2\u0156"+
		"\u0157\5\34\17\2\u0157\u0158\7D\2\2\u0158\u015b\5\34\17\2\u0159\u015a"+
		"\7F\2\2\u015a\u015c\5\34\17\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015d\u015e\7\20\2\2\u015e\u0190\3\2\2\2\u015f\u0161"+
		"\7H\2\2\u0160\u0162\7X\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7B"+
		"\2\2\u0166\u0167\5\34\17\2\u0167\u0168\7\20\2\2\u0168\u0190\3\2\2\2\u0169"+
		"\u016a\7I\2\2\u016a\u016b\7X\2\2\u016b\u016c\7D\2\2\u016c\u016d\5\34\17"+
		"\2\u016d\u016e\7\20\2\2\u016e\u0190\3\2\2\2\u016f\u0170\7@\2\2\u0170\u0171"+
		"\7X\2\2\u0171\u0172\5\26\f\2\u0172\u0173\7\20\2\2\u0173\u0190\3\2\2\2"+
		"\u0174\u0175\7J\2\2\u0175\u0190\7X\2\2\u0176\u0177\7K\2\2\u0177\u0178"+
		"\5\34\17\2\u0178\u0179\7\20\2\2\u0179\u0190\3\2\2\2\u017a\u017b\7J\2\2"+
		"\u017b\u017c\7X\2\2\u017c\u017d\7L\2\2\u017d\u017e\5\34\17\2\u017e\u017f"+
		"\7M\2\2\u017f\u0180\5\34\17\2\u0180\u0181\7\20\2\2\u0181\u0190\3\2\2\2"+
		"\u0182\u0183\7J\2\2\u0183\u0184\7X\2\2\u0184\u0185\7M\2\2\u0185\u0186"+
		"\5\34\17\2\u0186\u0187\7L\2\2\u0187\u0188\5\34\17\2\u0188\u0189\7\20\2"+
		"\2\u0189\u0190\3\2\2\2\u018a\u018b\7N\2\2\u018b\u0190\7X\2\2\u018c\u018d"+
		"\7O\2\2\u018d\u0190\7X\2\2\u018e\u0190\5\22\n\2\u018f\u00f8\3\2\2\2\u018f"+
		"\u00f9\3\2\2\2\u018f\u00fa\3\2\2\2\u018f\u00fb\3\2\2\2\u018f\u00fc\3\2"+
		"\2\2\u018f\u00fd\3\2\2\2\u018f\u00fe\3\2\2\2\u018f\u00ff\3\2\2\2\u018f"+
		"\u0100\3\2\2\2\u018f\u0101\3\2\2\2\u018f\u0102\3\2\2\2\u018f\u0106\3\2"+
		"\2\2\u018f\u010a\3\2\2\2\u018f\u0117\3\2\2\2\u018f\u011b\3\2\2\2\u018f"+
		"\u0122\3\2\2\2\u018f\u012a\3\2\2\2\u018f\u0137\3\2\2\2\u018f\u0141\3\2"+
		"\2\2\u018f\u0155\3\2\2\2\u018f\u015f\3\2\2\2\u018f\u0169\3\2\2\2\u018f"+
		"\u016f\3\2\2\2\u018f\u0174\3\2\2\2\u018f\u0176\3\2\2\2\u018f\u017a\3\2"+
		"\2\2\u018f\u0182\3\2\2\2\u018f\u018a\3\2\2\2\u018f\u018c\3\2\2\2\u018f"+
		"\u018e\3\2\2\2\u0190\31\3\2\2\2\u0191\u0193\t\4\2\2\u0192\u0191\3\2\2"+
		"\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7S\2\2\u0195\u0199"+
		"\7X\2\2\u0196\u0198\5\b\5\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01a2\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019c\u019e\7\n\2\2\u019d\u019f\5\b\5\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2"+
		"\2\2\u01a2\u019c\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a5\7T\2\2\u01a5\u01a7\5\b\5\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7B\2\2\u01a9\u01aa\5\34\17\2\u01aa"+
		"\u01ab\7\20\2\2\u01ab\33\3\2\2\2\u01ac\u01ae\5\30\r\2\u01ad\u01ac\3\2"+
		"\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\35\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7U\2\2\u01b3\u01b4\7^\2\2"+
		"\u01b4\37\3\2\2\2\u01b5\u01b6\7V\2\2\u01b6\u01b8\7^\2\2\u01b7\u01b5\3"+
		"\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bc\3\2\2\2\u01b9\u01bb\5\36\20\2\u01ba"+
		"\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01c2\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c1\5\32\16\2\u01c0"+
		"\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7\2\2\3\u01c6"+
		"!\3\2\2\2,\'-\64:@CHScjlty\u0080\u008c\u00ab\u00c9\u00cf\u00d4\u00e2\u00ea"+
		"\u00f6\u0110\u0114\u011d\u0125\u0132\u013b\u014c\u0151\u015b\u0163\u018f"+
		"\u0192\u0199\u01a0\u01a2\u01a6\u01af\u01b7\u01bc\u01c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}