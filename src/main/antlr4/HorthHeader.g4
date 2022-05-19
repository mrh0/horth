grammar HorthHeader;

NAME: [_a-zA-Z][_a-zA-Z0-9]*;

WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;
OTHER: .*?;

other:
    OTHER
    ;

module:
    NAME('.'NAME)*
    ;

program:
    ('module' moduleName=module)? 'include' (includes+=module)* 'end' OTHER EOF
    ;