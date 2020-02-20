// Generated from /home/oussama/IdeaProjects/AntlrExps/src/MyLang/myLang.g4 by ANTLR 4.7.2
package MyLang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myLangParser extends Parser {
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
	public static final int
		RULE_s = 0, RULE_imports = 1, RULE_methode = 2, RULE_inst = 3, RULE_dec = 4, 
		RULE_type = 5, RULE_affect = 6, RULE_si = 7, RULE_si_a = 8, RULE_si_b = 9, 
		RULE_while_ = 10, RULE_while_a = 11, RULE_while_b = 12, RULE_exp = 13, 
		RULE_terminal = 14, RULE_output = 15, RULE_input = 16, RULE_io_a = 17, 
		RULE_io_b = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "imports", "methode", "inst", "dec", "type", "affect", "si", "si_a", 
			"si_b", "while_", "while_a", "while_b", "exp", "terminal", "output", 
			"input", "io_a", "io_b"
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

	@Override
	public String getGrammarFileName() { return "myLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public TerminalNode MC_CLASS() { return getToken(myLangParser.MC_CLASS, 0); }
		public TerminalNode IDF() { return getToken(myLangParser.IDF, 0); }
		public TerminalNode ACO_G() { return getToken(myLangParser.ACO_G, 0); }
		public TerminalNode ACO_D() { return getToken(myLangParser.ACO_D, 0); }
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(myLangParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(myLangParser.PV, i);
		}
		public List<MethodeContext> methode() {
			return getRuleContexts(MethodeContext.class);
		}
		public MethodeContext methode(int i) {
			return getRuleContext(MethodeContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MC_IMPORT) {
				{
				{
				setState(38);
				imports();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(44);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(47);
			match(MC_CLASS);
			setState(48);
			match(IDF);
			setState(49);
			match(ACO_G);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING))) != 0)) {
				{
				{
				setState(50);
				dec();
				setState(51);
				match(PV);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				methode();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDF );
			setState(63);
			match(ACO_D);
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

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode MC_IMPORT() { return getToken(myLangParser.MC_IMPORT, 0); }
		public TerminalNode BIB() { return getToken(myLangParser.BIB, 0); }
		public TerminalNode PV() { return getToken(myLangParser.PV, 0); }
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitImports(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(MC_IMPORT);
			setState(66);
			match(BIB);
			setState(67);
			match(PV);
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

	public static class MethodeContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(myLangParser.IDF, 0); }
		public TerminalNode ACO_G() { return getToken(myLangParser.ACO_G, 0); }
		public TerminalNode ACO_D() { return getToken(myLangParser.ACO_D, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public MethodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterMethode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitMethode(this);
		}
	}

	public final MethodeContext methode() throws RecognitionException {
		MethodeContext _localctx = new MethodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IDF);
			setState(70);
			match(ACO_G);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				inst();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << MC_WHILE) | (1L << IDF))) != 0) );
			setState(76);
			match(ACO_D);
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

	public static class InstContext extends ParserRuleContext {
		public AffectContext affect() {
			return getRuleContext(AffectContext.class,0);
		}
		public TerminalNode PV() { return getToken(myLangParser.PV, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitInst(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inst);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				affect();
				setState(79);
				match(PV);
				}
				break;
			case MC_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				input();
				}
				break;
			case MC_OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				output();
				}
				break;
			case MC_INT:
			case MC_FLOAT:
			case MC_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				dec();
				setState(84);
				match(PV);
				}
				break;
			case MC_IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				si();
				}
				break;
			case MC_WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				while_();
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

	public static class DecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<AffectContext> affect() {
			return getRuleContexts(AffectContext.class);
		}
		public AffectContext affect(int i) {
			return getRuleContext(AffectContext.class,i);
		}
		public List<TerminalNode> IDF() { return getTokens(myLangParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(myLangParser.IDF, i);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			type();
			{
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(91);
						affect();
						setState(92);
						match(T__2);
						}
						break;
					case 2:
						{
						setState(94);
						match(IDF);
						setState(95);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(101);
				affect();
				}
				break;
			case 2:
				{
				setState(102);
				match(IDF);
				}
				break;
			}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode MC_INT() { return getToken(myLangParser.MC_INT, 0); }
		public TerminalNode MC_FLOAT() { return getToken(myLangParser.MC_FLOAT, 0); }
		public TerminalNode MC_STRING() { return getToken(myLangParser.MC_STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING))) != 0)) ) {
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

	public static class AffectContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(myLangParser.IDF, 0); }
		public TerminalNode ASSIGN() { return getToken(myLangParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterAffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitAffect(this);
		}
	}

	public final AffectContext affect() throws RecognitionException {
		AffectContext _localctx = new AffectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_affect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IDF);
			setState(108);
			match(ASSIGN);
			setState(109);
			exp(0);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode MC_IF() { return getToken(myLangParser.MC_IF, 0); }
		public TerminalNode PAR_G() { return getToken(myLangParser.PAR_G, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PAR_D() { return getToken(myLangParser.PAR_D, 0); }
		public Si_aContext si_a() {
			return getRuleContext(Si_aContext.class,0);
		}
		public TerminalNode MC_THENE() { return getToken(myLangParser.MC_THENE, 0); }
		public List<TerminalNode> ACO_G() { return getTokens(myLangParser.ACO_G); }
		public TerminalNode ACO_G(int i) {
			return getToken(myLangParser.ACO_G, i);
		}
		public List<TerminalNode> ACO_D() { return getTokens(myLangParser.ACO_D); }
		public TerminalNode ACO_D(int i) {
			return getToken(myLangParser.ACO_D, i);
		}
		public Si_bContext si_b() {
			return getRuleContext(Si_bContext.class,0);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public TerminalNode MC_ELSE() { return getToken(myLangParser.MC_ELSE, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(MC_IF);
			setState(112);
			match(PAR_G);
			setState(113);
			exp(0);
			setState(114);
			match(PAR_D);
			setState(115);
			si_a();
			setState(116);
			match(MC_THENE);
			setState(117);
			match(ACO_G);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				inst();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << MC_WHILE) | (1L << IDF))) != 0) );
			setState(123);
			match(ACO_D);
			setState(124);
			si_b();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MC_ELSE) {
				{
				setState(125);
				match(MC_ELSE);
				setState(126);
				match(ACO_G);
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					inst();
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << MC_WHILE) | (1L << IDF))) != 0) );
				setState(132);
				match(ACO_D);
				}
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

	public static class Si_aContext extends ParserRuleContext {
		public Si_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterSi_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitSi_a(this);
		}
	}

	public final Si_aContext si_a() throws RecognitionException {
		Si_aContext _localctx = new Si_aContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_si_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Si_bContext extends ParserRuleContext {
		public Si_bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterSi_b(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitSi_b(this);
		}
	}

	public final Si_bContext si_b() throws RecognitionException {
		Si_bContext _localctx = new Si_bContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_si_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class While_Context extends ParserRuleContext {
		public TerminalNode MC_WHILE() { return getToken(myLangParser.MC_WHILE, 0); }
		public While_aContext while_a() {
			return getRuleContext(While_aContext.class,0);
		}
		public TerminalNode PAR_G() { return getToken(myLangParser.PAR_G, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PAR_D() { return getToken(myLangParser.PAR_D, 0); }
		public While_bContext while_b() {
			return getRuleContext(While_bContext.class,0);
		}
		public TerminalNode ACO_G() { return getToken(myLangParser.ACO_G, 0); }
		public TerminalNode ACO_D() { return getToken(myLangParser.ACO_D, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitWhile_(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(MC_WHILE);
			setState(141);
			while_a();
			setState(142);
			match(PAR_G);
			setState(143);
			exp(0);
			setState(144);
			match(PAR_D);
			setState(145);
			while_b();
			setState(146);
			match(ACO_G);
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				inst();
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << MC_WHILE) | (1L << IDF))) != 0) );
			setState(152);
			match(ACO_D);
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

	public static class While_aContext extends ParserRuleContext {
		public While_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterWhile_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitWhile_a(this);
		}
	}

	public final While_aContext while_a() throws RecognitionException {
		While_aContext _localctx = new While_aContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class While_bContext extends ParserRuleContext {
		public While_bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterWhile_b(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitWhile_b(this);
		}
	}

	public final While_bContext while_b() throws RecognitionException {
		While_bContext _localctx = new While_bContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(myLangParser.MINUS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NOT() { return getToken(myLangParser.NOT, 0); }
		public TerminalNode PAR_G() { return getToken(myLangParser.PAR_G, 0); }
		public TerminalNode PAR_D() { return getToken(myLangParser.PAR_D, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TerminalNode MOD() { return getToken(myLangParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(myLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(myLangParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(myLangParser.PLUS, 0); }
		public TerminalNode AND() { return getToken(myLangParser.AND, 0); }
		public TerminalNode OR() { return getToken(myLangParser.OR, 0); }
		public TerminalNode EQ() { return getToken(myLangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(myLangParser.NEQ, 0); }
		public TerminalNode LET() { return getToken(myLangParser.LET, 0); }
		public TerminalNode GET() { return getToken(myLangParser.GET, 0); }
		public TerminalNode GT() { return getToken(myLangParser.GT, 0); }
		public TerminalNode LT() { return getToken(myLangParser.LT, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(159);
				match(MINUS);
				setState(160);
				exp(15);
				}
				break;
			case NOT:
				{
				setState(161);
				match(NOT);
				setState(162);
				exp(14);
				}
				break;
			case PAR_G:
				{
				setState(163);
				match(PAR_G);
				setState(164);
				exp(0);
				setState(165);
				match(PAR_D);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case TRUE:
			case FALSE:
			case IDF:
				{
				setState(167);
				terminal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(170);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(171);
						match(MOD);
						setState(172);
						exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(173);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(174);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						exp(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(176);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(177);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						exp(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(179);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(180);
						match(AND);
						setState(181);
						exp(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(182);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(183);
						match(OR);
						setState(184);
						exp(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(185);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(186);
						match(EQ);
						setState(187);
						exp(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(188);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(189);
						match(NEQ);
						setState(190);
						exp(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(191);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(192);
						match(LET);
						setState(193);
						exp(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(194);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(195);
						match(GET);
						setState(196);
						exp(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(197);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(198);
						match(GT);
						setState(199);
						exp(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(200);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(201);
						match(LT);
						setState(202);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(myLangParser.IDF, 0); }
		public TerminalNode INT() { return getToken(myLangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myLangParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(myLangParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(myLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(myLangParser.FALSE, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_terminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << IDF))) != 0)) ) {
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode MC_OUT() { return getToken(myLangParser.MC_OUT, 0); }
		public TerminalNode PAR_G() { return getToken(myLangParser.PAR_G, 0); }
		public TerminalNode STRING() { return getToken(myLangParser.STRING, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PAR_D() { return getToken(myLangParser.PAR_D, 0); }
		public TerminalNode PV() { return getToken(myLangParser.PV, 0); }
		public List<Io_aContext> io_a() {
			return getRuleContexts(Io_aContext.class);
		}
		public Io_aContext io_a(int i) {
			return getRuleContext(Io_aContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(MC_OUT);
			setState(211);
			match(PAR_G);
			setState(212);
			match(STRING);
			setState(213);
			match(T__2);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					exp(0);
					setState(215);
					io_a();
					setState(216);
					match(T__2);
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(223);
			exp(0);
			setState(224);
			match(PAR_D);
			setState(225);
			match(PV);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode MC_IN() { return getToken(myLangParser.MC_IN, 0); }
		public TerminalNode PAR_G() { return getToken(myLangParser.PAR_G, 0); }
		public TerminalNode STRING() { return getToken(myLangParser.STRING, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PAR_D() { return getToken(myLangParser.PAR_D, 0); }
		public TerminalNode PV() { return getToken(myLangParser.PV, 0); }
		public List<Io_bContext> io_b() {
			return getRuleContexts(Io_bContext.class);
		}
		public Io_bContext io_b(int i) {
			return getRuleContext(Io_bContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(MC_IN);
			setState(228);
			match(PAR_G);
			setState(229);
			match(STRING);
			setState(230);
			match(T__2);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					exp(0);
					setState(232);
					io_b();
					setState(233);
					match(T__2);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(240);
			exp(0);
			setState(241);
			match(PAR_D);
			setState(242);
			match(PV);
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

	public static class Io_aContext extends ParserRuleContext {
		public Io_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterIo_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitIo_a(this);
		}
	}

	public final Io_aContext io_a() throws RecognitionException {
		Io_aContext _localctx = new Io_aContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_io_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Io_bContext extends ParserRuleContext {
		public Io_bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterIo_b(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitIo_b(this);
		}
	}

	public final Io_bContext io_b() throws RecognitionException {
		Io_bContext _localctx = new Io_bContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_io_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		case 13:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\5\2\60\n\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\6\2>\n\2\r\2\16\2?\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4K\n\4\r\4\16\4L\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6c\n"+
		"\6\f\6\16\6f\13\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\6\tz\n\t\r\t\16\t{\3\t\3\t\3\t\3\t\3\t\6\t\u0083"+
		"\n\t\r\t\16\t\u0084\3\t\3\t\5\t\u0089\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\6\f\u0097\n\f\r\f\16\f\u0098\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ab"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ce\n\17\f\17\16\17\u00d1\13\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00dd\n\21\f\21"+
		"\16\21\u00e0\13\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\7\22\u00ee\n\22\f\22\16\22\u00f1\13\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\2\3\34\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&\2\7\3\2\3\4\3\2\7\t\3\2\34\35\3\2\32\33\4\2\21\25**\2\u0108\2"+
		"+\3\2\2\2\4C\3\2\2\2\6G\3\2\2\2\bZ\3\2\2\2\n\\\3\2\2\2\fk\3\2\2\2\16m"+
		"\3\2\2\2\20q\3\2\2\2\22\u008a\3\2\2\2\24\u008c\3\2\2\2\26\u008e\3\2\2"+
		"\2\30\u009c\3\2\2\2\32\u009e\3\2\2\2\34\u00aa\3\2\2\2\36\u00d2\3\2\2\2"+
		" \u00d4\3\2\2\2\"\u00e5\3\2\2\2$\u00f6\3\2\2\2&\u00f8\3\2\2\2(*\5\4\3"+
		"\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2.\60\t\2"+
		"\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\6\2\2\62\63\7*\2\2\63"+
		"9\7\27\2\2\64\65\5\n\6\2\65\66\7)\2\2\668\3\2\2\2\67\64\3\2\2\28;\3\2"+
		"\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<>\5\6\4\2=<\3\2\2\2>?\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\26\2\2B\3\3\2\2\2CD\7\f\2\2D"+
		"E\7+\2\2EF\7)\2\2F\5\3\2\2\2GH\7*\2\2HJ\7\27\2\2IK\5\b\5\2JI\3\2\2\2K"+
		"L\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\26\2\2O\7\3\2\2\2PQ\5\16\b"+
		"\2QR\7)\2\2R[\3\2\2\2S[\5\"\22\2T[\5 \21\2UV\5\n\6\2VW\7)\2\2W[\3\2\2"+
		"\2X[\5\20\t\2Y[\5\26\f\2ZP\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZX\3\2"+
		"\2\2ZY\3\2\2\2[\t\3\2\2\2\\d\5\f\7\2]^\5\16\b\2^_\7\5\2\2_c\3\2\2\2`a"+
		"\7*\2\2ac\7\5\2\2b]\3\2\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ei"+
		"\3\2\2\2fd\3\2\2\2gj\5\16\b\2hj\7*\2\2ig\3\2\2\2ih\3\2\2\2j\13\3\2\2\2"+
		"kl\t\3\2\2l\r\3\2\2\2mn\7*\2\2no\7(\2\2op\5\34\17\2p\17\3\2\2\2qr\7\r"+
		"\2\2rs\7\31\2\2st\5\34\17\2tu\7\30\2\2uv\5\22\n\2vw\7\16\2\2wy\7\27\2"+
		"\2xz\5\b\5\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\26"+
		"\2\2~\u0088\5\24\13\2\177\u0080\7\17\2\2\u0080\u0082\7\27\2\2\u0081\u0083"+
		"\5\b\5\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\26\2\2\u0087\u0089\3"+
		"\2\2\2\u0088\177\3\2\2\2\u0088\u0089\3\2\2\2\u0089\21\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d\3\2\2\2\u008d\25\3\2\2\2\u008e\u008f"+
		"\7\20\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7\31\2\2\u0091\u0092\5\34\17"+
		"\2\u0092\u0093\7\30\2\2\u0093\u0094\5\32\16\2\u0094\u0096\7\27\2\2\u0095"+
		"\u0097\5\b\5\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\26\2\2\u009b"+
		"\27\3\2\2\2\u009c\u009d\3\2\2\2\u009d\31\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\33\3\2\2\2\u00a0\u00a1\b\17\1\2\u00a1\u00a2\7\33\2\2\u00a2\u00ab\5\34"+
		"\17\21\u00a3\u00a4\7\'\2\2\u00a4\u00ab\5\34\17\20\u00a5\u00a6\7\31\2\2"+
		"\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7\30\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00ab\5\36\20\2\u00aa\u00a0\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa\u00a5\3"+
		"\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00cf\3\2\2\2\u00ac\u00ad\f\17\2\2\u00ad"+
		"\u00ae\7\36\2\2\u00ae\u00ce\5\34\17\20\u00af\u00b0\f\16\2\2\u00b0\u00b1"+
		"\t\4\2\2\u00b1\u00ce\5\34\17\17\u00b2\u00b3\f\r\2\2\u00b3\u00b4\t\5\2"+
		"\2\u00b4\u00ce\5\34\17\16\u00b5\u00b6\f\f\2\2\u00b6\u00b7\7%\2\2\u00b7"+
		"\u00ce\5\34\17\r\u00b8\u00b9\f\13\2\2\u00b9\u00ba\7&\2\2\u00ba\u00ce\5"+
		"\34\17\f\u00bb\u00bc\f\n\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00ce\5\34\17"+
		"\13\u00be\u00bf\f\t\2\2\u00bf\u00c0\7 \2\2\u00c0\u00ce\5\34\17\n\u00c1"+
		"\u00c2\f\b\2\2\u00c2\u00c3\7#\2\2\u00c3\u00ce\5\34\17\t\u00c4\u00c5\f"+
		"\7\2\2\u00c5\u00c6\7$\2\2\u00c6\u00ce\5\34\17\b\u00c7\u00c8\f\6\2\2\u00c8"+
		"\u00c9\7!\2\2\u00c9\u00ce\5\34\17\7\u00ca\u00cb\f\5\2\2\u00cb\u00cc\7"+
		"\"\2\2\u00cc\u00ce\5\34\17\6\u00cd\u00ac\3\2\2\2\u00cd\u00af\3\2\2\2\u00cd"+
		"\u00b2\3\2\2\2\u00cd\u00b5\3\2\2\2\u00cd\u00b8\3\2\2\2\u00cd\u00bb\3\2"+
		"\2\2\u00cd\u00be\3\2\2\2\u00cd\u00c1\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd"+
		"\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\35\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3"+
		"\t\6\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7\13\2\2\u00d5\u00d6\7\31\2\2\u00d6"+
		"\u00d7\7\23\2\2\u00d7\u00de\7\5\2\2\u00d8\u00d9\5\34\17\2\u00d9\u00da"+
		"\5$\23\2\u00da\u00db\7\5\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e3\7\30\2\2\u00e3"+
		"\u00e4\7)\2\2\u00e4!\3\2\2\2\u00e5\u00e6\7\n\2\2\u00e6\u00e7\7\31\2\2"+
		"\u00e7\u00e8\7\23\2\2\u00e8\u00ef\7\5\2\2\u00e9\u00ea\5\34\17\2\u00ea"+
		"\u00eb\5&\24\2\u00eb\u00ec\7\5\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e9\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5\34\17\2\u00f3\u00f4\7"+
		"\30\2\2\u00f4\u00f5\7)\2\2\u00f5#\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7%\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\'\3\2\2\2\24+/9?LZbdi{\u0084\u0088\u0098"+
		"\u00aa\u00cd\u00cf\u00de\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}