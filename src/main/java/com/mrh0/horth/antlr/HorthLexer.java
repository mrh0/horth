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
		T__52=53, T__53=54, IDENTIFIER=55, ATOM=56, INT=57, STRING=58, BOOL=59, 
		WHITESPACE=60, COMMENT=61, BLOCKCOMMENT=62, TYPE=63;
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
			"T__49", "T__50", "T__51", "T__52", "T__53", "IDENTIFIER", "ATOM", "INT", 
			"STRING", "BOOL", "WHITESPACE", "COMMENT", "BLOCKCOMMENT", "TYPE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u01de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\38\38\78\u0158\n8\f8\168\u015b\138\39\39\39\3:\3:\3:\7:\u0163"+
		"\n:\f:\16:\u0166\13:\5:\u0168\n:\3;\3;\3;\3;\7;\u016e\n;\f;\16;\u0171"+
		"\13;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u017e\n<\3=\6=\u0181\n=\r=\16"+
		"=\u0182\3=\3=\3>\3>\3>\3>\7>\u018b\n>\f>\16>\u018e\13>\3>\3>\3?\3?\3?"+
		"\3?\7?\u0196\n?\f?\16?\u0199\13?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\6@\u01cf\n@\r@\16@\u01d0"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u01dd\n@\3\u0197\2A\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\3\2\t\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\4\2))^^\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17\2\u01f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081"+
		"\3\2\2\2\5\u0085\3\2\2\2\7\u0087\3\2\2\2\t\u0089\3\2\2\2\13\u008b\3\2"+
		"\2\2\r\u008d\3\2\2\2\17\u008f\3\2\2\2\21\u0091\3\2\2\2\23\u0093\3\2\2"+
		"\2\25\u0095\3\2\2\2\27\u0098\3\2\2\2\31\u009b\3\2\2\2\33\u009e\3\2\2\2"+
		"\35\u00a1\3\2\2\2\37\u00a3\3\2\2\2!\u00a5\3\2\2\2#\u00a9\3\2\2\2%\u00ac"+
		"\3\2\2\2\'\u00af\3\2\2\2)\u00b2\3\2\2\2+\u00b5\3\2\2\2-\u00ba\3\2\2\2"+
		"/\u00bc\3\2\2\2\61\u00c0\3\2\2\2\63\u00c5\3\2\2\2\65\u00ca\3\2\2\2\67"+
		"\u00d0\3\2\2\29\u00d4\3\2\2\2;\u00d9\3\2\2\2=\u00df\3\2\2\2?\u00e5\3\2"+
		"\2\2A\u00e9\3\2\2\2C\u00ed\3\2\2\2E\u00f5\3\2\2\2G\u00f7\3\2\2\2I\u00fd"+
		"\3\2\2\2K\u0100\3\2\2\2M\u0103\3\2\2\2O\u0105\3\2\2\2Q\u010c\3\2\2\2S"+
		"\u0110\3\2\2\2U\u0117\3\2\2\2W\u011e\3\2\2\2Y\u0123\3\2\2\2[\u0129\3\2"+
		"\2\2]\u012c\3\2\2\2_\u012f\3\2\2\2a\u0132\3\2\2\2c\u0135\3\2\2\2e\u013a"+
		"\3\2\2\2g\u013f\3\2\2\2i\u0145\3\2\2\2k\u0149\3\2\2\2m\u014d\3\2\2\2o"+
		"\u0155\3\2\2\2q\u015c\3\2\2\2s\u0167\3\2\2\2u\u0169\3\2\2\2w\u017d\3\2"+
		"\2\2y\u0180\3\2\2\2{\u0186\3\2\2\2}\u0191\3\2\2\2\177\u01dc\3\2\2\2\u0081"+
		"\u0082\7p\2\2\u0082\u0083\7q\2\2\u0083\u0084\7v\2\2\u0084\4\3\2\2\2\u0085"+
		"\u0086\7\u0080\2\2\u0086\6\3\2\2\2\u0087\u0088\7/\2\2\u0088\b\3\2\2\2"+
		"\u0089\u008a\7-\2\2\u008a\n\3\2\2\2\u008b\u008c\7,\2\2\u008c\f\3\2\2\2"+
		"\u008d\u008e\7\61\2\2\u008e\16\3\2\2\2\u008f\u0090\7\'\2\2\u0090\20\3"+
		"\2\2\2\u0091\u0092\7>\2\2\u0092\22\3\2\2\2\u0093\u0094\7@\2\2\u0094\24"+
		"\3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7?\2\2\u0097\26\3\2\2\2\u0098"+
		"\u0099\7@\2\2\u0099\u009a\7?\2\2\u009a\30\3\2\2\2\u009b\u009c\7?\2\2\u009c"+
		"\u009d\7?\2\2\u009d\32\3\2\2\2\u009e\u009f\7#\2\2\u009f\u00a0\7?\2\2\u00a0"+
		"\34\3\2\2\2\u00a1\u00a2\7(\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7~\2\2\u00a4"+
		" \3\2\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7f\2\2\u00a8"+
		"\"\3\2\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7t\2\2\u00ab$\3\2\2\2\u00ac"+
		"\u00ad\7>\2\2\u00ad\u00ae\7>\2\2\u00ae&\3\2\2\2\u00af\u00b0\7@\2\2\u00b0"+
		"\u00b1\7@\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7u\2\2\u00b4"+
		"*\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7u\2\2\u00b8"+
		"\u00b9\7v\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb.\3\2\2\2\u00bc\u00bd"+
		"\7f\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7r\2\2\u00bf\60\3\2\2\2\u00c0\u00c1"+
		"\7f\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7\64\2\2\u00c4"+
		"\62\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7y\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7r\2\2\u00c9\64\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7y\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7\64\2\2\u00cf\66\3\2\2\2"+
		"\u00d0\u00d1\7t\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7v\2\2\u00d38\3\2\2"+
		"\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7r\2\2\u00d8:\3\2\2\2\u00d9\u00da\7f\2\2\u00da\u00db\7t\2\2\u00db\u00dc"+
		"\7q\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7\64\2\2\u00de<\3\2\2\2\u00df\u00e0"+
		"\7f\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7r\2\2\u00e3"+
		"\u00e4\7\65\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7w\2\2\u00e7"+
		"\u00e8\7v\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7t\2\2\u00eb"+
		"\u00ec\7t\2\2\u00ecB\3\2\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7k\2\2\u00ef"+
		"\u00f0\7|\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7h\2\2"+
		"\u00f3\u00f4\7*\2\2\u00f4D\3\2\2\2\u00f5\u00f6\7+\2\2\u00f6F\3\2\2\2\u00f7"+
		"\u00f8\7e\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7v\2\2"+
		"\u00fb\u00fc\7*\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7v\2"+
		"\2\u00ffJ\3\2\2\2\u0100\u0101\7p\2\2\u0101\u0102\7f\2\2\u0102L\3\2\2\2"+
		"\u0103\u0104\7*\2\2\u0104N\3\2\2\2\u0105\u0106\7c\2\2\u0106\u0107\7u\2"+
		"\2\u0107\u0108\7u\2\2\u0108\u0109\7g\2\2\u0109\u010a\7t\2\2\u010a\u010b"+
		"\7v\2\2\u010bP\3\2\2\2\u010c\u010d\7g\2\2\u010d\u010e\7p\2\2\u010e\u010f"+
		"\7f\2\2\u010fR\3\2\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113"+
		"\7n\2\2\u0113\u0114\7k\2\2\u0114\u0115\7p\2\2\u0115\u0116\7g\2\2\u0116"+
		"T\3\2\2\2\u0117\u0118\7g\2\2\u0118\u0119\7z\2\2\u0119\u011a\7v\2\2\u011a"+
		"\u011b\7g\2\2\u011b\u011c\7t\2\2\u011c\u011d\7p\2\2\u011dV\3\2\2\2\u011e"+
		"\u011f\7h\2\2\u011f\u0120\7w\2\2\u0120\u0121\7p\2\2\u0121\u0122\7e\2\2"+
		"\u0122X\3\2\2\2\u0123\u0124\7k\2\2\u0124\u0125\7p\2\2\u0125\u0126\7h\2"+
		"\2\u0126\u0127\7g\2\2\u0127\u0128\7t\2\2\u0128Z\3\2\2\2\u0129\u012a\7"+
		"k\2\2\u012a\u012b\7p\2\2\u012b\\\3\2\2\2\u012c\u012d\7/\2\2\u012d\u012e"+
		"\7@\2\2\u012e^\3\2\2\2\u012f\u0130\7k\2\2\u0130\u0131\7h\2\2\u0131`\3"+
		"\2\2\2\u0132\u0133\7f\2\2\u0133\u0134\7q\2\2\u0134b\3\2\2\2\u0135\u0136"+
		"\7g\2\2\u0136\u0137\7n\2\2\u0137\u0138\7k\2\2\u0138\u0139\7h\2\2\u0139"+
		"d\3\2\2\2\u013a\u013b\7g\2\2\u013b\u013c\7n\2\2\u013c\u013d\7u\2\2\u013d"+
		"\u013e\7g\2\2\u013ef\3\2\2\2\u013f\u0140\7y\2\2\u0140\u0141\7j\2\2\u0141"+
		"\u0142\7k\2\2\u0142\u0143\7n\2\2\u0143\u0144\7g\2\2\u0144h\3\2\2\2\u0145"+
		"\u0146\7n\2\2\u0146\u0147\7g\2\2\u0147\u0148\7v\2\2\u0148j\3\2\2\2\u0149"+
		"\u014a\7r\2\2\u014a\u014b\7q\2\2\u014b\u014c\7r\2\2\u014cl\3\2\2\2\u014d"+
		"\u014e\7k\2\2\u014e\u014f\7p\2\2\u014f\u0150\7e\2\2\u0150\u0151\7n\2\2"+
		"\u0151\u0152\7w\2\2\u0152\u0153\7f\2\2\u0153\u0154\7g\2\2\u0154n\3\2\2"+
		"\2\u0155\u0159\t\2\2\2\u0156\u0158\t\3\2\2\u0157\u0156\3\2\2\2\u0158\u015b"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015ap\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015d\7%\2\2\u015d\u015e\5o8\2\u015er\3\2\2\2\u015f"+
		"\u0168\7\62\2\2\u0160\u0164\t\4\2\2\u0161\u0163\t\5\2\2\u0162\u0161\3"+
		"\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u015f\3\2\2\2\u0167\u0160\3\2"+
		"\2\2\u0168t\3\2\2\2\u0169\u016f\7$\2\2\u016a\u016e\n\6\2\2\u016b\u016c"+
		"\7^\2\2\u016c\u016e\13\2\2\2\u016d\u016a\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7$\2\2\u0173v\3\2\2\2\u0174\u0175"+
		"\7v\2\2\u0175\u0176\7t\2\2\u0176\u0177\7w\2\2\u0177\u017e\7g\2\2\u0178"+
		"\u0179\7h\2\2\u0179\u017a\7c\2\2\u017a\u017b\7n\2\2\u017b\u017c\7u\2\2"+
		"\u017c\u017e\7g\2\2\u017d\u0174\3\2\2\2\u017d\u0178\3\2\2\2\u017ex\3\2"+
		"\2\2\u017f\u0181\t\7\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\b="+
		"\2\2\u0185z\3\2\2\2\u0186\u0187\7\61\2\2\u0187\u0188\7\61\2\2\u0188\u018c"+
		"\3\2\2\2\u0189\u018b\n\b\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0190\b>\2\2\u0190|\3\2\2\2\u0191\u0192\7\61\2\2\u0192\u0193"+
		"\7,\2\2\u0193\u0197\3\2\2\2\u0194\u0196\13\2\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7,\2\2\u019b\u019c\7\61\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\b?\2\2\u019e~\3\2\2\2\u019f\u01a0\7k\2\2\u01a0"+
		"\u01a1\7p\2\2\u01a1\u01dd\7v\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7v\2\2"+
		"\u01a4\u01a5\7t\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\7p\2\2\u01a7\u01dd"+
		"\7i\2\2\u01a8\u01a9\7e\2\2\u01a9\u01aa\7j\2\2\u01aa\u01ab\7c\2\2\u01ab"+
		"\u01dd\7t\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7v\2\2\u01ae\u01af\7q\2\2"+
		"\u01af\u01dd\7o\2\2\u01b0\u01b1\7d\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3"+
		"\7q\2\2\u01b3\u01dd\7n\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6\7g\2\2\u01b6"+
		"\u01dd\7h\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7h\2\2"+
		"\u01ba\u01bb\7>\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\5\177@\2\u01bd\u01be"+
		"\7@\2\2\u01be\u01dd\3\2\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c1\7t\2\2\u01c1"+
		"\u01c2\7t\2\2\u01c2\u01c3\7>\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\5\177"+
		"@\2\u01c5\u01c6\7@\2\2\u01c6\u01dd\3\2\2\2\u01c7\u01c8\7v\2\2\u01c8\u01c9"+
		"\7{\2\2\u01c9\u01ca\7r\2\2\u01ca\u01cb\7g\2\2\u01cb\u01cc\7>\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01cf\5\177@\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3"+
		"\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\7@\2\2\u01d3\u01dd\3\2\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7p\2"+
		"\2\u01d6\u01d7\7{\2\2\u01d7\u01d8\7>\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da"+
		"\5o8\2\u01da\u01db\7@\2\2\u01db\u01dd\3\2\2\2\u01dc\u019f\3\2\2\2\u01dc"+
		"\u01a2\3\2\2\2\u01dc\u01a8\3\2\2\2\u01dc\u01ac\3\2\2\2\u01dc\u01b0\3\2"+
		"\2\2\u01dc\u01b4\3\2\2\2\u01dc\u01b7\3\2\2\2\u01dc\u01bf\3\2\2\2\u01dc"+
		"\u01c7\3\2\2\2\u01dc\u01d4\3\2\2\2\u01dd\u0080\3\2\2\2\16\2\u0159\u0164"+
		"\u0167\u016d\u016f\u017d\u0182\u018c\u0197\u01d0\u01dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}