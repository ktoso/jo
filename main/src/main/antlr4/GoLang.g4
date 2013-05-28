grammar GoLang;

@header {
package pl.project13.jo.antlr;
}

@members {
int WHITESPACE = 1;
int COMMENTS = 2;
}

sourceFile: packageDeclaration
            importDeclaration*
            funcDeclaration*;

packageDeclaration : PACKAGE Identifier
                   ;

importDeclaration : IMPORT StringLiteral
                  | IMPORT LPAREN (StringLiteral LineTerminator) RPAREN
                  ;

funcDeclaration : FUNC Identifier LPAREN RPAREN LBRACE statement* RBRACE
                ;

statement : packagePrefix '.' Identifier LPAREN StringLiteral RPAREN NEWLINE?
          ;

packagePrefix : Identifier
              ;
                
PACKAGE : 'package' ;

IMPORT : 'import' ;

FUNC : 'func' ;

NEWLINE : '\n' ;

/* A number: can be an integer value, or a decimal value */
Number : ('0'..'9')+ ('.' ('0'..'9')+)? ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines









SEMI         : ';';
DOT          : '.';
STAR         : '*';
PROTECTED    : 'protected';
PRIVATE      : 'private';
ABSTRACT     : 'abstract';
STATIC       : 'static';
FINAL        : 'final';
STRICTFP     : 'strictfp';
COMMA        : ',';
LBRACE       : '{';
RBRACE       : '}';
LBRACKET     : '[';
RBRACKET     : ']';
LPAREN       : '(';
RPAREN       : ')';
VOID         : 'void';
INTERFACE    : 'interface';
THROW        : 'throw';
THROWS       : 'throws';
EQ           : '=';
NATIVE       : 'native';
SYNCHRONIZED : 'synchronized';
TRANSIENT    : 'transient';
VOLATILE     : 'volatile';
BOOLEAN      : 'boolean';
CHAR         : 'char';
BYTE         : 'byte';
SHORT        : 'short';
INT          : 'int';
LONG         : 'long';
FLOAT        : 'float';
DOUBLE       : 'double';
QUES         : '?';
EXTENDS      : 'extends';
ELLIPSIS     : '...';
THIS         : 'this';
SUPER        : 'super';
NULL         : 'null';
TRUE         : 'true';
FALSE        : 'false';
AT           : '@';
DEFAULT      : 'default';
COLON        : ':';
IF           : 'if';
ELSE         : 'else';
FOR          : 'for';
WHILE        : 'while';
DO           : 'do';
TRY          : 'try';
FINALLY      : 'finally';
SWITCH       : 'switch';
RETURN       : 'return';
BREAK        : 'break';
CONTINUE     : 'continue';
CATCH        : 'catch';
CASE         : 'case';
ENUM         : 'enum';
ASSERT       : 'assert';
PLUSPLUS     : '++';
SUBSUB       : '--';
TILDE        : '~';
BANG         : '!';
NEW          : 'new';
SLASH        : '/';
PERCENT      : '%';
PLUS         : '+';
SUB          : '-';
EQEQ         : '==';
BANGEQ       : '!=';
AMP          : '&';
CARET        : '^';
BAR          : '|';
AMPAMP       : '&&';
BARBAR       : '||';
CARETEQ      : '^=';
PLUSEQ       : '+=';
SUBEQ        : '-=';
STAREQ       : '*=';
SLASHEQ      : '/=';
AMPEQ        : '&=';
BAREQ        : '|=';
PERCENTEQ    : '%=';
GT           : '>';
LT           : '<';
INSTANCEOF   : 'instanceof';
CONST        : 'const';
GOTO         : 'goto';

fragment
ZeroToThree
    :    '0'..'3'
    ;

fragment
IntegerTypeSuffix
    :    'l'
    |    'L'
    ;

fragment
DecimalFloatingPointLiteral
    :    Digits DOT Digits? ExponentPart? FloatTypeSuffix?
    |    DOT Digits ExponentPart? FloatTypeSuffix?
    |    Digits ExponentPart FloatTypeSuffix?
    |    Digits ExponentPart? FloatTypeSuffix
    ;

fragment
HexadecimalFloatingPointLiteral
    :    HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
JavaLetterOrDigit
    :    JavaLetter
    |    JavaDigit
    ;

fragment
UnicodeMarker
    :    'u'+                                                                                                           // u
    ;

