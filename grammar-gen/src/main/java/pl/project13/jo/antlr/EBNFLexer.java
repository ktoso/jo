// Generated from EBNF.g4 by ANTLR 4.0

package pl.project13.jo.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EBNFLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Production=1, Expression=2, Alternative=3, NextAlternative=4, Term=5, 
		Group=6, Option=7, Repetition=8, EQ=9, DOT=10, PIPE=11, LBRACE=12, RBRACE=13, 
		LBRACKET=14, RBRACKET=15, LPAREN=16, RPAREN=17, TRIDOT=18, Identifier=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"Production", "Expression", "Alternative", "NextAlternative", "Term", 
		"Group", "Option", "Repetition", "'='", "'.'", "'|'", "'{'", "'}'", "'['", 
		"']'", "'('", "')'", "'…'", "Identifier"
	};
	public static final String[] ruleNames = {
		"Production", "Expression", "Alternative", "NextAlternative", "Term", 
		"Group", "Option", "Repetition", "EQ", "DOT", "PIPE", "LBRACE", "RBRACE", 
		"LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "TRIDOT", "Identifier", "IdentifierChars", 
		"Letter", "Digit", "LetterOrDigit"
	};


	public EBNFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EBNF.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\25\u008b\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\3\2\3\2\3\2\5\2\65\n\2\3\2\3\2\3\3\3\3\7\3;\n\3\f\3\16"+
		"\3>\13\3\3\4\3\4\7\4B\n\4\f\4\16\4E\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5M"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\7\25\177\n\25\f\25\16\25\u0082\13\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\5\30\u008a\n\30\2\31\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\24\1\'\25\1)\2\1+\2\1-\2\1/\2\1\3\2\4\16&&C\\aac|\u00c2\u00d8\u00da"+
		"\u00f8\u00fa\u2001\u3042\u3191\u3302\u3381\u3402\u3d2f\u4e02\ua001\uf902"+
		"\ufb01\21\62;\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8\u09f1\u0a68\u0a71"+
		"\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71"+
		"\u0e52\u0e5b\u0ed2\u0edb\u1042\u104b\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\3\61\3\2\2\2\58\3\2\2\2\7?\3\2\2\2\tL\3\2\2\2\13V\3\2\2\2\rX\3\2\2\2"+
		"\17\\\3\2\2\2\21`\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31j\3\2"+
		"\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2%v\3\2\2\2"+
		"\'z\3\2\2\2)|\3\2\2\2+\u0083\3\2\2\2-\u0085\3\2\2\2/\u0089\3\2\2\2\61"+
		"\62\5\'\24\2\62\64\5\23\n\2\63\65\5\5\3\2\64\63\3\2\2\2\64\65\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\5\25\13\2\67\4\3\2\2\28<\5\7\4\29;\5\t\5\2:9\3\2"+
		"\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\6\3\2\2\2><\3\2\2\2?C\5\13\6\2@B\5"+
		"\13\6\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\b\3\2\2\2EC\3\2\2\2F"+
		"G\5\27\f\2GH\5\7\4\2HM\3\2\2\2IJ\5\27\f\2JK\5\t\5\2KM\3\2\2\2LF\3\2\2"+
		"\2LI\3\2\2\2M\n\3\2\2\2NW\5\'\24\2OP\5\'\24\2PQ\5%\23\2QR\5\'\24\2RW\3"+
		"\2\2\2SW\5\r\7\2TW\5\17\b\2UW\5\21\t\2VN\3\2\2\2VO\3\2\2\2VS\3\2\2\2V"+
		"T\3\2\2\2VU\3\2\2\2W\f\3\2\2\2XY\5!\21\2YZ\5\5\3\2Z[\5#\22\2[\16\3\2\2"+
		"\2\\]\5\35\17\2]^\5\5\3\2^_\5\37\20\2_\20\3\2\2\2`a\5\31\r\2ab\5\5\3\2"+
		"bc\5\33\16\2c\22\3\2\2\2de\7?\2\2e\24\3\2\2\2fg\7\60\2\2g\26\3\2\2\2h"+
		"i\7~\2\2i\30\3\2\2\2jk\7}\2\2k\32\3\2\2\2lm\7\177\2\2m\34\3\2\2\2no\7"+
		"]\2\2o\36\3\2\2\2pq\7_\2\2q \3\2\2\2rs\7*\2\2s\"\3\2\2\2tu\7+\2\2u$\3"+
		"\2\2\2vw\7\u201c\2\2wx\7\u00c6\2\2xy\7\u00b8\2\2y&\3\2\2\2z{\5)\25\2{"+
		"(\3\2\2\2|\u0080\5+\26\2}\177\5/\30\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081*\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\t\2\2\2\u0084,\3\2\2\2\u0085\u0086\t\3\2\2\u0086.\3\2\2\2\u0087"+
		"\u008a\5+\26\2\u0088\u008a\5-\27\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2"+
		"\2\2\u008a\60\3\2\2\2\n\2\64<CLV\u0080\u0089";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}