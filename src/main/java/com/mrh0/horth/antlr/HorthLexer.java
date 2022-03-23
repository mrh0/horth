// Generated from W:/Development/horth/src/main/antlr4\Horth.g4 by ANTLR 4.9.2
package com.mrh0.horth.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HorthLexer extends Lexer {
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
		T__87=88, T__88=89, BOOL=90, NAME=91, ATOM=92, INT=93, HEX=94, BIN=95, 
		CHAR=96, STRING=97, STRING_NT=98, MODULE_NAME=99, WHITESPACE=100, COMMENT=101, 
		BLOCKCOMMENT=102;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
			"T__73", "T__74", "T__75", "T__76", "T__77", "T__78", "T__79", "T__80", 
			"T__81", "T__82", "T__83", "T__84", "T__85", "T__86", "T__87", "T__88", 
			"BOOL", "NAME", "ATOM", "INT", "HEX", "BIN", "CHAR", "STRING", "STRING_NT", 
			"MODULE_NAME", "WHITESPACE", "COMMENT", "BLOCKCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'<'", "'>'", "'func'", "'->'", "'type'", "'as'", "','", 
			"'end'", "'not'", "'!'", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'divmod'", 
			"'<='", "'>='", "'=='", "'!='", "'&'", "'|'", "'and'", "'or'", "'<<'", 
			"'>>'", "'='", "'dup'", "'dup2'", "'swap'", "'swap2'", "'drop'", "'drop2'", 
			"'drop3'", "'next'", "'out'", "'log'", "'error'", "'read'", "'write'", 
			"'copy'", "'clone'", "'ret'", "'break'", "'here'", "'box'", "'void'", 
			"'sizeof'", "'('", "')'", "'unsafe'", "'is'", "'new'", "'.'", "'['", 
			"']'", "']^'", "'{'", "'}'", "'assert'", "'static'", "'const'", "'alloc'", 
			"'in'", "'if'", "'do'", "'elif'", "'else'", "'switch'", "'case'", "'default'", 
			"'while'", "'let'", "'with'", "'try'", "'throw'", "'pass'", "'catch'", 
			"'syscall'", "'export'", "'inline'", "'extern'", "'start'", "'rec'", 
			"'throws'", "'include'", "'module'"
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
			null, null, null, null, null, null, "BOOL", "NAME", "ATOM", "INT", "HEX", 
			"BIN", "CHAR", "STRING", "STRING_NT", "MODULE_NAME", "WHITESPACE", "COMMENT", 
			"BLOCKCOMMENT"
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


	public HorthLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Horth.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2h\u02d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\3"+
		"9\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3"+
		"E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3"+
		"I\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3"+
		"M\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3U\3U\3"+
		"U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\5"+
		"[\u025b\n[\3\\\3\\\7\\\u025f\n\\\f\\\16\\\u0262\13\\\3]\3]\3]\7]\u0267"+
		"\n]\f]\16]\u026a\13]\3^\3^\5^\u026e\n^\3^\3^\7^\u0272\n^\f^\16^\u0275"+
		"\13^\5^\u0277\n^\3_\3_\3_\3_\7_\u027d\n_\f_\16_\u0280\13_\3`\3`\3`\3`"+
		"\7`\u0286\n`\f`\16`\u0289\13`\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0293\na\3b\3"+
		"b\7b\u0297\nb\fb\16b\u029a\13b\3b\3b\3c\3c\3c\3c\7c\u02a2\nc\fc\16c\u02a5"+
		"\13c\3c\3c\3c\3d\3d\7d\u02ac\nd\fd\16d\u02af\13d\3e\6e\u02b2\ne\re\16"+
		"e\u02b3\3e\3e\3f\3f\3f\3f\7f\u02bc\nf\ff\16f\u02bf\13f\3f\3f\3g\3g\3g"+
		"\3g\7g\u02c7\ng\fg\16g\u02ca\13g\3g\3g\3g\3g\3g\4\u0298\u02c8\2h\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7"+
		"]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cb"+
		"g\u00cdh\3\2\17\5\2C\\aac|\6\2\62;C\\aac|\5\2\62;C\\c|\3\2\63;\3\2\62"+
		";\5\2\62;CHch\3\2\62\63\t\2$$))\62\62^^ppttvv\4\2))^^\4\2C\\c|\7\2\60"+
		"\60\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u02df\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2"+
		"\2\3\u00cf\3\2\2\2\5\u00d1\3\2\2\2\7\u00d3\3\2\2\2\t\u00d5\3\2\2\2\13"+
		"\u00da\3\2\2\2\r\u00dd\3\2\2\2\17\u00e2\3\2\2\2\21\u00e5\3\2\2\2\23\u00e7"+
		"\3\2\2\2\25\u00eb\3\2\2\2\27\u00ef\3\2\2\2\31\u00f1\3\2\2\2\33\u00f3\3"+
		"\2\2\2\35\u00f5\3\2\2\2\37\u00f7\3\2\2\2!\u00f9\3\2\2\2#\u00fb\3\2\2\2"+
		"%\u00fd\3\2\2\2\'\u0104\3\2\2\2)\u0107\3\2\2\2+\u010a\3\2\2\2-\u010d\3"+
		"\2\2\2/\u0110\3\2\2\2\61\u0112\3\2\2\2\63\u0114\3\2\2\2\65\u0118\3\2\2"+
		"\2\67\u011b\3\2\2\29\u011e\3\2\2\2;\u0121\3\2\2\2=\u0123\3\2\2\2?\u0127"+
		"\3\2\2\2A\u012c\3\2\2\2C\u0131\3\2\2\2E\u0137\3\2\2\2G\u013c\3\2\2\2I"+
		"\u0142\3\2\2\2K\u0148\3\2\2\2M\u014d\3\2\2\2O\u0151\3\2\2\2Q\u0155\3\2"+
		"\2\2S\u015b\3\2\2\2U\u0160\3\2\2\2W\u0166\3\2\2\2Y\u016b\3\2\2\2[\u0171"+
		"\3\2\2\2]\u0175\3\2\2\2_\u017b\3\2\2\2a\u0180\3\2\2\2c\u0184\3\2\2\2e"+
		"\u0189\3\2\2\2g\u0190\3\2\2\2i\u0192\3\2\2\2k\u0194\3\2\2\2m\u019b\3\2"+
		"\2\2o\u019e\3\2\2\2q\u01a2\3\2\2\2s\u01a4\3\2\2\2u\u01a6\3\2\2\2w\u01a8"+
		"\3\2\2\2y\u01ab\3\2\2\2{\u01ad\3\2\2\2}\u01af\3\2\2\2\177\u01b6\3\2\2"+
		"\2\u0081\u01bd\3\2\2\2\u0083\u01c3\3\2\2\2\u0085\u01c9\3\2\2\2\u0087\u01cc"+
		"\3\2\2\2\u0089\u01cf\3\2\2\2\u008b\u01d2\3\2\2\2\u008d\u01d7\3\2\2\2\u008f"+
		"\u01dc\3\2\2\2\u0091\u01e3\3\2\2\2\u0093\u01e8\3\2\2\2\u0095\u01f0\3\2"+
		"\2\2\u0097\u01f6\3\2\2\2\u0099\u01fa\3\2\2\2\u009b\u01ff\3\2\2\2\u009d"+
		"\u0203\3\2\2\2\u009f\u0209\3\2\2\2\u00a1\u020e\3\2\2\2\u00a3\u0214\3\2"+
		"\2\2\u00a5\u021c\3\2\2\2\u00a7\u0223\3\2\2\2\u00a9\u022a\3\2\2\2\u00ab"+
		"\u0231\3\2\2\2\u00ad\u0237\3\2\2\2\u00af\u023b\3\2\2\2\u00b1\u0242\3\2"+
		"\2\2\u00b3\u024a\3\2\2\2\u00b5\u025a\3\2\2\2\u00b7\u025c\3\2\2\2\u00b9"+
		"\u0263\3\2\2\2\u00bb\u0276\3\2\2\2\u00bd\u0278\3\2\2\2\u00bf\u0281\3\2"+
		"\2\2\u00c1\u0292\3\2\2\2\u00c3\u0294\3\2\2\2\u00c5\u029d\3\2\2\2\u00c7"+
		"\u02a9\3\2\2\2\u00c9\u02b1\3\2\2\2\u00cb\u02b7\3\2\2\2\u00cd\u02c2\3\2"+
		"\2\2\u00cf\u00d0\7B\2\2\u00d0\4\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\6\3\2"+
		"\2\2\u00d3\u00d4\7@\2\2\u00d4\b\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7"+
		"\7w\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7e\2\2\u00d9\n\3\2\2\2\u00da\u00db"+
		"\7/\2\2\u00db\u00dc\7@\2\2\u00dc\f\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df"+
		"\7{\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7g\2\2\u00e1\16\3\2\2\2\u00e2\u00e3"+
		"\7c\2\2\u00e3\u00e4\7u\2\2\u00e4\20\3\2\2\2\u00e5\u00e6\7.\2\2\u00e6\22"+
		"\3\2\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7f\2\2\u00ea"+
		"\24\3\2\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7v\2\2\u00ee"+
		"\26\3\2\2\2\u00ef\u00f0\7#\2\2\u00f0\30\3\2\2\2\u00f1\u00f2\7\u0080\2"+
		"\2\u00f2\32\3\2\2\2\u00f3\u00f4\7-\2\2\u00f4\34\3\2\2\2\u00f5\u00f6\7"+
		"/\2\2\u00f6\36\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8 \3\2\2\2\u00f9\u00fa\7"+
		"\61\2\2\u00fa\"\3\2\2\2\u00fb\u00fc\7\'\2\2\u00fc$\3\2\2\2\u00fd\u00fe"+
		"\7f\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7x\2\2\u0100\u0101\7o\2\2\u0101"+
		"\u0102\7q\2\2\u0102\u0103\7f\2\2\u0103&\3\2\2\2\u0104\u0105\7>\2\2\u0105"+
		"\u0106\7?\2\2\u0106(\3\2\2\2\u0107\u0108\7@\2\2\u0108\u0109\7?\2\2\u0109"+
		"*\3\2\2\2\u010a\u010b\7?\2\2\u010b\u010c\7?\2\2\u010c,\3\2\2\2\u010d\u010e"+
		"\7#\2\2\u010e\u010f\7?\2\2\u010f.\3\2\2\2\u0110\u0111\7(\2\2\u0111\60"+
		"\3\2\2\2\u0112\u0113\7~\2\2\u0113\62\3\2\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7p\2\2\u0116\u0117\7f\2\2\u0117\64\3\2\2\2\u0118\u0119\7q\2\2\u0119"+
		"\u011a\7t\2\2\u011a\66\3\2\2\2\u011b\u011c\7>\2\2\u011c\u011d\7>\2\2\u011d"+
		"8\3\2\2\2\u011e\u011f\7@\2\2\u011f\u0120\7@\2\2\u0120:\3\2\2\2\u0121\u0122"+
		"\7?\2\2\u0122<\3\2\2\2\u0123\u0124\7f\2\2\u0124\u0125\7w\2\2\u0125\u0126"+
		"\7r\2\2\u0126>\3\2\2\2\u0127\u0128\7f\2\2\u0128\u0129\7w\2\2\u0129\u012a"+
		"\7r\2\2\u012a\u012b\7\64\2\2\u012b@\3\2\2\2\u012c\u012d\7u\2\2\u012d\u012e"+
		"\7y\2\2\u012e\u012f\7c\2\2\u012f\u0130\7r\2\2\u0130B\3\2\2\2\u0131\u0132"+
		"\7u\2\2\u0132\u0133\7y\2\2\u0133\u0134\7c\2\2\u0134\u0135\7r\2\2\u0135"+
		"\u0136\7\64\2\2\u0136D\3\2\2\2\u0137\u0138\7f\2\2\u0138\u0139\7t\2\2\u0139"+
		"\u013a\7q\2\2\u013a\u013b\7r\2\2\u013bF\3\2\2\2\u013c\u013d\7f\2\2\u013d"+
		"\u013e\7t\2\2\u013e\u013f\7q\2\2\u013f\u0140\7r\2\2\u0140\u0141\7\64\2"+
		"\2\u0141H\3\2\2\2\u0142\u0143\7f\2\2\u0143\u0144\7t\2\2\u0144\u0145\7"+
		"q\2\2\u0145\u0146\7r\2\2\u0146\u0147\7\65\2\2\u0147J\3\2\2\2\u0148\u0149"+
		"\7p\2\2\u0149\u014a\7g\2\2\u014a\u014b\7z\2\2\u014b\u014c\7v\2\2\u014c"+
		"L\3\2\2\2\u014d\u014e\7q\2\2\u014e\u014f\7w\2\2\u014f\u0150\7v\2\2\u0150"+
		"N\3\2\2\2\u0151\u0152\7n\2\2\u0152\u0153\7q\2\2\u0153\u0154\7i\2\2\u0154"+
		"P\3\2\2\2\u0155\u0156\7g\2\2\u0156\u0157\7t\2\2\u0157\u0158\7t\2\2\u0158"+
		"\u0159\7q\2\2\u0159\u015a\7t\2\2\u015aR\3\2\2\2\u015b\u015c\7t\2\2\u015c"+
		"\u015d\7g\2\2\u015d\u015e\7c\2\2\u015e\u015f\7f\2\2\u015fT\3\2\2\2\u0160"+
		"\u0161\7y\2\2\u0161\u0162\7t\2\2\u0162\u0163\7k\2\2\u0163\u0164\7v\2\2"+
		"\u0164\u0165\7g\2\2\u0165V\3\2\2\2\u0166\u0167\7e\2\2\u0167\u0168\7q\2"+
		"\2\u0168\u0169\7r\2\2\u0169\u016a\7{\2\2\u016aX\3\2\2\2\u016b\u016c\7"+
		"e\2\2\u016c\u016d\7n\2\2\u016d\u016e\7q\2\2\u016e\u016f\7p\2\2\u016f\u0170"+
		"\7g\2\2\u0170Z\3\2\2\2\u0171\u0172\7t\2\2\u0172\u0173\7g\2\2\u0173\u0174"+
		"\7v\2\2\u0174\\\3\2\2\2\u0175\u0176\7d\2\2\u0176\u0177\7t\2\2\u0177\u0178"+
		"\7g\2\2\u0178\u0179\7c\2\2\u0179\u017a\7m\2\2\u017a^\3\2\2\2\u017b\u017c"+
		"\7j\2\2\u017c\u017d\7g\2\2\u017d\u017e\7t\2\2\u017e\u017f\7g\2\2\u017f"+
		"`\3\2\2\2\u0180\u0181\7d\2\2\u0181\u0182\7q\2\2\u0182\u0183\7z\2\2\u0183"+
		"b\3\2\2\2\u0184\u0185\7x\2\2\u0185\u0186\7q\2\2\u0186\u0187\7k\2\2\u0187"+
		"\u0188\7f\2\2\u0188d\3\2\2\2\u0189\u018a\7u\2\2\u018a\u018b\7k\2\2\u018b"+
		"\u018c\7|\2\2\u018c\u018d\7g\2\2\u018d\u018e\7q\2\2\u018e\u018f\7h\2\2"+
		"\u018ff\3\2\2\2\u0190\u0191\7*\2\2\u0191h\3\2\2\2\u0192\u0193\7+\2\2\u0193"+
		"j\3\2\2\2\u0194\u0195\7w\2\2\u0195\u0196\7p\2\2\u0196\u0197\7u\2\2\u0197"+
		"\u0198\7c\2\2\u0198\u0199\7h\2\2\u0199\u019a\7g\2\2\u019al\3\2\2\2\u019b"+
		"\u019c\7k\2\2\u019c\u019d\7u\2\2\u019dn\3\2\2\2\u019e\u019f\7p\2\2\u019f"+
		"\u01a0\7g\2\2\u01a0\u01a1\7y\2\2\u01a1p\3\2\2\2\u01a2\u01a3\7\60\2\2\u01a3"+
		"r\3\2\2\2\u01a4\u01a5\7]\2\2\u01a5t\3\2\2\2\u01a6\u01a7\7_\2\2\u01a7v"+
		"\3\2\2\2\u01a8\u01a9\7_\2\2\u01a9\u01aa\7`\2\2\u01aax\3\2\2\2\u01ab\u01ac"+
		"\7}\2\2\u01acz\3\2\2\2\u01ad\u01ae\7\177\2\2\u01ae|\3\2\2\2\u01af\u01b0"+
		"\7c\2\2\u01b0\u01b1\7u\2\2\u01b1\u01b2\7u\2\2\u01b2\u01b3\7g\2\2\u01b3"+
		"\u01b4\7t\2\2\u01b4\u01b5\7v\2\2\u01b5~\3\2\2\2\u01b6\u01b7\7u\2\2\u01b7"+
		"\u01b8\7v\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb\7k\2\2"+
		"\u01bb\u01bc\7e\2\2\u01bc\u0080\3\2\2\2\u01bd\u01be\7e\2\2\u01be\u01bf"+
		"\7q\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7u\2\2\u01c1\u01c2\7v\2\2\u01c2"+
		"\u0082\3\2\2\2\u01c3\u01c4\7c\2\2\u01c4\u01c5\7n\2\2\u01c5\u01c6\7n\2"+
		"\2\u01c6\u01c7\7q\2\2\u01c7\u01c8\7e\2\2\u01c8\u0084\3\2\2\2\u01c9\u01ca"+
		"\7k\2\2\u01ca\u01cb\7p\2\2\u01cb\u0086\3\2\2\2\u01cc\u01cd\7k\2\2\u01cd"+
		"\u01ce\7h\2\2\u01ce\u0088\3\2\2\2\u01cf\u01d0\7f\2\2\u01d0\u01d1\7q\2"+
		"\2\u01d1\u008a\3\2\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7n\2\2\u01d4\u01d5"+
		"\7k\2\2\u01d5\u01d6\7h\2\2\u01d6\u008c\3\2\2\2\u01d7\u01d8\7g\2\2\u01d8"+
		"\u01d9\7n\2\2\u01d9\u01da\7u\2\2\u01da\u01db\7g\2\2\u01db\u008e\3\2\2"+
		"\2\u01dc\u01dd\7u\2\2\u01dd\u01de\7y\2\2\u01de\u01df\7k\2\2\u01df\u01e0"+
		"\7v\2\2\u01e0\u01e1\7e\2\2\u01e1\u01e2\7j\2\2\u01e2\u0090\3\2\2\2\u01e3"+
		"\u01e4\7e\2\2\u01e4\u01e5\7c\2\2\u01e5\u01e6\7u\2\2\u01e6\u01e7\7g\2\2"+
		"\u01e7\u0092\3\2\2\2\u01e8\u01e9\7f\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb"+
		"\7h\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed\7w\2\2\u01ed\u01ee\7n\2\2\u01ee"+
		"\u01ef\7v\2\2\u01ef\u0094\3\2\2\2\u01f0\u01f1\7y\2\2\u01f1\u01f2\7j\2"+
		"\2\u01f2\u01f3\7k\2\2\u01f3\u01f4\7n\2\2\u01f4\u01f5\7g\2\2\u01f5\u0096"+
		"\3\2\2\2\u01f6\u01f7\7n\2\2\u01f7\u01f8\7g\2\2\u01f8\u01f9\7v\2\2\u01f9"+
		"\u0098\3\2\2\2\u01fa\u01fb\7y\2\2\u01fb\u01fc\7k\2\2\u01fc\u01fd\7v\2"+
		"\2\u01fd\u01fe\7j\2\2\u01fe\u009a\3\2\2\2\u01ff\u0200\7v\2\2\u0200\u0201"+
		"\7t\2\2\u0201\u0202\7{\2\2\u0202\u009c\3\2\2\2\u0203\u0204\7v\2\2\u0204"+
		"\u0205\7j\2\2\u0205\u0206\7t\2\2\u0206\u0207\7q\2\2\u0207\u0208\7y\2\2"+
		"\u0208\u009e\3\2\2\2\u0209\u020a\7r\2\2\u020a\u020b\7c\2\2\u020b\u020c"+
		"\7u\2\2\u020c\u020d\7u\2\2\u020d\u00a0\3\2\2\2\u020e\u020f\7e\2\2\u020f"+
		"\u0210\7c\2\2\u0210\u0211\7v\2\2\u0211\u0212\7e\2\2\u0212\u0213\7j\2\2"+
		"\u0213\u00a2\3\2\2\2\u0214\u0215\7u\2\2\u0215\u0216\7{\2\2\u0216\u0217"+
		"\7u\2\2\u0217\u0218\7e\2\2\u0218\u0219\7c\2\2\u0219\u021a\7n\2\2\u021a"+
		"\u021b\7n\2\2\u021b\u00a4\3\2\2\2\u021c\u021d\7g\2\2\u021d\u021e\7z\2"+
		"\2\u021e\u021f\7r\2\2\u021f\u0220\7q\2\2\u0220\u0221\7t\2\2\u0221\u0222"+
		"\7v\2\2\u0222\u00a6\3\2\2\2\u0223\u0224\7k\2\2\u0224\u0225\7p\2\2\u0225"+
		"\u0226\7n\2\2\u0226\u0227\7k\2\2\u0227\u0228\7p\2\2\u0228\u0229\7g\2\2"+
		"\u0229\u00a8\3\2\2\2\u022a\u022b\7g\2\2\u022b\u022c\7z\2\2\u022c\u022d"+
		"\7v\2\2\u022d\u022e\7g\2\2\u022e\u022f\7t\2\2\u022f\u0230\7p\2\2\u0230"+
		"\u00aa\3\2\2\2\u0231\u0232\7u\2\2\u0232\u0233\7v\2\2\u0233\u0234\7c\2"+
		"\2\u0234\u0235\7t\2\2\u0235\u0236\7v\2\2\u0236\u00ac\3\2\2\2\u0237\u0238"+
		"\7t\2\2\u0238\u0239\7g\2\2\u0239\u023a\7e\2\2\u023a\u00ae\3\2\2\2\u023b"+
		"\u023c\7v\2\2\u023c\u023d\7j\2\2\u023d\u023e\7t\2\2\u023e\u023f\7q\2\2"+
		"\u023f\u0240\7y\2\2\u0240\u0241\7u\2\2\u0241\u00b0\3\2\2\2\u0242\u0243"+
		"\7k\2\2\u0243\u0244\7p\2\2\u0244\u0245\7e\2\2\u0245\u0246\7n\2\2\u0246"+
		"\u0247\7w\2\2\u0247\u0248\7f\2\2\u0248\u0249\7g\2\2\u0249\u00b2\3\2\2"+
		"\2\u024a\u024b\7o\2\2\u024b\u024c\7q\2\2\u024c\u024d\7f\2\2\u024d\u024e"+
		"\7w\2\2\u024e\u024f\7n\2\2\u024f\u0250\7g\2\2\u0250\u00b4\3\2\2\2\u0251"+
		"\u0252\7v\2\2\u0252\u0253\7t\2\2\u0253\u0254\7w\2\2\u0254\u025b\7g\2\2"+
		"\u0255\u0256\7h\2\2\u0256\u0257\7c\2\2\u0257\u0258\7n\2\2\u0258\u0259"+
		"\7u\2\2\u0259\u025b\7g\2\2\u025a\u0251\3\2\2\2\u025a\u0255\3\2\2\2\u025b"+
		"\u00b6\3\2\2\2\u025c\u0260\t\2\2\2\u025d\u025f\t\3\2\2\u025e\u025d\3\2"+
		"\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u00b8\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\7<\2\2\u0264\u0268\t\4"+
		"\2\2\u0265\u0267\t\3\2\2\u0266\u0265\3\2\2\2\u0267\u026a\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u00ba\3\2\2\2\u026a\u0268\3\2"+
		"\2\2\u026b\u0277\7\62\2\2\u026c\u026e\7/\2\2\u026d\u026c\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0273\t\5\2\2\u0270\u0272\t\6"+
		"\2\2\u0271\u0270\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u026b\3\2"+
		"\2\2\u0276\u026d\3\2\2\2\u0277\u00bc\3\2\2\2\u0278\u0279\7\62\2\2\u0279"+
		"\u027a\7z\2\2\u027a\u027e\3\2\2\2\u027b\u027d\t\7\2\2\u027c\u027b\3\2"+
		"\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u00be\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282\7\62\2\2\u0282\u0283\7"+
		"d\2\2\u0283\u0287\3\2\2\2\u0284\u0286\t\b\2\2\u0285\u0284\3\2\2\2\u0286"+
		"\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u00c0\3\2"+
		"\2\2\u0289\u0287\3\2\2\2\u028a\u028b\7)\2\2\u028b\u028c\13\2\2\2\u028c"+
		"\u0293\7)\2\2\u028d\u028e\7)\2\2\u028e\u028f\7^\2\2\u028f\u0290\3\2\2"+
		"\2\u0290\u0291\t\t\2\2\u0291\u0293\7)\2\2\u0292\u028a\3\2\2\2\u0292\u028d"+
		"\3\2\2\2\u0293\u00c2\3\2\2\2\u0294\u0298\7$\2\2\u0295\u0297\13\2\2\2\u0296"+
		"\u0295\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0299\3\2\2\2\u0298\u0296\3\2"+
		"\2\2\u0299\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c\7$\2\2\u029c"+
		"\u00c4\3\2\2\2\u029d\u02a3\7$\2\2\u029e\u02a2\n\n\2\2\u029f\u02a0\7^\2"+
		"\2\u02a0\u02a2\13\2\2\2\u02a1\u029e\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2"+
		"\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2"+
		"\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\7$\2\2\u02a7\u02a8\7`\2\2\u02a8\u00c6"+
		"\3\2\2\2\u02a9\u02ad\t\13\2\2\u02aa\u02ac\t\f\2\2\u02ab\u02aa\3\2\2\2"+
		"\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u00c8"+
		"\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b2\t\r\2\2\u02b1\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02b6\be\2\2\u02b6\u00ca\3\2\2\2\u02b7\u02b8\7\61\2\2\u02b8"+
		"\u02b9\7\61\2\2\u02b9\u02bd\3\2\2\2\u02ba\u02bc\n\16\2\2\u02bb\u02ba\3"+
		"\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c0\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\bf\2\2\u02c1\u00cc\3\2"+
		"\2\2\u02c2\u02c3\7\61\2\2\u02c3\u02c4\7,\2\2\u02c4\u02c8\3\2\2\2\u02c5"+
		"\u02c7\13\2\2\2\u02c6\u02c5\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c9\3"+
		"\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb"+
		"\u02cc\7,\2\2\u02cc\u02cd\7\61\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\bg"+
		"\2\2\u02cf\u00ce\3\2\2\2\23\2\u025a\u0260\u0268\u026d\u0273\u0276\u027e"+
		"\u0287\u0292\u0298\u02a1\u02a3\u02ad\u02b3\u02bd\u02c8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}