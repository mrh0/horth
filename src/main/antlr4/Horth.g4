grammar Horth;

IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9]*;
ATOM: '#'IDENTIFIER;
INT: '0'|[1-9][0-9]*;
STRING: '"' (~('\'' | '\\') | '\\' . )* '"';
BOOL: 'true' | 'false';
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;
TYPE: 'int' | 'string' | 'char' | 'atom' | 'bool' | 'ref' | 'ref<' TYPE '>' | 'arr<' TYPE '>' | 'type<' (TYPE)+ '>' | 'any<' IDENTIFIER '>'; // | 'byte(' (INT | IDENTIFIER) (INT | '+' | '-' | '*')* ')';

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
    ;

intrfunc:
    'sizeof(' TYPE ')'
    | 'cast(' TYPE ')'
    ;

infix:
    'st' | 'nd'
    | IDENTIFIER
    | ATOM
    | INT
    | BOOL
    | infix binop infix
    | unop infix
    | intrfunc
    | '(' infix ')'
    ;

general:
    ATOM
    | INT
    | IDENTIFIER
    | STRING

    | unop
    | binop
    | keywords

    | '(' infix ')'
    | 'assert' block 'end'
    | ('inline' | 'extern')? 'func' IDENTIFIER 'infer' 'in' block 'end'
    | ('inline' | 'extern')? 'func' IDENTIFIER (TYPE)* ('->' (TYPE)+)? 'in' block 'end'
    | ('inline' | 'extern')? 'func' IDENTIFIER (TYPE)* ('->' (TYPE)+)? 'end'               //Signature

    | 'if' block 'do' block ('elif' block 'do' block)* ('else' block)? 'end'
    | 'while' block 'do' block ('else' block)? 'end'

    | 'let' IDENTIFIER (TYPE | 'infer') ('pop')?
    | intrfunc
    ;

block:
    (ops+=general)*
    ;

include:
    'include' STRING
    ;

program:
    (includes+=include)* main=block EOF
    ;