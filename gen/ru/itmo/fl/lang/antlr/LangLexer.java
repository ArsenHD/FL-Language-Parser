// Generated from //wsl$/Ubuntu/home/arsen/FormalLanguages/ANTLR_Homework/src/antlr\Lang.g4 by ANTLR 4.10.1

package ru.itmo.fl.lang.antlr;

import java.util.LinkedList;
import ru.itmo.fl.lang.tree.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, IF=2, THEN=3, ELSE=4, WHILE=5, INPUT=6, PRINT=7, COMMENT=8, 
		ID=9, NUM=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, POW=15, MUL=16, 
		DIV=17, PLUS=18, MINUS=19, EQ=20, NEQ=21, LEQ=22, LT=23, GEQ=24, GT=25, 
		NOT=26, AND=27, OR=28, SEMICOLON=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "IF", "THEN", "ELSE", "WHILE", "INPUT", "PRINT", "COMMENT", 
			"ID", "NUM", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "POW", "MUL", "DIV", 
			"PLUS", "MINUS", "EQ", "NEQ", "LEQ", "LT", "GEQ", "GT", "NOT", "AND", 
			"OR", "SEMICOLON", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'if'", "'then'", "'else'", "'while'", "'input'", "'print'", 
			null, null, null, "'('", "')'", "'{'", "'}'", "'^'", "'*'", "'/'", "'+'", 
			"'-'", "'=='", "'/='", "'<='", "'<'", "'>='", "'>'", "'!'", "'&&'", "'||'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "IF", "THEN", "ELSE", "WHILE", "INPUT", "PRINT", "COMMENT", 
			"ID", "NUM", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "POW", "MUL", "DIV", 
			"PLUS", "MINUS", "EQ", "NEQ", "LEQ", "LT", "GEQ", "GT", "NOT", "AND", 
			"OR", "SEMICOLON", "WS"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

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
		"\u0004\u0000\u001e\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007c\b\u0007\n\u0007\f\u0007f\t\u0007\u0001\b\u0001"+
		"\b\u0005\bj\b\b\n\b\f\bm\t\b\u0001\t\u0003\tp\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\tu\b\t\n\t\f\tx\t\t\u0003\tz\b\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0000\u0000\u001e\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e\u0001\u0000\u0007\u0002\u0000\n\n\r\r\u0002\u0000AZaz\u0003"+
		"\u000009AZaz\u0002\u0000++--\u0001\u000019\u0001\u000009\u0002\u0000\t"+
		"\n  \u00af\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
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
		"\u0000\u0001=\u0001\u0000\u0000\u0000\u0003?\u0001\u0000\u0000\u0000\u0005"+
		"B\u0001\u0000\u0000\u0000\u0007G\u0001\u0000\u0000\u0000\tL\u0001\u0000"+
		"\u0000\u0000\u000bR\u0001\u0000\u0000\u0000\rX\u0001\u0000\u0000\u0000"+
		"\u000f^\u0001\u0000\u0000\u0000\u0011g\u0001\u0000\u0000\u0000\u0013o"+
		"\u0001\u0000\u0000\u0000\u0015{\u0001\u0000\u0000\u0000\u0017}\u0001\u0000"+
		"\u0000\u0000\u0019\u007f\u0001\u0000\u0000\u0000\u001b\u0081\u0001\u0000"+
		"\u0000\u0000\u001d\u0083\u0001\u0000\u0000\u0000\u001f\u0085\u0001\u0000"+
		"\u0000\u0000!\u0087\u0001\u0000\u0000\u0000#\u0089\u0001\u0000\u0000\u0000"+
		"%\u008b\u0001\u0000\u0000\u0000\'\u008d\u0001\u0000\u0000\u0000)\u0090"+
		"\u0001\u0000\u0000\u0000+\u0093\u0001\u0000\u0000\u0000-\u0096\u0001\u0000"+
		"\u0000\u0000/\u0098\u0001\u0000\u0000\u00001\u009b\u0001\u0000\u0000\u0000"+
		"3\u009d\u0001\u0000\u0000\u00005\u009f\u0001\u0000\u0000\u00007\u00a2"+
		"\u0001\u0000\u0000\u00009\u00a5\u0001\u0000\u0000\u0000;\u00a7\u0001\u0000"+
		"\u0000\u0000=>\u0005=\u0000\u0000>\u0002\u0001\u0000\u0000\u0000?@\u0005"+
		"i\u0000\u0000@A\u0005f\u0000\u0000A\u0004\u0001\u0000\u0000\u0000BC\u0005"+
		"t\u0000\u0000CD\u0005h\u0000\u0000DE\u0005e\u0000\u0000EF\u0005n\u0000"+
		"\u0000F\u0006\u0001\u0000\u0000\u0000GH\u0005e\u0000\u0000HI\u0005l\u0000"+
		"\u0000IJ\u0005s\u0000\u0000JK\u0005e\u0000\u0000K\b\u0001\u0000\u0000"+
		"\u0000LM\u0005w\u0000\u0000MN\u0005h\u0000\u0000NO\u0005i\u0000\u0000"+
		"OP\u0005l\u0000\u0000PQ\u0005e\u0000\u0000Q\n\u0001\u0000\u0000\u0000"+
		"RS\u0005i\u0000\u0000ST\u0005n\u0000\u0000TU\u0005p\u0000\u0000UV\u0005"+
		"u\u0000\u0000VW\u0005t\u0000\u0000W\f\u0001\u0000\u0000\u0000XY\u0005"+
		"p\u0000\u0000YZ\u0005r\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005n\u0000"+
		"\u0000\\]\u0005t\u0000\u0000]\u000e\u0001\u0000\u0000\u0000^_\u0005/\u0000"+
		"\u0000_`\u0005/\u0000\u0000`d\u0001\u0000\u0000\u0000ac\b\u0000\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\u0010\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000gk\u0007\u0001\u0000\u0000hj\u0007\u0002\u0000"+
		"\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0012\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000np\u0007\u0003\u0000\u0000on\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000py\u0001\u0000\u0000\u0000qz\u00050\u0000"+
		"\u0000rv\u0007\u0004\u0000\u0000su\u0007\u0005\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"yq\u0001\u0000\u0000\u0000yr\u0001\u0000\u0000\u0000z\u0014\u0001\u0000"+
		"\u0000\u0000{|\u0005(\u0000\u0000|\u0016\u0001\u0000\u0000\u0000}~\u0005"+
		")\u0000\u0000~\u0018\u0001\u0000\u0000\u0000\u007f\u0080\u0005{\u0000"+
		"\u0000\u0080\u001a\u0001\u0000\u0000\u0000\u0081\u0082\u0005}\u0000\u0000"+
		"\u0082\u001c\u0001\u0000\u0000\u0000\u0083\u0084\u0005^\u0000\u0000\u0084"+
		"\u001e\u0001\u0000\u0000\u0000\u0085\u0086\u0005*\u0000\u0000\u0086 \u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005/\u0000\u0000\u0088\"\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005+\u0000\u0000\u008a$\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005-\u0000\u0000\u008c&\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005=\u0000\u0000\u008e\u008f\u0005=\u0000\u0000\u008f(\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005/\u0000\u0000\u0091\u0092\u0005=\u0000\u0000"+
		"\u0092*\u0001\u0000\u0000\u0000\u0093\u0094\u0005<\u0000\u0000\u0094\u0095"+
		"\u0005=\u0000\u0000\u0095,\u0001\u0000\u0000\u0000\u0096\u0097\u0005<"+
		"\u0000\u0000\u0097.\u0001\u0000\u0000\u0000\u0098\u0099\u0005>\u0000\u0000"+
		"\u0099\u009a\u0005=\u0000\u0000\u009a0\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005>\u0000\u0000\u009c2\u0001\u0000\u0000\u0000\u009d\u009e\u0005!"+
		"\u0000\u0000\u009e4\u0001\u0000\u0000\u0000\u009f\u00a0\u0005&\u0000\u0000"+
		"\u00a0\u00a1\u0005&\u0000\u0000\u00a16\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005|\u0000\u0000\u00a3\u00a4\u0005|\u0000\u0000\u00a48\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005;\u0000\u0000\u00a6:\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0007\u0006\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0006\u001d\u0000\u0000\u00aa<\u0001\u0000\u0000\u0000\u0006"+
		"\u0000dkovy\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}