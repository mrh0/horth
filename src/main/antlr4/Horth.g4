grammar Horth;

BOOL: 'true' | 'false';
NAME: [_a-zA-Z][_a-zA-Z0-9]*;
ADDR_IDENTIFIER: '@'?[_a-zA-Z][_a-zA-Z0-9]*;
KEYED_IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9.]*[_a-zA-Z0-9]+;
KEYED_IDENTIFIER_DEF: [_a-zA-Z][_a-zA-Z0-9.]*;
ATOM: ':'[a-zA-Z0-9][_a-zA-Z0-9]*;

INT: '0'|'-'?[1-9][0-9]*;
HEX: '0x'[0-9a-fA-F]*;
BIN: '0b'[0-1]*;

CHAR: '\''.'\'' | '\'\\'('n'|'r'|'t'|'\\'|'\''|'"'|'0')'\'';

STRING: '"' (~('\'' | '\\') | '\\' . )* '"';
STRING_NT: '"' (~('\'' | '\\') | '\\' . )* '"^';
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;

identifier:
    NAME
    | ADDR_IDENTIFIER
    ;

integer:
    INT         #integerInt
    | HEX       #integerHex
    | BIN       #integerBin
    ;

simpleDataType:
    'int' | 'string' | 'char' | 'atom' | 'bool' | 'ref' | 'u64' | 'u32' | 'u16' | 'u8' | 'byte'
    ;

userDefinedDataType:
    'type' NAME 'as' (NAME dataType '|')* NAME dataType 'end'
    ;

dataType:
    simpleDataType                                  #dataTypeSimple
    | 'ref<' dataType '>'                           #dataTypeRef
    | 'arr<' dataType '>'                           #dataTypeArr
    //| 'any<' NAME '>'                               #dataTypeAny //replaced by function overloads
    | 'func<' (dataType)* ('->' (dataType)+)? '>'   #dataTypeFunc
    | dataType '*' staticExpr                       #dataTypeMany
    | 'atom<' (ATOM '|')* ATOM '>'                  #dataTypeAtoms
    ;

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
    | 'drop' | 'drop2' | 'drop3'
    | 'out' | 'log' 'error' | 'log^' 'error' | 'log' | 'log^' //^ for ntstring
    | 'exit' | 'halt' // | 'ret' //| 'terminate'
    | 'break'
    | 'length'
    ;

typefunc:
    'sizeof' '(' dataType ')'                       #typefuncSizeof
    | 'sizeof' dataType                             #typefuncSizeof
    | 'cast' '(' dataType ')'                       #typefuncCast
    | 'as' dataType                                 #typefuncCast
    | 'unsafe' 'cast' '(' dataType ')'              #typefuncCastUnsafe
    | 'is' '(' (types+=dataType)* ')'               #typefuncIs
    | 'is' types+=dataType                          #typefuncIs
    ;

infix:
    identifier                  #infixIdent
    | identifier? typefunc      #infixTypefunc
    | ATOM                      #infixAtom
    | integer                   #infixInt
    | BOOL                      #infixBool
    | CHAR                      #infixChar
    | infix binop infix         #infixBinOp
    | unop infix                #infixUnOp

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
    | ','                                                                                   #genSeparator

    | unop                                                                                  #genUnop
    | binop                                                                                 #genBinOp
    | keywords                                                                              #genKeyword
    | '[' accBlock=block ']'                                                                #genAccessor
    | '[' accBlock=block ']^'                                                               #genAccessorStrict
    | '{' (staticExpr ',')* staticExpr? '}'                                                 #genArray

    | '(' infix ')'                                                                         #genInfix
    | 'assert' (message=STRING)? block 'end'                                              #genAssert
    | 'static' 'assert' (message=STRING)? staticExpr 'end'                                #genStaticAssert
    | ('inline' | 'extern')? 'func' NAME 'infer' 'in' block 'end'                           #genFuncInfer
    | ('inline' | 'extern')? 'func' NAME
        (dataType)* ('->' (dataType)+)? ('throws' dataType)? 'in' block 'end'               #genFunc
    | ('inline' | 'extern')? 'func' NAME
        (dataType)* ('->' (dataType)+)? 'let' (names+=NAME)+ 'in' block 'end'               #genFuncLet
    | ('inline' | 'extern')? 'func' NAME (dataType)* ('->' (dataType)+)? 'end'              #genFuncSignature
    //| ('inline' | 'extern')? 'func' IDENTIFIER 'infer' 'from' IDENTIFIER 'in' block 'end'   #genFuncSignatureOf

    | 'static' 'alloc' NAME dataType ('*' staticExpr)* 'end'                                #genAllocStatic
    | 'alloc' NAME dataType ('*' block)? 'in' block 'end'                                   #genAlloc

    | 'if' conds+=block 'do' doBlock+=block
    ('elif' conds+=block 'do' doBlock+=block)*
    ('else' elseBlock=block)? 'end'                                                         #genIf

    | 'while' cond=block 'do' doBlock=block ('else' elseBlock=block)? 'end'                 #genWhile
    //| 'for' block ';' block ';' block 'do' block 'end'                                      #genFor

    //| 'let' IDENTIFIER (TYPE | 'infer') ('pop')?                                            #genLet
    //| 'let' ('.'IDENTIFIER)* (IDENTIFIER)* 'in' block 'end'                                 #genLet
    | 'let' (names+=NAME)+ 'in' localBlock=block 'end'                                      #genLet
    //| 'label' (IDENTIFIER)+ 'in' block 'end'                                                #genLabel
    | 'with' NAME 'do' block 'end'                                                          #genWith
    | 'const' NAME staticExpr 'end'                                                         #genConst

    | 'try' NAME                                                                            #genTry
    | 'throw' block 'end'                                                                   #genThrow
    | 'catch' NAME 'passed' passBlock=block 'failed' failBlock=block 'end'                  #genCatch
    | 'catch' NAME 'failed' failBlock=block 'passed' passBlock=block 'end'                  #genCatch

    | 'syscall' sysCallName=NAME                                                            #genSyscall
    | 'export' NAME                                                                         #genExport
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