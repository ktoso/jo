// Generated from GoLang.g4 by ANTLR 4.0

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
		RULE_funcDeclaration = 3, RULE_statement = 4, RULE_ifStamement = 5, RULE_elseStatement = 6, 
		RULE_returnType = 7, RULE_funcArguments = 8, RULE_returnArguments = 9, 
		RULE_funcName = 10, RULE_packagePrefix = 11;
	public static final String[] ruleNames = {
		"sourceFile", "packageDeclaration", "importDeclaration", "funcDeclaration", 
		"statement", "ifStamement", "elseStatement", "returnType", "funcArguments", 
		"returnArguments", "funcName", "packagePrefix"
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
			setState(24); packageDeclaration();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(25); importDeclaration();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(31); funcDeclaration();
				}
				}
				setState(36);
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
			setState(37); match(PACKAGE);
			setState(38); match(Identifier);
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
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); match(IMPORT);
				setState(41); match(StringLiteral);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); match(IMPORT);
				setState(43); match(LPAREN);
				{
				setState(44); match(StringLiteral);
				setState(45); match(LineTerminator);
				}
				setState(47); match(RPAREN);
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
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
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
			setState(50); match(FUNC);
			setState(51); funcName();
			setState(52); match(LPAREN);
			setState(53); match(RPAREN);
			setState(55);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(54); returnType();
				}
			}

			setState(57); match(LBRACE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (IF - 51)) | (1L << (RETURN - 51)) | (1L << (Identifier - 51)))) != 0)) {
				{
				{
				setState(58); statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64); match(RBRACE);
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
		public ReturnArgumentsContext returnArguments() {
			return getRuleContext(ReturnArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoLangParser.RPAREN, 0); }
		public IfStamementContext ifStamement() {
			return getRuleContext(IfStamementContext.class,0);
		}
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
		public TerminalNode RETURN() { return getToken(GoLangParser.RETURN, 0); }
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
			setState(78);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); packagePrefix();
				setState(67); match(DOT);
				setState(68); funcName();
				setState(69); match(LPAREN);
				setState(70); funcArguments();
				setState(71); match(RPAREN);
				setState(73);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(72); match(NEWLINE);
					}
				}

				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); ifStamement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); match(RETURN);
				setState(77); returnArguments();
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

	public static class IfStamementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public TerminalNode IF() { return getToken(GoLangParser.IF, 0); }
		public IfStamementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStamement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterIfStamement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitIfStamement(this);
		}
	}

	public final IfStamementContext ifStamement() throws RecognitionException {
		IfStamementContext _localctx = new IfStamementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStamement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(IF);
			setState(81); statement();
			setState(82); statement();
			setState(83); elseStatement();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(GoLangParser.ELSE, 0); }
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(ELSE);
			setState(86); statement();
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GoLangParser.Identifier, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(Identifier);
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
		enterRule(_localctx, 16, RULE_funcArguments);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); match(StringLiteral);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); match(StringLiteral);
				setState(92); match(COMMA);
				setState(93); funcArguments();
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

	public static class ReturnArgumentsContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(GoLangParser.StringLiteral, 0); }
		public ReturnArgumentsContext returnArguments() {
			return getRuleContext(ReturnArgumentsContext.class,0);
		}
		public ReturnArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterReturnArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitReturnArguments(this);
		}
	}

	public final ReturnArgumentsContext returnArguments() throws RecognitionException {
		ReturnArgumentsContext _localctx = new ReturnArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnArguments);
		try {
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); match(StringLiteral);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); match(StringLiteral);
				setState(98); match(COMMA);
				setState(99); returnArguments();
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
		enterRule(_localctx, 20, RULE_funcName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(Identifier);
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
		enterRule(_localctx, 22, RULE_packagePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(Identifier);
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
		"\2\3im\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3"+
		"\2\7\2#\n\2\f\2\16\2&\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\63\n\4\3\5\3\5\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\6\3\6\3\6\5\6Q\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\na\n\n\3\13\3"+
		"\13\3\13\3\13\5\13g\n\13\3\f\3\f\3\r\3\r\3\r\2\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\2j\2\32\3\2\2\2\4\'\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\nP\3"+
		"\2\2\2\fR\3\2\2\2\16W\3\2\2\2\20Z\3\2\2\2\22`\3\2\2\2\24f\3\2\2\2\26h"+
		"\3\2\2\2\30j\3\2\2\2\32\36\5\4\3\2\33\35\5\6\4\2\34\33\3\2\2\2\35 \3\2"+
		"\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37$\3\2\2\2 \36\3\2\2\2!#\5\b\5\2\"!"+
		"\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2\'(\7\3\2"+
		"\2()\7e\2\2)\5\3\2\2\2*+\7\4\2\2+\63\7d\2\2,-\7\4\2\2-.\7\27\2\2./\7d"+
		"\2\2/\60\7g\2\2\60\61\3\2\2\2\61\63\7\30\2\2\62*\3\2\2\2\62,\3\2\2\2\63"+
		"\7\3\2\2\2\64\65\7\5\2\2\65\66\5\26\f\2\66\67\7\27\2\2\679\7\30\2\28:"+
		"\5\20\t\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;?\7\23\2\2<>\5\n\6\2=<\3\2\2\2"+
		">A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\24\2\2C\t\3\2\2"+
		"\2DE\5\30\r\2EF\7\n\2\2FG\5\26\f\2GH\7\27\2\2HI\5\22\n\2IK\7\30\2\2JL"+
		"\7\6\2\2KJ\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MQ\5\f\7\2NO\7=\2\2OQ\5\24\13\2"+
		"PD\3\2\2\2PM\3\2\2\2PN\3\2\2\2Q\13\3\2\2\2RS\7\65\2\2ST\5\n\6\2TU\5\n"+
		"\6\2UV\5\16\b\2V\r\3\2\2\2WX\7\66\2\2XY\5\n\6\2Y\17\3\2\2\2Z[\7e\2\2["+
		"\21\3\2\2\2\\a\7d\2\2]^\7d\2\2^_\7\22\2\2_a\5\22\n\2`\\\3\2\2\2`]\3\2"+
		"\2\2a\23\3\2\2\2bg\7d\2\2cd\7d\2\2de\7\22\2\2eg\5\24\13\2fb\3\2\2\2fc"+
		"\3\2\2\2g\25\3\2\2\2hi\7e\2\2i\27\3\2\2\2jk\7e\2\2k\31\3\2\2\2\13\36$"+
		"\629?KP`f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}