// Generated from /home/ghram/Downloads/ReactJsCompiler/src/Grammar/ReactParser.g4 by ANTLR 4.13.1
package Grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportState}
	 * labeled alternative in {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportState(ReactParser.ImportStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportState}
	 * labeled alternative in {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportState(ReactParser.ImportStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentState}
	 * labeled alternative in {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterComponentState(ReactParser.ComponentStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentState}
	 * labeled alternative in {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitComponentState(ReactParser.ComponentStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void enterImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void exitImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LibraryImport}
	 * labeled alternative in {@link ReactParser#importBody}.
	 * @param ctx the parse tree
	 */
	void enterLibraryImport(ReactParser.LibraryImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LibraryImport}
	 * labeled alternative in {@link ReactParser#importBody}.
	 * @param ctx the parse tree
	 */
	void exitLibraryImport(ReactParser.LibraryImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HooksImport}
	 * labeled alternative in {@link ReactParser#importBody}.
	 * @param ctx the parse tree
	 */
	void enterHooksImport(ReactParser.HooksImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HooksImport}
	 * labeled alternative in {@link ReactParser#importBody}.
	 * @param ctx the parse tree
	 */
	void exitHooksImport(ReactParser.HooksImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#singleHookImport}.
	 * @param ctx the parse tree
	 */
	void enterSingleHookImport(ReactParser.SingleHookImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#singleHookImport}.
	 * @param ctx the parse tree
	 */
	void exitSingleHookImport(ReactParser.SingleHookImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#componentStatment}.
	 * @param ctx the parse tree
	 */
	void enterComponentStatment(ReactParser.ComponentStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#componentStatment}.
	 * @param ctx the parse tree
	 */
	void exitComponentStatment(ReactParser.ComponentStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterVariableCompo(ReactParser.VariableCompoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitVariableCompo(ReactParser.VariableCompoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterArrayCompo(ReactParser.ArrayCompoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitArrayCompo(ReactParser.ArrayCompoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCompo(ReactParser.FunctionCompoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCompo(ReactParser.FunctionCompoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HooksCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterHooksCompo(ReactParser.HooksCompoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HooksCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitHooksCompo(ReactParser.HooksCompoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterIfCompo(ReactParser.IfCompoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitIfCompo(ReactParser.IfCompoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterWhileCompo(ReactParser.WhileCompoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitWhileCompo(ReactParser.WhileCompoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileCompo(ReactParser.DoWhileCompoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileCompo(ReactParser.DoWhileCompoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterForCompo(ReactParser.ForCompoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitForCompo(ReactParser.ForCompoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCompo(ReactParser.SwitchCompoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCompo}
	 * labeled alternative in {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCompo(ReactParser.SwitchCompoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#returnBody}.
	 * @param ctx the parse tree
	 */
	void enterReturnBody(ReactParser.ReturnBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#returnBody}.
	 * @param ctx the parse tree
	 */
	void exitReturnBody(ReactParser.ReturnBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JSXOpenClose}
	 * labeled alternative in {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJSXOpenClose(ReactParser.JSXOpenCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JSXOpenClose}
	 * labeled alternative in {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJSXOpenClose(ReactParser.JSXOpenCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JSXOpen}
	 * labeled alternative in {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJSXOpen(ReactParser.JSXOpenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JSXOpen}
	 * labeled alternative in {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJSXOpen(ReactParser.JSXOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTag(ReactParser.HtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTag(ReactParser.HtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(ReactParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(ReactParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(ReactParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(ReactParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(ReactParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(ReactParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayContent}.
	 * @param ctx the parse tree
	 */
	void enterArrayContent(ReactParser.ArrayContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayContent}.
	 * @param ctx the parse tree
	 */
	void exitArrayContent(ReactParser.ArrayContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(ReactParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(ReactParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(ReactParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(ReactParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UseStateDecl}
	 * labeled alternative in {@link ReactParser#hooksDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUseStateDecl(ReactParser.UseStateDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UseStateDecl}
	 * labeled alternative in {@link ReactParser#hooksDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUseStateDecl(ReactParser.UseStateDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UseRefDecl}
	 * labeled alternative in {@link ReactParser#hooksDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUseRefDecl(ReactParser.UseRefDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UseRefDecl}
	 * labeled alternative in {@link ReactParser#hooksDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUseRefDecl(ReactParser.UseRefDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UseEffectDecl}
	 * labeled alternative in {@link ReactParser#hooksDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUseEffectDecl(ReactParser.UseEffectDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UseEffectDecl}
	 * labeled alternative in {@link ReactParser#hooksDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUseEffectDecl(ReactParser.UseEffectDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#hooksReturn}.
	 * @param ctx the parse tree
	 */
	void enterHooksReturn(ReactParser.HooksReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#hooksReturn}.
	 * @param ctx the parse tree
	 */
	void exitHooksReturn(ReactParser.HooksReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpDecrementIncrement}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpDecrementIncrement(ReactParser.ExpDecrementIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpDecrementIncrement}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpDecrementIncrement(ReactParser.ExpDecrementIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpOperation}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpOperation(ReactParser.ExpOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpOperation}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpOperation(ReactParser.ExpOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpFuncCall}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpFuncCall(ReactParser.ExpFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpFuncCall}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpFuncCall(ReactParser.ExpFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpInitial}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpInitial(ReactParser.ExpInitialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpInitial}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpInitial(ReactParser.ExpInitialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpParams}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpParams(ReactParser.ExpParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpParams}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpParams(ReactParser.ExpParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpVarDecl}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpVarDecl(ReactParser.ExpVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpVarDecl}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpVarDecl(ReactParser.ExpVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpParens}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpParens(ReactParser.ExpParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpParens}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpParens(ReactParser.ExpParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ReactParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ReactParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ReactParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ReactParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ReactParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ReactParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(ReactParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(ReactParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(ReactParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(ReactParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBlock(ReactParser.DefaultBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBlock(ReactParser.DefaultBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ReactParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ReactParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(ReactParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(ReactParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(ReactParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(ReactParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(ReactParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(ReactParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterFloatValue(ReactParser.FloatValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatValue}
	 * labeled alternative in {@link ReactParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitFloatValue(ReactParser.FloatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ReactParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ReactParser.StringLiteralContext ctx);
}