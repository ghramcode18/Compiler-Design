// ReactParser.g4
parser grammar ReactParser;

options {tokenVocab=ReactLexer;}
program
    :  (statement)+ EOF
    ;
statement
    :   importStatment                                                                             #ImportState
    |   componentStatment                                                                          #ComponentState
    ;
importStatment
    :   Import importBody (Comma importBody)* SemiColon?
    ;
importBody
    :   Identifier From? stringLiteral?                                                            #LibraryImport  //React from '/App.css' , React
    |   OpenBrace singleHookImport (Comma singleHookImport)* CloseBrace From stringLiteral         #HooksImport   // { useState } from 'react'
    |   stringLiteral                                                                              #LibraryImport   // "./App.css";
    ;
singleHookImport
    : Identifier
    | Usestate
    | Useref
    | Useeffect
    ;
componentStatment
    :   (Export Default)? Function Identifier OpenParen parameters?
          CloseParen OpenBrace (componentBody)* returnBody CloseBrace
    ;
componentBody
    :   variableDeclaration                                                                        #VariableCompo
    |   arrayDeclaration                                                                           #ArrayCompo
    |   functionDeclaration                                                                        #FunctionCompo
    |   hooksDeclaration                                                                           #HooksCompo
    |   ifStatement                                                                              #IfCompo
    |   whileStatement                                                                           #WhileCompo
    |   doWhileStatement                                                                         #DoWhileCompo
    |   forStatement                                                                             #ForCompo
    |   switchStatement                                                                          #SwitchCompo
    ;
returnBody
    : Return OpenParen jsxElement+ CloseParen SemiColon?
    ;
jsxElement
    : LessThan htmlTag? (htmlAttribute)* MoreThan (htmlContent)* LessThan Divide htmlTag? MoreThan    #JSXOpenClose
    | LessThan htmlTag? (htmlAttribute)* Divide? MoreThan                                             #JSXOpen
    ;

htmlTag
    : Div
    | P
    | H1
    | H2
    | H3
    | H4
    | H5
    | H6
    | Button
    | Img
    | Identifier
    ;

htmlAttribute
    :  Identifier  Assign OpenBrace? (Identifier (Dot Identifier)*|stringLiteral|functionDeclaration)*  CloseBrace?
    ;

htmlContent
    : OpenBrace Identifier Dot Map OpenParen (expression)* ARROW (OpenParen)* jsxElement? CloseParen? CloseParen? CloseBrace
    | (Dot|Colon)? OpenBrace? Identifier ( Dot Identifier)* CloseBrace?
    | OpenBrace? jsxElement+ CloseBrace?
    | OpenBrace? Identifier And OpenParen? jsxElement+ CloseParen? CloseBrace?
    ;
variableDeclaration
    :  type Identifier(Assign expression)? SemiColon?
    ;
arrayDeclaration
    : type Identifier Assign OpenBracket arrayContent (Comma arrayContent)* CloseBracket SemiColon;
arrayContent
    : OpenBrace arrayElement (Comma arrayElement)* CloseBrace Comma?;
arrayElement
    : Identifier Colon stringLiteral;

functionDeclaration
    :  Function? Identifier? OpenParen parameters? CloseParen ARROW? OpenBrace (expression)*  functionReturn? CloseBrace
    ;

functionReturn
    : Return OpenParen expression* CloseParen SemiColon?
    ;
parameters
    :  OpenBrace? Identifier (Comma Identifier)* CloseBrace?
    ;

hooksDeclaration
    : Const OpenBracket Identifier Comma Identifier CloseBracket Assign Usestate OpenParen initial CloseParen (SemiColon)?                               # UseStateDecl
    | Const OpenBracket Identifier CloseBracket Assign Useref OpenParen CloseParen (SemiColon)?                                                          # UseRefDecl
    | Useeffect OpenParen expression? OpenParen CloseParen ARROW OpenBrace hooksReturn?
     CloseBrace Comma OpenBracket Identifier CloseBracket CloseParen (SemiColon)?                                                                        # UseEffectDecl
    ;
hooksReturn
    : Return OpenParen expression* CloseParen ARROW OpenBrace CloseBrace
    ;
expression
    : OpenParen expression CloseParen                                                                                              #ExpParens
    | expression (Multiply|Divide|Plus|Minus|Modulus|Assign|Equals_|NotEquals|IdentityNotEquals|IdentityEquals)expression          #ExpOperation
    | expression (Assign_Plus|Assign_Minus|Assign_Multiply|Assign_Divide)expression                                                #ExpOperation
    | expression (LessThan|MoreThan|LessThanEquals|GreaterThanEquals|ARROW) expression                                             #ExpOperation
    | expression (And|Or)expression                                                                                                #ExpOperation
    | expression Increment SemiColon?                                                                                              #ExpDecrementIncrement
    | expression Decrement SemiColon?                                                                                              #ExpDecrementIncrement
    | functionCall                                                                                                                 #ExpFuncCall
    | initial                                                                                                                      #ExpInitial
    | parameters                                                                                                                   #ExpParams
    | variableDeclaration                                                                                                          #ExpVarDecl
    ;
functionCall
    :  Identifier OpenParen expression CloseParen (SemiColon)?
    ;
ifStatement
    : If OpenParen expression CloseParen OpenBrace expression* CloseBrace (Elseif OpenParen expression CloseParen OpenBrace expression* CloseBrace)* (Else OpenBrace expression* CloseBrace)?
    ;
whileStatement
    : While OpenParen expression CloseParen  OpenBrace expression* CloseBrace
    ;
doWhileStatement
    : Do  OpenBrace expression* CloseBrace While OpenParen expression CloseParen
    ;
forStatement
    : For OpenParen expression? SemiColon expression? SemiColon expression? CloseParen OpenBrace expression* CloseBrace
    | For OpenParen type Identifier Colon Identifier CloseParen OpenBrace statement* CloseBrace
    ;
switchStatement
    : Switch OpenParen expression CloseParen OpenBrace switchBlock CloseBrace
    ;

switchBlock: (caseBlock | defaultBlock)+;

caseBlock
    : Case expression Colon expression*
    ;

defaultBlock
    : Default Colon expression*
    ;
type
    :  Var
    |  Let
    |  Const
    ;
initial
    :  NullLiteral                                                                     #StringValue
    |  BooleanLiteral                                                                  #BoolValue
    |  Identifier                                                                      #StringValue
    |  IntLiteral                                                                      #IntValue
    |  FloatLiteral                                                                    #FloatValue
    |  StringLiteral                                                                   #StringValue
    ;
stringLiteral
    : StringLiteral
    | CharLiteral
    | Identifier
    ;