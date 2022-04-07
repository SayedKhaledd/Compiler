// Generated from G:/Github/Compiler/src\switchh.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwitchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Coma=1, DType=2, OR=3, AND=4, EQ=5, NEQ=6, GT=7, LT=8, GTEQ=9, LTEQ=10,
		PLUS=11, MINUS=12, MULT=13, DIV=14, MOD=15, POW=16, NOT=17, SCOL=18, ASSIGN=19,
		OPAR=20, CPAR=21, OBRACE=22, CBRACE=23, TRUE=24, FALSE=25, NIL=26, IF=27,
		ELSE=28, FOR=29, LOG=30, ID=31, INT=32, FLOAT=33, STRING=34, COMMENT=35,
		SPACE=36, OTHER=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Coma", "DType", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ",
			"PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "ASSIGN",
			"OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", "FALSE", "NIL", "IF", "ELSE",
			"FOR", "LOG", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='",
			"'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "'='",
			"'('", "')'", "'{'", "'}'", "'true'", "'false'", "'nil'", "'if'", "'else'",
			"'for'", "'log'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Coma", "DType", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ",
			"LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "SCOL",
			"ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", "FALSE", "NIL",
			"IF", "ELSE", "FOR", "LOG", "ID", "INT", "FLOAT", "STRING", "COMMENT",
			"SPACE", "OTHER"
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


	public SwitchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "switchh.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		" \3 \7 \u00b2\n \f \16 \u00b5\13 \3!\6!\u00b8\n!\r!\16!\u00b9\3\"\6\""+
		"\u00bd\n\"\r\"\16\"\u00be\3\"\3\"\7\"\u00c3\n\"\f\"\16\"\u00c6\13\"\3"+
		"\"\3\"\6\"\u00ca\n\"\r\"\16\"\u00cb\5\"\u00ce\n\"\3#\3#\3#\3#\7#\u00d4"+
		"\n#\f#\16#\u00d7\13#\3#\3#\3$\3$\7$\u00dd\n$\f$\16$\u00e0\13$\3$\3$\3"+
		"%\3%\3%\3%\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3"+
		"\2\62;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00f3\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5^\3\2\2\2\7`\3\2\2\2\tc\3\2\2\2\13f\3"+
		"\2\2\2\ri\3\2\2\2\17l\3\2\2\2\21n\3\2\2\2\23p\3\2\2\2\25s\3\2\2\2\27v"+
		"\3\2\2\2\31x\3\2\2\2\33z\3\2\2\2\35|\3\2\2\2\37~\3\2\2\2!\u0080\3\2\2"+
		"\2#\u0082\3\2\2\2%\u0084\3\2\2\2\'\u0086\3\2\2\2)\u0088\3\2\2\2+\u008a"+
		"\3\2\2\2-\u008c\3\2\2\2/\u008e\3\2\2\2\61\u0090\3\2\2\2\63\u0095\3\2\2"+
		"\2\65\u009b\3\2\2\2\67\u009f\3\2\2\29\u00a2\3\2\2\2;\u00a7\3\2\2\2=\u00ab"+
		"\3\2\2\2?\u00af\3\2\2\2A\u00b7\3\2\2\2C\u00cd\3\2\2\2E\u00cf\3\2\2\2G"+
		"\u00da\3\2\2\2I\u00e3\3\2\2\2K\u00e7\3\2\2\2MN\7.\2\2N\4\3\2\2\2OP\7f"+
		"\2\2PQ\7q\2\2QR\7w\2\2RS\7d\2\2ST\7n\2\2T_\7g\2\2UV\7k\2\2VW\7p\2\2W_"+
		"\7v\2\2XY\7U\2\2YZ\7v\2\2Z[\7t\2\2[\\\7k\2\2\\]\7p\2\2]_\7i\2\2^O\3\2"+
		"\2\2^U\3\2\2\2^X\3\2\2\2_\6\3\2\2\2`a\7~\2\2ab\7~\2\2b\b\3\2\2\2cd\7("+
		"\2\2de\7(\2\2e\n\3\2\2\2fg\7?\2\2gh\7?\2\2h\f\3\2\2\2ij\7#\2\2jk\7?\2"+
		"\2k\16\3\2\2\2lm\7@\2\2m\20\3\2\2\2no\7>\2\2o\22\3\2\2\2pq\7@\2\2qr\7"+
		"?\2\2r\24\3\2\2\2st\7>\2\2tu\7?\2\2u\26\3\2\2\2vw\7-\2\2w\30\3\2\2\2x"+
		"y\7/\2\2y\32\3\2\2\2z{\7,\2\2{\34\3\2\2\2|}\7\61\2\2}\36\3\2\2\2~\177"+
		"\7\'\2\2\177 \3\2\2\2\u0080\u0081\7`\2\2\u0081\"\3\2\2\2\u0082\u0083\7"+
		"#\2\2\u0083$\3\2\2\2\u0084\u0085\7=\2\2\u0085&\3\2\2\2\u0086\u0087\7?"+
		"\2\2\u0087(\3\2\2\2\u0088\u0089\7*\2\2\u0089*\3\2\2\2\u008a\u008b\7+\2"+
		"\2\u008b,\3\2\2\2\u008c\u008d\7}\2\2\u008d.\3\2\2\2\u008e\u008f\7\177"+
		"\2\2\u008f\60\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092\u0093"+
		"\7w\2\2\u0093\u0094\7g\2\2\u0094\62\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097"+
		"\7c\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a"+
		"\64\3\2\2\2\u009b\u009c\7p\2\2\u009c\u009d\7k\2\2\u009d\u009e\7n\2\2\u009e"+
		"\66\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a18\3\2\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6:\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2"+
		"\2\u00aa<\3\2\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7"+
		"i\2\2\u00ae>\3\2\2\2\u00af\u00b3\t\2\2\2\u00b0\u00b2\t\3\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"@\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\t\4\2\2\u00b7\u00b6\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00baB\3"+
		"\2\2\2\u00bb\u00bd\t\4\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4\7\60"+
		"\2\2\u00c1\u00c3\t\4\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00ce\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c9\7\60\2\2\u00c8\u00ca\t\4\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00bc\3\2\2\2\u00cd\u00c7\3\2\2\2\u00ceD\3\2\2\2\u00cf\u00d5"+
		"\7$\2\2\u00d0\u00d4\n\5\2\2\u00d1\u00d2\7$\2\2\u00d2\u00d4\7$\2\2\u00d3"+
		"\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\7$\2\2\u00d9F\3\2\2\2\u00da\u00de\7%\2\2\u00db\u00dd\n\6\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\b$\2\2\u00e2"+
		"H\3\2\2\2\u00e3\u00e4\t\7\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b%\2\2\u00e6"+
		"J\3\2\2\2\u00e7\u00e8\13\2\2\2\u00e8L\3\2\2\2\r\2^\u00b3\u00b9\u00be\u00c4"+
		"\u00cb\u00cd\u00d3\u00d5\u00de\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
