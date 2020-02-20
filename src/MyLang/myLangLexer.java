// Generated from /home/oussama/IdeaProjects/AntlrExps/src/MyLang/myLang.g4 by ANTLR 4.7.2
package MyLang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MC_CLASS=4, MC_INT=5, MC_FLOAT=6, MC_STRING=7, 
		MC_IN=8, MC_OUT=9, MC_IMPORT=10, MC_IF=11, MC_THENE=12, MC_ELSE=13, MC_WHILE=14, 
		INT=15, FLOAT=16, STRING=17, TRUE=18, FALSE=19, ACO_D=20, ACO_G=21, PAR_D=22, 
		PAR_G=23, PLUS=24, MINUS=25, MUL=26, DIV=27, MOD=28, EQ=29, NEQ=30, GT=31, 
		LT=32, LET=33, GET=34, AND=35, OR=36, NOT=37, ASSIGN=38, PV=39, IDF=40, 
		BIB=41, WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MC_CLASS", "MC_INT", "MC_FLOAT", "MC_STRING", 
			"MC_IN", "MC_OUT", "MC_IMPORT", "MC_IF", "MC_THENE", "MC_ELSE", "MC_WHILE", 
			"INT", "FLOAT", "STRING", "TRUE", "FALSE", "ACO_D", "ACO_G", "PAR_D", 
			"PAR_G", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EQ", "NEQ", "GT", "LT", 
			"LET", "GET", "AND", "OR", "NOT", "ASSIGN", "PV", "IDF", "BIB", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'protected'", "'public'", "','", "'class'", "'int'", "'float'", 
			"'string'", "'In'", "'Out'", "'import'", "'if'", "'then'", "'else'", 
			"'while'", null, null, null, "'true'", "'false'", "'}'", "'{'", "')'", 
			"'('", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'!='", "'>'", "'<'", 
			"'<='", "'>='", "'and'", "'or'", "'not'", "':='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MC_CLASS", "MC_INT", "MC_FLOAT", "MC_STRING", 
			"MC_IN", "MC_OUT", "MC_IMPORT", "MC_IF", "MC_THENE", "MC_ELSE", "MC_WHILE", 
			"INT", "FLOAT", "STRING", "TRUE", "FALSE", "ACO_D", "ACO_G", "PAR_D", 
			"PAR_G", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EQ", "NEQ", "GT", "LT", 
			"LET", "GET", "AND", "OR", "NOT", "ASSIGN", "PV", "IDF", "BIB", "WS"
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


	public myLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "myLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00a4\n\20\r\20\16\20"+
		"\u00a5\3\21\6\21\u00a9\n\21\r\21\16\21\u00aa\3\21\3\21\7\21\u00af\n\21"+
		"\f\21\16\21\u00b2\13\21\3\22\3\22\3\22\3\22\7\22\u00b8\n\22\f\22\16\22"+
		"\u00bb\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3"+
		")\3)\7)\u00fd\n)\f)\16)\u0100\13)\3*\3*\3*\5*\u0105\n*\3+\6+\u0108\n+"+
		"\r+\16+\u0109\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\7\3\2\62;\3\2"+
		"$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0114\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3"+
		"\2\2\2\5a\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13p\3\2\2\2\rt\3\2\2\2\17z\3\2"+
		"\2\2\21\u0081\3\2\2\2\23\u0084\3\2\2\2\25\u0088\3\2\2\2\27\u008f\3\2\2"+
		"\2\31\u0092\3\2\2\2\33\u0097\3\2\2\2\35\u009c\3\2\2\2\37\u00a3\3\2\2\2"+
		"!\u00a8\3\2\2\2#\u00b3\3\2\2\2%\u00be\3\2\2\2\'\u00c3\3\2\2\2)\u00c9\3"+
		"\2\2\2+\u00cb\3\2\2\2-\u00cd\3\2\2\2/\u00cf\3\2\2\2\61\u00d1\3\2\2\2\63"+
		"\u00d3\3\2\2\2\65\u00d5\3\2\2\2\67\u00d7\3\2\2\29\u00d9\3\2\2\2;\u00db"+
		"\3\2\2\2=\u00dd\3\2\2\2?\u00e0\3\2\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E"+
		"\u00e7\3\2\2\2G\u00ea\3\2\2\2I\u00ee\3\2\2\2K\u00f1\3\2\2\2M\u00f5\3\2"+
		"\2\2O\u00f8\3\2\2\2Q\u00fa\3\2\2\2S\u0101\3\2\2\2U\u0107\3\2\2\2WX\7r"+
		"\2\2XY\7t\2\2YZ\7q\2\2Z[\7v\2\2[\\\7g\2\2\\]\7e\2\2]^\7v\2\2^_\7g\2\2"+
		"_`\7f\2\2`\4\3\2\2\2ab\7r\2\2bc\7w\2\2cd\7d\2\2de\7n\2\2ef\7k\2\2fg\7"+
		"e\2\2g\6\3\2\2\2hi\7.\2\2i\b\3\2\2\2jk\7e\2\2kl\7n\2\2lm\7c\2\2mn\7u\2"+
		"\2no\7u\2\2o\n\3\2\2\2pq\7k\2\2qr\7p\2\2rs\7v\2\2s\f\3\2\2\2tu\7h\2\2"+
		"uv\7n\2\2vw\7q\2\2wx\7c\2\2xy\7v\2\2y\16\3\2\2\2z{\7u\2\2{|\7v\2\2|}\7"+
		"t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7i\2\2\u0080\20\3\2\2\2\u0081\u0082"+
		"\7K\2\2\u0082\u0083\7p\2\2\u0083\22\3\2\2\2\u0084\u0085\7Q\2\2\u0085\u0086"+
		"\7w\2\2\u0086\u0087\7v\2\2\u0087\24\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a"+
		"\7o\2\2\u008a\u008b\7r\2\2\u008b\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d"+
		"\u008e\7v\2\2\u008e\26\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7h\2\2\u0091"+
		"\30\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7j\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u0096\7p\2\2\u0096\32\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b\34\3\2\2\2\u009c\u009d\7y\2\2\u009d"+
		"\u009e\7j\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7g\2\2"+
		"\u00a1\36\3\2\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6 \3\2\2\2\u00a7"+
		"\u00a9\t\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b0\7\60\2\2\u00ad"+
		"\u00af\t\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b9"+
		"\7$\2\2\u00b4\u00b8\n\3\2\2\u00b5\u00b6\7^\2\2\u00b6\u00b8\7$\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7$\2\2\u00bd$\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0"+
		"\u00c1\7w\2\2\u00c1\u00c2\7g\2\2\u00c2&\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4"+
		"\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2"+
		"\u00c8(\3\2\2\2\u00c9\u00ca\7\177\2\2\u00ca*\3\2\2\2\u00cb\u00cc\7}\2"+
		"\2\u00cc,\3\2\2\2\u00cd\u00ce\7+\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7*\2\2"+
		"\u00d0\60\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7/\2"+
		"\2\u00d4\64\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7"+
		"\61\2\2\u00d88\3\2\2\2\u00d9\u00da\7\'\2\2\u00da:\3\2\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc<\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df\7?\2\2\u00df>\3"+
		"\2\2\2\u00e0\u00e1\7@\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3B\3\2"+
		"\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7?\2\2\u00e6D\3\2\2\2\u00e7\u00e8"+
		"\7@\2\2\u00e8\u00e9\7?\2\2\u00e9F\3\2\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec"+
		"\7p\2\2\u00ec\u00ed\7f\2\2\u00edH\3\2\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0"+
		"\7t\2\2\u00f0J\3\2\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4"+
		"\7v\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6\u00f7\7?\2\2\u00f7N\3"+
		"\2\2\2\u00f8\u00f9\7=\2\2\u00f9P\3\2\2\2\u00fa\u00fe\t\4\2\2\u00fb\u00fd"+
		"\t\5\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ffR\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0104\5Q)\2\u0102"+
		"\u0103\7\60\2\2\u0103\u0105\5Q)\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105T\3\2\2\2\u0106\u0108\t\6\2\2\u0107\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\b+\2\2\u010cV\3\2\2\2\13\2\u00a5\u00aa\u00b0\u00b7\u00b9\u00fe"+
		"\u0104\u0109\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}