// Generated from C:/Users/91807/Desktop/GitHub/SER502-Striger-Team9/src.StrigerGrammar/Striger.g4 by ANTLR 4.13.1
package src;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class StrigerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		Variable_name=39, Str=40, Int=41, WHITESPACE=42, COMMENT=43, LINE_COMMENT=44;
	public static final int
		RULE_program = 0, RULE_initializations = 1, RULE_initialization = 2, RULE_computations = 3, 
		RULE_computation = 4, RULE_conclusion = 5, RULE_print_statement = 6, RULE_conditionals = 7, 
		RULE_if_condition = 8, RULE_elif_part = 9, RULE_else_part = 10, RULE_if_then_else = 11, 
		RULE_terinary = 12, RULE_assignment = 13, RULE_loops = 14, RULE_for_loop = 15, 
		RULE_for_inrange = 16, RULE_while_loop = 17, RULE_expression = 18, RULE_boolexpr = 19, 
		RULE_arthexpr = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "initializations", "initialization", "computations", "computation", 
			"conclusion", "print_statement", "conditionals", "if_condition", "elif_part", 
			"else_part", "if_then_else", "terinary", "assignment", "loops", "for_loop", 
			"for_inrange", "while_loop", "expression", "boolexpr", "arthexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'String'", "'='", "'int'", "'bool'", "'{'", "'}'", "';'", "'print'", 
			"'('", "')'", "'if'", "'elif'", "'else'", "'then'", "'?'", "':'", "'++'", 
			"'--'", "'for'", "'in'", "'range'", "','", "'while'", "'true'", "'false'", 
			"'=='", "'not'", "'and'", "'or'", "'>'", "'<'", "'>='", "'<='", "'!='", 
			"'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "Variable_name", "Str", "Int", "WHITESPACE", "COMMENT", 
			"LINE_COMMENT"
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
	public String getGrammarFileName() { return "Striger.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StrigerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public InitializationsContext initializations() {
			return getRuleContext(InitializationsContext.class,0);
		}
		public ComputationsContext computations() {
			return getRuleContext(ComputationsContext.class,0);
		}
		public List<ConclusionContext> conclusion() {
			return getRuleContexts(ConclusionContext.class);
		}
		public ConclusionContext conclusion(int i) {
			return getRuleContext(ConclusionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				initializations();
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(43);
						conclusion();
						}
						} 
					}
					setState(48);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(49);
				computations();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6 || _la==T__7) {
					{
					{
					setState(50);
					conclusion();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				conclusion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationsContext extends ParserRuleContext {
		public List<InitializationContext> initialization() {
			return getRuleContexts(InitializationContext.class);
		}
		public InitializationContext initialization(int i) {
			return getRuleContext(InitializationContext.class,i);
		}
		public List<ConclusionContext> conclusion() {
			return getRuleContexts(ConclusionContext.class);
		}
		public ConclusionContext conclusion(int i) {
			return getRuleContext(ConclusionContext.class,i);
		}
		public InitializationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterInitializations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitInitializations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitInitializations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationsContext initializations() throws RecognitionException {
		InitializationsContext _localctx = new InitializationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initializations);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				initialization();
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(60);
						conclusion();
						}
						} 
					}
					setState(65);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 26L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationContext extends ParserRuleContext {
		public TerminalNode Variable_name() { return getToken(StrigerParser.Variable_name, 0); }
		public TerminalNode Str() { return getToken(StrigerParser.Str, 0); }
		public TerminalNode Int() { return getToken(StrigerParser.Int, 0); }
		public ArthexprContext arthexpr() {
			return getRuleContext(ArthexprContext.class,0);
		}
		public TerinaryContext terinary() {
			return getRuleContext(TerinaryContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initialization);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(T__0);
				setState(71);
				match(Variable_name);
				setState(72);
				match(T__1);
				setState(73);
				match(Str);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__2);
				setState(75);
				match(Variable_name);
				setState(76);
				match(T__1);
				setState(77);
				match(Int);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(T__2);
				setState(79);
				match(Variable_name);
				setState(80);
				match(T__1);
				setState(81);
				arthexpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(T__2);
				setState(83);
				match(Variable_name);
				setState(84);
				match(T__1);
				setState(85);
				terinary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(T__3);
				setState(87);
				match(Variable_name);
				setState(88);
				match(T__1);
				setState(89);
				boolexpr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				match(T__2);
				setState(91);
				match(Variable_name);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(T__0);
				setState(93);
				match(Variable_name);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				match(T__3);
				setState(95);
				match(Variable_name);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComputationsContext extends ParserRuleContext {
		public List<ComputationContext> computation() {
			return getRuleContexts(ComputationContext.class);
		}
		public ComputationContext computation(int i) {
			return getRuleContext(ComputationContext.class,i);
		}
		public ComputationsContext computations() {
			return getRuleContext(ComputationsContext.class,0);
		}
		public ComputationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterComputations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitComputations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitComputations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputationsContext computations() throws RecognitionException {
		ComputationsContext _localctx = new ComputationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_computations);
		try {
			int _alt;
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__10:
			case T__16:
			case T__17:
			case T__18:
			case T__22:
			case Variable_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(98);
						computation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(101); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__4);
				setState(104);
				computations();
				setState(105);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComputationContext extends ParserRuleContext {
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public ComputationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterComputation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitComputation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitComputation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputationContext computation() throws RecognitionException {
		ComputationContext _localctx = new ComputationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_computation);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				conditionals();
				}
				break;
			case T__18:
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				loops();
				}
				break;
			case T__16:
			case T__17:
			case Variable_name:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				assignment();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				conclusion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConclusionContext extends ParserRuleContext {
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public ConclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclusionContext conclusion() throws RecognitionException {
		ConclusionContext _localctx = new ConclusionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conclusion);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				print_statement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode Variable_name() { return getToken(StrigerParser.Variable_name, 0); }
		public TerminalNode Str() { return getToken(StrigerParser.Str, 0); }
		public TerminalNode Int() { return getToken(StrigerParser.Int, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_statement);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__7);
				setState(120);
				match(Variable_name);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__7);
				setState(122);
				match(T__8);
				setState(123);
				match(Variable_name);
				setState(124);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(T__7);
				setState(126);
				match(T__8);
				setState(127);
				match(Str);
				setState(128);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(T__7);
				setState(130);
				match(T__8);
				setState(131);
				match(Int);
				setState(132);
				match(T__9);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				match(T__7);
				setState(134);
				match(T__8);
				setState(135);
				boolexpr(0);
				setState(136);
				match(T__9);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(T__7);
				setState(139);
				match(Str);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				match(T__7);
				setState(141);
				match(Int);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				match(T__7);
				setState(143);
				boolexpr(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalsContext extends ParserRuleContext {
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public If_then_elseContext if_then_else() {
			return getRuleContext(If_then_elseContext.class,0);
		}
		public ConditionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterConditionals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitConditionals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitConditionals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalsContext conditionals() throws RecognitionException {
		ConditionalsContext _localctx = new ConditionalsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionals);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				if_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				if_then_else();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_conditionContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public ComputationsContext computations() {
			return getRuleContext(ComputationsContext.class,0);
		}
		public List<Elif_partContext> elif_part() {
			return getRuleContexts(Elif_partContext.class);
		}
		public Elif_partContext elif_part(int i) {
			return getRuleContext(Elif_partContext.class,i);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__10);
			setState(151);
			boolexpr(0);
			setState(152);
			match(T__4);
			setState(153);
			computations();
			setState(154);
			match(T__5);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(155);
				elif_part();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(161);
				else_part();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_partContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public ComputationsContext computations() {
			return getRuleContext(ComputationsContext.class,0);
		}
		public Elif_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterElif_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitElif_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitElif_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_partContext elif_part() throws RecognitionException {
		Elif_partContext _localctx = new Elif_partContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elif_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__11);
			setState(165);
			boolexpr(0);
			setState(166);
			match(T__4);
			setState(167);
			computations();
			setState(168);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_partContext extends ParserRuleContext {
		public ComputationsContext computations() {
			return getRuleContext(ComputationsContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitElse_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitElse_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__12);
			setState(171);
			match(T__4);
			setState(172);
			computations();
			setState(173);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_then_elseContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public List<ComputationsContext> computations() {
			return getRuleContexts(ComputationsContext.class);
		}
		public ComputationsContext computations(int i) {
			return getRuleContext(ComputationsContext.class,i);
		}
		public If_then_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterIf_then_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitIf_then_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitIf_then_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_then_elseContext if_then_else() throws RecognitionException {
		If_then_elseContext _localctx = new If_then_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_then_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__10);
			setState(176);
			boolexpr(0);
			setState(177);
			match(T__13);
			setState(178);
			computations();
			setState(179);
			match(T__12);
			setState(180);
			computations();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerinaryContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public List<ArthexprContext> arthexpr() {
			return getRuleContexts(ArthexprContext.class);
		}
		public ArthexprContext arthexpr(int i) {
			return getRuleContext(ArthexprContext.class,i);
		}
		public List<TerminalNode> Str() { return getTokens(StrigerParser.Str); }
		public TerminalNode Str(int i) {
			return getToken(StrigerParser.Str, i);
		}
		public List<TerminalNode> Variable_name() { return getTokens(StrigerParser.Variable_name); }
		public TerminalNode Variable_name(int i) {
			return getToken(StrigerParser.Variable_name, i);
		}
		public TerinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terinary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterTerinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitTerinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitTerinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerinaryContext terinary() throws RecognitionException {
		TerinaryContext _localctx = new TerinaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_terinary);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				boolexpr(0);
				setState(183);
				match(T__14);
				setState(184);
				arthexpr(0);
				setState(185);
				match(T__15);
				setState(186);
				arthexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				boolexpr(0);
				setState(189);
				match(T__14);
				setState(190);
				match(Str);
				setState(191);
				match(T__15);
				setState(192);
				match(Str);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				boolexpr(0);
				setState(195);
				match(T__14);
				setState(196);
				match(Variable_name);
				setState(197);
				match(T__15);
				setState(198);
				match(Variable_name);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Variable_name() { return getToken(StrigerParser.Variable_name, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerinaryContext terinary() {
			return getRuleContext(TerinaryContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(Variable_name);
				setState(203);
				match(T__1);
				setState(204);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(Variable_name);
				setState(206);
				match(T__1);
				setState(207);
				terinary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(Variable_name);
				setState(209);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(T__16);
				setState(211);
				match(Variable_name);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(Variable_name);
				setState(213);
				match(T__17);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				match(T__17);
				setState(215);
				match(Variable_name);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopsContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_inrangeContext for_inrange() {
			return getRuleContext(For_inrangeContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitLoops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loops);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				for_inrange();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ComputationsContext computations() {
			return getRuleContext(ComputationsContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__18);
			setState(224);
			match(T__8);
			setState(225);
			initialization();
			setState(226);
			match(T__6);
			setState(227);
			boolexpr(0);
			setState(228);
			match(T__6);
			setState(229);
			assignment();
			setState(230);
			match(T__9);
			setState(231);
			match(T__4);
			setState(232);
			computations();
			setState(233);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_inrangeContext extends ParserRuleContext {
		public List<TerminalNode> Variable_name() { return getTokens(StrigerParser.Variable_name); }
		public TerminalNode Variable_name(int i) {
			return getToken(StrigerParser.Variable_name, i);
		}
		public List<TerminalNode> Int() { return getTokens(StrigerParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(StrigerParser.Int, i);
		}
		public ComputationsContext computations() {
			return getRuleContext(ComputationsContext.class,0);
		}
		public For_inrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_inrange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterFor_inrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitFor_inrange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitFor_inrange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_inrangeContext for_inrange() throws RecognitionException {
		For_inrangeContext _localctx = new For_inrangeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_inrange);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__18);
				setState(236);
				match(Variable_name);
				setState(237);
				match(T__19);
				setState(238);
				match(T__20);
				setState(239);
				match(T__8);
				setState(240);
				match(Int);
				setState(241);
				match(T__21);
				setState(242);
				match(Int);
				setState(243);
				match(T__9);
				setState(244);
				match(T__4);
				setState(245);
				computations();
				setState(246);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__18);
				setState(249);
				match(Variable_name);
				setState(250);
				match(T__19);
				setState(251);
				match(T__20);
				setState(252);
				match(T__8);
				setState(253);
				match(Variable_name);
				setState(254);
				match(T__21);
				setState(255);
				match(Variable_name);
				setState(256);
				match(T__9);
				setState(257);
				match(T__4);
				setState(258);
				computations();
				setState(259);
				match(T__5);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public ComputationsContext computations() {
			return getRuleContext(ComputationsContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__22);
			setState(264);
			boolexpr(0);
			setState(265);
			match(T__4);
			setState(266);
			computations();
			setState(267);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public ArthexprContext arthexpr() {
			return getRuleContext(ArthexprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				boolexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				arthexpr(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolexprContext extends ParserRuleContext {
		public List<ArthexprContext> arthexpr() {
			return getRuleContexts(ArthexprContext.class);
		}
		public ArthexprContext arthexpr(int i) {
			return getRuleContext(ArthexprContext.class,i);
		}
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		return boolexpr(0);
	}

	private BoolexprContext boolexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolexprContext _localctx = new BoolexprContext(_ctx, _parentState);
		BoolexprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_boolexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(274);
				match(T__23);
				}
				break;
			case 2:
				{
				setState(275);
				match(T__24);
				}
				break;
			case 3:
				{
				setState(276);
				arthexpr(0);
				setState(277);
				match(T__25);
				setState(278);
				arthexpr(0);
				}
				break;
			case 4:
				{
				setState(280);
				match(T__26);
				setState(281);
				boolexpr(9);
				}
				break;
			case 5:
				{
				setState(282);
				arthexpr(0);
				setState(283);
				match(T__29);
				setState(284);
				arthexpr(0);
				}
				break;
			case 6:
				{
				setState(286);
				arthexpr(0);
				setState(287);
				match(T__30);
				setState(288);
				arthexpr(0);
				}
				break;
			case 7:
				{
				setState(290);
				arthexpr(0);
				setState(291);
				match(T__31);
				setState(292);
				arthexpr(0);
				}
				break;
			case 8:
				{
				setState(294);
				arthexpr(0);
				setState(295);
				match(T__32);
				setState(296);
				arthexpr(0);
				}
				break;
			case 9:
				{
				setState(298);
				arthexpr(0);
				setState(299);
				match(T__33);
				setState(300);
				arthexpr(0);
				}
				break;
			case 10:
				{
				setState(302);
				match(T__8);
				setState(303);
				boolexpr(0);
				setState(304);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new BoolexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(308);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(309);
						match(T__27);
						setState(310);
						boolexpr(9);
						}
						break;
					case 2:
						{
						_localctx = new BoolexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(311);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(312);
						match(T__28);
						setState(313);
						boolexpr(8);
						}
						break;
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArthexprContext extends ParserRuleContext {
		public TerminalNode Variable_name() { return getToken(StrigerParser.Variable_name, 0); }
		public TerminalNode Int() { return getToken(StrigerParser.Int, 0); }
		public List<ArthexprContext> arthexpr() {
			return getRuleContexts(ArthexprContext.class);
		}
		public ArthexprContext arthexpr(int i) {
			return getRuleContext(ArthexprContext.class,i);
		}
		public ArthexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arthexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).enterArthexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrigerListener ) ((StrigerListener)listener).exitArthexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrigerVisitor ) return ((StrigerVisitor<? extends T>)visitor).visitArthexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArthexprContext arthexpr() throws RecognitionException {
		return arthexpr(0);
	}

	private ArthexprContext arthexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArthexprContext _localctx = new ArthexprContext(_ctx, _parentState);
		ArthexprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_arthexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable_name:
				{
				setState(320);
				match(Variable_name);
				}
				break;
			case Int:
				{
				setState(321);
				match(Int);
				}
				break;
			case T__8:
				{
				setState(322);
				match(T__8);
				setState(323);
				arthexpr(0);
				setState(324);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ArthexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arthexpr);
						setState(328);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(329);
						match(T__34);
						setState(330);
						arthexpr(8);
						}
						break;
					case 2:
						{
						_localctx = new ArthexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arthexpr);
						setState(331);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(332);
						match(T__35);
						setState(333);
						arthexpr(7);
						}
						break;
					case 3:
						{
						_localctx = new ArthexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arthexpr);
						setState(334);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(335);
						match(T__36);
						setState(336);
						arthexpr(6);
						}
						break;
					case 4:
						{
						_localctx = new ArthexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arthexpr);
						setState(337);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(338);
						match(T__37);
						setState(339);
						arthexpr(5);
						}
						break;
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		case 20:
			return arthexpr_sempred((ArthexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean arthexpr_sempred(ArthexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u015a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0005\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000\u0003\u0000"+
		":\b\u0000\u0001\u0001\u0001\u0001\u0005\u0001>\b\u0001\n\u0001\f\u0001"+
		"A\t\u0001\u0004\u0001C\b\u0001\u000b\u0001\f\u0001D\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002a\b\u0002\u0001\u0003\u0004\u0003d\b\u0003\u000b\u0003"+
		"\f\u0003e\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"l\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"r\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0091\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0095\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u009d\b\b\n\b"+
		"\f\b\u00a0\t\b\u0001\b\u0003\b\u00a3\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00c9\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d9"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00de\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0106\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0110\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0133"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u013b\b\u0013\n\u0013\f\u0013\u013e\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0147\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0155\b\u0014\n\u0014\f\u0014\u0158"+
		"\t\u0014\u0001\u0014\u0000\u0002&(\u0015\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0000"+
		"\u017c\u00009\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004"+
		"`\u0001\u0000\u0000\u0000\u0006k\u0001\u0000\u0000\u0000\bq\u0001\u0000"+
		"\u0000\u0000\nu\u0001\u0000\u0000\u0000\f\u0090\u0001\u0000\u0000\u0000"+
		"\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u0096\u0001\u0000\u0000\u0000"+
		"\u0012\u00a4\u0001\u0000\u0000\u0000\u0014\u00aa\u0001\u0000\u0000\u0000"+
		"\u0016\u00af\u0001\u0000\u0000\u0000\u0018\u00c8\u0001\u0000\u0000\u0000"+
		"\u001a\u00d8\u0001\u0000\u0000\u0000\u001c\u00dd\u0001\u0000\u0000\u0000"+
		"\u001e\u00df\u0001\u0000\u0000\u0000 \u0105\u0001\u0000\u0000\u0000\""+
		"\u0107\u0001\u0000\u0000\u0000$\u010f\u0001\u0000\u0000\u0000&\u0132\u0001"+
		"\u0000\u0000\u0000(\u0146\u0001\u0000\u0000\u0000*.\u0003\u0002\u0001"+
		"\u0000+-\u0003\n\u0005\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000015\u0003\u0006\u0003\u000024\u0003"+
		"\n\u0005\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u00006:\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u00008:\u0003\n\u0005\u00009*\u0001\u0000\u0000\u0000"+
		"98\u0001\u0000\u0000\u0000:\u0001\u0001\u0000\u0000\u0000;?\u0003\u0004"+
		"\u0002\u0000<>\u0003\n\u0005\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@C\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000B;\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E\u0003\u0001\u0000\u0000\u0000FG\u0005\u0001\u0000\u0000GH\u0005"+
		"\'\u0000\u0000HI\u0005\u0002\u0000\u0000Ia\u0005(\u0000\u0000JK\u0005"+
		"\u0003\u0000\u0000KL\u0005\'\u0000\u0000LM\u0005\u0002\u0000\u0000Ma\u0005"+
		")\u0000\u0000NO\u0005\u0003\u0000\u0000OP\u0005\'\u0000\u0000PQ\u0005"+
		"\u0002\u0000\u0000Qa\u0003(\u0014\u0000RS\u0005\u0003\u0000\u0000ST\u0005"+
		"\'\u0000\u0000TU\u0005\u0002\u0000\u0000Ua\u0003\u0018\f\u0000VW\u0005"+
		"\u0004\u0000\u0000WX\u0005\'\u0000\u0000XY\u0005\u0002\u0000\u0000Ya\u0003"+
		"&\u0013\u0000Z[\u0005\u0003\u0000\u0000[a\u0005\'\u0000\u0000\\]\u0005"+
		"\u0001\u0000\u0000]a\u0005\'\u0000\u0000^_\u0005\u0004\u0000\u0000_a\u0005"+
		"\'\u0000\u0000`F\u0001\u0000\u0000\u0000`J\u0001\u0000\u0000\u0000`N\u0001"+
		"\u0000\u0000\u0000`R\u0001\u0000\u0000\u0000`V\u0001\u0000\u0000\u0000"+
		"`Z\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000a\u0005\u0001\u0000\u0000\u0000bd\u0003\b\u0004\u0000cb\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fl\u0001\u0000\u0000\u0000gh\u0005\u0005\u0000\u0000"+
		"hi\u0003\u0006\u0003\u0000ij\u0005\u0006\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000kc\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000l\u0007\u0001"+
		"\u0000\u0000\u0000mr\u0003\u000e\u0007\u0000nr\u0003\u001c\u000e\u0000"+
		"or\u0003\u001a\r\u0000pr\u0003\n\u0005\u0000qm\u0001\u0000\u0000\u0000"+
		"qn\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000r\t\u0001\u0000\u0000\u0000sv\u0003\f\u0006\u0000tv\u0005\u0007"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u000b"+
		"\u0001\u0000\u0000\u0000wx\u0005\b\u0000\u0000x\u0091\u0005\'\u0000\u0000"+
		"yz\u0005\b\u0000\u0000z{\u0005\t\u0000\u0000{|\u0005\'\u0000\u0000|\u0091"+
		"\u0005\n\u0000\u0000}~\u0005\b\u0000\u0000~\u007f\u0005\t\u0000\u0000"+
		"\u007f\u0080\u0005(\u0000\u0000\u0080\u0091\u0005\n\u0000\u0000\u0081"+
		"\u0082\u0005\b\u0000\u0000\u0082\u0083\u0005\t\u0000\u0000\u0083\u0084"+
		"\u0005)\u0000\u0000\u0084\u0091\u0005\n\u0000\u0000\u0085\u0086\u0005"+
		"\b\u0000\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u0088\u0003&\u0013"+
		"\u0000\u0088\u0089\u0005\n\u0000\u0000\u0089\u0091\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\b\u0000\u0000\u008b\u0091\u0005(\u0000\u0000\u008c"+
		"\u008d\u0005\b\u0000\u0000\u008d\u0091\u0005)\u0000\u0000\u008e\u008f"+
		"\u0005\b\u0000\u0000\u008f\u0091\u0003&\u0013\u0000\u0090w\u0001\u0000"+
		"\u0000\u0000\u0090y\u0001\u0000\u0000\u0000\u0090}\u0001\u0000\u0000\u0000"+
		"\u0090\u0081\u0001\u0000\u0000\u0000\u0090\u0085\u0001\u0000\u0000\u0000"+
		"\u0090\u008a\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0003\u0010\b\u0000\u0093\u0095\u0003\u0016\u000b\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u000f"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u000b\u0000\u0000\u0097\u0098"+
		"\u0003&\u0013\u0000\u0098\u0099\u0005\u0005\u0000\u0000\u0099\u009a\u0003"+
		"\u0006\u0003\u0000\u009a\u009e\u0005\u0006\u0000\u0000\u009b\u009d\u0003"+
		"\u0012\t\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a3\u0003\u0014\n\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u0011\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005\f\u0000\u0000\u00a5\u00a6\u0003&\u0013\u0000"+
		"\u00a6\u00a7\u0005\u0005\u0000\u0000\u00a7\u00a8\u0003\u0006\u0003\u0000"+
		"\u00a8\u00a9\u0005\u0006\u0000\u0000\u00a9\u0013\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0005\r\u0000\u0000\u00ab\u00ac\u0005\u0005\u0000\u0000\u00ac"+
		"\u00ad\u0003\u0006\u0003\u0000\u00ad\u00ae\u0005\u0006\u0000\u0000\u00ae"+
		"\u0015\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u000b\u0000\u0000\u00b0"+
		"\u00b1\u0003&\u0013\u0000\u00b1\u00b2\u0005\u000e\u0000\u0000\u00b2\u00b3"+
		"\u0003\u0006\u0003\u0000\u00b3\u00b4\u0005\r\u0000\u0000\u00b4\u00b5\u0003"+
		"\u0006\u0003\u0000\u00b5\u0017\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003"+
		"&\u0013\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u00b9\u0003(\u0014"+
		"\u0000\u00b9\u00ba\u0005\u0010\u0000\u0000\u00ba\u00bb\u0003(\u0014\u0000"+
		"\u00bb\u00c9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003&\u0013\u0000\u00bd"+
		"\u00be\u0005\u000f\u0000\u0000\u00be\u00bf\u0005(\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0010\u0000\u0000\u00c0\u00c1\u0005(\u0000\u0000\u00c1\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0003&\u0013\u0000\u00c3\u00c4\u0005\u000f"+
		"\u0000\u0000\u00c4\u00c5\u0005\'\u0000\u0000\u00c5\u00c6\u0005\u0010\u0000"+
		"\u0000\u00c6\u00c7\u0005\'\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c8\u00b6\u0001\u0000\u0000\u0000\u00c8\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c9\u0019\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005\'\u0000\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc"+
		"\u00d9\u0003$\u0012\u0000\u00cd\u00ce\u0005\'\u0000\u0000\u00ce\u00cf"+
		"\u0005\u0002\u0000\u0000\u00cf\u00d9\u0003\u0018\f\u0000\u00d0\u00d1\u0005"+
		"\'\u0000\u0000\u00d1\u00d9\u0005\u0011\u0000\u0000\u00d2\u00d3\u0005\u0011"+
		"\u0000\u0000\u00d3\u00d9\u0005\'\u0000\u0000\u00d4\u00d5\u0005\'\u0000"+
		"\u0000\u00d5\u00d9\u0005\u0012\u0000\u0000\u00d6\u00d7\u0005\u0012\u0000"+
		"\u0000\u00d7\u00d9\u0005\'\u0000\u0000\u00d8\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d8\u00cd\u0001\u0000\u0000\u0000\u00d8\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u001b\u0001\u0000\u0000\u0000"+
		"\u00da\u00de\u0003\u001e\u000f\u0000\u00db\u00de\u0003\"\u0011\u0000\u00dc"+
		"\u00de\u0003 \u0010\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u001d"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0013\u0000\u0000\u00e0\u00e1"+
		"\u0005\t\u0000\u0000\u00e1\u00e2\u0003\u0004\u0002\u0000\u00e2\u00e3\u0005"+
		"\u0007\u0000\u0000\u00e3\u00e4\u0003&\u0013\u0000\u00e4\u00e5\u0005\u0007"+
		"\u0000\u0000\u00e5\u00e6\u0003\u001a\r\u0000\u00e6\u00e7\u0005\n\u0000"+
		"\u0000\u00e7\u00e8\u0005\u0005\u0000\u0000\u00e8\u00e9\u0003\u0006\u0003"+
		"\u0000\u00e9\u00ea\u0005\u0006\u0000\u0000\u00ea\u001f\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0013\u0000\u0000\u00ec\u00ed\u0005\'\u0000\u0000"+
		"\u00ed\u00ee\u0005\u0014\u0000\u0000\u00ee\u00ef\u0005\u0015\u0000\u0000"+
		"\u00ef\u00f0\u0005\t\u0000\u0000\u00f0\u00f1\u0005)\u0000\u0000\u00f1"+
		"\u00f2\u0005\u0016\u0000\u0000\u00f2\u00f3\u0005)\u0000\u0000\u00f3\u00f4"+
		"\u0005\n\u0000\u0000\u00f4\u00f5\u0005\u0005\u0000\u0000\u00f5\u00f6\u0003"+
		"\u0006\u0003\u0000\u00f6\u00f7\u0005\u0006\u0000\u0000\u00f7\u0106\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0005\u0013\u0000\u0000\u00f9\u00fa\u0005"+
		"\'\u0000\u0000\u00fa\u00fb\u0005\u0014\u0000\u0000\u00fb\u00fc\u0005\u0015"+
		"\u0000\u0000\u00fc\u00fd\u0005\t\u0000\u0000\u00fd\u00fe\u0005\'\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0016\u0000\u0000\u00ff\u0100\u0005\'\u0000\u0000"+
		"\u0100\u0101\u0005\n\u0000\u0000\u0101\u0102\u0005\u0005\u0000\u0000\u0102"+
		"\u0103\u0003\u0006\u0003\u0000\u0103\u0104\u0005\u0006\u0000\u0000\u0104"+
		"\u0106\u0001\u0000\u0000\u0000\u0105\u00eb\u0001\u0000\u0000\u0000\u0105"+
		"\u00f8\u0001\u0000\u0000\u0000\u0106!\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0005\u0017\u0000\u0000\u0108\u0109\u0003&\u0013\u0000\u0109\u010a\u0005"+
		"\u0005\u0000\u0000\u010a\u010b\u0003\u0006\u0003\u0000\u010b\u010c\u0005"+
		"\u0006\u0000\u0000\u010c#\u0001\u0000\u0000\u0000\u010d\u0110\u0003&\u0013"+
		"\u0000\u010e\u0110\u0003(\u0014\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u010e\u0001\u0000\u0000\u0000\u0110%\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0006\u0013\uffff\uffff\u0000\u0112\u0133\u0005\u0018\u0000\u0000"+
		"\u0113\u0133\u0005\u0019\u0000\u0000\u0114\u0115\u0003(\u0014\u0000\u0115"+
		"\u0116\u0005\u001a\u0000\u0000\u0116\u0117\u0003(\u0014\u0000\u0117\u0133"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u001b\u0000\u0000\u0119\u0133"+
		"\u0003&\u0013\t\u011a\u011b\u0003(\u0014\u0000\u011b\u011c\u0005\u001e"+
		"\u0000\u0000\u011c\u011d\u0003(\u0014\u0000\u011d\u0133\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0003(\u0014\u0000\u011f\u0120\u0005\u001f\u0000\u0000"+
		"\u0120\u0121\u0003(\u0014\u0000\u0121\u0133\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0003(\u0014\u0000\u0123\u0124\u0005 \u0000\u0000\u0124\u0125\u0003"+
		"(\u0014\u0000\u0125\u0133\u0001\u0000\u0000\u0000\u0126\u0127\u0003(\u0014"+
		"\u0000\u0127\u0128\u0005!\u0000\u0000\u0128\u0129\u0003(\u0014\u0000\u0129"+
		"\u0133\u0001\u0000\u0000\u0000\u012a\u012b\u0003(\u0014\u0000\u012b\u012c"+
		"\u0005\"\u0000\u0000\u012c\u012d\u0003(\u0014\u0000\u012d\u0133\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0005\t\u0000\u0000\u012f\u0130\u0003&"+
		"\u0013\u0000\u0130\u0131\u0005\n\u0000\u0000\u0131\u0133\u0001\u0000\u0000"+
		"\u0000\u0132\u0111\u0001\u0000\u0000\u0000\u0132\u0113\u0001\u0000\u0000"+
		"\u0000\u0132\u0114\u0001\u0000\u0000\u0000\u0132\u0118\u0001\u0000\u0000"+
		"\u0000\u0132\u011a\u0001\u0000\u0000\u0000\u0132\u011e\u0001\u0000\u0000"+
		"\u0000\u0132\u0122\u0001\u0000\u0000\u0000\u0132\u0126\u0001\u0000\u0000"+
		"\u0000\u0132\u012a\u0001\u0000\u0000\u0000\u0132\u012e\u0001\u0000\u0000"+
		"\u0000\u0133\u013c\u0001\u0000\u0000\u0000\u0134\u0135\n\b\u0000\u0000"+
		"\u0135\u0136\u0005\u001c\u0000\u0000\u0136\u013b\u0003&\u0013\t\u0137"+
		"\u0138\n\u0007\u0000\u0000\u0138\u0139\u0005\u001d\u0000\u0000\u0139\u013b"+
		"\u0003&\u0013\b\u013a\u0134\u0001\u0000\u0000\u0000\u013a\u0137\u0001"+
		"\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\'\u0001\u0000"+
		"\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140\u0006\u0014"+
		"\uffff\uffff\u0000\u0140\u0147\u0005\'\u0000\u0000\u0141\u0147\u0005)"+
		"\u0000\u0000\u0142\u0143\u0005\t\u0000\u0000\u0143\u0144\u0003(\u0014"+
		"\u0000\u0144\u0145\u0005\n\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000"+
		"\u0146\u013f\u0001\u0000\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000"+
		"\u0146\u0142\u0001\u0000\u0000\u0000\u0147\u0156\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\n\u0007\u0000\u0000\u0149\u014a\u0005#\u0000\u0000\u014a"+
		"\u0155\u0003(\u0014\b\u014b\u014c\n\u0006\u0000\u0000\u014c\u014d\u0005"+
		"$\u0000\u0000\u014d\u0155\u0003(\u0014\u0007\u014e\u014f\n\u0005\u0000"+
		"\u0000\u014f\u0150\u0005%\u0000\u0000\u0150\u0155\u0003(\u0014\u0006\u0151"+
		"\u0152\n\u0004\u0000\u0000\u0152\u0153\u0005&\u0000\u0000\u0153\u0155"+
		"\u0003(\u0014\u0005\u0154\u0148\u0001\u0000\u0000\u0000\u0154\u014b\u0001"+
		"\u0000\u0000\u0000\u0154\u014e\u0001\u0000\u0000\u0000\u0154\u0151\u0001"+
		"\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157)\u0001\u0000"+
		"\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0019.59?D`ekqu\u0090"+
		"\u0094\u009e\u00a2\u00c8\u00d8\u00dd\u0105\u010f\u0132\u013a\u013c\u0146"+
		"\u0154\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}