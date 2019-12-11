// Generated from /home/temp/IdeaProjects/AntlrExps/src/MyLang/myLang.g4 by ANTLR 4.7.2
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
		MC_IN=8, MC_OUT=9, MC_IMPORT=10, MC_IF=11, MC_THENE=12, MC_ELSE=13, INT=14, 
		FLOAT=15, STRING=16, TRUE=17, FALSE=18, ACO_D=19, ACO_G=20, PAR_D=21, 
		PAR_G=22, PLUS=23, MINUS=24, MUL=25, DIV=26, MOD=27, EQ=28, NEQ=29, GT=30, 
		LT=31, LET=32, GET=33, AND=34, OR=35, NOT=36, ASSIGN=37, PV=38, IDF=39, 
		BIB=40, WS=41;
	public static final int
		RULE_s = 0, RULE_imports = 1, RULE_methode = 2, RULE_inst = 3, RULE_dec = 4, 
		RULE_type = 5, RULE_affect = 6, RULE_si = 7, RULE_si_a = 8, RULE_si_b = 9, 
		RULE_exp = 10, RULE_terminal = 11, RULE_output = 12, RULE_input = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "imports", "methode", "inst", "dec", "type", "affect", "si", "si_a", 
			"si_b", "exp", "terminal", "output", "input"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MC_IMPORT) {
				{
				{
				setState(28);
				imports();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(34);
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

			setState(37);
			match(MC_CLASS);
			setState(38);
			match(IDF);
			setState(39);
			match(ACO_G);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				methode();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDF );
			setState(45);
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
			setState(47);
			match(MC_IMPORT);
			setState(48);
			match(BIB);
			setState(49);
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
			setState(51);
			match(IDF);
			setState(52);
			match(ACO_G);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				inst();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << IDF))) != 0) );
			setState(58);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				affect();
				setState(61);
				match(PV);
				}
				break;
			case MC_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				input();
				}
				break;
			case MC_OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				output();
				}
				break;
			case MC_INT:
			case MC_FLOAT:
			case MC_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				dec();
				setState(66);
				match(PV);
				}
				break;
			case MC_IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				si();
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
			setState(71);
			type();
			{
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(72);
						affect();
						setState(73);
						match(T__2);
						}
						break;
					case 2:
						{
						setState(75);
						match(IDF);
						setState(76);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(82);
				affect();
				}
				break;
			case 2:
				{
				setState(83);
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
			setState(86);
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
			setState(88);
			match(IDF);
			setState(89);
			match(ASSIGN);
			setState(90);
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
		public List<TerminalNode> MC_ELSE() { return getTokens(myLangParser.MC_ELSE); }
		public TerminalNode MC_ELSE(int i) {
			return getToken(myLangParser.MC_ELSE, i);
		}
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
			setState(92);
			match(MC_IF);
			setState(93);
			match(PAR_G);
			setState(94);
			exp(0);
			setState(95);
			match(PAR_D);
			setState(96);
			si_a();
			setState(97);
			match(MC_THENE);
			setState(98);
			match(ACO_G);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				inst();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << IDF))) != 0) );
			setState(104);
			match(ACO_D);
			setState(105);
			si_b();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MC_ELSE) {
				{
				{
				setState(106);
				match(MC_ELSE);
				setState(107);
				match(ACO_G);
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					inst();
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << IDF))) != 0) );
				setState(113);
				match(ACO_D);
				}
				}
				setState(119);
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
		public TerminalNode MUL() { return getToken(myLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(myLangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(myLangParser.MOD, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(125);
				match(MINUS);
				setState(126);
				exp(4);
				}
				break;
			case NOT:
				{
				setState(127);
				match(NOT);
				setState(128);
				exp(3);
				}
				break;
			case PAR_G:
				{
				setState(129);
				match(PAR_G);
				setState(130);
				exp(0);
				setState(131);
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
				setState(133);
				terminal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(136);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(137);
						match(MUL);
						setState(138);
						exp(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(139);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(140);
						match(DIV);
						setState(141);
						exp(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(142);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(143);
						match(MOD);
						setState(144);
						exp(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(145);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(146);
						match(PLUS);
						setState(147);
						exp(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(148);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(149);
						match(MINUS);
						setState(150);
						exp(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(151);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(152);
						match(AND);
						setState(153);
						exp(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(154);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(155);
						match(OR);
						setState(156);
						exp(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(157);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(158);
						match(EQ);
						setState(159);
						exp(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(160);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(161);
						match(NEQ);
						setState(162);
						exp(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(163);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(164);
						match(LET);
						setState(165);
						exp(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(166);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(167);
						match(GET);
						setState(168);
						exp(8);
						}
						break;
					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(169);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(170);
						match(GT);
						setState(171);
						exp(7);
						}
						break;
					case 13:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(172);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(173);
						match(LT);
						setState(174);
						exp(6);
						}
						break;
					}
					} 
				}
				setState(179);
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
		enterRule(_localctx, 22, RULE_terminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 24, RULE_output);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(MC_OUT);
			setState(183);
			match(PAR_G);
			setState(184);
			match(STRING);
			setState(185);
			match(T__2);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					exp(0);
					setState(187);
					match(T__2);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(194);
			exp(0);
			setState(195);
			match(PAR_D);
			setState(196);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PAR_D() { return getToken(myLangParser.PAR_D, 0); }
		public TerminalNode PV() { return getToken(myLangParser.PV, 0); }
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
		enterRule(_localctx, 26, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(MC_IN);
			setState(199);
			match(PAR_G);
			setState(200);
			exp(0);
			setState(201);
			match(PAR_D);
			setState(202);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\5\2&\n\2\3\2\3\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\6\49\n\4\r\4\16\4:\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\3\6\3"+
		"\6\5\6W\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6"+
		"\tg\n\t\r\t\16\th\3\t\3\t\3\t\3\t\3\t\6\tp\n\t\r\t\16\tq\3\t\3\t\7\tv"+
		"\n\t\f\t\16\ty\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0089\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b2\n\f\f\f\16\f\u00b5\13"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c0\n\16\f\16\16"+
		"\16\u00c3\13\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\2\3\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\3\2\3\4\3\2\7\t\4\2"+
		"\20\24))\2\u00df\2!\3\2\2\2\4\61\3\2\2\2\6\65\3\2\2\2\bG\3\2\2\2\nI\3"+
		"\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20^\3\2\2\2\22z\3\2\2\2\24|\3\2\2\2\26\u0088"+
		"\3\2\2\2\30\u00b6\3\2\2\2\32\u00b8\3\2\2\2\34\u00c8\3\2\2\2\36 \5\4\3"+
		"\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"%\3\2\2\2#!\3\2\2\2"+
		"$&\t\2\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\6\2\2()\7)\2\2)+\7\26\2"+
		"\2*,\5\6\4\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\25"+
		"\2\2\60\3\3\2\2\2\61\62\7\f\2\2\62\63\7*\2\2\63\64\7(\2\2\64\5\3\2\2\2"+
		"\65\66\7)\2\2\668\7\26\2\2\679\5\b\5\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2"+
		":;\3\2\2\2;<\3\2\2\2<=\7\25\2\2=\7\3\2\2\2>?\5\16\b\2?@\7(\2\2@H\3\2\2"+
		"\2AH\5\34\17\2BH\5\32\16\2CD\5\n\6\2DE\7(\2\2EH\3\2\2\2FH\5\20\t\2G>\3"+
		"\2\2\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2GF\3\2\2\2H\t\3\2\2\2IQ\5\f\7\2JK"+
		"\5\16\b\2KL\7\5\2\2LP\3\2\2\2MN\7)\2\2NP\7\5\2\2OJ\3\2\2\2OM\3\2\2\2P"+
		"S\3\2\2\2QO\3\2\2\2QR\3\2\2\2RV\3\2\2\2SQ\3\2\2\2TW\5\16\b\2UW\7)\2\2"+
		"VT\3\2\2\2VU\3\2\2\2W\13\3\2\2\2XY\t\3\2\2Y\r\3\2\2\2Z[\7)\2\2[\\\7\'"+
		"\2\2\\]\5\26\f\2]\17\3\2\2\2^_\7\r\2\2_`\7\30\2\2`a\5\26\f\2ab\7\27\2"+
		"\2bc\5\22\n\2cd\7\16\2\2df\7\26\2\2eg\5\b\5\2fe\3\2\2\2gh\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\25\2\2kw\5\24\13\2lm\7\17\2\2mo\7\26\2"+
		"\2np\5\b\5\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\25"+
		"\2\2tv\3\2\2\2ul\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\21\3\2\2\2yw\3"+
		"\2\2\2z{\3\2\2\2{\23\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~\177\b\f\1\2\177\u0080"+
		"\7\32\2\2\u0080\u0089\5\26\f\6\u0081\u0082\7&\2\2\u0082\u0089\5\26\f\5"+
		"\u0083\u0084\7\30\2\2\u0084\u0085\5\26\f\2\u0085\u0086\7\27\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0089\5\30\r\2\u0088~\3\2\2\2\u0088\u0081\3\2\2\2"+
		"\u0088\u0083\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u00b3\3\2\2\2\u008a\u008b"+
		"\f\23\2\2\u008b\u008c\7\33\2\2\u008c\u00b2\5\26\f\24\u008d\u008e\f\22"+
		"\2\2\u008e\u008f\7\34\2\2\u008f\u00b2\5\26\f\23\u0090\u0091\f\21\2\2\u0091"+
		"\u0092\7\35\2\2\u0092\u00b2\5\26\f\22\u0093\u0094\f\20\2\2\u0094\u0095"+
		"\7\31\2\2\u0095\u00b2\5\26\f\21\u0096\u0097\f\17\2\2\u0097\u0098\7\32"+
		"\2\2\u0098\u00b2\5\26\f\20\u0099\u009a\f\16\2\2\u009a\u009b\7$\2\2\u009b"+
		"\u00b2\5\26\f\17\u009c\u009d\f\r\2\2\u009d\u009e\7%\2\2\u009e\u00b2\5"+
		"\26\f\16\u009f\u00a0\f\f\2\2\u00a0\u00a1\7\36\2\2\u00a1\u00b2\5\26\f\r"+
		"\u00a2\u00a3\f\13\2\2\u00a3\u00a4\7\37\2\2\u00a4\u00b2\5\26\f\f\u00a5"+
		"\u00a6\f\n\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00b2\5\26\f\13\u00a8\u00a9\f"+
		"\t\2\2\u00a9\u00aa\7#\2\2\u00aa\u00b2\5\26\f\n\u00ab\u00ac\f\b\2\2\u00ac"+
		"\u00ad\7 \2\2\u00ad\u00b2\5\26\f\t\u00ae\u00af\f\7\2\2\u00af\u00b0\7!"+
		"\2\2\u00b0\u00b2\5\26\f\b\u00b1\u008a\3\2\2\2\u00b1\u008d\3\2\2\2\u00b1"+
		"\u0090\3\2\2\2\u00b1\u0093\3\2\2\2\u00b1\u0096\3\2\2\2\u00b1\u0099\3\2"+
		"\2\2\u00b1\u009c\3\2\2\2\u00b1\u009f\3\2\2\2\u00b1\u00a2\3\2\2\2\u00b1"+
		"\u00a5\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ae\3\2"+
		"\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\27\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\t\4\2\2\u00b7\31\3\2\2\2\u00b8"+
		"\u00b9\7\13\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00c1"+
		"\7\5\2\2\u00bc\u00bd\5\26\f\2\u00bd\u00be\7\5\2\2\u00be\u00c0\3\2\2\2"+
		"\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5\26\f\2"+
		"\u00c5\u00c6\7\27\2\2\u00c6\u00c7\7(\2\2\u00c7\33\3\2\2\2\u00c8\u00c9"+
		"\7\n\2\2\u00c9\u00ca\7\30\2\2\u00ca\u00cb\5\26\f\2\u00cb\u00cc\7\27\2"+
		"\2\u00cc\u00cd\7(\2\2\u00cd\35\3\2\2\2\21!%-:GOQVhqw\u0088\u00b1\u00b3"+
		"\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}