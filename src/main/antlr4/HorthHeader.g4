grammar HorthHeader;

NAME: [_a-zA-Z][_a-zA-Z0-9]*;

WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;

other:
    (.)*
    ;

module:
    NAME ('.'NAME)*
    ;

include:
    'include' module
    ;


program:
    ('module' moduleName=module)? (includes+=include)* main+=other EOF
    ;