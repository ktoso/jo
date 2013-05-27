package pl.project13.jo.antlr;// Generated from GoLang.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
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
		RULE_file = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_funcDeclaration = 3, RULE_statement = 4, RULE_packagePrefix = 5;
	public static final String[] ruleNames = {
		"file", "packageDeclaration", "importDeclaration", "funcDeclaration", 
		"statement", "packagePrefix"
	};

	@Override
	public String getGrammarFileName() { return "GoLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(12); packageDeclaration();
				}
			}

			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(15); importDeclaration();
				}
				}
				setState(20);
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
			setState(21); match(PACKAGE);
			setState(22); match(Identifier);
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
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); match(IMPORT);
				setState(25); match(StringLiteral);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26); match(IMPORT);
				setState(27); match(LPAREN);
				{
				setState(28); match(StringLiteral);
				setState(29); match(LineTerminator);
				}
				setState(31); match(RPAREN);
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
		public TerminalNode LBRACKET() { return getToken(GoLangParser.LBRACKET, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GoLangParser.RPAREN, 0); }
		public TerminalNode RBRACKET() { return getToken(GoLangParser.RBRACKET, 0); }
		public TerminalNode FUNC() { return getToken(GoLangParser.FUNC, 0); }
		public TerminalNode Identifier() { return getToken(GoLangParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(GoLangParser.LPAREN, 0); }
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
			setState(34); match(FUNC);
			setState(35); match(Identifier);
			setState(36); match(LPAREN);
			setState(37); match(RPAREN);
			setState(38); match(LBRACKET);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(39); statement();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45); match(RBRACKET);
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
		public TerminalNode StringLiteral() { return getToken(GoLangParser.StringLiteral, 0); }
		public TerminalNode RPAREN() { return getToken(GoLangParser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(GoLangParser.Identifier, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); packagePrefix();
			setState(48); match(DOT);
			setState(49); match(Identifier);
			setState(50); match(LPAREN);
			setState(51); match(StringLiteral);
			setState(52); match(RPAREN);
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
		enterRule(_localctx, 10, RULE_packagePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(Identifier);
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
		"\2\3i;\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\5\2\20\n\2"+
		"\3\2\7\2\23\n\2\f\2\16\2\26\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4#\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\2\b\2\4\6\b\n\f\2\28\2\17\3"+
		"\2\2\2\4\27\3\2\2\2\6\"\3\2\2\2\b$\3\2\2\2\n\61\3\2\2\2\f8\3\2\2\2\16"+
		"\20\5\4\3\2\17\16\3\2\2\2\17\20\3\2\2\2\20\24\3\2\2\2\21\23\5\6\4\2\22"+
		"\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\3\3\2\2\2\26"+
		"\24\3\2\2\2\27\30\7\3\2\2\30\31\7e\2\2\31\5\3\2\2\2\32\33\7\4\2\2\33#"+
		"\7d\2\2\34\35\7\4\2\2\35\36\7\27\2\2\36\37\7d\2\2\37 \7g\2\2 !\3\2\2\2"+
		"!#\7\30\2\2\"\32\3\2\2\2\"\34\3\2\2\2#\7\3\2\2\2$%\7\5\2\2%&\7e\2\2&\'"+
		"\7\27\2\2\'(\7\30\2\2(,\7\25\2\2)+\5\n\6\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2"+
		"\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\26\2\2\60\t\3\2\2\2\61\62\5\f\7"+
		"\2\62\63\7\n\2\2\63\64\7e\2\2\64\65\7\27\2\2\65\66\7d\2\2\66\67\7\30\2"+
		"\2\67\13\3\2\2\289\7e\2\29\r\3\2\2\2\6\17\24\",";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}