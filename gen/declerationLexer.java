// Generated from G:/Github/Compiler/src\Decleration.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class declerationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, INTEGER=2, DOUBLE=3, INTEGERTYPE=4, DOUBLETYPE=5, DECLERATION=6,
		ID=7, WS=8, ASSIGNMENT=9, DOUBLESEQ=10, DIGITSEQ=11, K=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "INTEGER", "DOUBLE", "INTEGERTYPE", "DOUBLETYPE", "DECLERATION",
			"ID", "WS", "ASSIGNMENT", "DOUBLESEQ", "DIGITSEQ", "K"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "INTEGER", "DOUBLE", "INTEGERTYPE", "DOUBLETYPE", "DECLERATION",
			"ID", "WS", "ASSIGNMENT", "DOUBLESEQ", "DIGITSEQ", "K"
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


	public declerationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decleration.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\3\7\3$\n\3\f"+
		"\3\16\3\'\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\6\3\6\3\7\3\7\7"+
		"\7W\n\7\f\7\16\7Z\13\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7\3\b\5\bd\n\b\3"+
		"\b\7\bg\n\b\f\b\16\bj\13\b\3\t\6\tm\n\t\r\t\16\tn\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13z\n\13\3\f\6\f}\n\f\r\f\16\f~\3\r\3\r\2\2\16"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\5\5\2C\\"+
		"aac|\6\2\62;C\\aac|\5\2\f\f\"\"tt\2\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\35\3\2\2\2\5"+
		"\37\3\2\2\2\7*\3\2\2\2\tA\3\2\2\2\13P\3\2\2\2\rT\3\2\2\2\17c\3\2\2\2\21"+
		"l\3\2\2\2\23r\3\2\2\2\25y\3\2\2\2\27|\3\2\2\2\31\u0080\3\2\2\2\33\36\5"+
		"\5\3\2\34\36\5\7\4\2\35\33\3\2\2\2\35\34\3\2\2\2\36\4\3\2\2\2\37 \5\t"+
		"\5\2 !\5\r\7\2!%\5\27\f\2\"$\5\21\t\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2"+
		"%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\5\31\r\2)\6\3\2\2\2*+\5\13\6\2+,\5\r"+
		"\7\2,\60\5\25\13\2-/\5\21\t\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\5\31\r\2\64\b\3\2\2\2\65\66"+
		"\7k\2\2\66\67\7p\2\2\67B\7v\2\289\7n\2\29:\7q\2\2:;\7p\2\2;B\7i\2\2<="+
		"\7u\2\2=>\7j\2\2>?\7q\2\2?@\7t\2\2@B\7v\2\2A\65\3\2\2\2A8\3\2\2\2A<\3"+
		"\2\2\2BC\3\2\2\2CD\5\21\t\2D\n\3\2\2\2EF\7f\2\2FG\7q\2\2GH\7w\2\2HI\7"+
		"d\2\2IJ\7n\2\2JQ\7g\2\2KL\7h\2\2LM\7n\2\2MN\7q\2\2NO\7c\2\2OQ\7v\2\2P"+
		"E\3\2\2\2PK\3\2\2\2QR\3\2\2\2RS\5\21\t\2S\f\3\2\2\2TX\5\17\b\2UW\5\21"+
		"\t\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[_\5\23"+
		"\n\2\\^\5\21\t\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\16\3\2\2\2"+
		"a_\3\2\2\2bd\t\2\2\2cb\3\2\2\2dh\3\2\2\2eg\t\3\2\2fe\3\2\2\2gj\3\2\2\2"+
		"hf\3\2\2\2hi\3\2\2\2i\20\3\2\2\2jh\3\2\2\2km\t\4\2\2lk\3\2\2\2mn\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\t\2\2q\22\3\2\2\2rs\7?\2\2s\24\3"+
		"\2\2\2tz\5\27\f\2uv\5\27\f\2vw\7\60\2\2wx\5\27\f\2xz\3\2\2\2yt\3\2\2\2"+
		"yu\3\2\2\2z\26\3\2\2\2{}\4\62;\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\30\3\2\2\2\u0080\u0081\7=\2\2\u0081\32\3\2\2\2\20\2\35%\60"+
		"APX_cfhny~\3\3\t\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
