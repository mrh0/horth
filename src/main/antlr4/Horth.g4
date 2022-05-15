grammar Horth;

BOOL: 'true' | 'false';
NAME: [_a-zA-Z][_a-zA-Z0-9]*;
ATOM: ':'[a-zA-Z0-9][_a-zA-Z0-9]*;

INT: '0'|'-'?[1-9][0-9]*;
HEX: '0x'[0-9a-fA-F]*;
BIN: '0b'[0-1]*;

CHAR: '\''.'\'' | '\'\\'('n'|'r'|'t'|'\\'|'\''|'"'|'0')'\'';

STRING: '"' .*? '"';

//MODULE_NAME: ([a-zA-Z][_a-zA-Z0-9]*)('.'[a-zA-Z][_a-zA-Z0-9])*;

WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;

identifier:
    NAME '@'
    | NAME
    ;

integer:
    INT         #integerInt
    | HEX       #integerHex
    | BIN       #integerBin
    ;

dataType:
    nestedName=NAME '<' nested=dataType '>'                      #dataTypeNested
    //| 'ref<' dataType '>'                           #dataTypeRef
    //| 'arr<' dataType '>'                           #dataTypeArr
    //| 'any<' NAME '>'                               #dataTypeAny //replaced by function overloads
    | 'func' '<' (dataType)* ('->' (dataType)+)? '>'   #dataTypeFunc
    //| dataType '*' staticExpr                       #dataTypeMany
    //| 'atom' '<' (ATOM '|')* ATOM '>'                  #dataTypeAtoms
    | NAME                                                #dataTypeSimple
    ;

userDefinedDataType:
    'type' NAME '->' (NAME dataType '|')* NAME dataType
    ;

unop:
    'not' | '!' | '~'
    ;

binop:
    '+' | '-' | '*' | '/' | '%' | 'divmod'
    | '<' | '>' | '<=' | '>=' | '==' | '!='
    | '&' | '|' | 'and' | 'or'
    | '<<' | '>>' | '='
    ;

keywords:
    'dup' | 'dup2'
    | 'swap' | 'swap2'
    | 'drop' | 'drop2' | 'drop3'
    | 'next'
    | 'out' | 'log' 'error'
    | 'read' | 'write' | 'copy' | 'clone'
    //| 'exit' | 'halt' // | 'ret' //| 'terminate'
    | 'ret'
    | 'break' //brk?
    | 'here'
    | 'box'
    | 'void'
    ;

typeFunc: // _ used as skip type?
    'sizeof' '(' dataType ')'                           #typeFuncSizeof
    | 'sizeof' dataType                                 #typeFuncSizeof
    //| 'cast' '(' dataType ')'                         #typeFuncCast
    | 'as' dataType                                     #typeFuncCast
    //| 'as' '(' (types+=dataType)* ')'                 #typeFuncCast
    //| 'unsafe' 'cast' '(' dataType ')'                #typeFuncCastUnsafe
    | 'as' 'unsafe' dataType                            #typeFuncCastUnsafe
    | 'as' '!' dataType                                 #typeFuncCastUnsafe
    //| 'as' '(' ('unsafe'? types+=dataType)* ')'       #typeFuncCastUnsafe
    | 'is' '(' (types+=dataType)* ')'                   #typeFuncIs
    | 'is' types+=dataType                              #typeFuncIs
    | 'new' type=dataType                               #typeFuncNew
    ;

infix:
    identifier                  #infixIdent
    | identifier? typeFunc      #infixTypefunc
    //| identifier '.' prop=NAME          #infixProps
    //| identifier '.' prop=NAME '@'      #infixPropsAddr
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
    | typeFunc
    ;

switchCaseExpr:
    integer | ATOM | BOOL | CHAR
    ;