/////////////////////////////////////////////// NUMBERS ///////////////////////////////////////

fragment
DecimalNumeral
    :    '0'
    |    NonZeroDigit Digits?
    |    NonZeroDigit Underscores Digits
    ;

fragment
Digits
    :    Digit
    |    Digit DigitsAndUnderscores? Digit
    ;

fragment
Digit
    :    '0'
    |    NonZeroDigit
    ;

fragment
NonZeroDigit
    :    '1'..'9'
    ;

fragment
DigitsAndUnderscores
    :    DigitOrUnderscore+
    ;

fragment
DigitOrUnderscore
    :    Digit
    |    '_'
    ;

fragment
Underscores
    :    '_'+
    ;

fragment
HexNumeral
    :    '0' 'x' HexDigits
    |    '0' 'X' HexDigits
    ;

fragment
HexDigits
    :    HexDigit
    |    HexDigit HexDigitsAndUnderscores? HexDigit
    ;

fragment
HexDigit
    :    ('0'..'9' | 'a'..'f' | 'A'..'F')
    ;

fragment
HexDigitsAndUnderscores
    :    HexDigitOrUnderscore+
    ;

fragment
HexDigitOrUnderscore
    :    HexDigit
    |    '_'
    ;

fragment
OctalNumeral
    :    '0' OctalDigits
    |    '0' Underscores OctalDigits
    ;

fragment
OctalDigits
    :    OctalDigit
    |    OctalDigit OctalDigitsAndUnderscores? OctalDigit
    ;

fragment
OctalDigit
    :    '0'..'7'
    ;

fragment
OctalDigitsAndUnderscores
    :    OctalDigitOrUnderscore+
    ;

fragment
OctalDigitOrUnderscore
    :    OctalDigit
    |    '_'
    ;

fragment
BinaryNumeral
    :    '0' 'b' BinaryDigits
    |    '0' 'B' BinaryDigits
    ;

fragment
BinaryDigits
    :    BinaryDigit
    |    BinaryDigit BinaryDigitsAndUnderscores? BinaryDigit
    ;

fragment
BinaryDigit
    :    '0'..'1'
    ;

fragment
BinaryDigitsAndUnderscores
    :    BinaryDigitOrUnderscore+
    ;

fragment
BinaryDigitOrUnderscore
    :    BinaryDigit
    |    '_'
    ;


fragment
ExponentPart
    :    ('e' | 'E') SignedInteger
    ;

fragment
SignedInteger
    :    Sign? Digits
    ;

fragment
Sign
    :    PLUS
    |    SUB
    ;

fragment
FloatTypeSuffix
    :    'f'
    |    'F'
    |    'd'
    |    'D'
    ;

fragment
HexSignificand
    :    HexNumeral
    |    HexNumeral DOT
    |    '0' 'x' HexDigits? DOT HexDigits
    |    '0' 'X' HexDigits? DOT HexDigits
    ;

fragment
BinaryExponent
    :    ('p' | 'P') SignedInteger
    ;

