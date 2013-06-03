// Generated from GoLang.g4 by ANTLR 4.0

package pl.project13.jo.antlr;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoLangParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PACKAGE=1, IMPORT=2, FUNC=3, NEWLINE=4, Number=5, WS=6, SEMI=7, DOT=8, 
		STAR=9, PROTECTED=10, PRIVATE=11, ABSTRACT=12, STATIC=13, FINAL=14, STRICTFP=15, 
		COMMA=16, LBRACE=17, RBRACE=18, LBRACKET=19, RBRACKET=20, LPAREN=21, RPAREN=22, 
		VOID=23, INTERFACE=24, THROW=25, THROWS=26, EQ=27, NATIVE=28, SYNCHRONIZED=29, 
		TRANSIENT=30, VOLATILE=31, BOOLEAN=32, CHAR=33, BYTE=34, SHORT=35, INT=36, 
		LONG=37, FLOAT=38, DOUBLE=39, QUES=40, EXTENDS=41, ELLIPSIS=42, THIS=43, 
		SUPER=44, NULL=45, TRUE=46, FALSE=47, AT=48, DEFAULT=49, COLON=50, IF=51, 
		ELSE=52, FOR=53, WHILE=54, DO=55, TRY=56, FINALLY=57, SWITCH=58, RETURN=59, 
		BREAK=60, CONTINUE=61, CATCH=62, CASE=63, ENUM=64, ASSERT=65, PLUSPLUS=66, 
		SUBSUB=67, TILDE=68, BANG=69, NEW=70, SLASH=71, PERCENT=72, PLUS=73, SUB=74, 
		EQEQ=75, BANGEQ=76, AMP=77, CARET=78, BAR=79, AMPAMP=80, BARBAR=81, CARETEQ=82, 
		PLUSEQ=83, SUBEQ=84, STAREQ=85, SLASHEQ=86, AMPEQ=87, BAREQ=88, PERCENTEQ=89, 
		GT=90, LT=91, INSTANCEOF=92, CONST=93, GOTO=94, IntegerLiteral=95, FloatingPointLiteral=96, 
		CharacterLiteral=97, StringLiteral=98, Identifier=99, WhiteSpace=100, 
		LineTerminator=101, SlashComment=102, EndOfLineComment=103;
	public static final String[] tokenNames = {
		"<INVALID>", "'package'", "'import'", "'func'", "'\n'", "Number", "WS", 
		"';'", "'.'", "'*'", "'protected'", "'private'", "'abstract'", "'static'", 
		"'final'", "'strictfp'", "','", "'{'", "'}'", "'['", "']'", "'('", "')'", 
		"'void'", "'interface'", "'throw'", "'throws'", "'='", "'native'", "'synchronized'", 
		"'transient'", "'volatile'", "'boolean'", "'char'", "'byte'", "'short'", 
		"'int'", "'long'", "'float'", "'double'", "'?'", "'extends'", "'...'", 
		"'this'", "'super'", "'null'", "'true'", "'false'", "'@'", "'default'", 
		"':'", "'if'", "'else'", "'for'", "'while'", "'do'", "'try'", "'finally'", 
		"'switch'", "'return'", "'break'", "'continue'", "'catch'", "'case'", 
		"'enum'", "'assert'", "'++'", "'--'", "'~'", "'!'", "'new'", "'/'", "'%'", 
		"'+'", "'-'", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'^='", 
		"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'%='", "'>'", "'<'", 
		"'instanceof'", "'const'", "'goto'", "IntegerLiteral", "FloatingPointLiteral", 
		"CharacterLiteral", "StringLiteral", "Identifier", "WhiteSpace", "LineTerminator", 
		"SlashComment", "EndOfLineComment"
	};
	public static final int
		RULE_sourceFile = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_funcDeclaration = 3, RULE_statement = 4, RULE_funcArguments = 5, 
		RULE_funcName = 6, RULE_packagePrefix = 7;
	public static final String[] ruleNames = {
		"sourceFile", "packageDeclaration", "importDeclaration", "funcDeclaration", 
		"statement", "funcArguments", "funcName", "packagePrefix"
	};

	@Override
	public String getGrammarFileName() { return "GoLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	int WHITESPACE = 1;
	int COMMENTS = 2;

	public GoLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceFileContext extends ParserRuleContext {
		public List<FuncDeclarationContext> funcDeclaration() {
			return getRuleContexts(FuncDeclarationContext.class);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public FuncDeclarationContext funcDeclaration(int i) {
			return getRuleContext(FuncDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitSourceFile(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); packageDeclaration();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(17); importDeclaration();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(23); funcDeclaration();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(GoLangParser.PACKAGE, 0); }
		public TerminalNode Identifier() { return getToken(GoLangParser.Identifier, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(PACKAGE);
			setState(30); match(Identifier);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(GoLangParser.StringLiteral, 0); }
		public TerminalNode RPAREN() { return getToken(GoLangParser.RPAREN, 0); }
		public TerminalNode IMPORT() { return getToken(GoLangParser.IMPORT, 0); }
		public TerminalNode LPAREN() { return getToken(GoLangParser.LPAREN, 0); }
		public TerminalNode LineTerminator() { return getToken(GoLangParser.LineTerminator, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			setState(40);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); match(IMPORT);
				setState(33); match(StringLiteral);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); match(IMPORT);
				setState(35); match(LPAREN);
				{
				setState(36); match(StringLiteral);
				setState(37); match(LineTerminator);
				}
				setState(39); match(RPAREN);
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

	public static class FuncDeclarationContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GoLangParser.RPAREN, 0); }
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GoLangParser.RBRACE, 0); }
		public TerminalNode FUNC() { return getToken(GoLangParser.FUNC, 0); }
		public TerminalNode LPAREN() { return getToken(GoLangParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GoLangParser.LBRACE, 0); }
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterFuncDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitFuncDeclaration(this);
		}
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(FUNC);
			setState(43); funcName();
			setState(44); match(LPAREN);
			setState(45); match(RPAREN);
			setState(46); match(LBRACE);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(47); statement();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53); match(RBRACE);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(GoLangParser.RPAREN, 0); }
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GoLangParser.NEWLINE, 0); }
		public FuncArgumentsContext funcArguments() {
			return getRuleContext(FuncArgumentsContext.class,0);
		}
		public PackagePrefixContext packagePrefix() {
			return getRuleContext(PackagePrefixContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GoLangParser.LPAREN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); packagePrefix();
			setState(56); match(DOT);
			setState(57); funcName();
			setState(58); match(LPAREN);
			setState(59); funcArguments();
			setState(60); match(RPAREN);
			setState(62);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(61); match(NEWLINE);
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

	public static class FuncArgumentsContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(GoLangParser.StringLiteral, 0); }
		public FuncArgumentsContext funcArguments() {
			return getRuleContext(FuncArgumentsContext.class,0);
		}
		public FuncArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterFuncArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitFuncArguments(this);
		}
	}

	public final FuncArgumentsContext funcArguments() throws RecognitionException {
		FuncArgumentsContext _localctx = new FuncArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcArguments);
		try {
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(StringLiteral);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(StringLiteral);
				setState(66); match(COMMA);
				setState(67); funcArguments();
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

	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GoLangParser.Identifier, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitFuncName(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(Identifier);
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

	public static class PackagePrefixContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GoLangParser.Identifier, 0); }
		public PackagePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterPackagePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitPackagePrefix(this);
		}
	}

	public final PackagePrefixContext packagePrefix() throws RecognitionException {
		PackagePrefixContext _localctx = new PackagePrefixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_packagePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(Identifier);
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
		"\2\3iM\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\3\2\3\2\7\2\25\n\2\f\2\16\2\30\13\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5\63\n\5\f\5\16\5\66\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6A\n\6\3\7\3\7\3\7\3\7\5\7G\n\7\3\b\3\b\3\t\3\t\3\t\2\n\2\4\6\b\n\f"+
		"\16\20\2\2J\2\22\3\2\2\2\4\37\3\2\2\2\6*\3\2\2\2\b,\3\2\2\2\n9\3\2\2\2"+
		"\fF\3\2\2\2\16H\3\2\2\2\20J\3\2\2\2\22\26\5\4\3\2\23\25\5\6\4\2\24\23"+
		"\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\34\3\2\2\2\30\26"+
		"\3\2\2\2\31\33\5\b\5\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35"+
		"\3\2\2\2\35\3\3\2\2\2\36\34\3\2\2\2\37 \7\3\2\2 !\7e\2\2!\5\3\2\2\2\""+
		"#\7\4\2\2#+\7d\2\2$%\7\4\2\2%&\7\27\2\2&\'\7d\2\2\'(\7g\2\2()\3\2\2\2"+
		")+\7\30\2\2*\"\3\2\2\2*$\3\2\2\2+\7\3\2\2\2,-\7\5\2\2-.\5\16\b\2./\7\27"+
		"\2\2/\60\7\30\2\2\60\64\7\23\2\2\61\63\5\n\6\2\62\61\3\2\2\2\63\66\3\2"+
		"\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\24"+
		"\2\28\t\3\2\2\29:\5\20\t\2:;\7\n\2\2;<\5\16\b\2<=\7\27\2\2=>\5\f\7\2>"+
		"@\7\30\2\2?A\7\6\2\2@?\3\2\2\2@A\3\2\2\2A\13\3\2\2\2BG\7d\2\2CD\7d\2\2"+
		"DE\7\22\2\2EG\5\f\7\2FB\3\2\2\2FC\3\2\2\2G\r\3\2\2\2HI\7e\2\2I\17\3\2"+
		"\2\2JK\7e\2\2K\21\3\2\2\2\b\26\34*\64@F";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}