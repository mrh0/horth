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
		T__52=53, T__53=54, IDENTIFIER=55, ATOM=56, INT=57, STRING=58, BOOL=59, 
		WHITESPACE=60, COMMENT=61, BLOCKCOMMENT=62, TYPE=63;
	public static final int
		RULE_unop = 0, RULE_binop = 1, RULE_keywords = 2, RULE_intrfunc = 3, RULE_infix = 4, 
		RULE_general = 5, RULE_block = 6, RULE_include = 7, RULE_program = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"unop", "binop", "keywords", "intrfunc", "infix", "general", "block", 
			"include", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'not'", "'~'", "'-'", "'+'", "'*'", "'/'", "'%'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'&'", "'|'", "'and'", "'or'", "'<<'", 
			"'>>'", "'is'", "'cast'", "'='", "'dup'", "'dup2'", "'swap'", "'swap2'", 
			"'rot'", "'drop'", "'drop2'", "'drop3'", "'out'", "'err'", "'sizeof('", 
			"')'", "'cast('", "'st'", "'nd'", "'('", "'assert'", "'end'", "'inline'", 
			"'extern'", "'func'", "'infer'", "'in'", "'->'", "'if'", "'do'", "'elif'", 
			"'else'", "'while'", "'let'", "'pop'", "'include'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "IDENTIFIER", "ATOM", "INT", 
			"STRING", "BOOL", "WHITESPACE", "COMMENT", "BLOCKCOMMENT", "TYPE"
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
		enterRule(_localctx, 0, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
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
		enterRule(_localctx, 2, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
		enterRule(_localctx, 4, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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

	public static class IntrfuncContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HorthParser.TYPE, 0); }
		public IntrfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intrfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterIntrfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitIntrfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitIntrfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntrfuncContext intrfunc() throws RecognitionException {
		IntrfuncContext _localctx = new IntrfuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intrfunc);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(T__32);
				setState(25);
				match(TYPE);
				setState(26);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(T__34);
				setState(28);
				match(TYPE);
				setState(29);
				match(T__33);
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
		public TerminalNode IDENTIFIER() { return getToken(HorthParser.IDENTIFIER, 0); }
		public TerminalNode ATOM() { return getToken(HorthParser.ATOM, 0); }
		public TerminalNode INT() { return getToken(HorthParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(HorthParser.BOOL, 0); }
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public IntrfuncContext intrfunc() {
			return getRuleContext(IntrfuncContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public InfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitInfix(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_infix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				{
				setState(33);
				match(T__35);
				}
				break;
			case T__36:
				{
				setState(34);
				match(T__36);
				}
				break;
			case IDENTIFIER:
				{
				setState(35);
				match(IDENTIFIER);
				}
				break;
			case ATOM:
				{
				setState(36);
				match(ATOM);
				}
				break;
			case INT:
				{
				setState(37);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(38);
				match(BOOL);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
				{
				setState(39);
				unop();
				setState(40);
				infix(3);
				}
				break;
			case T__32:
			case T__34:
				{
				setState(42);
				intrfunc();
				}
				break;
			case T__37:
				{
				setState(43);
				match(T__37);
				setState(44);
				infix(0);
				setState(45);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infix);
					setState(49);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(50);
					binop();
					setState(51);
					infix(5);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class GeneralContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(HorthParser.ATOM, 0); }
		public TerminalNode INT() { return getToken(HorthParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HorthParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(HorthParser.STRING, 0); }
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> TYPE() { return getTokens(HorthParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(HorthParser.TYPE, i);
		}
		public IntrfuncContext intrfunc() {
			return getRuleContext(IntrfuncContext.class,0);
		}
		public GeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).enterGeneral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HorthListener ) ((HorthListener)listener).exitGeneral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HorthVisitor ) return ((HorthVisitor<? extends T>)visitor).visitGeneral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralContext general() throws RecognitionException {
		GeneralContext _localctx = new GeneralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_general);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ATOM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				unop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				binop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				keywords();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				match(T__37);
				setState(66);
				infix(0);
				setState(67);
				match(T__33);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				match(T__38);
				setState(70);
				block();
				setState(71);
				match(T__39);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40 || _la==T__41) {
					{
					setState(73);
					_la = _input.LA(1);
					if ( !(_la==T__40 || _la==T__41) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(76);
				match(T__42);
				setState(77);
				match(IDENTIFIER);
				setState(78);
				match(T__43);
				setState(79);
				match(T__44);
				setState(80);
				block();
				setState(81);
				match(T__39);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40 || _la==T__41) {
					{
					setState(83);
					_la = _input.LA(1);
					if ( !(_la==T__40 || _la==T__41) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(86);
				match(T__42);
				setState(87);
				match(IDENTIFIER);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(88);
					match(TYPE);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(94);
					match(T__45);
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(95);
						match(TYPE);
						}
						}
						setState(98); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TYPE );
					}
				}

				setState(102);
				match(T__44);
				setState(103);
				block();
				setState(104);
				match(T__39);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40 || _la==T__41) {
					{
					setState(106);
					_la = _input.LA(1);
					if ( !(_la==T__40 || _la==T__41) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(109);
				match(T__42);
				setState(110);
				match(IDENTIFIER);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(111);
					match(TYPE);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(117);
					match(T__45);
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(118);
						match(TYPE);
						}
						}
						setState(121); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TYPE );
					}
				}

				setState(125);
				match(T__39);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(126);
				match(T__46);
				setState(127);
				block();
				setState(128);
				match(T__47);
				setState(129);
				block();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__48) {
					{
					{
					setState(130);
					match(T__48);
					setState(131);
					block();
					setState(132);
					match(T__47);
					setState(133);
					block();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__49) {
					{
					setState(140);
					match(T__49);
					setState(141);
					block();
					}
				}

				setState(144);
				match(T__39);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(146);
				match(T__50);
				setState(147);
				block();
				setState(148);
				match(T__47);
				setState(149);
				block();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__49) {
					{
					setState(150);
					match(T__49);
					setState(151);
					block();
					}
				}

				setState(154);
				match(T__39);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(156);
				match(T__51);
				setState(157);
				match(IDENTIFIER);
				setState(158);
				_la = _input.LA(1);
				if ( !(_la==T__43 || _la==TYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(159);
					match(T__52);
					}
				}

				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(162);
				intrfunc();
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
		public List<GeneralContext> ops = new ArrayList<GeneralContext>();
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
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__46) | (1L << T__50) | (1L << T__51) | (1L << IDENTIFIER) | (1L << ATOM) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(165);
				((BlockContext)_localctx).general = general();
				((BlockContext)_localctx).ops.add(((BlockContext)_localctx).general);
				}
				}
				setState(170);
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
		enterRule(_localctx, 14, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__53);
			setState(172);
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
		enterRule(_localctx, 16, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__53) {
				{
				{
				setState(174);
				((ProgramContext)_localctx).include = include();
				((ProgramContext)_localctx).includes.add(((ProgramContext)_localctx).include);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			((ProgramContext)_localctx).main = block();
			setState(181);
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
		case 4:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5!\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\6\3\6\3\6\3\6\7"+
		"\68\n\6\f\6\16\6;\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7W\n\7\3\7"+
		"\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7\6\7c\n\7\r\7\16\7d\5\7g\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7\3\7\7\7s\n\7\f\7\16\7v\13\7\3\7"+
		"\3\7\6\7z\n\7\r\7\16\7{\5\7~\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\7\3\7\5\7\u0091\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u009b\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a3\n"+
		"\7\3\7\5\7\u00a6\n\7\3\b\7\b\u00a9\n\b\f\b\16\b\u00ac\13\b\3\t\3\t\3\t"+
		"\3\n\7\n\u00b2\n\n\f\n\16\n\u00b5\13\n\3\n\3\n\3\n\3\n\2\3\n\13\2\4\6"+
		"\b\n\f\16\20\22\2\7\3\2\3\5\3\2\5\30\3\2\31\"\3\2+,\4\2..AA\2\u00d8\2"+
		"\24\3\2\2\2\4\26\3\2\2\2\6\30\3\2\2\2\b \3\2\2\2\n\61\3\2\2\2\f\u00a5"+
		"\3\2\2\2\16\u00aa\3\2\2\2\20\u00ad\3\2\2\2\22\u00b3\3\2\2\2\24\25\t\2"+
		"\2\2\25\3\3\2\2\2\26\27\t\3\2\2\27\5\3\2\2\2\30\31\t\4\2\2\31\7\3\2\2"+
		"\2\32\33\7#\2\2\33\34\7A\2\2\34!\7$\2\2\35\36\7%\2\2\36\37\7A\2\2\37!"+
		"\7$\2\2 \32\3\2\2\2 \35\3\2\2\2!\t\3\2\2\2\"#\b\6\1\2#\62\7&\2\2$\62\7"+
		"\'\2\2%\62\79\2\2&\62\7:\2\2\'\62\7;\2\2(\62\7=\2\2)*\5\2\2\2*+\5\n\6"+
		"\5+\62\3\2\2\2,\62\5\b\5\2-.\7(\2\2./\5\n\6\2/\60\7$\2\2\60\62\3\2\2\2"+
		"\61\"\3\2\2\2\61$\3\2\2\2\61%\3\2\2\2\61&\3\2\2\2\61\'\3\2\2\2\61(\3\2"+
		"\2\2\61)\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\629\3\2\2\2\63\64\f\6\2\2\64"+
		"\65\5\4\3\2\65\66\5\n\6\7\668\3\2\2\2\67\63\3\2\2\28;\3\2\2\29\67\3\2"+
		"\2\29:\3\2\2\2:\13\3\2\2\2;9\3\2\2\2<\u00a6\7:\2\2=\u00a6\7;\2\2>\u00a6"+
		"\79\2\2?\u00a6\7<\2\2@\u00a6\5\2\2\2A\u00a6\5\4\3\2B\u00a6\5\6\4\2CD\7"+
		"(\2\2DE\5\n\6\2EF\7$\2\2F\u00a6\3\2\2\2GH\7)\2\2HI\5\16\b\2IJ\7*\2\2J"+
		"\u00a6\3\2\2\2KM\t\5\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7-\2\2OP\79\2"+
		"\2PQ\7.\2\2QR\7/\2\2RS\5\16\b\2ST\7*\2\2T\u00a6\3\2\2\2UW\t\5\2\2VU\3"+
		"\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7-\2\2Y]\79\2\2Z\\\7A\2\2[Z\3\2\2\2\\_\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^f\3\2\2\2_]\3\2\2\2`b\7\60\2\2ac\7A\2\2ba\3"+
		"\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2f`\3\2\2\2fg\3\2\2\2gh\3"+
		"\2\2\2hi\7/\2\2ij\5\16\b\2jk\7*\2\2k\u00a6\3\2\2\2ln\t\5\2\2ml\3\2\2\2"+
		"mn\3\2\2\2no\3\2\2\2op\7-\2\2pt\79\2\2qs\7A\2\2rq\3\2\2\2sv\3\2\2\2tr"+
		"\3\2\2\2tu\3\2\2\2u}\3\2\2\2vt\3\2\2\2wy\7\60\2\2xz\7A\2\2yx\3\2\2\2z"+
		"{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}w\3\2\2\2}~\3\2\2\2~\177\3\2\2"+
		"\2\177\u00a6\7*\2\2\u0080\u0081\7\61\2\2\u0081\u0082\5\16\b\2\u0082\u0083"+
		"\7\62\2\2\u0083\u008b\5\16\b\2\u0084\u0085\7\63\2\2\u0085\u0086\5\16\b"+
		"\2\u0086\u0087\7\62\2\2\u0087\u0088\5\16\b\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0084\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u0090\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\64\2\2\u008f"+
		"\u0091\5\16\b\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0093\7*\2\2\u0093\u00a6\3\2\2\2\u0094\u0095\7\65\2\2\u0095"+
		"\u0096\5\16\b\2\u0096\u0097\7\62\2\2\u0097\u009a\5\16\b\2\u0098\u0099"+
		"\7\64\2\2\u0099\u009b\5\16\b\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009d\7*\2\2\u009d\u00a6\3\2\2\2\u009e\u009f"+
		"\7\66\2\2\u009f\u00a0\79\2\2\u00a0\u00a2\t\6\2\2\u00a1\u00a3\7\67\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6"+
		"\5\b\5\2\u00a5<\3\2\2\2\u00a5=\3\2\2\2\u00a5>\3\2\2\2\u00a5?\3\2\2\2\u00a5"+
		"@\3\2\2\2\u00a5A\3\2\2\2\u00a5B\3\2\2\2\u00a5C\3\2\2\2\u00a5G\3\2\2\2"+
		"\u00a5L\3\2\2\2\u00a5V\3\2\2\2\u00a5m\3\2\2\2\u00a5\u0080\3\2\2\2\u00a5"+
		"\u0094\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\r\3\2\2\2"+
		"\u00a7\u00a9\5\f\7\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\17\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\78\2\2\u00ae\u00af\7<\2\2\u00af\21\3\2\2\2\u00b0\u00b2\5\20\t\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\5\16\b\2"+
		"\u00b7\u00b8\7\2\2\3\u00b8\23\3\2\2\2\25 \619LV]dfmt{}\u008b\u0090\u009a"+
		"\u00a2\u00a5\u00aa\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}