grammar HorthHeader;

NAME: [_a-zA-Z][_a-zA-Z0-9]*;

WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;
OTHER: .*? -> skip;

module:
    NAME('.'NAME)*
    ;

program:
    ('module' moduleName=module)? 'include' (includes+=module)* 'end' EOF
    ;