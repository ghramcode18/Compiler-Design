package AST;

import AST.Expression.Expression;
import AST.Expression.ExpressionIncDec;
import AST.Expression.ExpressionOper;
import AST.Expression.FunctionCall;
import AST.Expression.initial.*;
import AST.Statement.ComponentStatement;
import AST.Statement.Parameters;
import AST.Statement.ReturnBody;
import AST.Statement.Statement;
import AST.Statement.componentBody.Array.ArrayElement;
import AST.Statement.componentBody.FunctionDeclaration;
import AST.Statement.componentBody.FunctionReturn;
import AST.Statement.componentBody.Hooks.*;
import AST.Statement.componentBody.ViriableDeclaration;
import AST.Statement.componentBody.Array.ArrayContent;
import AST.Statement.componentBody.Array.ArrayDeclaration;
import AST.Statement.imports.HooksImport;
import AST.Statement.imports.Import;
import AST.Statement.imports.ImportStatement;
import AST.Statement.imports.LibraryImport;
import Grammar.ReactParser;
import Grammar.ReactParserBaseVisitor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;

public class ASTVisitor extends ReactParserBaseVisitor {
    //---------------Program---------------------------//
    public Program visitProgram(ReactParser.ProgramContext ctx) {
        List<Node> statements = new ArrayList<>();
        for(int i = 0; i < ctx.statement().size(); ++i) {
            statements.add((Node)this.visit(ctx.statement().get(i)));
        }
        return new Program(statements);
    }
    //--------------Import-----------------------------//
    public Import visitImportState(ReactParser.ImportStateContext ctx) {
        return (Import)this.visit(ctx.importStatment());
    }

    public Import visitImportStatment(ReactParser.ImportStatmentContext ctx) {
        List<ImportStatement> importStatements = new ArrayList<>();

        for(int i = 0; i < ctx.importBody().size(); ++i) {
            importStatements.add((ImportStatement)this.visit(ctx.importBody().get(i)));
        }

        return new Import(importStatements);
    }

    public LibraryImport visitLibraryImport(ReactParser.LibraryImportContext ctx) {
        String stringLiteral = null;
        String identifier = null;
        if (ctx.stringLiteral() != null) {
            stringLiteral = (String)this.visit(ctx.stringLiteral());
        }

        if (ctx.Identifier() != null) {
            identifier = ctx.Identifier().getText();
        }

        return new LibraryImport(identifier, stringLiteral);
    }

    public HooksImport visitHooksImport(ReactParser.HooksImportContext ctx) {
        List<String> singleHook = new ArrayList<>();

        for(int i = 0; i < ctx.singleHookImport().size(); ++i) {
            singleHook.add((String)this.visit(ctx.singleHookImport().get(i)));
        }

        String stringLiteral = (String)this.visit(ctx.stringLiteral());
        return new HooksImport(singleHook, stringLiteral);
    }

    public String visitSingleHookImport(ReactParser.SingleHookImportContext ctx) {

        return ctx.getChild(0).getText();
    }

    //-----------------------Component-----------------------//
    public ComponentStatement visitComponentStatment(ReactParser.ComponentStatmentContext ctx) {
        String identifier = ctx.Identifier().getText();
        Parameters parameters = new Parameters();
        List<Statement> ComponentBody = new ArrayList<>();
        ReturnBody returnBody = (ReturnBody) visit(ctx.returnBody());
        if (ctx.componentBody() != null) {
            for(int i = 0; i < ctx.componentBody().size(); ++i) {
                ComponentBody.add((Statement) visit(ctx.componentBody().get(i)));
            }
        }
        if (ctx.parameters() != null) {
            parameters = (Parameters) visit(ctx.parameters());
        }
        return new ComponentStatement(identifier, parameters, ComponentBody, returnBody);
    }

    public ReturnBody visitReturnBody(ReactParser.ReturnBodyContext ctx) {
        String jsxElement = "jsxElement";

        return new ReturnBody(jsxElement);
    }

    //---------------------------Viriable-------------------//
    public ViriableDeclaration visitVariableCompo(ReactParser.VariableCompoContext ctx) {
        return (ViriableDeclaration) visit(ctx.variableDeclaration());
    }

