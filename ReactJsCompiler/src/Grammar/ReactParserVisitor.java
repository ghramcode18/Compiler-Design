// Generated from /home/ghram/Downloads/ReactJsCompiler/src/Grammar/ReactParser.g4 by ANTLR 4.13.1
package Grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportState}
	 * labeled alternative in {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportState(ReactParser.ImportStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentState}
	 * labeled alternative in {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentState(ReactParser.ComponentStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LibraryImport}
	 * labeled alternative in {@link ReactParser#importBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryImport(ReactParser.LibraryImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HooksImport}
	 * labeled alternative in {@link ReactParser#importBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHooksImport(ReactParser.HooksImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#singleHookImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleHookImport(ReactParser.SingleHookImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#componentStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStatment(ReactParser.ComponentStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableCompo(ReactParser.VariableCompoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCompo(ReactParser.ArrayCompoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCompo(ReactParser.FunctionCompoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HooksCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHooksCompo(ReactParser.HooksCompoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCompo(ReactParser.IfCompoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCompo(ReactParser.WhileCompoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileCompo(ReactParser.DoWhileCompoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCompo(ReactParser.ForCompoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCompo(ReactParser.SwitchCompoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#returnBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBody(ReactParser.ReturnBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JSXOpenClose}
	 * labeled alternative in {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJSXOpenClose(ReactParser.JSXOpenCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JSXOpen}
	 * labeled alternative in {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJSXOpen(ReactParser.JSXOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTag(ReactParser.HtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(ReactParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(ReactParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(ReactParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayContent(ReactParser.ArrayContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(ReactParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(ReactParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UseStateDecl}
	 * labeled alternative in {@link ReactParser#hooksDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStateDecl(ReactParser.UseStateDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UseRefDecl}
	 * labeled alternative in {@link ReactParser#hooksDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRefDecl(ReactParser.UseRefDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UseEffectDecl}
	 * labeled alternative in {@link ReactParser#hooksDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffectDecl(ReactParser.UseEffectDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hooksReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHooksReturn(ReactParser.HooksReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpDecrementIncrement}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDecrementIncrement(ReactParser.ExpDecrementIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpOperation}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOperation(ReactParser.ExpOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpFuncCall}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFuncCall(ReactParser.ExpFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpInitial}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpInitial(ReactParser.ExpInitialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpParams}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParams(ReactParser.ExpParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpVarDecl}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpVarDecl(ReactParser.ExpVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpParens}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParens(ReactParser.ExpParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ReactParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(ReactParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ReactParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(ReactParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(ReactParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#defaultBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBlock(ReactParser.DefaultBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ReactParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(ReactParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(ReactParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(ReactParser.IntValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatValue(ReactParser.FloatValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ReactParser.StringLiteralContext ctx);
}