grammar Horth;

BOOL: 'true' | 'false';
IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9]*;
KEYED_IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9.]*[_a-zA-Z0-9]+;
KEYED_IDENTIFIER_DEF: [_a-zA-Z][_a-zA-Z0-9.]*;
ATOM: '#'IDENTIFIER;
INT: '0'|[1-9][0-9]*;
STRING: '"' (~('\'' | '\\') | '\\' . )* '"';
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;

dataType: 'int' | 'string' | 'char' | 'atom' | 'bool'
    | 'ref' | 'ref<' dataType '>' | 'arr<' dataType '>' | 'obj<' (dataType)+ '>' | 'any<' IDENTIFIER '>'
    | 'func<' (dataType)* ('->' (dataType)+)? '>';
    // | 'byte(' staticExpr ')';

unop:
    'not' | '~' | '-'
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
    | 'err'
    | 'exit'
    ;

typefunc:
    'sizeof(' dataType ')'
    | 'cast(' dataType ')'
    | 'is(' dataType ')'
    ;

infix:
    | IDENTIFIER
    | ATOM
    | INT
    | BOOL
    | infix binop infix
    | unop infix
    | typefunc
    | '(' infix ')'
    ;

staticExpr:
    INT | ATOM | BOOL | STRING
    | IDENTIFIER //constants only
    | unop | binop
    | typefunc
    ;

general:
    ATOM                                                                                    #genAtom
    | INT                                                                                   #genInt
    | IDENTIFIER                                                                            #genIdentifier
    | STRING                                                                                #genString
    | BOOL                                                                                  #genBool

    | unop                                                                                  #genUnop
    | binop                                                                                 #genBinOp
    | keywords                                                                              #genKeyword
    | '[' block ']'                                                                         #genAccessor
    | '{' (staticExpr* ',')* staticExpr* '}'                                                #genArray

    | '(' infix ')'                                                                         #genInfix
    | 'assert' block 'end'                                                                  #genAssert
    | 'static' 'assert' staticExpr 'end'                                                    #genStaticAssert
    | ('inline' | 'extern')? 'func' IDENTIFIER 'infer' 'in' block 'end'                     #genFuncInfer
    | ('inline' | 'extern')? 'func' IDENTIFIER (dataType)* ('->' (dataType)+)? 'in' block 'end'     #genFunc
    | ('inline' | 'extern')? 'func' IDENTIFIER (dataType)* ('->' (dataType)+)? 'end'                #genFuncSignature
    //| ('inline' | 'extern')? 'func' IDENTIFIER 'infer' 'from' IDENTIFIER 'in' block 'end'   #genFuncSignatureOf

    | 'if' conds+=block 'do' doBlock+=block
    ('elif' conds+=block 'do' doBlock+=block)*
    ('else' elseBlock=block)? 'end'                                                         #genIf

    | 'while' block 'do' block ('else' block)? 'end'                                        #genWhile
    //| 'for' block ';' block ';' block 'do' block 'end'                                      #genFor

    //| 'let' IDENTIFIER (TYPE | 'infer') ('pop')?                                            #genLet
    //| 'let' ('.'IDENTIFIER)* (IDENTIFIER)* 'in' block 'end'                                 #genLet
    | 'let' (IDENTIFIER)+ 'in' block 'end'                                                  #genLet
    //| 'label' (IDENTIFIER)+ 'in' block 'end'                                                #genLabel
    | 'with' IDENTIFIER 'do' block 'end'                                                    #genWith
    | 'const' IDENTIFIER staticExpr 'end'                                                       #genConst
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