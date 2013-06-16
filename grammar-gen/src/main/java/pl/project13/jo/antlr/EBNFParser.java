// Generated from EBNF.g4 by ANTLR 4.0

package pl.project13.jo.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EBNFParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Production=1, Expression=2, Alternative=3, NextAlternative=4, Term=5, 
		Group=6, Option=7, Repetition=8, EQ=9, DOT=10, PIPE=11, LBRACE=12, RBRACE=13, 
		LBRACKET=14, RBRACKET=15, LPAREN=16, RPAREN=17, TRIDOT=18, Identifier=19;
	public static final String[] tokenNames = {
		"<INVALID>", "Production", "Expression", "Alternative", "NextAlternative", 
		"Term", "Group", "Option", "Repetition", "'='", "'.'", "'|'", "'{'", "'}'", 
		"'['", "']'", "'('", "')'", "'…'", "Identifier"
	};
	public static final int
		RULE_token = 0;
	public static final String[] ruleNames = {
		"token"
	};

	@Override
	public String getGrammarFileName() { return "EBNF.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public EBNFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(EBNFParser.Identifier, 0); }
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(Identifier);
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
		"\2\3\25\7\4\2\t\2\3\2\3\2\3\2\2\3\2\2\2\5\2\4\3\2\2\2\4\5\7\25\2\2\5\3"+
		"\3\2\2\2\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}