// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GAXTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Fmt_variable=1, Fmt_space=2, Fmt_tab=3, Fmt_new_line=4, Fmt_finish=5, 
		AMPERSAND=6, FINISH=7, SPACE=8, VARIABLE=9, CONSTANT=10, DIGIT=11, TOKEN=12, 
		ADD=13, SUB=14, MULT=15, DIV=16, CAT=17, NOR=18, LESS=19, EQUAL=20, GREATER=21, 
		PRINT_INT=22, PRINT_CHAR=23, ASSIGN=24, REVERSE=25, SHAVE=26, CLEAR=27, 
		IF=28, THEN=29, ELSE=30, BREAK=31, CONTINUE=32, READ=33, WRITE=34, CALL=35, 
		REPEAT=36, UNTIL=37, STRING_EDGE=38, FORMAT=39, SAVE=40, LOAD=41, SWITCH=42, 
		PROGRAM_END=43, COMMENT=44;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_string = 2, RULE_expr_in_string = 3, 
		RULE_string_char = 4, RULE_formatter = 5, RULE_fmt_expr = 6, RULE_flow = 7, 
		RULE_full_branch = 8, RULE_short_branch = 9, RULE_service = 10, RULE_direct_stack_op = 11, 
		RULE_print = 12, RULE_stack_op = 13, RULE_stack_logical = 14, RULE_stack_math = 15, 
		RULE_stack_push = 16, RULE_loop = 17, RULE_macro = 18, RULE_store_macro = 19, 
		RULE_call_macro = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "string", "expr_in_string", "string_char", "formatter", 
			"fmt_expr", "flow", "full_branch", "short_branch", "service", "direct_stack_op", 
			"print", "stack_op", "stack_logical", "stack_math", "stack_push", "loop", 
			"macro", "store_macro", "call_macro"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'&'", "'!'", null, null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'_'", "'`'", "'<'", "'='", "'>'", 
			"'?'", "'$'", "':'", "';'", "'~'", "'%'", "'{'", "'|'", "'}'", "'\\'", 
			"'^'", "'('", "')'", "'@'", "'['", "']'", "'\"'", "'''", "'.'", "','", 
			"'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Fmt_variable", "Fmt_space", "Fmt_tab", "Fmt_new_line", "Fmt_finish", 
			"AMPERSAND", "FINISH", "SPACE", "VARIABLE", "CONSTANT", "DIGIT", "TOKEN", 
			"ADD", "SUB", "MULT", "DIV", "CAT", "NOR", "LESS", "EQUAL", "GREATER", 
			"PRINT_INT", "PRINT_CHAR", "ASSIGN", "REVERSE", "SHAVE", "CLEAR", "IF", 
			"THEN", "ELSE", "BREAK", "CONTINUE", "READ", "WRITE", "CALL", "REPEAT", 
			"UNTIL", "STRING_EDGE", "FORMAT", "SAVE", "LOAD", "SWITCH", "PROGRAM_END", 
			"COMMENT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GAXTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode FINISH() { return getToken(GAXTParser.FINISH, 0); }
		public TerminalNode EOF() { return getToken(GAXTParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4791572889088L) != 0) {
				{
				{
				setState(42);
				expression();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(FINISH);
			setState(49);
			match(EOF);
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
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Store_macroContext store_macro() {
			return getRuleContext(Store_macroContext.class,0);
		}
		public Stack_pushContext stack_push() {
			return getRuleContext(Stack_pushContext.class,0);
		}
		public Stack_opContext stack_op() {
			return getRuleContext(Stack_opContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Direct_stack_opContext direct_stack_op() {
			return getRuleContext(Direct_stack_opContext.class,0);
		}
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public FlowContext flow() {
			return getRuleContext(FlowContext.class,0);
		}
		public Call_macroContext call_macro() {
			return getRuleContext(Call_macroContext.class,0);
		}
		public TerminalNode TOKEN() { return getToken(GAXTParser.TOKEN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				loop();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				store_macro();
				}
				break;
			case VARIABLE:
			case CONSTANT:
			case DIGIT:
			case STRING_EDGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				stack_push();
				}
				break;
			case ADD:
			case SUB:
			case MULT:
			case DIV:
			case CAT:
			case NOR:
			case LESS:
			case EQUAL:
			case GREATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				stack_op();
				}
				break;
			case PRINT_INT:
			case PRINT_CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				print();
				}
				break;
			case ASSIGN:
			case REVERSE:
			case SHAVE:
			case CLEAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				direct_stack_op();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				service();
				}
				break;
			case IF:
			case BREAK:
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				flow();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 9);
				{
				setState(59);
				call_macro();
				}
				break;
			case TOKEN:
				enterOuterAlt(_localctx, 10);
				{
				setState(60);
				match(TOKEN);
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
	public static class StringContext extends ParserRuleContext {
		public String_charContext string_chars;
		public List<TerminalNode> STRING_EDGE() { return getTokens(GAXTParser.STRING_EDGE); }
		public TerminalNode STRING_EDGE(int i) {
			return getToken(GAXTParser.STRING_EDGE, i);
		}
		public List<String_charContext> string_char() {
			return getRuleContexts(String_charContext.class);
		}
		public String_charContext string_char(int i) {
			return getRuleContext(String_charContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(STRING_EDGE);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4516694982270L) != 0) {
				{
				{
				setState(64);
				((StringContext)_localctx).string_chars = string_char();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(STRING_EDGE);
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
	public static class Expr_in_stringContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Store_macroContext store_macro() {
			return getRuleContext(Store_macroContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(GAXTParser.VARIABLE, 0); }
		public TerminalNode CONSTANT() { return getToken(GAXTParser.CONSTANT, 0); }
		public TerminalNode DIGIT() { return getToken(GAXTParser.DIGIT, 0); }
		public Stack_opContext stack_op() {
			return getRuleContext(Stack_opContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Direct_stack_opContext direct_stack_op() {
			return getRuleContext(Direct_stack_opContext.class,0);
		}
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public FlowContext flow() {
			return getRuleContext(FlowContext.class,0);
		}
		public Call_macroContext call_macro() {
			return getRuleContext(Call_macroContext.class,0);
		}
		public TerminalNode TOKEN() { return getToken(GAXTParser.TOKEN, 0); }
		public Expr_in_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_in_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterExpr_in_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitExpr_in_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitExpr_in_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_in_stringContext expr_in_string() throws RecognitionException {
		Expr_in_stringContext _localctx = new Expr_in_stringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr_in_string);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				loop();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				store_macro();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(VARIABLE);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(CONSTANT);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(DIGIT);
				}
				break;
			case ADD:
			case SUB:
			case MULT:
			case DIV:
			case CAT:
			case NOR:
			case LESS:
			case EQUAL:
			case GREATER:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				stack_op();
				}
				break;
			case PRINT_INT:
			case PRINT_CHAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				print();
				}
				break;
			case ASSIGN:
			case REVERSE:
			case SHAVE:
			case CLEAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				direct_stack_op();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 9);
				{
				setState(80);
				service();
				}
				break;
			case IF:
			case BREAK:
			case CONTINUE:
				enterOuterAlt(_localctx, 10);
				{
				setState(81);
				flow();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 11);
				{
				setState(82);
				call_macro();
				}
				break;
			case TOKEN:
				enterOuterAlt(_localctx, 12);
				{
				setState(83);
				match(TOKEN);
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
	public static class String_charContext extends ParserRuleContext {
		public Expr_in_stringContext expr_in_string() {
			return getRuleContext(Expr_in_stringContext.class,0);
		}
		public FormatterContext formatter() {
			return getRuleContext(FormatterContext.class,0);
		}
		public String_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterString_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitString_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitString_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_charContext string_char() throws RecognitionException {
		String_charContext _localctx = new String_charContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_char);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
			case CONSTANT:
			case DIGIT:
			case TOKEN:
			case ADD:
			case SUB:
			case MULT:
			case DIV:
			case CAT:
			case NOR:
			case LESS:
			case EQUAL:
			case GREATER:
			case PRINT_INT:
			case PRINT_CHAR:
			case ASSIGN:
			case REVERSE:
			case SHAVE:
			case CLEAR:
			case IF:
			case BREAK:
			case CONTINUE:
			case READ:
			case CALL:
			case REPEAT:
			case SWITCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				expr_in_string();
				}
				break;
			case Fmt_variable:
			case Fmt_space:
			case Fmt_tab:
			case Fmt_new_line:
			case Fmt_finish:
			case AMPERSAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				formatter();
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
	public static class FormatterContext extends ParserRuleContext {
		public TerminalNode Fmt_variable() { return getToken(GAXTParser.Fmt_variable, 0); }
		public TerminalNode Fmt_space() { return getToken(GAXTParser.Fmt_space, 0); }
		public TerminalNode Fmt_tab() { return getToken(GAXTParser.Fmt_tab, 0); }
		public TerminalNode Fmt_new_line() { return getToken(GAXTParser.Fmt_new_line, 0); }
		public TerminalNode Fmt_finish() { return getToken(GAXTParser.Fmt_finish, 0); }
		public Fmt_exprContext fmt_expr() {
			return getRuleContext(Fmt_exprContext.class,0);
		}
		public FormatterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterFormatter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitFormatter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitFormatter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatterContext formatter() throws RecognitionException {
		FormatterContext _localctx = new FormatterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formatter);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Fmt_variable:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(Fmt_variable);
				}
				break;
			case Fmt_space:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(Fmt_space);
				}
				break;
			case Fmt_tab:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(Fmt_tab);
				}
				break;
			case Fmt_new_line:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(Fmt_new_line);
				}
				break;
			case Fmt_finish:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(Fmt_finish);
				}
				break;
			case AMPERSAND:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				fmt_expr();
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
	public static class Fmt_exprContext extends ParserRuleContext {
		public List<TerminalNode> AMPERSAND() { return getTokens(GAXTParser.AMPERSAND); }
		public TerminalNode AMPERSAND(int i) {
			return getToken(GAXTParser.AMPERSAND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Fmt_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fmt_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterFmt_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitFmt_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitFmt_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fmt_exprContext fmt_expr() throws RecognitionException {
		Fmt_exprContext _localctx = new Fmt_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fmt_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(AMPERSAND);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4791572889088L) != 0) {
				{
				{
				setState(99);
				expression();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(AMPERSAND);
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
	public static class FlowContext extends ParserRuleContext {
		public Full_branchContext full_branch() {
			return getRuleContext(Full_branchContext.class,0);
		}
		public Short_branchContext short_branch() {
			return getRuleContext(Short_branchContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(GAXTParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(GAXTParser.CONTINUE, 0); }
		public FlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitFlow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitFlow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowContext flow() throws RecognitionException {
		FlowContext _localctx = new FlowContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_flow);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				full_branch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				short_branch();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(BREAK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(CONTINUE);
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
	public static class Full_branchContext extends ParserRuleContext {
		public ExpressionContext true_branch;
		public ExpressionContext false_branch;
		public TerminalNode IF() { return getToken(GAXTParser.IF, 0); }
		public TerminalNode THEN() { return getToken(GAXTParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(GAXTParser.ELSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Full_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterFull_branch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitFull_branch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitFull_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_branchContext full_branch() throws RecognitionException {
		Full_branchContext _localctx = new Full_branchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_full_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IF);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4791572889088L) != 0) {
				{
				{
				setState(114);
				((Full_branchContext)_localctx).true_branch = expression();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(THEN);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4791572889088L) != 0) {
				{
				{
				setState(121);
				((Full_branchContext)_localctx).false_branch = expression();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(ELSE);
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
	public static class Short_branchContext extends ParserRuleContext {
		public ExpressionContext true_branch;
		public TerminalNode IF() { return getToken(GAXTParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(GAXTParser.ELSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Short_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterShort_branch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitShort_branch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitShort_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Short_branchContext short_branch() throws RecognitionException {
		Short_branchContext _localctx = new Short_branchContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_short_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IF);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4791572889088L) != 0) {
				{
				{
				setState(130);
				((Short_branchContext)_localctx).true_branch = expression();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(ELSE);
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
	public static class ServiceContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GAXTParser.SWITCH, 0); }
		public ServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitService(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitService(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceContext service() throws RecognitionException {
		ServiceContext _localctx = new ServiceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(SWITCH);
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
	public static class Direct_stack_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(GAXTParser.ASSIGN, 0); }
		public TerminalNode CLEAR() { return getToken(GAXTParser.CLEAR, 0); }
		public TerminalNode REVERSE() { return getToken(GAXTParser.REVERSE, 0); }
		public TerminalNode SHAVE() { return getToken(GAXTParser.SHAVE, 0); }
		public Direct_stack_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_stack_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterDirect_stack_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitDirect_stack_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitDirect_stack_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Direct_stack_opContext direct_stack_op() throws RecognitionException {
		Direct_stack_opContext _localctx = new Direct_stack_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_direct_stack_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT_INT() { return getToken(GAXTParser.PRINT_INT, 0); }
		public TerminalNode PRINT_CHAR() { return getToken(GAXTParser.PRINT_CHAR, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==PRINT_INT || _la==PRINT_CHAR) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stack_opContext extends ParserRuleContext {
		public Stack_mathContext stack_math() {
			return getRuleContext(Stack_mathContext.class,0);
		}
		public Stack_logicalContext stack_logical() {
			return getRuleContext(Stack_logicalContext.class,0);
		}
		public Stack_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterStack_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitStack_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitStack_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_opContext stack_op() throws RecognitionException {
		Stack_opContext _localctx = new Stack_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stack_op);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MULT:
			case DIV:
			case CAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				stack_math();
				}
				break;
			case NOR:
			case LESS:
			case EQUAL:
			case GREATER:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				stack_logical();
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
	public static class Stack_logicalContext extends ParserRuleContext {
		public TerminalNode NOR() { return getToken(GAXTParser.NOR, 0); }
		public TerminalNode LESS() { return getToken(GAXTParser.LESS, 0); }
		public TerminalNode EQUAL() { return getToken(GAXTParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(GAXTParser.GREATER, 0); }
		public Stack_logicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterStack_logical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitStack_logical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitStack_logical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_logicalContext stack_logical() throws RecognitionException {
		Stack_logicalContext _localctx = new Stack_logicalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stack_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stack_mathContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(GAXTParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GAXTParser.SUB, 0); }
		public TerminalNode MULT() { return getToken(GAXTParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GAXTParser.DIV, 0); }
		public TerminalNode CAT() { return getToken(GAXTParser.CAT, 0); }
		public Stack_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterStack_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitStack_math(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitStack_math(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_mathContext stack_math() throws RecognitionException {
		Stack_mathContext _localctx = new Stack_mathContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stack_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stack_pushContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(GAXTParser.VARIABLE, 0); }
		public TerminalNode CONSTANT() { return getToken(GAXTParser.CONSTANT, 0); }
		public TerminalNode DIGIT() { return getToken(GAXTParser.DIGIT, 0); }
		public Stack_pushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterStack_push(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitStack_push(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitStack_push(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_pushContext stack_push() throws RecognitionException {
		Stack_pushContext _localctx = new Stack_pushContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stack_push);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_EDGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				string();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(VARIABLE);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(CONSTANT);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(DIGIT);
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
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(GAXTParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(GAXTParser.UNTIL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(REPEAT);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4791572889088L) != 0) {
				{
				{
				setState(159);
				expression();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(UNTIL);
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
	public static class MacroContext extends ParserRuleContext {
		public Store_macroContext store_macro() {
			return getRuleContext(Store_macroContext.class,0);
		}
		public Call_macroContext call_macro() {
			return getRuleContext(Call_macroContext.class,0);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_macro);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				store_macro();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				call_macro();
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
	public static class Store_macroContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(GAXTParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(GAXTParser.WRITE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Store_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterStore_macro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitStore_macro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitStore_macro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Store_macroContext store_macro() throws RecognitionException {
		Store_macroContext _localctx = new Store_macroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_store_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(READ);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4791572889088L) != 0) {
				{
				{
				setState(172);
				expression();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(WRITE);
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
	public static class Call_macroContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(GAXTParser.CALL, 0); }
		public Call_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).enterCall_macro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAXTListener ) ((GAXTListener)listener).exitCall_macro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GAXTVisitor ) return ((GAXTVisitor<? extends T>)visitor).visitCall_macro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_macroContext call_macro() throws RecognitionException {
		Call_macroContext _localctx = new Call_macroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_call_macro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(CALL);
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

	public static final String _serializedATN =
		"\u0004\u0001,\u00b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005\u0000"+
		",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004Y\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0005\u0006e\b\u0006\n\u0006\f\u0006h\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007p\b\u0007"+
		"\u0001\b\u0001\b\u0005\bt\b\b\n\b\f\bw\t\b\u0001\b\u0001\b\u0005\b{\b"+
		"\b\n\b\f\b~\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u0084\b\t\n\t"+
		"\f\t\u0087\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u0093\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u009d\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00a1\b"+
		"\u0011\n\u0011\f\u0011\u00a4\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00aa\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00ae\b\u0013\n\u0013\f\u0013\u00b1\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000"+
		"\u0004\u0001\u0000\u0018\u001b\u0001\u0000\u0016\u0017\u0001\u0000\u0012"+
		"\u0015\u0001\u0000\r\u0011\u00cb\u0000-\u0001\u0000\u0000\u0000\u0002"+
		"=\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006T\u0001"+
		"\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000"+
		"\fb\u0001\u0000\u0000\u0000\u000eo\u0001\u0000\u0000\u0000\u0010q\u0001"+
		"\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u008a\u0001"+
		"\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018\u008e\u0001"+
		"\u0000\u0000\u0000\u001a\u0092\u0001\u0000\u0000\u0000\u001c\u0094\u0001"+
		"\u0000\u0000\u0000\u001e\u0096\u0001\u0000\u0000\u0000 \u009c\u0001\u0000"+
		"\u0000\u0000\"\u009e\u0001\u0000\u0000\u0000$\u00a9\u0001\u0000\u0000"+
		"\u0000&\u00ab\u0001\u0000\u0000\u0000(\u00b4\u0001\u0000\u0000\u0000*"+
		",\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005\u0007\u0000\u000012\u0005"+
		"\u0000\u0000\u00012\u0001\u0001\u0000\u0000\u00003>\u0003\"\u0011\u0000"+
		"4>\u0003&\u0013\u00005>\u0003 \u0010\u00006>\u0003\u001a\r\u00007>\u0003"+
		"\u0018\f\u00008>\u0003\u0016\u000b\u00009>\u0003\u0014\n\u0000:>\u0003"+
		"\u000e\u0007\u0000;>\u0003(\u0014\u0000<>\u0005\f\u0000\u0000=3\u0001"+
		"\u0000\u0000\u0000=4\u0001\u0000\u0000\u0000=5\u0001\u0000\u0000\u0000"+
		"=6\u0001\u0000\u0000\u0000=7\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000"+
		"\u0000=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000\u0000"+
		"?C\u0005&\u0000\u0000@B\u0003\b\u0004\u0000A@\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005&\u0000"+
		"\u0000G\u0005\u0001\u0000\u0000\u0000HU\u0003\"\u0011\u0000IU\u0003&\u0013"+
		"\u0000JU\u0005\t\u0000\u0000KU\u0005\n\u0000\u0000LU\u0005\u000b\u0000"+
		"\u0000MU\u0003\u001a\r\u0000NU\u0003\u0018\f\u0000OU\u0003\u0016\u000b"+
		"\u0000PU\u0003\u0014\n\u0000QU\u0003\u000e\u0007\u0000RU\u0003(\u0014"+
		"\u0000SU\u0005\f\u0000\u0000TH\u0001\u0000\u0000\u0000TI\u0001\u0000\u0000"+
		"\u0000TJ\u0001\u0000\u0000\u0000TK\u0001\u0000\u0000\u0000TL\u0001\u0000"+
		"\u0000\u0000TM\u0001\u0000\u0000\u0000TN\u0001\u0000\u0000\u0000TO\u0001"+
		"\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0007\u0001\u0000"+
		"\u0000\u0000VY\u0003\u0006\u0003\u0000WY\u0003\n\u0005\u0000XV\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\t\u0001\u0000\u0000\u0000Za\u0005"+
		"\u0001\u0000\u0000[a\u0005\u0002\u0000\u0000\\a\u0005\u0003\u0000\u0000"+
		"]a\u0005\u0004\u0000\u0000^a\u0005\u0005\u0000\u0000_a\u0003\f\u0006\u0000"+
		"`Z\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000"+
		"\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000"+
		"\u0000\u0000a\u000b\u0001\u0000\u0000\u0000bf\u0005\u0006\u0000\u0000"+
		"ce\u0003\u0002\u0001\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u0006\u0000\u0000j\r\u0001"+
		"\u0000\u0000\u0000kp\u0003\u0010\b\u0000lp\u0003\u0012\t\u0000mp\u0005"+
		"\u001f\u0000\u0000np\u0005 \u0000\u0000ok\u0001\u0000\u0000\u0000ol\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000"+
		"p\u000f\u0001\u0000\u0000\u0000qu\u0005\u001c\u0000\u0000rt\u0003\u0002"+
		"\u0001\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000x|\u0005\u001d\u0000\u0000y{\u0003\u0002\u0001"+
		"\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u001e\u0000\u0000\u0080\u0011"+
		"\u0001\u0000\u0000\u0000\u0081\u0085\u0005\u001c\u0000\u0000\u0082\u0084"+
		"\u0003\u0002\u0001\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u001e\u0000\u0000\u0089\u0013"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005*\u0000\u0000\u008b\u0015\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0007\u0000\u0000\u0000\u008d\u0017\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0007\u0001\u0000\u0000\u008f\u0019\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0003\u001e\u000f\u0000\u0091\u0093\u0003"+
		"\u001c\u000e\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u001b\u0001\u0000\u0000\u0000\u0094\u0095\u0007"+
		"\u0002\u0000\u0000\u0095\u001d\u0001\u0000\u0000\u0000\u0096\u0097\u0007"+
		"\u0003\u0000\u0000\u0097\u001f\u0001\u0000\u0000\u0000\u0098\u009d\u0003"+
		"\u0004\u0002\u0000\u0099\u009d\u0005\t\u0000\u0000\u009a\u009d\u0005\n"+
		"\u0000\u0000\u009b\u009d\u0005\u000b\u0000\u0000\u009c\u0098\u0001\u0000"+
		"\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d!\u0001\u0000\u0000"+
		"\u0000\u009e\u00a2\u0005$\u0000\u0000\u009f\u00a1\u0003\u0002\u0001\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005%\u0000\u0000\u00a6#\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0003&\u0013\u0000\u00a8\u00aa\u0003(\u0014\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa%\u0001\u0000\u0000"+
		"\u0000\u00ab\u00af\u0005!\u0000\u0000\u00ac\u00ae\u0003\u0002\u0001\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\"\u0000\u0000\u00b3\'\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005#\u0000\u0000\u00b5)\u0001\u0000\u0000\u0000\u0010-=CTX`f"+
		"ou|\u0085\u0092\u009c\u00a2\u00a9\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}