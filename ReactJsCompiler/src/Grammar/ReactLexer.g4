// ReactLexer.g4
lexer grammar ReactLexer;
OpenBracket:                    '[';
CloseBracket:                   ']';
OpenParen:                      '(';
CloseParen:                     ')';
OpenBrace:                      '{' ;
CloseBrace:                     '}';
SemiColon:                      ';';
Comma:                          ',';
Assign:                         '=';
Not:                            '!';
QuestionMark:                   '?';
Colon:                          ':';
Dot:                            '.';
SingleCotation:                 '\'';
DoubleCotation:                 '"';
Plus:                           '+';
Minus:                          '-';
Multiply:                       '*';
Divide:                         '/';
Modulus:                        '%';
Increment:                      '++';
Decrement:                      '--';
Assign_Plus:                    '+=';
Assign_Minus:                   '-=';
Assign_Multiply:                '*=';
Assign_Divide:                  '/=';
LessThan:                       '<';
MoreThan:                       '>';
LessThanEquals:                 '<=';
GreaterThanEquals:              '>=';
Equals_:                        '==';
NotEquals:                      '!=';
IdentityEquals:                 '===';
IdentityNotEquals:              '!==';
And:                            '&&';
Or:                             '||';
ARROW:                          '=>';

/// Keywords

Do:                             'do';
While:                          'while';
If:                             'if';
Elseif:                         'elseif';
Else:                           'else';
Void:                           'void';
Return:                         'return';
For:                            'for';
Switch:                         'switch';
Case:                           'case';
Break:                          'break';
Continue:                       'continue';
Var:                            'var';
Let:                            'let';
Const:                          'const';
Function:                       'function';
This:                           'this';
Default:                        'default';
In:                             'in';
Import:                         'import';
Export:                         'export';
From:                           'from';
Map:                            'map';
Console:                        'console';
Log:                            'log';
//Jsx
Div:                            'div';
P:                              'p';
H1:                             'h1';
H2:                             'h2';
H3:                             'h3';
H4:                             'h4';
H5:                             'h5';
H6:                             'h6';
Button:                         'button';
Img:                            'img';
//hooks
Usestate:                       'useState';
Useeffect:                      'useEffect';
Useref:                         'useRef';
//Classname:                      'className';
//Onclick:                        'onClick';
Set:                            'set';
/// Id
NullLiteral:                    'null';
BooleanLiteral:                 'true' |'false';
StringLiteral:                  '"' ('\\"' | . )*? '"';
CharLiteral:                    '\''  .*? '\'';
IntLiteral:                     Digit+;
FloatLiteral:                   Digit+ '.' Digit+;
Identifier:                     [a-zA-Z] [a-zA-Z_0-9]+;
//Identifier:                 /home/ghram/Downloads/ReactJsCompiler    [a-zA-Z_0-9]+ | [a-zA-Z_][a-zA-Z_./]* | './' [a-zA-Z_][a-zA-Z0-9_/.]* |[a-zA-Z]+ ;
fragment Digit:                 [0-9];

/// comments

WS:                              [ \t\n\r]+            -> channel(HIDDEN);
MultiLineComment:               '/*' .*? '*/'      -> channel(HIDDEN);
SingleLineComment:              '//' ~[\r\n]*      -> channel(HIDDEN);
