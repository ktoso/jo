grammar EBNF;

@header {
package pl.project13.jo.antlr;
}

// see: http://golang.org/ref/spec#Notation

Production
    : Identifier EQ Expression? DOT
    ;

Expression
    : Alternative NextAlternative*
    ;

Alternative
    : Term Term*
    ;

NextAlternative
    : PIPE Alternative
    | PIPE NextAlternative
    ;

Term
    : Identifier
    | Identifier TRIDOT Identifier
    | Group
    | Option
    | Repetition
    ;

token
    : Identifier
    ;

Group
    : LPAREN   Expression RPAREN
    ;
Option
    : LBRACKET Expression RBRACKET
    ;
Repetition
    : LBRACE   Expression RBRACE
    ;

EQ       : '=' ;
DOT      : '.' ;
PIPE     : '|' ;
LBRACE   : '{' ;
RBRACE   : '}' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
LPAREN   : '(' ;
RPAREN   : ')' ;
TRIDOT   : '…' ;



Identifier
    : IdentifierChars
    ;

fragment
IdentifierChars
    : Letter LetterOrDigit*
    ;

fragment
Letter                  // any Unicode character that is a Java letter (see below)
    : '\u0024'           // $
    | '\u0041'..'\u005a' // A-Z
    | '\u005f'           // _
    | '\u0061'..'\u007a' // a-z
    | '\u00c0'..'\u00d6' // �-�
    | '\u00d8'..'\u00f6' // �-�
    | '\u00f8'..'\u00ff' // �-�
    | '\u0100'..'\u1fff'
    | '\u3040'..'\u318f'
    | '\u3300'..'\u337f'
    | '\u3400'..'\u3d2d'
    | '\u4e00'..'\u9fff'
    | '\uf900'..'\ufaff'
    ;

fragment
Digit
    : '\u0030'..'\u0039'   // 0-9
    | '\u0660'..'\u0669'   // Arabic 0-9
    | '\u06f0'..'\u06f9'   // Arabic-Indic 0-9
    | '\u0966'..'\u096f'   // Devanagari 0-9
    | '\u09e6'..'\u09ef'   // Bengali 0-9
    | '\u0a66'..'\u0a6f'   // Gurmukhi 0-9
    | '\u0ae6'..'\u0aef'   // Gujarati 0-9
    | '\u0b66'..'\u0b6f'   // Oriya 0-9
    | '\u0be7'..'\u0bef'   // Tamil 0-9
    | '\u0c66'..'\u0c6f'   // Telugu 0-9
    | '\u0ce6'..'\u0cef'   // Kannada 0-9
    | '\u0d66'..'\u0d6f'   // Malayalam 0-9
    | '\u0e50'..'\u0e59'   // Thai 0-9
    | '\u0ed0'..'\u0ed9'   // Lao 0-9
    | '\u1040'..'\u1049'   // Myanmar 0-9
    ;

fragment
LetterOrDigit
    : Letter
    | Digit
    ;