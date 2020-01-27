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
		MC_IN=8, MC_OUT=9, MC_IMPORT=10, MC_IF=11, MC_THENE=12, MC_ELSE=13, INT=14, 
		FLOAT=15, STRING=16, TRUE=17, FALSE=18, ACO_D=19, ACO_G=20, PAR_D=21, 
		PAR_G=22, PLUS=23, MINUS=24, MUL=25, DIV=26, MOD=27, EQ=28, NEQ=29, GT=30, 
		LT=31, LET=32, GET=33, AND=34, OR=35, NOT=36, ASSIGN=37, PV=38, IDF=39, 
		BIB=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MC_CLASS", "MC_INT", "MC_FLOAT", "MC_STRING", 
			"MC_IN", "MC_OUT", "MC_IMPORT", "MC_IF", "MC_THENE", "MC_ELSE", "INT", 
			"FLOAT", "STRING", "TRUE", "FALSE", "ACO_D", "ACO_G", "PAR_D", "PAR_G", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "EQ", "NEQ", "GT", "LT", "LET", 
			"GET", "AND", "OR", "NOT", "ASSIGN", "PV", "IDF", "BIB", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'protected'", "'public'", "','", "'sj_class'", "'sj_int'", "'sj_float'", 
			"'sj_string'", "'sj_In'", "'sj_Out'", "'import'", "'si'", "'alors'", 
			"'sinon'", null, null, null, "'true'", "'false'", "'}'", "'{'", "')'", 
			"'('", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'=/='", "'>'", "'<'", 
			"'<='", "'>='", "'and'", "'or'", "'not'", "':='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MC_CLASS", "MC_INT", "MC_FLOAT", "MC_STRING", 
			"MC_IN", "MC_OUT", "MC_IMPORT", "MC_IF", "MC_THENE", "MC_ELSE", "INT", 
			"FLOAT", "STRING", "TRUE", "FALSE", "ACO_D", "ACO_G", "PAR_D", "PAR_G", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "EQ", "NEQ", "GT", "LT", "LET", 
			"GET", "AND", "OR", "NOT", "ASSIGN", "PV", "IDF", "BIB", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\6\17\u00b0\n\17\r\17\16\17\u00b1\3\20\6\20\u00b5\n\20"+
		"\r\20\16\20\u00b6\3\20\3\20\7\20\u00bb\n\20\f\20\16\20\u00be\13\20\3\21"+
		"\3\21\3\21\3\21\7\21\u00c4\n\21\f\21\16\21\u00c7\13\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\7(\u010a\n(\f("+
		"\16(\u010d\13(\3)\3)\3)\5)\u0112\n)\3*\6*\u0115\n*\r*\16*\u0116\3*\3*"+
		"\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\7\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;"+
		"C\\aac|\5\2\13\f\17\17\"\"\2\u0121\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5_\3\2\2\2\7f\3\2\2\2\th\3"+
		"\2\2\2\13q\3\2\2\2\rx\3\2\2\2\17\u0081\3\2\2\2\21\u008b\3\2\2\2\23\u0091"+
		"\3\2\2\2\25\u0098\3\2\2\2\27\u009f\3\2\2\2\31\u00a2\3\2\2\2\33\u00a8\3"+
		"\2\2\2\35\u00af\3\2\2\2\37\u00b4\3\2\2\2!\u00bf\3\2\2\2#\u00ca\3\2\2\2"+
		"%\u00cf\3\2\2\2\'\u00d5\3\2\2\2)\u00d7\3\2\2\2+\u00d9\3\2\2\2-\u00db\3"+
		"\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63\u00e1\3\2\2\2\65\u00e3\3\2\2"+
		"\2\67\u00e5\3\2\2\29\u00e7\3\2\2\2;\u00e9\3\2\2\2=\u00ed\3\2\2\2?\u00ef"+
		"\3\2\2\2A\u00f1\3\2\2\2C\u00f4\3\2\2\2E\u00f7\3\2\2\2G\u00fb\3\2\2\2I"+
		"\u00fe\3\2\2\2K\u0102\3\2\2\2M\u0105\3\2\2\2O\u0107\3\2\2\2Q\u010e\3\2"+
		"\2\2S\u0114\3\2\2\2UV\7r\2\2VW\7t\2\2WX\7q\2\2XY\7v\2\2YZ\7g\2\2Z[\7e"+
		"\2\2[\\\7v\2\2\\]\7g\2\2]^\7f\2\2^\4\3\2\2\2_`\7r\2\2`a\7w\2\2ab\7d\2"+
		"\2bc\7n\2\2cd\7k\2\2de\7e\2\2e\6\3\2\2\2fg\7.\2\2g\b\3\2\2\2hi\7u\2\2"+
		"ij\7l\2\2jk\7a\2\2kl\7e\2\2lm\7n\2\2mn\7c\2\2no\7u\2\2op\7u\2\2p\n\3\2"+
		"\2\2qr\7u\2\2rs\7l\2\2st\7a\2\2tu\7k\2\2uv\7p\2\2vw\7v\2\2w\f\3\2\2\2"+
		"xy\7u\2\2yz\7l\2\2z{\7a\2\2{|\7h\2\2|}\7n\2\2}~\7q\2\2~\177\7c\2\2\177"+
		"\u0080\7v\2\2\u0080\16\3\2\2\2\u0081\u0082\7u\2\2\u0082\u0083\7l\2\2\u0083"+
		"\u0084\7a\2\2\u0084\u0085\7u\2\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2"+
		"\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a\7i\2\2\u008a\20\3\2"+
		"\2\2\u008b\u008c\7u\2\2\u008c\u008d\7l\2\2\u008d\u008e\7a\2\2\u008e\u008f"+
		"\7K\2\2\u008f\u0090\7p\2\2\u0090\22\3\2\2\2\u0091\u0092\7u\2\2\u0092\u0093"+
		"\7l\2\2\u0093\u0094\7a\2\2\u0094\u0095\7Q\2\2\u0095\u0096\7w\2\2\u0096"+
		"\u0097\7v\2\2\u0097\24\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7o\2\2\u009a"+
		"\u009b\7r\2\2\u009b\u009c\7q\2\2\u009c\u009d\7t\2\2\u009d\u009e\7v\2\2"+
		"\u009e\26\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7k\2\2\u00a1\30\3\2\2"+
		"\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7t\2\2\u00a6\u00a7\7u\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa"+
		"\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\34\3\2\2\2\u00ae\u00b0\t\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2"+
		"\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\36\3\2\2\2\u00b3\u00b5"+
		"\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\7\60\2\2\u00b9\u00bb\t"+
		"\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd \3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c5\7$\2\2\u00c0"+
		"\u00c4\n\3\2\2\u00c1\u00c2\7^\2\2\u00c2\u00c4\7$\2\2\u00c3\u00c0\3\2\2"+
		"\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7$\2\2\u00c9"+
		"\"\3\2\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7w\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7c\2\2\u00d1"+
		"\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2\2\u00d4&\3\2\2\2\u00d5"+
		"\u00d6\7\177\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7}\2\2\u00d8*\3\2\2\2\u00d9"+
		"\u00da\7+\2\2\u00da,\3\2\2\2\u00db\u00dc\7*\2\2\u00dc.\3\2\2\2\u00dd\u00de"+
		"\7-\2\2\u00de\60\3\2\2\2\u00df\u00e0\7/\2\2\u00e0\62\3\2\2\2\u00e1\u00e2"+
		"\7,\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4\66\3\2\2\2\u00e5\u00e6"+
		"\7\'\2\2\u00e68\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8:\3\2\2\2\u00e9\u00ea"+
		"\7?\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\7?\2\2\u00ec<\3\2\2\2\u00ed\u00ee"+
		"\7@\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0@\3\2\2\2\u00f1\u00f2\7"+
		">\2\2\u00f2\u00f3\7?\2\2\u00f3B\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa"+
		"\7f\2\2\u00faF\3\2\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7t\2\2\u00fdH\3"+
		"\2\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7v\2\2\u0101"+
		"J\3\2\2\2\u0102\u0103\7<\2\2\u0103\u0104\7?\2\2\u0104L\3\2\2\2\u0105\u0106"+
		"\7=\2\2\u0106N\3\2\2\2\u0107\u010b\t\4\2\2\u0108\u010a\t\5\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"P\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0111\5O(\2\u010f\u0110\7\60\2\2\u0110"+
		"\u0112\5O(\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112R\3\2\2\2\u0113"+
		"\u0115\t\6\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b*\2\2\u0119"+
		"T\3\2\2\2\13\2\u00b1\u00b6\u00bc\u00c3\u00c5\u010b\u0111\u0116\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}