fragment
SingleCharacter
    :    ~['\\]
    ;

fragment
OctalEscape
    :    '\\' OctalDigit                                                                                                  // \ OctalDigit
    |    '\\' OctalDigit OctalDigit                                                                                       // \ OctalDigit OctalDigit
    |    '\\' ZeroToThree OctalDigit OctalDigit                                                                           // \ ZeroToThree OctalDigit OctalDigit
    ;

fragment
IdentifierChars
    :    JavaLetter JavaLetterOrDigit*                                                                                                   // JavaLetter
    ;

fragment
JavaLetter                  // any Unicode character that is a Java letter (see below)
    :    '\u0024'           // $
    |    '\u0041'..'\u005a' // A-Z
    |    '\u005f'           // _
    |    '\u0061'..'\u007a' // a-z
    |    '\u00c0'..'\u00d6' // �-�
    |    '\u00d8'..'\u00f6' // �-�
    |    '\u00f8'..'\u00ff' // �-�
    |    '\u0100'..'\u1fff'
    |    '\u3040'..'\u318f'
    |    '\u3300'..'\u337f'
    |    '\u3400'..'\u3d2d'
    |    '\u4e00'..'\u9fff'
    |    '\uf900'..'\ufaff'
    ;

fragment
JavaDigit
    :    '\u0030'..'\u0039'   // 0-9
    |    '\u0660'..'\u0669'   // Arabic 0-9
    |    '\u06f0'..'\u06f9'   // Arabic-Indic 0-9
    |    '\u0966'..'\u096f'   // Devanagari 0-9
    |    '\u09e6'..'\u09ef'   // Bengali 0-9
    |    '\u0a66'..'\u0a6f'   // Gurmukhi 0-9
    |    '\u0ae6'..'\u0aef'   // Gujarati 0-9
    |    '\u0b66'..'\u0b6f'   // Oriya 0-9
    |    '\u0be7'..'\u0bef'   // Tamil 0-9
    |    '\u0c66'..'\u0c6f'   // Telugu 0-9
    |    '\u0ce6'..'\u0cef'   // Kannada 0-9
    |    '\u0d66'..'\u0d6f'   // Malayalam 0-9
    |    '\u0e50'..'\u0e59'   // Thai 0-9
    |    '\u0ed0'..'\u0ed9'   // Lao 0-9
    |    '\u1040'..'\u1049'   // Myanmar 0-9
    ;

fragment
EscapeSequence
    :    '\\b' /* \u0008: backspace BS */
    |    '\\t' /* \u0009: horizontal tab HT */
    |    '\\n' /* \u000a: linefeed LF */
    |    '\\f' /* \u000c: form feed FF */
    |    '\\r' /* \u000d: carriage return CR */
    |    '\\"' /* \u0022: double quote " */
    |    '\\\'' /* \u0027: single quote ' */
    |    '\\\\' /* \u005c: backslash \ */
    |    OctalEscape /* \u0000 to \u00ff: from octal value */
    ;

fragment
RawInputCharacter	// any Unicode character
    :    '\u0024'
    |    '\u0041'..'\u005a'
    |    '\u005f'
    |    '\u0061'..'\u007a'
    |    '\u00c0'..'\u00d6'
    |    '\u00d8'..'\u00f6'
    |    '\u00f8'..'\u00ff'
    |    '\u0100'..'\u1fff'
    |    '\u3040'..'\u318f'
    |    '\u3300'..'\u337f'
    |    '\u3400'..'\u3d2d'
    |    '\u4e00'..'\u9fff'
    |    '\uf900'..'\ufaff'
    ;

fragment
DecimalIntegerLiteral
    :    DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :    HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :    OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :    BinaryNumeral IntegerTypeSuffix?
    ;


fragment
InputCharacter
    :    UnicodeInputCharacter
    ;

fragment
UnicodeInputCharacter
    :    UnicodeEscape                                                                                                 // UnicodeEscape
    |    RawInputCharacter                                                                                             // RawInputCharacter
    ;

fragment
UnicodeEscape
    :    '\\' UnicodeMarker HexDigit HexDigit HexDigit HexDigit
    ;

fragment
StringCharacters
    :    StringCharacter+                                                                                               // StringCharacter
    ;

fragment
StringCharacter
    :    EscapeSequence
    |    UnicodeEscape
    |    ~('"'|'\\')
    ;

/////// NON-FRAGMENTS //////////

IntegerLiteral
    :    DecimalIntegerLiteral
    |    HexIntegerLiteral
    |    OctalIntegerLiteral
    |    BinaryIntegerLiteral
    ;

FloatingPointLiteral
    :    DecimalFloatingPointLiteral
    |    HexadecimalFloatingPointLiteral
    ;

CharacterLiteral
    :    '\'' SingleCharacter '\''                                                                                           // ' SingleCharacter '
    |    '\'' EscapeSequence '\''                                                                                            // ' EscapeSequence '
    |    '\'' UnicodeEscape '\''
    ;

StringLiteral
    :    '"' StringCharacter*? '"'
    ;

Identifier
    :    IdentifierChars
    ;

WhiteSpace
    :    (' '
    |    '\u0009'                                        // the ASCII HT character, also known as "horizontal tab"
    |    '\u000C'                                        // the ASCII FF character, also known as "form feed"
    |    LineTerminator)  -> channel(WHITESPACE)                                // LineTerminator
    ;

LineTerminator
    :    ('\r\n'
    |    '\n'
    |    '\r')          -> channel(WHITESPACE)
    ;

SlashComment
    :    '/*' .*? '*/' LineTerminator* -> channel(COMMENTS) // match anything between /* and */
    ;

EndOfLineComment
    :    '//' .*? LineTerminator+ -> channel(COMMENTS)
    ;