general:
    ','                                                                                     #genSeparator
    | unop                                                                                  #genUnop
    | binop                                                                                 #genBinOp
    | keywords                                                                              #genKeyword

    | '.' prop=NAME                                                                          #genProp
    | '.' prop=NAME '@'                                                                      #genPropAddr

    | '[' accBlock=block ']'                                                                #genAccessor
    | '[' accBlock=block ']^'                                                               #genAccessorStrict
    //| '{' (staticExpr ',')* staticExpr? '}'                                                 #genArray

    | '(' infix ')'                                                                         #genInfix
    //| 'assert' (message=STRING)? block 'end'                                              #genAssert
    //| 'static' 'assert' (message=STRING)? staticExpr 'end'                                #genStaticAssert
    //| ('inline' | 'extern' | 'start')? 'func' NAME 'infer' 'in' block 'end'                           #genFuncInfer



    //| ('inline' | 'extern')? 'func' NAME 'let' (names+=NAME)+ 'as'
    //    (dataType)* ('->' (dataType)+)? 'in' block 'end'               #genFuncLet
    //| ('inline' | 'extern')? 'func' NAME (dataType)* ('->' (dataType)+)? 'end'              #genFuncSignature
    //| ('inline' | 'extern')? 'func' IDENTIFIER 'infer' 'from' IDENTIFIER 'in' block 'end'   #genFuncSignatureOf

    //| 'const' NAME 'alloc' dataType ('*' staticExpr)* 'end'                                #genAllocStatic

    | 'if' conds+=block 'do' doBlock+=block
    ('elif' conds+=block 'do' doBlock+=block)*
    ('else' elseBlock=block)? 'end'                                                         #genIf

    //| 'switch' condBlock=block 'in'
    //('case' cases+=switchCaseExpr 'do' doBlock+=block)*
    //('default' 'case' defBlock=block) 'end'                                                          #genSwitch

    | 'while' cond=block 'do' doBlock=block ('else' elseBlock=block)? 'end'                 #genWhile
    //| 'for' block ';' block ';' block 'do' block 'end'                                      #genFor
    //| 'for' 'each' NAME 'in' block 'do' block 'end'
    //| 'let' IDENTIFIER (TYPE | 'infer') ('pop')?                                            #genLet
    //| 'let' ('.'IDENTIFIER)* (IDENTIFIER)* 'in' block 'end'                                 #genLet
    | 'let' (names+=NAME)+ 'in' localBlock=block                                              #genLet
    //| 'label' (IDENTIFIER)+ 'in' block 'end'                                                #genLabel
    //| 'let' (names+=NAME)+ 'in' #genLetFuncScope
    //| 'with' NAME 'do' block 'end'                                                          #genWith
    //| 'const' NAME staticExpr 'end'                                                         #genConst

    //| 'try' NAME                                                                            #genTry
    //| 'throw' block                                                                   #genThrow
    //| 'try' NAME 'pass' passBlock=block 'catch' failBlock=block 'end'                  #genCatch
    //| 'try' NAME 'catch' failBlock=block 'pass' passBlock=block 'end'                  #genCatch

    | 'syscall' sysCallName=NAME                                                            #genSyscall
    //| 'export' NAME                                                                         #genExport

    | typeFunc                                                                              #genIntrfunc

    | ATOM                                                                                  #genAtom
    | integer                                                                               #genInt
    | identifier                                                                            #genIdentifier
    | STRING                                                                                #genString
    | BOOL                                                                                  #genBool
    | CHAR                                                                                  #genChar
    ;

mainBlock:
    funcPrefix=('inline' | 'extern' | 'start' | 'rec')? 'func' name=NAME
            (args+=dataType)* ('->' (rets+=dataType)+)? ('throws' thrown=dataType)? 'in' funcBody=block 'end'               #mainFunc
    ;

block:
    (contents+=general)*
    ;

include:
    'include' module
    ;

module:
    NAME ('.'NAME)*
    ;

program:
    ('module' moduleName=module)? (includes+=include)* main+=mainBlock* EOF
    ;