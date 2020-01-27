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
		RULE_terminal = 14, RULE_output = 15, RULE_input = 16, RULE_io_a = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "imports", "methode", "inst", "dec", "type", "affect", "si", "si_a", 
			"si_b", "while_", "while_a", "while_b", "exp", "terminal", "output", 
			"input", "io_a"
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MC_IMPORT) {
				{
				{
				setState(36);
				imports();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(42);
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

			setState(45);
			match(MC_CLASS);
			setState(46);
			match(IDF);
			setState(47);
			match(ACO_G);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				methode();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDF );
			setState(53);
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
			setState(55);
			match(MC_IMPORT);
			setState(56);
			match(BIB);
			setState(57);
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
			setState(59);
			match(IDF);
			setState(60);
			match(ACO_G);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				inst();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << MC_WHILE) | (1L << IDF))) != 0) );
			setState(66);
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				affect();
				setState(69);
				match(PV);
				}
				break;
			case MC_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				input();
				}
				break;
			case MC_OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				output();
				}
				break;
			case MC_INT:
			case MC_FLOAT:
			case MC_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				dec();
				setState(74);
				match(PV);
				}
				break;
			case MC_IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				si();
				}
				break;
			case MC_WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
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
			setState(80);
			type();
			{
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(81);
						affect();
						setState(82);
						match(T__2);
						}
						break;
					case 2:
						{
						setState(84);
						match(IDF);
						setState(85);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(91);
				affect();
				}
				break;
			case 2:
				{
				setState(92);
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
			setState(95);
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
			setState(97);
			match(IDF);
			setState(98);
			match(ASSIGN);
			setState(99);
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
			setState(101);
			match(MC_IF);
			setState(102);
			match(PAR_G);
			setState(103);
			exp(0);
			setState(104);
			match(PAR_D);
			setState(105);
			si_a();
			setState(106);
			match(MC_THENE);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << MC_WHILE) | (1L << IDF))) != 0) );
			setState(113);
			match(ACO_D);
			setState(114);
			si_b();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MC_ELSE) {
				{
				setState(115);
				match(MC_ELSE);
				setState(116);
				match(ACO_G);
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					inst();
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << MC_WHILE) | (1L << IDF))) != 0) );
				setState(122);
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
			setState(130);
			match(MC_WHILE);
			setState(131);
			while_a();
			setState(132);
			match(PAR_G);
			setState(133);
			exp(0);
			setState(134);
			match(PAR_D);
			setState(135);
			while_b();
			setState(136);
			match(ACO_G);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				inst();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MC_INT) | (1L << MC_FLOAT) | (1L << MC_STRING) | (1L << MC_IN) | (1L << MC_OUT) | (1L << MC_IF) | (1L << MC_WHILE) | (1L << IDF))) != 0) );
			setState(142);
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(149);
				match(MINUS);
				setState(150);
				exp(15);
				}
				break;
			case NOT:
				{
				setState(151);
				match(NOT);
				setState(152);
				exp(14);
				}
				break;
			case PAR_G:
				{
				setState(153);
				match(PAR_G);
				setState(154);
				exp(0);
				setState(155);
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
				setState(157);
				terminal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(160);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(161);
						match(MOD);
						setState(162);
						exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(163);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(164);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(165);
						exp(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(166);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(167);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(168);
						exp(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(169);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(170);
						match(AND);
						setState(171);
						exp(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(172);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(173);
						match(OR);
						setState(174);
						exp(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(175);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(176);
						match(EQ);
						setState(177);
						exp(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(178);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(179);
						match(NEQ);
						setState(180);
						exp(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(181);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(182);
						match(LET);
						setState(183);
						exp(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(184);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(185);
						match(GET);
						setState(186);
						exp(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(187);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(188);
						match(GT);
						setState(189);
						exp(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191);
						match(LT);
						setState(192);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			setState(198);
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
			setState(200);
			match(MC_OUT);
			setState(201);
			match(PAR_G);
			setState(202);
			match(STRING);
			setState(203);
			match(T__2);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					exp(0);
					setState(205);
					io_a();
					setState(206);
					match(T__2);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(213);
			exp(0);
			setState(214);
			match(PAR_D);
			setState(215);
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
		enterRule(_localctx, 32, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(MC_IN);
			setState(218);
			match(PAR_G);
			setState(219);
			exp(0);
			setState(220);
			match(PAR_D);
			setState(221);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\5\2.\n\2\3\2\3\2\3\2\3\2\6"+
		"\2\64\n\2\r\2\16\2\65\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4A\n\4\r\4"+
		"\16\4B\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\5\6`\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\tp\n\t\r\t\16\tq\3\t"+
		"\3\t\3\t\3\t\3\t\6\ty\n\t\r\t\16\tz\3\t\3\t\5\t\177\n\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u008d\n\f\r\f\16\f\u008e\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00a1\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c4\n\17\f\17\16\17\u00c7"+
		"\13\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d3\n"+
		"\21\f\21\16\21\u00d6\13\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\2\3\34\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\7\3\2\3\4\3\2\7\t\3\2\34\35\3\2\32\33\4\2\21\25**\2\u00f0\2)\3"+
		"\2\2\2\49\3\2\2\2\6=\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fa\3\2\2\2\16c\3\2"+
		"\2\2\20g\3\2\2\2\22\u0080\3\2\2\2\24\u0082\3\2\2\2\26\u0084\3\2\2\2\30"+
		"\u0092\3\2\2\2\32\u0094\3\2\2\2\34\u00a0\3\2\2\2\36\u00c8\3\2\2\2 \u00ca"+
		"\3\2\2\2\"\u00db\3\2\2\2$\u00e1\3\2\2\2&(\5\4\3\2\'&\3\2\2\2(+\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*-\3\2\2\2+)\3\2\2\2,.\t\2\2\2-,\3\2\2\2-.\3\2\2"+
		"\2./\3\2\2\2/\60\7\6\2\2\60\61\7*\2\2\61\63\7\27\2\2\62\64\5\6\4\2\63"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67"+
		"8\7\26\2\28\3\3\2\2\29:\7\f\2\2:;\7+\2\2;<\7)\2\2<\5\3\2\2\2=>\7*\2\2"+
		">@\7\27\2\2?A\5\b\5\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2"+
		"\2DE\7\26\2\2E\7\3\2\2\2FG\5\16\b\2GH\7)\2\2HQ\3\2\2\2IQ\5\"\22\2JQ\5"+
		" \21\2KL\5\n\6\2LM\7)\2\2MQ\3\2\2\2NQ\5\20\t\2OQ\5\26\f\2PF\3\2\2\2PI"+
		"\3\2\2\2PJ\3\2\2\2PK\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\t\3\2\2\2RZ\5\f\7\2"+
		"ST\5\16\b\2TU\7\5\2\2UY\3\2\2\2VW\7*\2\2WY\7\5\2\2XS\3\2\2\2XV\3\2\2\2"+
		"Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[_\3\2\2\2\\Z\3\2\2\2]`\5\16\b\2^`\7*\2"+
		"\2_]\3\2\2\2_^\3\2\2\2`\13\3\2\2\2ab\t\3\2\2b\r\3\2\2\2cd\7*\2\2de\7("+
		"\2\2ef\5\34\17\2f\17\3\2\2\2gh\7\r\2\2hi\7\31\2\2ij\5\34\17\2jk\7\30\2"+
		"\2kl\5\22\n\2lm\7\16\2\2mo\7\27\2\2np\5\b\5\2on\3\2\2\2pq\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\26\2\2t~\5\24\13\2uv\7\17\2\2vx\7\27\2"+
		"\2wy\5\b\5\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\26"+
		"\2\2}\177\3\2\2\2~u\3\2\2\2~\177\3\2\2\2\177\21\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\23\3\2\2\2\u0082\u0083\3\2\2\2\u0083\25\3\2\2\2\u0084\u0085"+
		"\7\20\2\2\u0085\u0086\5\30\r\2\u0086\u0087\7\31\2\2\u0087\u0088\5\34\17"+
		"\2\u0088\u0089\7\30\2\2\u0089\u008a\5\32\16\2\u008a\u008c\7\27\2\2\u008b"+
		"\u008d\5\b\5\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\26\2\2\u0091"+
		"\27\3\2\2\2\u0092\u0093\3\2\2\2\u0093\31\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\33\3\2\2\2\u0096\u0097\b\17\1\2\u0097\u0098\7\33\2\2\u0098\u00a1\5\34"+
		"\17\21\u0099\u009a\7\'\2\2\u009a\u00a1\5\34\17\20\u009b\u009c\7\31\2\2"+
		"\u009c\u009d\5\34\17\2\u009d\u009e\7\30\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u00a1\5\36\20\2\u00a0\u0096\3\2\2\2\u00a0\u0099\3\2\2\2\u00a0\u009b\3"+
		"\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00c5\3\2\2\2\u00a2\u00a3\f\17\2\2\u00a3"+
		"\u00a4\7\36\2\2\u00a4\u00c4\5\34\17\20\u00a5\u00a6\f\16\2\2\u00a6\u00a7"+
		"\t\4\2\2\u00a7\u00c4\5\34\17\17\u00a8\u00a9\f\r\2\2\u00a9\u00aa\t\5\2"+
		"\2\u00aa\u00c4\5\34\17\16\u00ab\u00ac\f\f\2\2\u00ac\u00ad\7%\2\2\u00ad"+
		"\u00c4\5\34\17\r\u00ae\u00af\f\13\2\2\u00af\u00b0\7&\2\2\u00b0\u00c4\5"+
		"\34\17\f\u00b1\u00b2\f\n\2\2\u00b2\u00b3\7\37\2\2\u00b3\u00c4\5\34\17"+
		"\13\u00b4\u00b5\f\t\2\2\u00b5\u00b6\7 \2\2\u00b6\u00c4\5\34\17\n\u00b7"+
		"\u00b8\f\b\2\2\u00b8\u00b9\7#\2\2\u00b9\u00c4\5\34\17\t\u00ba\u00bb\f"+
		"\7\2\2\u00bb\u00bc\7$\2\2\u00bc\u00c4\5\34\17\b\u00bd\u00be\f\6\2\2\u00be"+
		"\u00bf\7!\2\2\u00bf\u00c4\5\34\17\7\u00c0\u00c1\f\5\2\2\u00c1\u00c2\7"+
		"\"\2\2\u00c2\u00c4\5\34\17\6\u00c3\u00a2\3\2\2\2\u00c3\u00a5\3\2\2\2\u00c3"+
		"\u00a8\3\2\2\2\u00c3\u00ab\3\2\2\2\u00c3\u00ae\3\2\2\2\u00c3\u00b1\3\2"+
		"\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3"+
		"\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9"+
		"\t\6\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\7\13\2\2\u00cb\u00cc\7\31\2\2\u00cc"+
		"\u00cd\7\23\2\2\u00cd\u00d4\7\5\2\2\u00ce\u00cf\5\34\17\2\u00cf\u00d0"+
		"\5$\23\2\u00d0\u00d1\7\5\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5\34\17\2\u00d8\u00d9\7\30\2\2\u00d9"+
		"\u00da\7)\2\2\u00da!\3\2\2\2\u00db\u00dc\7\n\2\2\u00dc\u00dd\7\31\2\2"+
		"\u00dd\u00de\5\34\17\2\u00de\u00df\7\30\2\2\u00df\u00e0\7)\2\2\u00e0#"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2%\3\2\2\2\22)-\65BPXZ_qz~\u008e\u00a0"+
		"\u00c3\u00c5\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}