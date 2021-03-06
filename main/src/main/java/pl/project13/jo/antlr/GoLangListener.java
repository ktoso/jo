// Generated from GoLang.g4 by ANTLR 4.0

package pl.project13.jo.antlr;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GoLangListener extends ParseTreeListener {
	void enterStatement(GoLangParser.StatementContext ctx);
	void exitStatement(GoLangParser.StatementContext ctx);

	void enterFuncDeclaration(GoLangParser.FuncDeclarationContext ctx);
	void exitFuncDeclaration(GoLangParser.FuncDeclarationContext ctx);

	void enterReturnArguments(GoLangParser.ReturnArgumentsContext ctx);
	void exitReturnArguments(GoLangParser.ReturnArgumentsContext ctx);

	void enterPackageDeclaration(GoLangParser.PackageDeclarationContext ctx);
	void exitPackageDeclaration(GoLangParser.PackageDeclarationContext ctx);

	void enterSourceFile(GoLangParser.SourceFileContext ctx);
	void exitSourceFile(GoLangParser.SourceFileContext ctx);

	void enterFuncName(GoLangParser.FuncNameContext ctx);
	void exitFuncName(GoLangParser.FuncNameContext ctx);

	void enterIfStamement(GoLangParser.IfStamementContext ctx);
	void exitIfStamement(GoLangParser.IfStamementContext ctx);

	void enterFuncArguments(GoLangParser.FuncArgumentsContext ctx);
	void exitFuncArguments(GoLangParser.FuncArgumentsContext ctx);

	void enterElseStatement(GoLangParser.ElseStatementContext ctx);
	void exitElseStatement(GoLangParser.ElseStatementContext ctx);

	void enterPackagePrefix(GoLangParser.PackagePrefixContext ctx);
	void exitPackagePrefix(GoLangParser.PackagePrefixContext ctx);

	void enterImportDeclaration(GoLangParser.ImportDeclarationContext ctx);
	void exitImportDeclaration(GoLangParser.ImportDeclarationContext ctx);

	void enterReturnType(GoLangParser.ReturnTypeContext ctx);
	void exitReturnType(GoLangParser.ReturnTypeContext ctx);
}