    public ViriableDeclaration visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx) {
        String type = (String) visit(ctx.type());
        String identifier = ctx.Identifier().getText();
        Expression expression = null;

        if (ctx.expression() != null) {
            expression = (Expression) visit(ctx.expression());
        }

        return new ViriableDeclaration(type, identifier, expression);
    }
    //-----------------------Array---------------------------//
    public ArrayDeclaration visitArrayCompo(ReactParser.ArrayCompoContext ctx) {
        return (ArrayDeclaration) visit(ctx.arrayDeclaration());
    }

    public ArrayDeclaration visitArrayDeclaration(ReactParser.ArrayDeclarationContext ctx) {
        String type =  (String) visit(ctx.type());
        String identifier = ctx.Identifier().getText();
        List<ArrayContent> arrayContents = new ArrayList<>();

        if (ctx.arrayContent() != null) {
            for(int i = 0; i < ctx.arrayContent().size(); ++i) {
                arrayContents.add((ArrayContent)this.visit(ctx.arrayContent().get(i)));
            }
        }
        return new ArrayDeclaration(type, identifier, arrayContents);
    }
    @Override
    public ArrayContent visitArrayContent(ReactParser.ArrayContentContext ctx) {
        List<ArrayElement> arrayElements =new ArrayList<>();
        for(int i = 0; i < ctx.arrayElement().size(); ++i) {
            arrayElements.add((ArrayElement) visit(ctx.arrayElement().get(i)));
        }
        return new ArrayContent(arrayElements);
    }

    @Override
    public ArrayElement visitArrayElement(ReactParser.ArrayElementContext ctx) {
        String stringLiteral = (String) visit(ctx.stringLiteral());
        String identifier = ctx.Identifier().getText();
        return new ArrayElement(identifier,stringLiteral);
    }



    //-----------------------Function-----------------------//
    public FunctionDeclaration visitFunctionCompo(ReactParser.FunctionCompoContext ctx) {
       return (FunctionDeclaration) visit(ctx.functionDeclaration());
    }
    @Override
    public Object visitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx) {
        String identifier = null;
        Parameters parameters = new Parameters();
        List<Expression> expressions = new ArrayList<>();
        FunctionReturn functionReturn = new FunctionReturn();
        if (ctx.Identifier() !=null){
            identifier=ctx.Identifier().getText();
        }
        if (ctx.parameters() != null) {
            parameters = (Parameters) visit(ctx.parameters());
        }

        if (ctx.expression() != null) {
            for(int i = 0; i < ctx.expression().size(); ++i) {
                expressions.add((Expression) visit(ctx.expression().get(i)));
            }
        }

        if (ctx.functionReturn()!= null) {
            functionReturn= (FunctionReturn) visit(ctx.functionReturn());
        }

        return new FunctionDeclaration(identifier, parameters, expressions, functionReturn);
    }
    //Function return
    @Override
    public FunctionReturn visitFunctionReturn(ReactParser.FunctionReturnContext ctx) {
        List<Expression> expressions =new ArrayList<>();
        for(int i = 0; i < ctx.expression().size(); ++i) {
            expressions.add((Expression) visit(ctx.expression().get(i)));
        }
        return new FunctionReturn(expressions);
    }
    //Parameters
    @Override
    public Parameters visitParameters(ReactParser.ParametersContext ctx) {
        List<String> paramters =new ArrayList<>();

        for(int i = 0; i < ctx.Identifier().size(); ++i) {
            paramters.add(String.valueOf(ctx.Identifier().get(i)));
        }
        return new Parameters(paramters);
    }

    //-----------------------Hooks------------------------//
    public HooksDeclaration visitHooksCompo(ReactParser.HooksCompoContext ctx) {
        return (HooksDeclaration) visit(ctx.hooksDeclaration());
    }
    //UseState
    public UseStateDecl visitUseStateDecl(ReactParser.UseStateDeclContext ctx) {
        String identifier1 = ctx.Identifier(0).getText();
        String identifier2 = ctx.Identifier(1).getText();
        Initial initial = (Initial) visit(ctx.initial());

        return new UseStateDecl(identifier1, identifier2, initial);
    }
    //UseRef
    public UseRefDecl visitUseRefDecl(ReactParser.UseRefDeclContext ctx) {
        String identifier = ctx.Identifier().getText();
        return new UseRefDecl(identifier);
    }
    //UseEffect
    public UseEffectDecl visitUseEffectDecl(ReactParser.UseEffectDeclContext ctx) {
        Expression expression = null;
        HooksReturn hooksReturn=new HooksReturn();
        String identifier = ctx.Identifier().getText();
        if (ctx.expression() != null) {
               expression = (Expression) visit(ctx.expression());
        }
        if(ctx.hooksReturn() != null){
            hooksReturn = (HooksReturn) visit(ctx.hooksReturn());
        }


        return new UseEffectDecl(expression, hooksReturn, identifier);
    }
   //Hooks Return
    @Override
    public HooksReturn visitHooksReturn(ReactParser.HooksReturnContext ctx) {
        List<Expression> expressions = new ArrayList<>();

        if (ctx.expression()!=null){
            for(int i = 0; i < ctx.expression().size(); ++i) {
                expressions.add((Expression) visit(ctx.expression().get(i)));
            }
        }
        return new HooksReturn(expressions);
    }
    //------------------Expression--------------------//
    @Override
    public Expression visitExpParens(ReactParser.ExpParensContext ctx) {
        return (Expression) visit(ctx.expression());
    }

    @Override
    public ExpressionOper visitExpOperation(ReactParser.ExpOperationContext ctx) {
        Expression left = (Expression) visit(ctx.expression().get(0));
        Expression right = (Expression) visit(ctx.expression().get(1));
        String op =ctx.getChild(1).getText();
        return new ExpressionOper(left,right,op);
    }
    @Override
    public ExpressionIncDec visitExpDecrementIncrement(ReactParser.ExpDecrementIncrementContext ctx) {
        Expression expression = (Expression) visit(ctx.expression());
        String op =ctx.getChild(1).getText();
        return new ExpressionIncDec(expression,op);
    }


    @Override
    public FunctionCall visitExpFuncCall(ReactParser.ExpFuncCallContext ctx) {
        return (FunctionCall) visit(ctx.functionCall());
    }
    //function Call
    @Override
    public FunctionCall visitFunctionCall(ReactParser.FunctionCallContext ctx) {
        String identifier = ctx.getText();
        Expression expression = (Expression) visit(ctx.expression());
        return new FunctionCall(identifier,expression);
    }

    @Override
    public ViriableDeclaration visitExpVarDecl(ReactParser.ExpVarDeclContext ctx) {
        return (ViriableDeclaration) visit(ctx.variableDeclaration());
    }
    @Override
    public Parameters visitExpParams(ReactParser.ExpParamsContext ctx) {
        return (Parameters) visit(ctx.parameters());
    }


    //---------------------Type-----------------------//
    public String visitType(ReactParser.TypeContext ctx) {
        return ctx.getChild(0).getText();
    }
    //---------------------Initial--------------------//
    //String
    @Override
    public StringValue visitStringValue(ReactParser.StringValueContext ctx) {
        String s =null;
        if(ctx.Identifier()!=null){
             s =(String) ctx.Identifier().getText();
        }
       return new StringValue(s);
    }
    //Boolean
    @Override
    public BoolValue visitBoolValue(ReactParser.BoolValueContext ctx) {
        boolean b = Boolean.parseBoolean(ctx.BooleanLiteral().getText()) ;
        return new BoolValue(b);
    }
    //Integer
    @Override
    public IntValue visitIntValue(ReactParser.IntValueContext ctx) {
        int i =Integer.parseInt(ctx.IntLiteral().getText());
        return new IntValue(i);
    }
    //Float
    @Override
    public FloatValue visitFloatValue(ReactParser.FloatValueContext ctx) {
        float f =Float.parseFloat(ctx.FloatLiteral().getText());
        return new FloatValue(f);
    }

    //---------------------stringLiteral--------------------//
    public String visitStringLiteral(ReactParser.StringLiteralContext ctx) {
        return ctx.getChild(0).getText();
    }
}
