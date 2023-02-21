// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GAXTLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Fmt_variable", "Fmt_space", "Fmt_tab", "Fmt_new_line", "Fmt_finish", 
			"AMPERSAND", "FINISH", "SPACE", "VARIABLE", "CONSTANT", "DIGIT", "TOKEN", 
			"ADD", "SUB", "MULT", "DIV", "CAT", "NOR", "LESS", "EQUAL", "GREATER", 
			"PRINT_INT", "PRINT_CHAR", "ASSIGN", "REVERSE", "SHAVE", "CLEAR", "IF", 
			"THEN", "ELSE", "BREAK", "CONTINUE", "READ", "WRITE", "CALL", "REPEAT", 
			"UNTIL", "STRING_EDGE", "FORMAT", "LABEL", "SAVE", "LOAD", "SWITCH", 
			"PROGRAM_END", "COMMENT"
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


	public GAXTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GAXT.g4"; }

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
		"\u0004\u0000,\u00c5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003k\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0003"+
		"\'\u00b8\b\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0000\u0000-\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O\u0000Q(S)U*W+Y,\u0001\u0000\u0005"+
		"\u0003\u0000\t\n\r\r  \u0001\u0000az\u0001\u0000AZ\u0001\u000009\u0001"+
		"\u0000!~\u00c5\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001"+
		"\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000"+
		"\u0000\u0001[\u0001\u0000\u0000\u0000\u0003^\u0001\u0000\u0000\u0000\u0005"+
		"a\u0001\u0000\u0000\u0000\u0007j\u0001\u0000\u0000\u0000\tl\u0001\u0000"+
		"\u0000\u0000\u000bo\u0001\u0000\u0000\u0000\rq\u0001\u0000\u0000\u0000"+
		"\u000fs\u0001\u0000\u0000\u0000\u0011w\u0001\u0000\u0000\u0000\u0013y"+
		"\u0001\u0000\u0000\u0000\u0015{\u0001\u0000\u0000\u0000\u0017}\u0001\u0000"+
		"\u0000\u0000\u0019\u007f\u0001\u0000\u0000\u0000\u001b\u0081\u0001\u0000"+
		"\u0000\u0000\u001d\u0083\u0001\u0000\u0000\u0000\u001f\u0085\u0001\u0000"+
		"\u0000\u0000!\u0087\u0001\u0000\u0000\u0000#\u0089\u0001\u0000\u0000\u0000"+
		"%\u008b\u0001\u0000\u0000\u0000\'\u008d\u0001\u0000\u0000\u0000)\u008f"+
		"\u0001\u0000\u0000\u0000+\u0091\u0001\u0000\u0000\u0000-\u0093\u0001\u0000"+
		"\u0000\u0000/\u0095\u0001\u0000\u0000\u00001\u0097\u0001\u0000\u0000\u0000"+
		"3\u0099\u0001\u0000\u0000\u00005\u009b\u0001\u0000\u0000\u00007\u009d"+
		"\u0001\u0000\u0000\u00009\u009f\u0001\u0000\u0000\u0000;\u00a1\u0001\u0000"+
		"\u0000\u0000=\u00a3\u0001\u0000\u0000\u0000?\u00a5\u0001\u0000\u0000\u0000"+
		"A\u00a7\u0001\u0000\u0000\u0000C\u00a9\u0001\u0000\u0000\u0000E\u00ab"+
		"\u0001\u0000\u0000\u0000G\u00ad\u0001\u0000\u0000\u0000I\u00af\u0001\u0000"+
		"\u0000\u0000K\u00b1\u0001\u0000\u0000\u0000M\u00b3\u0001\u0000\u0000\u0000"+
		"O\u00b7\u0001\u0000\u0000\u0000Q\u00b9\u0001\u0000\u0000\u0000S\u00bb"+
		"\u0001\u0000\u0000\u0000U\u00bd\u0001\u0000\u0000\u0000W\u00bf\u0001\u0000"+
		"\u0000\u0000Y\u00c1\u0001\u0000\u0000\u0000[\\\u0003M&\u0000\\]\u0003"+
		"\u0011\b\u0000]\u0002\u0001\u0000\u0000\u0000^_\u0003M&\u0000_`\u0005"+
		" \u0000\u0000`\u0004\u0001\u0000\u0000\u0000ab\u0003M&\u0000bc\u0005\t"+
		"\u0000\u0000c\u0006\u0001\u0000\u0000\u0000de\u0003M&\u0000ef\u0005\n"+
		"\u0000\u0000fk\u0001\u0000\u0000\u0000gh\u0005\'\u0000\u0000hi\u0005\\"+
		"\u0000\u0000ik\u0005n\u0000\u0000jd\u0001\u0000\u0000\u0000jg\u0001\u0000"+
		"\u0000\u0000k\b\u0001\u0000\u0000\u0000lm\u0003M&\u0000mn\u0005!\u0000"+
		"\u0000n\n\u0001\u0000\u0000\u0000op\u0005&\u0000\u0000p\f\u0001\u0000"+
		"\u0000\u0000qr\u0005!\u0000\u0000r\u000e\u0001\u0000\u0000\u0000st\u0007"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0006\u0007\u0000\u0000"+
		"v\u0010\u0001\u0000\u0000\u0000wx\u0007\u0001\u0000\u0000x\u0012\u0001"+
		"\u0000\u0000\u0000yz\u0007\u0002\u0000\u0000z\u0014\u0001\u0000\u0000"+
		"\u0000{|\u0007\u0003\u0000\u0000|\u0016\u0001\u0000\u0000\u0000}~\u0003"+
		"O\'\u0000~\u0018\u0001\u0000\u0000\u0000\u007f\u0080\u0005+\u0000\u0000"+
		"\u0080\u001a\u0001\u0000\u0000\u0000\u0081\u0082\u0005-\u0000\u0000\u0082"+
		"\u001c\u0001\u0000\u0000\u0000\u0083\u0084\u0005*\u0000\u0000\u0084\u001e"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005/\u0000\u0000\u0086 \u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005_\u0000\u0000\u0088\"\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005`\u0000\u0000\u008a$\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005<\u0000\u0000\u008c&\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"=\u0000\u0000\u008e(\u0001\u0000\u0000\u0000\u008f\u0090\u0005>\u0000"+
		"\u0000\u0090*\u0001\u0000\u0000\u0000\u0091\u0092\u0005?\u0000\u0000\u0092"+
		",\u0001\u0000\u0000\u0000\u0093\u0094\u0005$\u0000\u0000\u0094.\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005:\u0000\u0000\u00960\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005;\u0000\u0000\u00982\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005~\u0000\u0000\u009a4\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"%\u0000\u0000\u009c6\u0001\u0000\u0000\u0000\u009d\u009e\u0005{\u0000"+
		"\u0000\u009e8\u0001\u0000\u0000\u0000\u009f\u00a0\u0005|\u0000\u0000\u00a0"+
		":\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005}\u0000\u0000\u00a2<\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\\\u0000\u0000\u00a4>\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005^\u0000\u0000\u00a6@\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005(\u0000\u0000\u00a8B\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005)\u0000\u0000\u00aaD\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005@"+
		"\u0000\u0000\u00acF\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005[\u0000\u0000"+
		"\u00aeH\u0001\u0000\u0000\u0000\u00af\u00b0\u0005]\u0000\u0000\u00b0J"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\"\u0000\u0000\u00b2L\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\'\u0000\u0000\u00b4N\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0003Q(\u0000\u00b6\u00b8\u0003S)\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"P\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005.\u0000\u0000\u00baR\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005,\u0000\u0000\u00bcT\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005#\u0000\u0000\u00beV\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005\u0000\u0000\u0001\u00c0X\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\b\u0004\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0006"+
		",\u0000\u0000\u00c4Z\u0001\u0000\u0000\u0000\u0003\u0000j\u00b7\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}