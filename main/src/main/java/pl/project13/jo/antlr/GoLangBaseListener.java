// Generated from GoLang.g4 by ANTLR 4.0

package pl.project13.jo.antlr;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class GoLangBaseListener implements GoLangListener {
	@Override public void enterStatement(GoLangParser.StatementContext ctx) { }
	@Override public void exitStatement(GoLangParser.StatementContext ctx) { }

	@Override public void enterFuncDeclaration(GoLangParser.FuncDeclarationContext ctx) { }
	@Override public void exitFuncDeclaration(GoLangParser.FuncDeclarationContext ctx) { }

	@Override public void enterPackageDeclaration(GoLangParser.PackageDeclarationContext ctx) { }
	@Override public void exitPackageDeclaration(GoLangParser.PackageDeclarationContext ctx) { }

	@Override public void enterSourceFile(GoLangParser.SourceFileContext ctx) { }
	@Override public void exitSourceFile(GoLangParser.SourceFileContext ctx) { }

	@Override public void enterPackagePrefix(GoLangParser.PackagePrefixContext ctx) { }
	@Override public void exitPackagePrefix(GoLangParser.PackagePrefixContext ctx) { }

	@Override public void enterImportDeclaration(GoLangParser.ImportDeclarationContext ctx) { }
	@Override public void exitImportDeclaration(GoLangParser.ImportDeclarationContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}