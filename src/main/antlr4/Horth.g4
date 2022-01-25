grammar Horth;

IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9]*;
KEYED_IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9.]*[_a-zA-Z0-9]+;
KEYED_IDENTIFIER_DEF: [_a-zA-Z][_a-zA-Z0-9.]*;
ATOM: '#'IDENTIFIER;
INT: '0'|[1-9][0-9]*;
STRING: '"' (~('\'' | '\\') | '\\' . )* '"';
BOOL: 'true' | 'false';
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;
TYPE: 'int' | 'string' | 'char' | 'atom' | 'bool'
    | 'ref' | 'ref<' TYPE '>' | 'arr<' TYPE '>' | 'obj<' (TYPE)+ '>' | 'any<' IDENTIFIER '>'
    | 'func<' (TYPE)* ('->' (TYPE)+)? '>';
    // | 'byte(' (INT | IDENTIFIER) (INT | '+' | '-' | '*')* ')';

unop:
    'not' | '~' | '-'
    ;

binop:
    '+' | '-' | '*' | '/' | '%'
    | '<' | '>' | '<=' | '>=' | '==' | '!='
    | '&' | '|' | 'and' | 'or'
    | '<<' | '>>' | 'is' | 'cast' | '='
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
    'sizeof(' TYPE ')'
    | 'cast(' TYPE ')'
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

static:
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

    | unop                                                                                  #genUnop
    | binop                                                                                 #genBinOp
    | keywords                                                                              #genKeyword
    | '[' block ']'                                                                         #genAccessor
    | '{' (static* ',')* static* '}'                                                        #genArray

    | '(' infix ')'                                                                         #genInfix
    | 'assert' block 'end'                                                                  #genAssert
    | ('inline' | 'extern')? 'func' IDENTIFIER 'infer' 'in' block 'end'                     #genFuncInfer
    | ('inline' | 'extern')? 'func' IDENTIFIER (TYPE)* ('->' (TYPE)+)? 'in' block 'end'     #genFunc
    | ('inline' | 'extern')? 'func' IDENTIFIER (TYPE)* ('->' (TYPE)+)? 'end'                #genFuncSignature
    //| ('inline' | 'extern')? 'func' IDENTIFIER 'infer' 'from' IDENTIFIER 'in' block 'end'   #genFuncSignatureOf

    | 'if' conds+=block 'do' doBlock+=block
    ('elif' conds+=block 'do' doBlock+=block)*
    ('else' elseBlock=block)? 'end'                                                         #genIf

    | 'while' block 'do' block ('else' block)? 'end'                                        #genWhile
    //| 'for' block ';' block ';' block 'do' block 'end'                                      #genFor

    //| 'let' IDENTIFIER (TYPE | 'infer') ('pop')?                                            #genLet
    | 'let' (IDENTIFIER)+ 'in' block 'end'                                                  #genLet
    | 'label' (IDENTIFIER)+ 'in' block 'end'                                                #genLabel
    | 'with' IDENTIFIER 'do' block 'end'                                                    #genWith
    | 'const' IDENTIFIER static 'end'                                                       #genConst
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