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
			null, "'protected'", "'public'", "','", "'sj_class'", "'sj_int'", "'sj_float'", 
			"'sj_string'", "'sj_In'", "'sj_Out'", "'import'", "'si'", "'alors'", 
			"'sinon'", "'while'", null, null, null, "'true'", "'false'", "'}'", "'{'", 
			"')'", "'('", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'!='", "'>'", 
			"'<'", "'<='", "'>='", "'and'", "'or'", "'not'", "':='", "';'"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0121\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00b8\n\20\r\20"+
		"\16\20\u00b9\3\21\6\21\u00bd\n\21\r\21\16\21\u00be\3\21\3\21\7\21\u00c3"+
		"\n\21\f\21\16\21\u00c6\13\21\3\22\3\22\3\22\3\22\7\22\u00cc\n\22\f\22"+
		"\16\22\u00cf\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3)\3)\7)\u0111\n)\f)\16)\u0114\13)\3*\3*\3*\5*\u0119\n*\3+\6+\u011c"+
		"\n+\r+\16+\u011d\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\7\3\2\62;\3"+
		"\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0128\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W"+
		"\3\2\2\2\5a\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13s\3\2\2\2\rz\3\2\2\2\17\u0083"+
		"\3\2\2\2\21\u008d\3\2\2\2\23\u0093\3\2\2\2\25\u009a\3\2\2\2\27\u00a1\3"+
		"\2\2\2\31\u00a4\3\2\2\2\33\u00aa\3\2\2\2\35\u00b0\3\2\2\2\37\u00b7\3\2"+
		"\2\2!\u00bc\3\2\2\2#\u00c7\3\2\2\2%\u00d2\3\2\2\2\'\u00d7\3\2\2\2)\u00dd"+
		"\3\2\2\2+\u00df\3\2\2\2-\u00e1\3\2\2\2/\u00e3\3\2\2\2\61\u00e5\3\2\2\2"+
		"\63\u00e7\3\2\2\2\65\u00e9\3\2\2\2\67\u00eb\3\2\2\29\u00ed\3\2\2\2;\u00ef"+
		"\3\2\2\2=\u00f1\3\2\2\2?\u00f4\3\2\2\2A\u00f6\3\2\2\2C\u00f8\3\2\2\2E"+
		"\u00fb\3\2\2\2G\u00fe\3\2\2\2I\u0102\3\2\2\2K\u0105\3\2\2\2M\u0109\3\2"+
		"\2\2O\u010c\3\2\2\2Q\u010e\3\2\2\2S\u0115\3\2\2\2U\u011b\3\2\2\2WX\7r"+
		"\2\2XY\7t\2\2YZ\7q\2\2Z[\7v\2\2[\\\7g\2\2\\]\7e\2\2]^\7v\2\2^_\7g\2\2"+
		"_`\7f\2\2`\4\3\2\2\2ab\7r\2\2bc\7w\2\2cd\7d\2\2de\7n\2\2ef\7k\2\2fg\7"+
		"e\2\2g\6\3\2\2\2hi\7.\2\2i\b\3\2\2\2jk\7u\2\2kl\7l\2\2lm\7a\2\2mn\7e\2"+
		"\2no\7n\2\2op\7c\2\2pq\7u\2\2qr\7u\2\2r\n\3\2\2\2st\7u\2\2tu\7l\2\2uv"+
		"\7a\2\2vw\7k\2\2wx\7p\2\2xy\7v\2\2y\f\3\2\2\2z{\7u\2\2{|\7l\2\2|}\7a\2"+
		"\2}~\7h\2\2~\177\7n\2\2\177\u0080\7q\2\2\u0080\u0081\7c\2\2\u0081\u0082"+
		"\7v\2\2\u0082\16\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085\7l\2\2\u0085\u0086"+
		"\7a\2\2\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7i\2\2\u008c\20\3\2\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7l\2\2\u008f\u0090\7a\2\2\u0090\u0091\7K\2\2"+
		"\u0091\u0092\7p\2\2\u0092\22\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7"+
		"l\2\2\u0095\u0096\7a\2\2\u0096\u0097\7Q\2\2\u0097\u0098\7w\2\2\u0098\u0099"+
		"\7v\2\2\u0099\24\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7o\2\2\u009c\u009d"+
		"\7r\2\2\u009d\u009e\7q\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\26\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7k\2\2\u00a3\30\3\2\2\2\u00a4"+
		"\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7t\2\2"+
		"\u00a8\u00a9\7u\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7"+
		"k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p\2\2\u00af\34"+
		"\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b5\36\3\2\2\2\u00b6\u00b8\t\2\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba \3\2\2\2\u00bb\u00bd\t\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c4\7\60\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\"\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c7\u00cd\7$\2\2\u00c8\u00cc\n\3\2\2\u00c9\u00ca"+
		"\7^\2\2\u00ca\u00cc\7$\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1$\3\2\2\2\u00d2\u00d3"+
		"\7v\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"&\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da"+
		"\u00db\7u\2\2\u00db\u00dc\7g\2\2\u00dc(\3\2\2\2\u00dd\u00de\7\177\2\2"+
		"\u00de*\3\2\2\2\u00df\u00e0\7}\2\2\u00e0,\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2"+
		".\3\2\2\2\u00e3\u00e4\7*\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7-\2\2\u00e6"+
		"\62\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea"+
		"\66\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec8\3\2\2\2\u00ed\u00ee\7\'\2\2\u00ee"+
		":\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2\u00f3"+
		"\7?\2\2\u00f3>\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7"+
		">\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa\7?\2\2\u00faD\3\2"+
		"\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7?\2\2\u00fdF\3\2\2\2\u00fe\u00ff"+
		"\7c\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7f\2\2\u0101H\3\2\2\2\u0102\u0103"+
		"\7q\2\2\u0103\u0104\7t\2\2\u0104J\3\2\2\2\u0105\u0106\7p\2\2\u0106\u0107"+
		"\7q\2\2\u0107\u0108\7v\2\2\u0108L\3\2\2\2\u0109\u010a\7<\2\2\u010a\u010b"+
		"\7?\2\2\u010bN\3\2\2\2\u010c\u010d\7=\2\2\u010dP\3\2\2\2\u010e\u0112\t"+
		"\4\2\2\u010f\u0111\t\5\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113R\3\2\2\2\u0114\u0112\3\2\2\2"+
		"\u0115\u0118\5Q)\2\u0116\u0117\7\60\2\2\u0117\u0119\5Q)\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119T\3\2\2\2\u011a\u011c\t\6\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b+\2\2\u0120V\3\2\2\2\13\2\u00b9"+
		"\u00be\u00c4\u00cb\u00cd\u0112\u0118\u011d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}