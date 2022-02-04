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
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, BOOL=92, NAME=93, ADDR_IDENTIFIER=94, 
		KEYED_IDENTIFIER=95, KEYED_IDENTIFIER_DEF=96, ATOM=97, INT=98, HEX=99, 
		BIN=100, CHAR=101, STRING=102, STRING_NT=103, WHITESPACE=104, COMMENT=105, 
		BLOCKCOMMENT=106;
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
			null, "'int'", "'string'", "'char'", "'atom'", "'bool'", "'ref'", "'u64'", 
			"'u32'", "'u16'", "'u8'", "'byte'", "'ref<'", "'>'", "'arr<'", "'func<'", 
			"'->'", "'*'", "'atom<'", "'|'", "'not'", "'~'", "'+'", "'-'", "'/'", 
			"'%'", "'<'", "'<='", "'>='", "'=='", "'!='", "'&'", "'and'", "'or'", 
			"'<<'", "'>>'", "'='", "'dup'", "'dup2'", "'swap'", "'swap2'", "'drop'", 
			"'drop2'", "'drop3'", "'out'", "'log'", "'error'", "'log^'", "'exit'", 
			"'halt'", "'break'", "'length'", "'sizeof'", "'('", "')'", "'cast'", 
			"'as'", "'unsafe'", "'is'", "','", "'['", "']'", "']^'", "'{'", "'}'", 
			"'assert'", "'end'", "'static'", "'inline'", "'extern'", "'func'", "'infer'", 
			"'in'", "'throws'", "'let'", "'alloc'", "'if'", "'do'", "'elif'", "'else'", 
			"'while'", "'with'", "'const'", "'try'", "'throw'", "'catch'", "'passed'", 
			"'failed'", "'syscall'", "'export'", "'include'", "'module'"
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
			null, null, null, null, null, null, null, null, "BOOL", "NAME", "ADDR_IDENTIFIER", 
			"KEYED_IDENTIFIER", "KEYED_IDENTIFIER_DEF", "ATOM", "INT", "HEX", "BIN", 
			"CHAR", "STRING", "STRING_NT", "WHITESPACE", "COMMENT", "BLOCKCOMMENT"
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
		public TerminalNode ADDR_IDENTIFIER() { return getToken(HorthParser.ADDR_IDENTIFIER, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==ADDR_IDENTIFIER) ) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				{
				_localctx = new DataTypeSimpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(38);
				simpleDataType();
				}
				break;
			case T__11:
				{
				_localctx = new DataTypeRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(T__11);
				setState(40);
				dataType(0);
				setState(41);
				match(T__12);
				}
				break;
			case T__13:
				{
				_localctx = new DataTypeArrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(T__13);
				setState(44);
				dataType(0);
				setState(45);
				match(T__12);
				}
				break;
			case T__14:
				{
				_localctx = new DataTypeFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(T__14);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__17))) != 0)) {
					{
					{
					setState(48);
					dataType(0);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(54);
					match(T__15);
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(55);
						dataType(0);
						}
						}
						setState(58); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__17))) != 0) );
					}
				}

				setState(62);
				match(T__12);
				}
				break;
			case T__17:
				{
				_localctx = new DataTypeAtomsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(T__17);
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(64);
						match(ATOM);
						setState(65);
						match(T__18);
						}
						} 
					}
					setState(70);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(71);
				match(ATOM);
				setState(72);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DataTypeManyContext(new DataTypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_dataType);
					setState(75);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(76);
					match(T__16);
					setState(77);
					staticExpr();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
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
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__16) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
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
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__36);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__37);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(T__39);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				match(T__40);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(T__41);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				match(T__42);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				match(T__43);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				match(T__44);
				setState(96);
				match(T__45);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(97);
				match(T__46);
				setState(98);
				match(T__45);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(99);
				match(T__44);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(100);
				match(T__46);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(101);
				match(T__47);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(102);
				match(T__48);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(103);
				match(T__49);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(104);
				match(T__50);
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
		enterRule(_localctx, 14, RULE_typefunc);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new TypefuncSizeofContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__51);
				setState(108);
				match(T__52);
				setState(109);
				dataType(0);
				setState(110);
				match(T__53);
				}
				break;
			case 2:
				_localctx = new TypefuncSizeofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T__51);
				setState(113);
				dataType(0);
				}
				break;
			case 3:
				_localctx = new TypefuncCastContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__54);
				setState(115);
				match(T__52);
				setState(116);
				dataType(0);
				setState(117);
				match(T__53);
				}
				break;
			case 4:
				_localctx = new TypefuncCastContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(T__55);
				setState(120);
				dataType(0);
				}
				break;
			case 5:
				_localctx = new TypefuncCastUnsafeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(T__56);
				setState(122);
				match(T__54);
				setState(123);
				match(T__52);
				setState(124);
				dataType(0);
				setState(125);
				match(T__53);
				}
				break;
			case 6:
				_localctx = new TypefuncIsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				match(T__57);
				setState(128);
				match(T__52);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__17))) != 0)) {
					{
					{
					setState(129);
					((TypefuncIsContext)_localctx).dataType = dataType(0);
					((TypefuncIsContext)_localctx).types.add(((TypefuncIsContext)_localctx).dataType);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__53);
				}
				break;
			case 7:
				_localctx = new TypefuncIsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				match(T__57);
				setState(137);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_infix, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new InfixIdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(141);
				identifier();
				}
				break;
			case 2:
				{
				_localctx = new InfixTypefuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME || _la==ADDR_IDENTIFIER) {
					{
					setState(142);
					identifier();
					}
				}

				setState(145);
				typefunc();
				}
				break;
			case 3:
				{
				_localctx = new InfixAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(ATOM);
				}
				break;
			case 4:
				{
				_localctx = new InfixIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				integer();
				}
				break;
			case 5:
				{
				_localctx = new InfixBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(BOOL);
				}
				break;
			case 6:
				{
				_localctx = new InfixCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(CHAR);
				}
				break;
			case 7:
				{
				_localctx = new InfixUnOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				unop();
				setState(151);
				infix(2);
				}
				break;
			case 8:
				{
				_localctx = new InfixInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(T__52);
				setState(154);
				infix(0);
				setState(155);
				match(T__53);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixBinOpContext(new InfixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_infix);
					setState(159);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(160);
					binop();
					setState(161);
					infix(4);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case HEX:
			case BIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				integer();
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(ATOM);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(CHAR);
				}
				break;
			case NAME:
			case ADDR_IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				identifier();
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				unop();
				}
				break;
			case T__12:
			case T__16:
			case T__18:
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
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				binop();
				}
				break;
			case T__51:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
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
		public TerminalNode NAME() { return getToken(HorthParser.NAME, 0); }
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
		enterRule(_localctx, 20, RULE_general);
		int _la;
		try {
			int _alt;
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new GenAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(ATOM);
				}
				break;
			case 2:
				_localctx = new GenIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				integer();
				}
				break;
			case 3:
				_localctx = new GenIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				identifier();
				}
				break;
			case 4:
				_localctx = new GenStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new GenBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(BOOL);
				}
				break;
			case 6:
				_localctx = new GenCharContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				match(CHAR);
				}
				break;
			case 7:
				_localctx = new GenSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				match(T__58);
				}
				break;
			case 8:
				_localctx = new GenUnopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				unop();
				}
				break;
			case 9:
				_localctx = new GenBinOpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				binop();
				}
				break;
			case 10:
				_localctx = new GenKeywordContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(188);
				keywords();
				}
				break;
			case 11:
				_localctx = new GenAccessorContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(189);
				match(T__59);
				setState(190);
				((GenAccessorContext)_localctx).accBlock = block();
				setState(191);
				match(T__60);
				}
				break;
			case 12:
				_localctx = new GenAccessorStrictContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(193);
				match(T__59);
				setState(194);
				((GenAccessorStrictContext)_localctx).accBlock = block();
				setState(195);
				match(T__61);
				}
				break;
			case 13:
				_localctx = new GenArrayContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(197);
				match(T__62);
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						staticExpr();
						setState(199);
						match(T__58);
						}
						} 
					}
					setState(205);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__51) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (BOOL - 92)) | (1L << (NAME - 92)) | (1L << (ADDR_IDENTIFIER - 92)) | (1L << (ATOM - 92)) | (1L << (INT - 92)) | (1L << (HEX - 92)) | (1L << (BIN - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)))) != 0)) {
					{
					setState(206);
					staticExpr();
					}
				}

				setState(209);
				match(T__63);
				}
				break;
			case 14:
				_localctx = new GenInfixContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(210);
				match(T__52);
				setState(211);
				infix(0);
				setState(212);
				match(T__53);
				}
				break;
			case 15:
				_localctx = new GenAssertContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				match(T__64);
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(215);
					((GenAssertContext)_localctx).message = match(STRING);
					}
					break;
				}
				setState(218);
				block();
				setState(219);
				match(T__65);
				}
				break;
			case 16:
				_localctx = new GenStaticAssertContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(221);
				match(T__66);
				setState(222);
				match(T__64);
				setState(224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(223);
					((GenStaticAssertContext)_localctx).message = match(STRING);
					}
					break;
				}
				setState(226);
				staticExpr();
				setState(227);
				match(T__65);
				}
				break;
			case 17:
				_localctx = new GenFuncInferContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__67 || _la==T__68) {
					{
					setState(229);
					_la = _input.LA(1);
					if ( !(_la==T__67 || _la==T__68) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(232);
				match(T__69);
				setState(233);
				match(NAME);
				setState(234);
				match(T__70);
				setState(235);
				match(T__71);
				setState(236);
				block();
				setState(237);
				match(T__65);
				}
				break;
			case 18:
				_localctx = new GenFuncContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__67 || _la==T__68) {
					{
					setState(239);
					_la = _input.LA(1);
					if ( !(_la==T__67 || _la==T__68) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(242);
				match(T__69);
				setState(243);
				match(NAME);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__17))) != 0)) {
					{
					{
					setState(244);
					dataType(0);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(250);
					match(T__15);
					setState(252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(251);
						dataType(0);
						}
						}
						setState(254); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__17))) != 0) );
					}
				}

				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__72) {
					{
					setState(258);
					match(T__72);
					setState(259);
					dataType(0);
					}
				}

				setState(262);
				match(T__71);
				setState(263);
				block();
				setState(264);
				match(T__65);
				}
				break;
			case 19:
				_localctx = new GenFuncLetContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__67 || _la==T__68) {
					{
					setState(266);
					_la = _input.LA(1);
					if ( !(_la==T__67 || _la==T__68) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(269);
				match(T__69);
				setState(270);
				match(NAME);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__17))) != 0)) {
					{
					{
					setState(271);
					dataType(0);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(277);
					match(T__15);
					setState(279); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(278);
						dataType(0);
						}
						}
						setState(281); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__17))) != 0) );
					}
				}

				setState(285);
				match(T__73);
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(286);
					((GenFuncLetContext)_localctx).NAME = match(NAME);
					((GenFuncLetContext)_localctx).names.add(((GenFuncLetContext)_localctx).NAME);
					}
					}
					setState(289); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(291);
				match(T__71);
				setState(292);
				block();
				setState(293);
				match(T__65);
				}
				break;
			case 20:
				_localctx = new GenFuncSignatureContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__67 || _la==T__68) {
					{
					setState(295);
					_la = _input.LA(1);
					if ( !(_la==T__67 || _la==T__68) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(298);
				match(T__69);
				setState(299);
				match(NAME);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__17))) != 0)) {
					{
					{
					setState(300);
					dataType(0);
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(306);
					match(T__15);
					setState(308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(307);
						dataType(0);
						}
						}
						setState(310); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__17))) != 0) );
					}
				}

				setState(314);
				match(T__65);
				}
				break;
			case 21:
				_localctx = new GenAllocStaticContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(315);
				match(T__66);
				setState(316);
				match(T__74);
				setState(317);
				match(NAME);
				setState(318);
				dataType(0);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(319);
					match(T__16);
					setState(320);
					staticExpr();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
				match(T__65);
				}
				break;
			case 22:
				_localctx = new GenAllocContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(328);
				match(T__74);
				setState(329);
				match(NAME);
				setState(330);
				dataType(0);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(331);
					match(T__16);
					setState(332);
					block();
					}
				}

				setState(335);
				match(T__71);
				setState(336);
				block();
				setState(337);
				match(T__65);
				}
				break;
			case 23:
				_localctx = new GenIfContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(339);
				match(T__75);
				setState(340);
				((GenIfContext)_localctx).block = block();
				((GenIfContext)_localctx).conds.add(((GenIfContext)_localctx).block);
				setState(341);
				match(T__76);
				setState(342);
				((GenIfContext)_localctx).block = block();
				((GenIfContext)_localctx).doBlock.add(((GenIfContext)_localctx).block);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__77) {
					{
					{
					setState(343);
					match(T__77);
					setState(344);
					((GenIfContext)_localctx).block = block();
					((GenIfContext)_localctx).conds.add(((GenIfContext)_localctx).block);
					setState(345);
					match(T__76);
					setState(346);
					((GenIfContext)_localctx).block = block();
					((GenIfContext)_localctx).doBlock.add(((GenIfContext)_localctx).block);
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(353);
					match(T__78);
					setState(354);
					((GenIfContext)_localctx).elseBlock = block();
					}
				}

				setState(357);
				match(T__65);
				}
				break;
			case 24:
				_localctx = new GenWhileContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(359);
				match(T__79);
				setState(360);
				((GenWhileContext)_localctx).cond = block();
				setState(361);
				match(T__76);
				setState(362);
				((GenWhileContext)_localctx).doBlock = block();
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(363);
					match(T__78);
					setState(364);
					((GenWhileContext)_localctx).elseBlock = block();
					}
				}

				setState(367);
				match(T__65);
				}
				break;
			case 25:
				_localctx = new GenLetContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(369);
				match(T__73);
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(370);
					((GenLetContext)_localctx).NAME = match(NAME);
					((GenLetContext)_localctx).names.add(((GenLetContext)_localctx).NAME);
					}
					}
					setState(373); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(375);
				match(T__71);
				setState(376);
				((GenLetContext)_localctx).localBlock = block();
				setState(377);
				match(T__65);
				}
				break;
			case 26:
				_localctx = new GenWithContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(379);
				match(T__80);
				setState(380);
				match(NAME);
				setState(381);
				match(T__76);
				setState(382);
				block();
				setState(383);
				match(T__65);
				}
				break;
			case 27:
				_localctx = new GenConstContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(385);
				match(T__81);
				setState(386);
				match(NAME);
				setState(387);
				staticExpr();
				setState(388);
				match(T__65);
				}
				break;
			case 28:
				_localctx = new GenTryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(390);
				match(T__82);
				setState(391);
				match(NAME);
				}
				break;
			case 29:
				_localctx = new GenThrowContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(392);
				match(T__83);
				setState(393);
				block();
				setState(394);
				match(T__65);
				}
				break;
			case 30:
				_localctx = new GenCatchContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(396);
				match(T__84);
				setState(397);
				match(NAME);
				setState(398);
				match(T__85);
				setState(399);
				((GenCatchContext)_localctx).passBlock = block();
				setState(400);
				match(T__86);
				setState(401);
				((GenCatchContext)_localctx).failBlock = block();
				setState(402);
				match(T__65);
				}
				break;
			case 31:
				_localctx = new GenCatchContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(404);
				match(T__84);
				setState(405);
				match(NAME);
				setState(406);
				match(T__86);
				setState(407);
				((GenCatchContext)_localctx).failBlock = block();
				setState(408);
				match(T__85);
				setState(409);
				((GenCatchContext)_localctx).passBlock = block();
				setState(410);
				match(T__65);
				}
				break;
			case 32:
				_localctx = new GenSyscallContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(412);
				match(T__87);
				setState(413);
				((GenSyscallContext)_localctx).sysCallName = match(NAME);
				}
				break;
			case 33:
				_localctx = new GenExportContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(414);
				match(T__88);
				setState(415);
				match(NAME);
				}
				break;
			case 34:
				_localctx = new GenIntrfuncContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(416);
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
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__73 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__79 - 65)) | (1L << (T__80 - 65)) | (1L << (T__81 - 65)) | (1L << (T__82 - 65)) | (1L << (T__83 - 65)) | (1L << (T__84 - 65)) | (1L << (T__87 - 65)) | (1L << (T__88 - 65)) | (1L << (BOOL - 65)) | (1L << (NAME - 65)) | (1L << (ADDR_IDENTIFIER - 65)) | (1L << (ATOM - 65)) | (1L << (INT - 65)) | (1L << (HEX - 65)) | (1L << (BIN - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
				{
				{
				setState(419);
				((BlockContext)_localctx).general = general();
				((BlockContext)_localctx).contents.add(((BlockContext)_localctx).general);
				}
				}
				setState(424);
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
			setState(425);
			match(T__89);
			setState(426);
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
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__90) {
				{
				setState(428);
				match(T__90);
				setState(429);
				match(STRING);
				}
			}

			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__89) {
				{
				{
				setState(432);
				((ProgramContext)_localctx).include = include();
				((ProgramContext)_localctx).includes.add(((ProgramContext)_localctx).include);
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			((ProgramContext)_localctx).main = block();
			setState(439);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3l\u01bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\5\3$\n\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\64\n\5\f\5"+
		"\16\5\67\13\5\3\5\3\5\6\5;\n\5\r\5\16\5<\5\5?\n\5\3\5\3\5\3\5\3\5\7\5"+
		"E\n\5\f\5\16\5H\13\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0085\n\t\f\t"+
		"\16\t\u0088\13\t\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\5\n\u0092\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00b4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cc\n\f\f\f\16"+
		"\f\u00cf\13\f\3\f\5\f\u00d2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00db"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e3\n\f\3\f\3\f\3\f\3\f\5\f\u00e9\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f3\n\f\3\f\3\f\3\f\7\f\u00f8"+
		"\n\f\f\f\16\f\u00fb\13\f\3\f\3\f\6\f\u00ff\n\f\r\f\16\f\u0100\5\f\u0103"+
		"\n\f\3\f\3\f\5\f\u0107\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u010e\n\f\3\f\3\f\3"+
		"\f\7\f\u0113\n\f\f\f\16\f\u0116\13\f\3\f\3\f\6\f\u011a\n\f\r\f\16\f\u011b"+
		"\5\f\u011e\n\f\3\f\3\f\6\f\u0122\n\f\r\f\16\f\u0123\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u012b\n\f\3\f\3\f\3\f\7\f\u0130\n\f\f\f\16\f\u0133\13\f\3\f\3\f"+
		"\6\f\u0137\n\f\r\f\16\f\u0138\5\f\u013b\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u0144\n\f\f\f\16\f\u0147\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0150"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u015f\n\f"+
		"\f\f\16\f\u0162\13\f\3\f\3\f\5\f\u0166\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0170\n\f\3\f\3\f\3\f\3\f\6\f\u0176\n\f\r\f\16\f\u0177\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u01a4\n\f\3\r\7\r\u01a7\n\r\f\r\16\r\u01aa"+
		"\13\r\3\16\3\16\3\16\3\17\3\17\5\17\u01b1\n\17\3\17\7\17\u01b4\n\17\f"+
		"\17\16\17\u01b7\13\17\3\17\3\17\3\17\3\17\2\4\b\22\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\7\3\2_`\3\2\3\r\3\2\26\27\6\2\17\17\23\23\25\25\30"+
		"&\3\2FG\2\u021c\2\36\3\2\2\2\4#\3\2\2\2\6%\3\2\2\2\bK\3\2\2\2\nU\3\2\2"+
		"\2\fW\3\2\2\2\16k\3\2\2\2\20\u008c\3\2\2\2\22\u009f\3\2\2\2\24\u00b3\3"+
		"\2\2\2\26\u01a3\3\2\2\2\30\u01a8\3\2\2\2\32\u01ab\3\2\2\2\34\u01b0\3\2"+
		"\2\2\36\37\t\2\2\2\37\3\3\2\2\2 $\7d\2\2!$\7e\2\2\"$\7f\2\2# \3\2\2\2"+
		"#!\3\2\2\2#\"\3\2\2\2$\5\3\2\2\2%&\t\3\2\2&\7\3\2\2\2\'(\b\5\1\2(L\5\6"+
		"\4\2)*\7\16\2\2*+\5\b\5\2+,\7\17\2\2,L\3\2\2\2-.\7\20\2\2./\5\b\5\2/\60"+
		"\7\17\2\2\60L\3\2\2\2\61\65\7\21\2\2\62\64\5\b\5\2\63\62\3\2\2\2\64\67"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66>\3\2\2\2\67\65\3\2\2\28:\7\22"+
		"\2\29;\5\b\5\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2>8\3\2"+
		"\2\2>?\3\2\2\2?@\3\2\2\2@L\7\17\2\2AF\7\24\2\2BC\7c\2\2CE\7\25\2\2DB\3"+
		"\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7c\2\2JL\7"+
		"\17\2\2K\'\3\2\2\2K)\3\2\2\2K-\3\2\2\2K\61\3\2\2\2KA\3\2\2\2LR\3\2\2\2"+
		"MN\f\4\2\2NO\7\23\2\2OQ\5\24\13\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2S\t\3\2\2\2TR\3\2\2\2UV\t\4\2\2V\13\3\2\2\2WX\t\5\2\2X\r\3\2\2\2Y"+
		"l\7\'\2\2Zl\7(\2\2[l\7)\2\2\\l\7*\2\2]l\7+\2\2^l\7,\2\2_l\7-\2\2`l\7."+
		"\2\2ab\7/\2\2bl\7\60\2\2cd\7\61\2\2dl\7\60\2\2el\7/\2\2fl\7\61\2\2gl\7"+
		"\62\2\2hl\7\63\2\2il\7\64\2\2jl\7\65\2\2kY\3\2\2\2kZ\3\2\2\2k[\3\2\2\2"+
		"k\\\3\2\2\2k]\3\2\2\2k^\3\2\2\2k_\3\2\2\2k`\3\2\2\2ka\3\2\2\2kc\3\2\2"+
		"\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\17\3\2"+
		"\2\2mn\7\66\2\2no\7\67\2\2op\5\b\5\2pq\78\2\2q\u008d\3\2\2\2rs\7\66\2"+
		"\2s\u008d\5\b\5\2tu\79\2\2uv\7\67\2\2vw\5\b\5\2wx\78\2\2x\u008d\3\2\2"+
		"\2yz\7:\2\2z\u008d\5\b\5\2{|\7;\2\2|}\79\2\2}~\7\67\2\2~\177\5\b\5\2\177"+
		"\u0080\78\2\2\u0080\u008d\3\2\2\2\u0081\u0082\7<\2\2\u0082\u0086\7\67"+
		"\2\2\u0083\u0085\5\b\5\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008d\78\2\2\u008a\u008b\7<\2\2\u008b\u008d\5\b\5\2\u008cm"+
		"\3\2\2\2\u008cr\3\2\2\2\u008ct\3\2\2\2\u008cy\3\2\2\2\u008c{\3\2\2\2\u008c"+
		"\u0081\3\2\2\2\u008c\u008a\3\2\2\2\u008d\21\3\2\2\2\u008e\u008f\b\n\1"+
		"\2\u008f\u00a0\5\2\2\2\u0090\u0092\5\2\2\2\u0091\u0090\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00a0\5\20\t\2\u0094\u00a0\7c\2\2\u0095"+
		"\u00a0\5\4\3\2\u0096\u00a0\7^\2\2\u0097\u00a0\7g\2\2\u0098\u0099\5\n\6"+
		"\2\u0099\u009a\5\22\n\4\u009a\u00a0\3\2\2\2\u009b\u009c\7\67\2\2\u009c"+
		"\u009d\5\22\n\2\u009d\u009e\78\2\2\u009e\u00a0\3\2\2\2\u009f\u008e\3\2"+
		"\2\2\u009f\u0091\3\2\2\2\u009f\u0094\3\2\2\2\u009f\u0095\3\2\2\2\u009f"+
		"\u0096\3\2\2\2\u009f\u0097\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u009b\3\2"+
		"\2\2\u00a0\u00a7\3\2\2\2\u00a1\u00a2\f\5\2\2\u00a2\u00a3\5\f\7\2\u00a3"+
		"\u00a4\5\22\n\6\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00a9\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\23\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00b4\5\4\3\2\u00ab\u00b4\7c\2\2\u00ac\u00b4\7^\2"+
		"\2\u00ad\u00b4\7h\2\2\u00ae\u00b4\7g\2\2\u00af\u00b4\5\2\2\2\u00b0\u00b4"+
		"\5\n\6\2\u00b1\u00b4\5\f\7\2\u00b2\u00b4\5\20\t\2\u00b3\u00aa\3\2\2\2"+
		"\u00b3\u00ab\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00ae"+
		"\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\25\3\2\2\2\u00b5\u01a4\7c\2\2\u00b6\u01a4\5\4\3\2"+
		"\u00b7\u01a4\5\2\2\2\u00b8\u01a4\7h\2\2\u00b9\u01a4\7^\2\2\u00ba\u01a4"+
		"\7g\2\2\u00bb\u01a4\7=\2\2\u00bc\u01a4\5\n\6\2\u00bd\u01a4\5\f\7\2\u00be"+
		"\u01a4\5\16\b\2\u00bf\u00c0\7>\2\2\u00c0\u00c1\5\30\r\2\u00c1\u00c2\7"+
		"?\2\2\u00c2\u01a4\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c5\5\30\r\2\u00c5"+
		"\u00c6\7@\2\2\u00c6\u01a4\3\2\2\2\u00c7\u00cd\7A\2\2\u00c8\u00c9\5\24"+
		"\13\2\u00c9\u00ca\7=\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\5\24\13\2\u00d1\u00d0\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u01a4\7B\2\2\u00d4\u00d5\7\67"+
		"\2\2\u00d5\u00d6\5\22\n\2\u00d6\u00d7\78\2\2\u00d7\u01a4\3\2\2\2\u00d8"+
		"\u00da\7C\2\2\u00d9\u00db\7h\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2"+
		"\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5\30\r\2\u00dd\u00de\7D\2\2\u00de\u01a4"+
		"\3\2\2\2\u00df\u00e0\7E\2\2\u00e0\u00e2\7C\2\2\u00e1\u00e3\7h\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5\24"+
		"\13\2\u00e5\u00e6\7D\2\2\u00e6\u01a4\3\2\2\2\u00e7\u00e9\t\6\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7H"+
		"\2\2\u00eb\u00ec\7_\2\2\u00ec\u00ed\7I\2\2\u00ed\u00ee\7J\2\2\u00ee\u00ef"+
		"\5\30\r\2\u00ef\u00f0\7D\2\2\u00f0\u01a4\3\2\2\2\u00f1\u00f3\t\6\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7H"+
		"\2\2\u00f5\u00f9\7_\2\2\u00f6\u00f8\5\b\5\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0102\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\7\22\2\2\u00fd\u00ff\5\b\5\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0105\7K\2\2\u0105\u0107\5\b\5\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7J\2\2\u0109"+
		"\u010a\5\30\r\2\u010a\u010b\7D\2\2\u010b\u01a4\3\2\2\2\u010c\u010e\t\6"+
		"\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\7H\2\2\u0110\u0114\7_\2\2\u0111\u0113\5\b\5\2\u0112\u0111\3\2\2"+
		"\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011d"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\7\22\2\2\u0118\u011a\5\b\5\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\7L\2\2\u0120\u0122\7_\2\2\u0121\u0120\3\2\2"+
		"\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\7J\2\2\u0126\u0127\5\30\r\2\u0127\u0128\7D\2\2\u0128"+
		"\u01a4\3\2\2\2\u0129\u012b\t\6\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7H\2\2\u012d\u0131\7_\2\2\u012e\u0130"+
		"\5\b\5\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u013a\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\7\22"+
		"\2\2\u0135\u0137\5\b\5\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0134\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u01a4\7D\2\2\u013d"+
		"\u013e\7E\2\2\u013e\u013f\7M\2\2\u013f\u0140\7_\2\2\u0140\u0145\5\b\5"+
		"\2\u0141\u0142\7\23\2\2\u0142\u0144\5\24\13\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7D\2\2\u0149\u01a4\3\2\2\2\u014a"+
		"\u014b\7M\2\2\u014b\u014c\7_\2\2\u014c\u014f\5\b\5\2\u014d\u014e\7\23"+
		"\2\2\u014e\u0150\5\30\r\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\7J\2\2\u0152\u0153\5\30\r\2\u0153\u0154\7D"+
		"\2\2\u0154\u01a4\3\2\2\2\u0155\u0156\7N\2\2\u0156\u0157\5\30\r\2\u0157"+
		"\u0158\7O\2\2\u0158\u0160\5\30\r\2\u0159\u015a\7P\2\2\u015a\u015b\5\30"+
		"\r\2\u015b\u015c\7O\2\2\u015c\u015d\5\30\r\2\u015d\u015f\3\2\2\2\u015e"+
		"\u0159\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0165\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7Q\2\2\u0164"+
		"\u0166\5\30\r\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0167\u0168\7D\2\2\u0168\u01a4\3\2\2\2\u0169\u016a\7R\2\2\u016a"+
		"\u016b\5\30\r\2\u016b\u016c\7O\2\2\u016c\u016f\5\30\r\2\u016d\u016e\7"+
		"Q\2\2\u016e\u0170\5\30\r\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\7D\2\2\u0172\u01a4\3\2\2\2\u0173\u0175\7L\2"+
		"\2\u0174\u0176\7_\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7J\2\2\u017a"+
		"\u017b\5\30\r\2\u017b\u017c\7D\2\2\u017c\u01a4\3\2\2\2\u017d\u017e\7S"+
		"\2\2\u017e\u017f\7_\2\2\u017f\u0180\7O\2\2\u0180\u0181\5\30\r\2\u0181"+
		"\u0182\7D\2\2\u0182\u01a4\3\2\2\2\u0183\u0184\7T\2\2\u0184\u0185\7_\2"+
		"\2\u0185\u0186\5\24\13\2\u0186\u0187\7D\2\2\u0187\u01a4\3\2\2\2\u0188"+
		"\u0189\7U\2\2\u0189\u01a4\7_\2\2\u018a\u018b\7V\2\2\u018b\u018c\5\30\r"+
		"\2\u018c\u018d\7D\2\2\u018d\u01a4\3\2\2\2\u018e\u018f\7W\2\2\u018f\u0190"+
		"\7_\2\2\u0190\u0191\7X\2\2\u0191\u0192\5\30\r\2\u0192\u0193\7Y\2\2\u0193"+
		"\u0194\5\30\r\2\u0194\u0195\7D\2\2\u0195\u01a4\3\2\2\2\u0196\u0197\7W"+
		"\2\2\u0197\u0198\7_\2\2\u0198\u0199\7Y\2\2\u0199\u019a\5\30\r\2\u019a"+
		"\u019b\7X\2\2\u019b\u019c\5\30\r\2\u019c\u019d\7D\2\2\u019d\u01a4\3\2"+
		"\2\2\u019e\u019f\7Z\2\2\u019f\u01a4\7_\2\2\u01a0\u01a1\7[\2\2\u01a1\u01a4"+
		"\7_\2\2\u01a2\u01a4\5\20\t\2\u01a3\u00b5\3\2\2\2\u01a3\u00b6\3\2\2\2\u01a3"+
		"\u00b7\3\2\2\2\u01a3\u00b8\3\2\2\2\u01a3\u00b9\3\2\2\2\u01a3\u00ba\3\2"+
		"\2\2\u01a3\u00bb\3\2\2\2\u01a3\u00bc\3\2\2\2\u01a3\u00bd\3\2\2\2\u01a3"+
		"\u00be\3\2\2\2\u01a3\u00bf\3\2\2\2\u01a3\u00c3\3\2\2\2\u01a3\u00c7\3\2"+
		"\2\2\u01a3\u00d4\3\2\2\2\u01a3\u00d8\3\2\2\2\u01a3\u00df\3\2\2\2\u01a3"+
		"\u00e8\3\2\2\2\u01a3\u00f2\3\2\2\2\u01a3\u010d\3\2\2\2\u01a3\u012a\3\2"+
		"\2\2\u01a3\u013d\3\2\2\2\u01a3\u014a\3\2\2\2\u01a3\u0155\3\2\2\2\u01a3"+
		"\u0169\3\2\2\2\u01a3\u0173\3\2\2\2\u01a3\u017d\3\2\2\2\u01a3\u0183\3\2"+
		"\2\2\u01a3\u0188\3\2\2\2\u01a3\u018a\3\2\2\2\u01a3\u018e\3\2\2\2\u01a3"+
		"\u0196\3\2\2\2\u01a3\u019e\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a2\3\2"+
		"\2\2\u01a4\27\3\2\2\2\u01a5\u01a7\5\26\f\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\31\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ac\7\\\2\2\u01ac\u01ad\7h\2\2\u01ad\33\3\2\2\2"+
		"\u01ae\u01af\7]\2\2\u01af\u01b1\7h\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b5\3\2\2\2\u01b2\u01b4\5\32\16\2\u01b3\u01b2\3\2\2\2"+
		"\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\5\30\r\2\u01b9\u01ba\7\2\2\3"+
		"\u01ba\35\3\2\2\2-#\65<>FKRk\u0086\u008c\u0091\u009f\u00a7\u00b3\u00cd"+
		"\u00d1\u00da\u00e2\u00e8\u00f2\u00f9\u0100\u0102\u0106\u010d\u0114\u011b"+
		"\u011d\u0123\u012a\u0131\u0138\u013a\u0145\u014f\u0160\u0165\u016f\u0177"+
		"\u01a3\u01a8\u01b0\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}