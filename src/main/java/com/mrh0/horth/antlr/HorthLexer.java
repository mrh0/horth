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
		T__80=81, T__81=82, BOOL=83, NAME=84, ATOM=85, INT=86, HEX=87, BIN=88, 
		CHAR=89, STRING=90, STRING_NT=91, WHITESPACE=92, COMMENT=93, BLOCKCOMMENT=94;
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
			"T__81", "BOOL", "NAME", "ATOM", "INT", "HEX", "BIN", "CHAR", "STRING", 
			"STRING_NT", "WHITESPACE", "COMMENT", "BLOCKCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'.'", "'<'", "'>'", "'func<'", "'->'", "'atom<'", "'|'", 
			"'type'", "'as'", "'end'", "'not'", "'~'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'<='", "'>='", "'=='", "'!='", "'&'", "'and'", "'or'", "'<<'", 
			"'>>'", "'='", "'dup'", "'dup2'", "'swap'", "'swap2'", "'drop'", "'drop2'", 
			"'drop3'", "'out'", "'log'", "'error'", "'log^'", "'exit'", "'halt'", 
			"'break'", "'length'", "'here'", "'void'", "'sizeof'", "'('", "')'", 
			"'cast'", "'unsafe'", "'is'", "','", "'['", "']'", "']^'", "'{'", "'}'", 
			"'assert'", "'static'", "'const'", "'alloc'", "'in'", "'if'", "'do'", 
			"'elif'", "'else'", "'while'", "'let'", "'with'", "'try'", "'throw'", 
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
			null, null, null, null, null, null, null, null, null, null, null, "BOOL", 
			"NAME", "ATOM", "INT", "HEX", "BIN", "CHAR", "STRING", "STRING_NT", "WHITESPACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2`\u0298\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\3:\3:\3;"+
		"\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>"+
		"\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D"+
		"\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H"+
		"\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L"+
		"\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O"+
		"\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S"+
		"\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u022a\nT\3U\3U\7U\u022e\nU"+
		"\fU\16U\u0231\13U\3V\3V\3V\7V\u0236\nV\fV\16V\u0239\13V\3W\3W\5W\u023d"+
		"\nW\3W\3W\7W\u0241\nW\fW\16W\u0244\13W\5W\u0246\nW\3X\3X\3X\3X\7X\u024c"+
		"\nX\fX\16X\u024f\13X\3Y\3Y\3Y\3Y\7Y\u0255\nY\fY\16Y\u0258\13Y\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\5Z\u0262\nZ\3[\3[\7[\u0266\n[\f[\16[\u0269\13[\3[\3["+
		"\3\\\3\\\3\\\3\\\7\\\u0271\n\\\f\\\16\\\u0274\13\\\3\\\3\\\3\\\3]\6]\u027a"+
		"\n]\r]\16]\u027b\3]\3]\3^\3^\3^\3^\7^\u0284\n^\f^\16^\u0287\13^\3^\3^"+
		"\3_\3_\3_\3_\7_\u028f\n_\f_\16_\u0292\13_\3_\3_\3_\3_\3_\4\u0267\u0290"+
		"\2`\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5"+
		"\\\u00b7]\u00b9^\u00bb_\u00bd`\3\2\r\5\2C\\aac|\6\2\62;C\\aac|\5\2\62"+
		";C\\c|\3\2\63;\3\2\62;\5\2\62;CHch\3\2\62\63\t\2$$))\62\62^^ppttvv\4\2"+
		"))^^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u02a6\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\3\u00bf\3\2\2\2\5\u00c1\3\2\2\2\7\u00c3\3\2\2\2\t\u00c5\3\2\2\2\13"+
		"\u00c7\3\2\2\2\r\u00cd\3\2\2\2\17\u00d0\3\2\2\2\21\u00d6\3\2\2\2\23\u00d8"+
		"\3\2\2\2\25\u00dd\3\2\2\2\27\u00e0\3\2\2\2\31\u00e4\3\2\2\2\33\u00e8\3"+
		"\2\2\2\35\u00ea\3\2\2\2\37\u00ec\3\2\2\2!\u00ee\3\2\2\2#\u00f0\3\2\2\2"+
		"%\u00f2\3\2\2\2\'\u00f4\3\2\2\2)\u00f7\3\2\2\2+\u00fa\3\2\2\2-\u00fd\3"+
		"\2\2\2/\u0100\3\2\2\2\61\u0102\3\2\2\2\63\u0106\3\2\2\2\65\u0109\3\2\2"+
		"\2\67\u010c\3\2\2\29\u010f\3\2\2\2;\u0111\3\2\2\2=\u0115\3\2\2\2?\u011a"+
		"\3\2\2\2A\u011f\3\2\2\2C\u0125\3\2\2\2E\u012a\3\2\2\2G\u0130\3\2\2\2I"+
		"\u0136\3\2\2\2K\u013a\3\2\2\2M\u013e\3\2\2\2O\u0144\3\2\2\2Q\u0149\3\2"+
		"\2\2S\u014e\3\2\2\2U\u0153\3\2\2\2W\u0159\3\2\2\2Y\u0160\3\2\2\2[\u0165"+
		"\3\2\2\2]\u016a\3\2\2\2_\u0171\3\2\2\2a\u0173\3\2\2\2c\u0175\3\2\2\2e"+
		"\u017a\3\2\2\2g\u0181\3\2\2\2i\u0184\3\2\2\2k\u0186\3\2\2\2m\u0188\3\2"+
		"\2\2o\u018a\3\2\2\2q\u018d\3\2\2\2s\u018f\3\2\2\2u\u0191\3\2\2\2w\u0198"+
		"\3\2\2\2y\u019f\3\2\2\2{\u01a5\3\2\2\2}\u01ab\3\2\2\2\177\u01ae\3\2\2"+
		"\2\u0081\u01b1\3\2\2\2\u0083\u01b4\3\2\2\2\u0085\u01b9\3\2\2\2\u0087\u01be"+
		"\3\2\2\2\u0089\u01c4\3\2\2\2\u008b\u01c8\3\2\2\2\u008d\u01cd\3\2\2\2\u008f"+
		"\u01d1\3\2\2\2\u0091\u01d7\3\2\2\2\u0093\u01dc\3\2\2\2\u0095\u01e2\3\2"+
		"\2\2\u0097\u01ea\3\2\2\2\u0099\u01f1\3\2\2\2\u009b\u01f8\3\2\2\2\u009d"+
		"\u01ff\3\2\2\2\u009f\u0205\3\2\2\2\u00a1\u020a\3\2\2\2\u00a3\u0211\3\2"+
		"\2\2\u00a5\u0219\3\2\2\2\u00a7\u0229\3\2\2\2\u00a9\u022b\3\2\2\2\u00ab"+
		"\u0232\3\2\2\2\u00ad\u0245\3\2\2\2\u00af\u0247\3\2\2\2\u00b1\u0250\3\2"+
		"\2\2\u00b3\u0261\3\2\2\2\u00b5\u0263\3\2\2\2\u00b7\u026c\3\2\2\2\u00b9"+
		"\u0279\3\2\2\2\u00bb\u027f\3\2\2\2\u00bd\u028a\3\2\2\2\u00bf\u00c0\7B"+
		"\2\2\u00c0\4\3\2\2\2\u00c1\u00c2\7\60\2\2\u00c2\6\3\2\2\2\u00c3\u00c4"+
		"\7>\2\2\u00c4\b\3\2\2\2\u00c5\u00c6\7@\2\2\u00c6\n\3\2\2\2\u00c7\u00c8"+
		"\7h\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7e\2\2\u00cb"+
		"\u00cc\7>\2\2\u00cc\f\3\2\2\2\u00cd\u00ce\7/\2\2\u00ce\u00cf\7@\2\2\u00cf"+
		"\16\3\2\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7o\2\2\u00d4\u00d5\7>\2\2\u00d5\20\3\2\2\2\u00d6\u00d7\7~\2\2\u00d7"+
		"\22\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7{\2\2\u00da\u00db\7r\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\24\3\2\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7u\2\2\u00df"+
		"\26\3\2\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7f\2\2\u00e3"+
		"\30\3\2\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7v\2\2\u00e7"+
		"\32\3\2\2\2\u00e8\u00e9\7\u0080\2\2\u00e9\34\3\2\2\2\u00ea\u00eb\7-\2"+
		"\2\u00eb\36\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed \3\2\2\2\u00ee\u00ef\7,\2"+
		"\2\u00ef\"\3\2\2\2\u00f0\u00f1\7\61\2\2\u00f1$\3\2\2\2\u00f2\u00f3\7\'"+
		"\2\2\u00f3&\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\u00f6\7?\2\2\u00f6(\3\2\2"+
		"\2\u00f7\u00f8\7@\2\2\u00f8\u00f9\7?\2\2\u00f9*\3\2\2\2\u00fa\u00fb\7"+
		"?\2\2\u00fb\u00fc\7?\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7#\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ff.\3\2\2\2\u0100\u0101\7(\2\2\u0101\60\3\2\2\2\u0102\u0103"+
		"\7c\2\2\u0103\u0104\7p\2\2\u0104\u0105\7f\2\2\u0105\62\3\2\2\2\u0106\u0107"+
		"\7q\2\2\u0107\u0108\7t\2\2\u0108\64\3\2\2\2\u0109\u010a\7>\2\2\u010a\u010b"+
		"\7>\2\2\u010b\66\3\2\2\2\u010c\u010d\7@\2\2\u010d\u010e\7@\2\2\u010e8"+
		"\3\2\2\2\u010f\u0110\7?\2\2\u0110:\3\2\2\2\u0111\u0112\7f\2\2\u0112\u0113"+
		"\7w\2\2\u0113\u0114\7r\2\2\u0114<\3\2\2\2\u0115\u0116\7f\2\2\u0116\u0117"+
		"\7w\2\2\u0117\u0118\7r\2\2\u0118\u0119\7\64\2\2\u0119>\3\2\2\2\u011a\u011b"+
		"\7u\2\2\u011b\u011c\7y\2\2\u011c\u011d\7c\2\2\u011d\u011e\7r\2\2\u011e"+
		"@\3\2\2\2\u011f\u0120\7u\2\2\u0120\u0121\7y\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7r\2\2\u0123\u0124\7\64\2\2\u0124B\3\2\2\2\u0125\u0126\7f\2\2\u0126"+
		"\u0127\7t\2\2\u0127\u0128\7q\2\2\u0128\u0129\7r\2\2\u0129D\3\2\2\2\u012a"+
		"\u012b\7f\2\2\u012b\u012c\7t\2\2\u012c\u012d\7q\2\2\u012d\u012e\7r\2\2"+
		"\u012e\u012f\7\64\2\2\u012fF\3\2\2\2\u0130\u0131\7f\2\2\u0131\u0132\7"+
		"t\2\2\u0132\u0133\7q\2\2\u0133\u0134\7r\2\2\u0134\u0135\7\65\2\2\u0135"+
		"H\3\2\2\2\u0136\u0137\7q\2\2\u0137\u0138\7w\2\2\u0138\u0139\7v\2\2\u0139"+
		"J\3\2\2\2\u013a\u013b\7n\2\2\u013b\u013c\7q\2\2\u013c\u013d\7i\2\2\u013d"+
		"L\3\2\2\2\u013e\u013f\7g\2\2\u013f\u0140\7t\2\2\u0140\u0141\7t\2\2\u0141"+
		"\u0142\7q\2\2\u0142\u0143\7t\2\2\u0143N\3\2\2\2\u0144\u0145\7n\2\2\u0145"+
		"\u0146\7q\2\2\u0146\u0147\7i\2\2\u0147\u0148\7`\2\2\u0148P\3\2\2\2\u0149"+
		"\u014a\7g\2\2\u014a\u014b\7z\2\2\u014b\u014c\7k\2\2\u014c\u014d\7v\2\2"+
		"\u014dR\3\2\2\2\u014e\u014f\7j\2\2\u014f\u0150\7c\2\2\u0150\u0151\7n\2"+
		"\2\u0151\u0152\7v\2\2\u0152T\3\2\2\2\u0153\u0154\7d\2\2\u0154\u0155\7"+
		"t\2\2\u0155\u0156\7g\2\2\u0156\u0157\7c\2\2\u0157\u0158\7m\2\2\u0158V"+
		"\3\2\2\2\u0159\u015a\7n\2\2\u015a\u015b\7g\2\2\u015b\u015c\7p\2\2\u015c"+
		"\u015d\7i\2\2\u015d\u015e\7v\2\2\u015e\u015f\7j\2\2\u015fX\3\2\2\2\u0160"+
		"\u0161\7j\2\2\u0161\u0162\7g\2\2\u0162\u0163\7t\2\2\u0163\u0164\7g\2\2"+
		"\u0164Z\3\2\2\2\u0165\u0166\7x\2\2\u0166\u0167\7q\2\2\u0167\u0168\7k\2"+
		"\2\u0168\u0169\7f\2\2\u0169\\\3\2\2\2\u016a\u016b\7u\2\2\u016b\u016c\7"+
		"k\2\2\u016c\u016d\7|\2\2\u016d\u016e\7g\2\2\u016e\u016f\7q\2\2\u016f\u0170"+
		"\7h\2\2\u0170^\3\2\2\2\u0171\u0172\7*\2\2\u0172`\3\2\2\2\u0173\u0174\7"+
		"+\2\2\u0174b\3\2\2\2\u0175\u0176\7e\2\2\u0176\u0177\7c\2\2\u0177\u0178"+
		"\7u\2\2\u0178\u0179\7v\2\2\u0179d\3\2\2\2\u017a\u017b\7w\2\2\u017b\u017c"+
		"\7p\2\2\u017c\u017d\7u\2\2\u017d\u017e\7c\2\2\u017e\u017f\7h\2\2\u017f"+
		"\u0180\7g\2\2\u0180f\3\2\2\2\u0181\u0182\7k\2\2\u0182\u0183\7u\2\2\u0183"+
		"h\3\2\2\2\u0184\u0185\7.\2\2\u0185j\3\2\2\2\u0186\u0187\7]\2\2\u0187l"+
		"\3\2\2\2\u0188\u0189\7_\2\2\u0189n\3\2\2\2\u018a\u018b\7_\2\2\u018b\u018c"+
		"\7`\2\2\u018cp\3\2\2\2\u018d\u018e\7}\2\2\u018er\3\2\2\2\u018f\u0190\7"+
		"\177\2\2\u0190t\3\2\2\2\u0191\u0192\7c\2\2\u0192\u0193\7u\2\2\u0193\u0194"+
		"\7u\2\2\u0194\u0195\7g\2\2\u0195\u0196\7t\2\2\u0196\u0197\7v\2\2\u0197"+
		"v\3\2\2\2\u0198\u0199\7u\2\2\u0199\u019a\7v\2\2\u019a\u019b\7c\2\2\u019b"+
		"\u019c\7v\2\2\u019c\u019d\7k\2\2\u019d\u019e\7e\2\2\u019ex\3\2\2\2\u019f"+
		"\u01a0\7e\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3\7u\2\2"+
		"\u01a3\u01a4\7v\2\2\u01a4z\3\2\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7n\2"+
		"\2\u01a7\u01a8\7n\2\2\u01a8\u01a9\7q\2\2\u01a9\u01aa\7e\2\2\u01aa|\3\2"+
		"\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad\7p\2\2\u01ad~\3\2\2\2\u01ae\u01af"+
		"\7k\2\2\u01af\u01b0\7h\2\2\u01b0\u0080\3\2\2\2\u01b1\u01b2\7f\2\2\u01b2"+
		"\u01b3\7q\2\2\u01b3\u0082\3\2\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7n\2"+
		"\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7h\2\2\u01b8\u0084\3\2\2\2\u01b9\u01ba"+
		"\7g\2\2\u01ba\u01bb\7n\2\2\u01bb\u01bc\7u\2\2\u01bc\u01bd\7g\2\2\u01bd"+
		"\u0086\3\2\2\2\u01be\u01bf\7y\2\2\u01bf\u01c0\7j\2\2\u01c0\u01c1\7k\2"+
		"\2\u01c1\u01c2\7n\2\2\u01c2\u01c3\7g\2\2\u01c3\u0088\3\2\2\2\u01c4\u01c5"+
		"\7n\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7\7v\2\2\u01c7\u008a\3\2\2\2\u01c8"+
		"\u01c9\7y\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7j\2\2"+
		"\u01cc\u008c\3\2\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7t\2\2\u01cf\u01d0"+
		"\7{\2\2\u01d0\u008e\3\2\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3\7j\2\2\u01d3"+
		"\u01d4\7t\2\2\u01d4\u01d5\7q\2\2\u01d5\u01d6\7y\2\2\u01d6\u0090\3\2\2"+
		"\2\u01d7\u01d8\7r\2\2\u01d8\u01d9\7c\2\2\u01d9\u01da\7u\2\2\u01da\u01db"+
		"\7u\2\2\u01db\u0092\3\2\2\2\u01dc\u01dd\7e\2\2\u01dd\u01de\7c\2\2\u01de"+
		"\u01df\7v\2\2\u01df\u01e0\7e\2\2\u01e0\u01e1\7j\2\2\u01e1\u0094\3\2\2"+
		"\2\u01e2\u01e3\7u\2\2\u01e3\u01e4\7{\2\2\u01e4\u01e5\7u\2\2\u01e5\u01e6"+
		"\7e\2\2\u01e6\u01e7\7c\2\2\u01e7\u01e8\7n\2\2\u01e8\u01e9\7n\2\2\u01e9"+
		"\u0096\3\2\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7z\2\2\u01ec\u01ed\7r\2"+
		"\2\u01ed\u01ee\7q\2\2\u01ee\u01ef\7t\2\2\u01ef\u01f0\7v\2\2\u01f0\u0098"+
		"\3\2\2\2\u01f1\u01f2\7k\2\2\u01f2\u01f3\7p\2\2\u01f3\u01f4\7n\2\2\u01f4"+
		"\u01f5\7k\2\2\u01f5\u01f6\7p\2\2\u01f6\u01f7\7g\2\2\u01f7\u009a\3\2\2"+
		"\2\u01f8\u01f9\7g\2\2\u01f9\u01fa\7z\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc"+
		"\7g\2\2\u01fc\u01fd\7t\2\2\u01fd\u01fe\7p\2\2\u01fe\u009c\3\2\2\2\u01ff"+
		"\u0200\7u\2\2\u0200\u0201\7v\2\2\u0201\u0202\7c\2\2\u0202\u0203\7t\2\2"+
		"\u0203\u0204\7v\2\2\u0204\u009e\3\2\2\2\u0205\u0206\7h\2\2\u0206\u0207"+
		"\7w\2\2\u0207\u0208\7p\2\2\u0208\u0209\7e\2\2\u0209\u00a0\3\2\2\2\u020a"+
		"\u020b\7v\2\2\u020b\u020c\7j\2\2\u020c\u020d\7t\2\2\u020d\u020e\7q\2\2"+
		"\u020e\u020f\7y\2\2\u020f\u0210\7u\2\2\u0210\u00a2\3\2\2\2\u0211\u0212"+
		"\7k\2\2\u0212\u0213\7p\2\2\u0213\u0214\7e\2\2\u0214\u0215\7n\2\2\u0215"+
		"\u0216\7w\2\2\u0216\u0217\7f\2\2\u0217\u0218\7g\2\2\u0218\u00a4\3\2\2"+
		"\2\u0219\u021a\7o\2\2\u021a\u021b\7q\2\2\u021b\u021c\7f\2\2\u021c\u021d"+
		"\7w\2\2\u021d\u021e\7n\2\2\u021e\u021f\7g\2\2\u021f\u00a6\3\2\2\2\u0220"+
		"\u0221\7v\2\2\u0221\u0222\7t\2\2\u0222\u0223\7w\2\2\u0223\u022a\7g\2\2"+
		"\u0224\u0225\7h\2\2\u0225\u0226\7c\2\2\u0226\u0227\7n\2\2\u0227\u0228"+
		"\7u\2\2\u0228\u022a\7g\2\2\u0229\u0220\3\2\2\2\u0229\u0224\3\2\2\2\u022a"+
		"\u00a8\3\2\2\2\u022b\u022f\t\2\2\2\u022c\u022e\t\3\2\2\u022d\u022c\3\2"+
		"\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u00aa\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0233\7<\2\2\u0233\u0237\t\4"+
		"\2\2\u0234\u0236\t\3\2\2\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u00ac\3\2\2\2\u0239\u0237\3\2"+
		"\2\2\u023a\u0246\7\62\2\2\u023b\u023d\7/\2\2\u023c\u023b\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0242\t\5\2\2\u023f\u0241\t\6"+
		"\2\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u023a\3\2"+
		"\2\2\u0245\u023c\3\2\2\2\u0246\u00ae\3\2\2\2\u0247\u0248\7\62\2\2\u0248"+
		"\u0249\7z\2\2\u0249\u024d\3\2\2\2\u024a\u024c\t\7\2\2\u024b\u024a\3\2"+
		"\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u00b0\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0251\7\62\2\2\u0251\u0252\7"+
		"d\2\2\u0252\u0256\3\2\2\2\u0253\u0255\t\b\2\2\u0254\u0253\3\2\2\2\u0255"+
		"\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u00b2\3\2"+
		"\2\2\u0258\u0256\3\2\2\2\u0259\u025a\7)\2\2\u025a\u025b\13\2\2\2\u025b"+
		"\u0262\7)\2\2\u025c\u025d\7)\2\2\u025d\u025e\7^\2\2\u025e\u025f\3\2\2"+
		"\2\u025f\u0260\t\t\2\2\u0260\u0262\7)\2\2\u0261\u0259\3\2\2\2\u0261\u025c"+
		"\3\2\2\2\u0262\u00b4\3\2\2\2\u0263\u0267\7$\2\2\u0264\u0266\13\2\2\2\u0265"+
		"\u0264\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0268\3\2\2\2\u0267\u0265\3\2"+
		"\2\2\u0268\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\7$\2\2\u026b"+
		"\u00b6\3\2\2\2\u026c\u0272\7$\2\2\u026d\u0271\n\n\2\2\u026e\u026f\7^\2"+
		"\2\u026f\u0271\13\2\2\2\u0270\u026d\3\2\2\2\u0270\u026e\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0275\u0276\7$\2\2\u0276\u0277\7`\2\2\u0277\u00b8"+
		"\3\2\2\2\u0278\u027a\t\13\2\2\u0279\u0278\3\2\2\2\u027a\u027b\3\2\2\2"+
		"\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e"+
		"\b]\2\2\u027e\u00ba\3\2\2\2\u027f\u0280\7\61\2\2\u0280\u0281\7\61\2\2"+
		"\u0281\u0285\3\2\2\2\u0282\u0284\n\f\2\2\u0283\u0282\3\2\2\2\u0284\u0287"+
		"\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0288\u0289\b^\2\2\u0289\u00bc\3\2\2\2\u028a\u028b\7\61"+
		"\2\2\u028b\u028c\7,\2\2\u028c\u0290\3\2\2\2\u028d\u028f\13\2\2\2\u028e"+
		"\u028d\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u0291\3\2\2\2\u0290\u028e\3\2"+
		"\2\2\u0291\u0293\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\7,\2\2\u0294"+
		"\u0295\7\61\2\2\u0295\u0296\3\2\2\2\u0296\u0297\b_\2\2\u0297\u00be\3\2"+
		"\2\2\22\2\u0229\u022f\u0237\u023c\u0242\u0245\u024d\u0256\u0261\u0267"+
		"\u0270\u0272\u027b\u0285\u0290\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}