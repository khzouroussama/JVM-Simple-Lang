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
		MC_IN=8, MC_OUT=9, MC_IMPORT=10, MC_IF=11, MC_THENE=12, MC_ELSE=13, INT=14, 
		FLOAT=15, STRING=16, TRUE=17, FALSE=18, ACO_D=19, ACO_G=20, PAR_D=21, 
		PAR_G=22, PLUS=23, MINUS=24, MUL=25, DIV=26, MOD=27, EQ=28, NEQ=29, GT=30, 
		LT=31, LET=32, GET=33, AND=34, OR=35, NOT=36, ASSIGN=37, PV=38, IDF=39, 
		BIB=40, WS=41;
	public static final int
		RULE_s = 0, RULE_imports = 1, RULE_methode = 2, RULE_inst = 3, RULE_dec = 4, 
		RULE_type = 5, RULE_affect = 6, RULE_si = 7, RULE_si_a = 8, RULE_si_b = 9, 
		RULE_exp = 10, RULE_terminal = 11, RULE_output = 12, RULE_input = 13, 
		RULE_io_a = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "imports", "methode", "inst", "dec", "type", "affect", "si", "si_a", 
			"si_b", "exp", "terminal", "output", "input", "io_a"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MC_IMPORT) {
				{
				{
				setState(30);
				imports();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(36);
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

			setState(39);
			match(MC_CLASS);
			setState(40);
			match(IDF);
			setState(41);
			match(ACO_G);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				methode();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDF );
			setState(47);
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
			setState(49);
			match(MC_IMPORT);
			setState(50);
			match(BIB);
			setState(51);
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
			setState(53);
			match(IDF);
			setState(54);
			match(ACO_G);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				inst();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << IDF))) != 0) );
			setState(60);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				affect();
				setState(63);
				match(PV);
				}
				break;
			case MC_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				input();
				}
				break;
			case MC_OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				output();
				}
				break;
			case MC_INT:
			case MC_FLOAT:
			case MC_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				dec();
				setState(68);
				match(PV);
				}
				break;
			case MC_IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
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
			setState(73);
			type();
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(74);
						affect();
						setState(75);
						match(T__2);
						}
						break;
					case 2:
						{
						setState(77);
						match(IDF);
						setState(78);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(84);
				affect();
				}
				break;
			case 2:
				{
				setState(85);
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
			setState(88);
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
			setState(90);
			match(IDF);
			setState(91);
			match(ASSIGN);
			setState(92);
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
			setState(94);
			match(MC_IF);
			setState(95);
			match(PAR_G);
			setState(96);
			exp(0);
			setState(97);
			match(PAR_D);
			setState(98);
			si_a();
			setState(99);
			match(MC_THENE);
			setState(100);
			match(ACO_G);
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				inst();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << IDF))) != 0) );
			setState(106);
			match(ACO_D);
			setState(107);
			si_b();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MC_ELSE) {
				{
				setState(108);
				match(MC_ELSE);
				setState(109);
				match(ACO_G);
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					inst();
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << IDF))) != 0) );
				setState(115);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(124);
				match(MINUS);
				setState(125);
				exp(15);
				}
				break;
			case NOT:
				{
				setState(126);
				match(NOT);
				setState(127);
				exp(14);
				}
				break;
			case PAR_G:
				{
				setState(128);
				match(PAR_G);
				setState(129);
				exp(0);
				setState(130);
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
				setState(132);
				terminal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(135);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(136);
						match(MOD);
						setState(137);
						exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(138);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(139);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						exp(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(141);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(142);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						exp(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(144);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(145);
						match(AND);
						setState(146);
						exp(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(147);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(148);
						match(OR);
						setState(149);
						exp(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(150);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(151);
						match(EQ);
						setState(152);
						exp(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(153);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(154);
						match(NEQ);
						setState(155);
						exp(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
						match(LET);
						setState(158);
						exp(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						match(GET);
						setState(161);
						exp(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						match(GT);
						setState(164);
						exp(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						match(LT);
						setState(167);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(172);
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
			setState(173);
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
		enterRule(_localctx, 24, RULE_output);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(MC_OUT);
			setState(176);
			match(PAR_G);
			setState(177);
			match(STRING);
			setState(178);
			match(T__2);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					exp(0);
					setState(180);
					io_a();
					setState(181);
					match(T__2);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(188);
			exp(0);
			setState(189);
			match(PAR_D);
			setState(190);
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
			setState(192);
			match(MC_IN);
			setState(193);
			match(PAR_G);
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
		enterRule(_localctx, 28, RULE_io_a);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\5\2(\n\2\3\2\3\2\3\2\3\2\6\2.\n\2\r\2\16\2/\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\6\4;\n\4\r\4\16\4<\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6R\n\6\f\6\16\6U\13"+
		"\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\6\ti\n\t\r\t\16\tj\3\t\3\t\3\t\3\t\3\t\6\tr\n\t\r\t\16\ts\3\t\3"+
		"\t\5\tx\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0088\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00ba\n\16\f\16\16\16\u00bd\13\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\2\3\26\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2\3\4\3\2\7\t\3\2\33\34\3\2\31"+
		"\32\4\2\20\24))\2\u00d8\2#\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\bI\3\2\2"+
		"\2\nK\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20`\3\2\2\2\22y\3\2\2\2\24{\3\2"+
		"\2\2\26\u0087\3\2\2\2\30\u00af\3\2\2\2\32\u00b1\3\2\2\2\34\u00c2\3\2\2"+
		"\2\36\u00c8\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2"+
		"\2$\'\3\2\2\2%#\3\2\2\2&(\t\2\2\2\'&\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7"+
		"\6\2\2*+\7)\2\2+-\7\26\2\2,.\5\6\4\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60"+
		"\3\2\2\2\60\61\3\2\2\2\61\62\7\25\2\2\62\3\3\2\2\2\63\64\7\f\2\2\64\65"+
		"\7*\2\2\65\66\7(\2\2\66\5\3\2\2\2\678\7)\2\28:\7\26\2\29;\5\b\5\2:9\3"+
		"\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\25\2\2?\7\3\2\2\2@"+
		"A\5\16\b\2AB\7(\2\2BJ\3\2\2\2CJ\5\34\17\2DJ\5\32\16\2EF\5\n\6\2FG\7(\2"+
		"\2GJ\3\2\2\2HJ\5\20\t\2I@\3\2\2\2IC\3\2\2\2ID\3\2\2\2IE\3\2\2\2IH\3\2"+
		"\2\2J\t\3\2\2\2KS\5\f\7\2LM\5\16\b\2MN\7\5\2\2NR\3\2\2\2OP\7)\2\2PR\7"+
		"\5\2\2QL\3\2\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TX\3\2\2\2US\3"+
		"\2\2\2VY\5\16\b\2WY\7)\2\2XV\3\2\2\2XW\3\2\2\2Y\13\3\2\2\2Z[\t\3\2\2["+
		"\r\3\2\2\2\\]\7)\2\2]^\7\'\2\2^_\5\26\f\2_\17\3\2\2\2`a\7\r\2\2ab\7\30"+
		"\2\2bc\5\26\f\2cd\7\27\2\2de\5\22\n\2ef\7\16\2\2fh\7\26\2\2gi\5\b\5\2"+
		"hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\25\2\2mw\5\24\13"+
		"\2no\7\17\2\2oq\7\26\2\2pr\5\b\5\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2"+
		"\2\2tu\3\2\2\2uv\7\25\2\2vx\3\2\2\2wn\3\2\2\2wx\3\2\2\2x\21\3\2\2\2yz"+
		"\3\2\2\2z\23\3\2\2\2{|\3\2\2\2|\25\3\2\2\2}~\b\f\1\2~\177\7\32\2\2\177"+
		"\u0088\5\26\f\21\u0080\u0081\7&\2\2\u0081\u0088\5\26\f\20\u0082\u0083"+
		"\7\30\2\2\u0083\u0084\5\26\f\2\u0084\u0085\7\27\2\2\u0085\u0088\3\2\2"+
		"\2\u0086\u0088\5\30\r\2\u0087}\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0082"+
		"\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u00ac\3\2\2\2\u0089\u008a\f\17\2\2"+
		"\u008a\u008b\7\35\2\2\u008b\u00ab\5\26\f\20\u008c\u008d\f\16\2\2\u008d"+
		"\u008e\t\4\2\2\u008e\u00ab\5\26\f\17\u008f\u0090\f\r\2\2\u0090\u0091\t"+
		"\5\2\2\u0091\u00ab\5\26\f\16\u0092\u0093\f\f\2\2\u0093\u0094\7$\2\2\u0094"+
		"\u00ab\5\26\f\r\u0095\u0096\f\13\2\2\u0096\u0097\7%\2\2\u0097\u00ab\5"+
		"\26\f\f\u0098\u0099\f\n\2\2\u0099\u009a\7\36\2\2\u009a\u00ab\5\26\f\13"+
		"\u009b\u009c\f\t\2\2\u009c\u009d\7\37\2\2\u009d\u00ab\5\26\f\n\u009e\u009f"+
		"\f\b\2\2\u009f\u00a0\7\"\2\2\u00a0\u00ab\5\26\f\t\u00a1\u00a2\f\7\2\2"+
		"\u00a2\u00a3\7#\2\2\u00a3\u00ab\5\26\f\b\u00a4\u00a5\f\6\2\2\u00a5\u00a6"+
		"\7 \2\2\u00a6\u00ab\5\26\f\7\u00a7\u00a8\f\5\2\2\u00a8\u00a9\7!\2\2\u00a9"+
		"\u00ab\5\26\f\6\u00aa\u0089\3\2\2\2\u00aa\u008c\3\2\2\2\u00aa\u008f\3"+
		"\2\2\2\u00aa\u0092\3\2\2\2\u00aa\u0095\3\2\2\2\u00aa\u0098\3\2\2\2\u00aa"+
		"\u009b\3\2\2\2\u00aa\u009e\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a4\3\2"+
		"\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\t\6\2"+
		"\2\u00b0\31\3\2\2\2\u00b1\u00b2\7\13\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4"+
		"\7\22\2\2\u00b4\u00bb\7\5\2\2\u00b5\u00b6\5\26\f\2\u00b6\u00b7\5\36\20"+
		"\2\u00b7\u00b8\7\5\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\5\26\f\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\7"+
		"(\2\2\u00c1\33\3\2\2\2\u00c2\u00c3\7\n\2\2\u00c3\u00c4\7\30\2\2\u00c4"+
		"\u00c5\5\26\f\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\7(\2\2\u00c7\35\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\37\3\2\2\2\21#\'/<IQSXjsw\u0087\u00aa\u00ac"+
		"\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}