grammar Horth;

BOOL: 'true' | 'false';
NAME: [_a-zA-Z][_a-zA-Z0-9]*;
KEYED_IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9.]*[_a-zA-Z0-9]+;
KEYED_IDENTIFIER_DEF: [_a-zA-Z][_a-zA-Z0-9.]*;
ATOM: '#'NAME;

INT: '0'|'-'?[1-9][0-9]*;
HEX: '0x'[0-9a-fA-F]*;
BIN: '0b'[0-1]*;

CHAR: '\''.'\'' | '\'\\'('n'|'r'|'t'|'\\'|'\''|'"'|'0')'\'';

STRING: '"' (~('\'' | '\\') | '\\' . )* '"';
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;

identifier:
    NAME
    ;

integer:
    INT         #integerInt
    | HEX       #integerHex
    | BIN       #integerBin
    ;

simpleDataType:
    'int' | 'string' | 'char' | 'atom' | 'bool' | 'ref'
    ;

dataType:
    simpleDataType                                  #dataTypeSimple
    | 'ref<' dataType '>'                           #dataTypeRef
    | 'arr<' dataType '>'                           #dataTypeArr
    | 'any<' NAME '>'                               #dataTypeAny
    | 'func<' (dataType)* ('->' (dataType)+)? '>'   #dataTypeFunc
    ;
    // | 'byte(' staticExpr ')';

unop:
    'not' | '~'
    ;

binop:
    '+' | '-' | '*' | '/' | '%'
    | '<' | '>' | '<=' | '>=' | '==' | '!='
    | '&' | '|' | 'and' | 'or'
    | '<<' | '>>' | '='
    ;

keywords:
    'dup' | 'dup2'
    | 'swap' | 'swap2'
    | 'rot'
    | 'drop' | 'drop2' | 'drop3'
    | 'out'
    | 'throw'
    | 'exit'
    | 'break'
    ;

typefunc:
    'sizeof(' dataType /*('*' integer)?*/ ')'   #typefuncSizeof
    | 'cast(' dataType ')'                      #typefuncCast
    | 'unsafe' 'cast(' dataType ')'             #typefuncCastUnsafe
    | 'is(' dataType ')'                        #typefuncIs
    //| 'alloc(' dataType /*('*' integer)?*/ ')'  #typefuncAlloc
    ;

infix:
    identifier                  #infixIdent
    | ATOM                      #infixAtom
    | integer                   #infixInt
    | BOOL                      #infixBool
    | CHAR                      #infixChar
    | infix binop infix         #infixBinOp
    | unop infix                #infixUnOp
    | typefunc                  #infixTypefunc
    | '(' infix ')'             #infixInfix
    ;

staticExpr:
    integer | ATOM | BOOL | STRING | CHAR
    | identifier //constants only
    | unop | binop
    | typefunc
    ;

general:
    ATOM                                                                                    #genAtom
    | integer                                                                               #genInt
    | identifier                                                                            #genIdentifier
    | STRING                                                                                #genString
    | BOOL                                                                                  #genBool
    | CHAR                                                                                  #genChar

    | unop                                                                                  #genUnop
    | binop                                                                                 #genBinOp
    | keywords                                                                              #genKeyword
    | '[' block ']'                                                                         #genAccessor
    | '{' (staticExpr ',')* staticExpr? '}'                                                 #genArray

    | '(' infix ')'                                                                         #genInfix
    | 'assert(' message=STRING ')' block 'end'                                              #genAssert
    | 'static' 'assert(' message=STRING ')' staticExpr 'end'                                #genStaticAssert
    | ('inline' | 'extern')? 'func' NAME 'infer' 'in' block 'end'                           #genFuncInfer
    | ('inline' | 'extern')? 'func' NAME
        (dataType)* ('->' (dataType)+)? 'in' block 'end'                                    #genFunc
    | ('inline' | 'extern')? 'func' NAME
        (dataType)* ('->' (dataType)+)? 'let' (names+=NAME)+ 'in' block 'end'               #genFuncLet
    | ('inline' | 'extern')? 'func' NAME (dataType)* ('->' (dataType)+)? 'end'              #genFuncSignature
    //| ('inline' | 'extern')? 'func' IDENTIFIER 'infer' 'from' IDENTIFIER 'in' block 'end'   #genFuncSignatureOf

    | 'if' conds+=block 'do' doBlock+=block
    ('elif' conds+=block 'do' doBlock+=block)*
    ('else' elseBlock=block)? 'end'                                                         #genIf

    | 'while' cond=block 'do' doBlock=block ('else' elseBlock=block)? 'end'                  #genWhile
    //| 'for' block ';' block ';' block 'do' block 'end'                                      #genFor

    //| 'let' IDENTIFIER (TYPE | 'infer') ('pop')?                                            #genLet
    //| 'let' ('.'IDENTIFIER)* (IDENTIFIER)* 'in' block 'end'                                 #genLet
    | 'let' (names+=NAME)+ 'in' localBlock=block 'end'                                 #genLet
    //| 'label' (IDENTIFIER)+ 'in' block 'end'                                                #genLabel
    | 'with' NAME 'do' block 'end'                                                    #genWith
    | 'const' NAME staticExpr 'end'                                                       #genConst
    | typefunc                                                                              #genIntrfunc
    ;

block:
    (contents+=general)*
    ;

include:
    'include' STRING
    ;

program:
    ('module' STRING)? (includes+=include)* main=block EOF
    ;