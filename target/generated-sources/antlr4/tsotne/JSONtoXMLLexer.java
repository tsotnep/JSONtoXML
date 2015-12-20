// Generated from tsotne/JSONtoXML.g4 by ANTLR 4.5.1
package tsotne;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONtoXMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TRUE=8, FALSE=9, 
		NULL=10, StringCharacters=11, CHARACTERS=12, DIGITS=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "TRUE", "FALSE", 
		"NULL", "StringCharacters", "StringCharacter", "CHARACTERS", "DIGITS", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "':'", "'['", "']'", "'.'", "'true'", "'false'", 
		"'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "TRUE", "FALSE", "NULL", 
		"StringCharacters", "CHARACTERS", "DIGITS", "WS"
	};
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


	public JSONtoXMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSONtoXML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\6\fB\n\f\r\f\16\fC\3\f\3\f"+
		"\3\r\3\r\3\16\6\16K\n\16\r\16\16\16L\3\17\6\17P\n\17\r\17\16\17Q\3\20"+
		"\6\20U\n\20\r\20\16\20V\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\2\33\16\35\17\37\20\3\2\6\4\2$$^^\4\2C\\c|\3"+
		"\2\62;\5\2\13\f\16\17\"\"\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3"+
		"\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3"+
		"\2\2\2\21/\3\2\2\2\23\64\3\2\2\2\25:\3\2\2\2\27?\3\2\2\2\31G\3\2\2\2\33"+
		"J\3\2\2\2\35O\3\2\2\2\37T\3\2\2\2!\"\7}\2\2\"\4\3\2\2\2#$\7.\2\2$\6\3"+
		"\2\2\2%&\7\177\2\2&\b\3\2\2\2\'(\7<\2\2(\n\3\2\2\2)*\7]\2\2*\f\3\2\2\2"+
		"+,\7_\2\2,\16\3\2\2\2-.\7\60\2\2.\20\3\2\2\2/\60\7v\2\2\60\61\7t\2\2\61"+
		"\62\7w\2\2\62\63\7g\2\2\63\22\3\2\2\2\64\65\7h\2\2\65\66\7c\2\2\66\67"+
		"\7n\2\2\678\7u\2\289\7g\2\29\24\3\2\2\2:;\7p\2\2;<\7w\2\2<=\7n\2\2=>\7"+
		"n\2\2>\26\3\2\2\2?A\7$\2\2@B\5\31\r\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD"+
		"\3\2\2\2DE\3\2\2\2EF\7$\2\2F\30\3\2\2\2GH\n\2\2\2H\32\3\2\2\2IK\t\3\2"+
		"\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\34\3\2\2\2NP\t\4\2\2ON\3\2"+
		"\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\36\3\2\2\2SU\t\5\2\2TS\3\2\2\2UV\3"+
		"\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\20\2\2Y \3\2\2\2\7\2CLQV\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}