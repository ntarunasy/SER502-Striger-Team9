grammar Striger;

program: (block '\n')+ ;

block: (computation '\n')+ ;

computation: Variable_name assignment_op Str
            | Variable_name assignment_op arthexpr
            | Variable_name boolexpr
            | Variable_name
            | conditionals
            | loops
            | assignment
            | 'print' Str
            | 'print' Int
            | 'print' Variable_name
            | 'print' boolexpr;

assignment: Variable_name assignment_op arthexpr
          | Variable_name assignment_op boolexpr
          | Variable_name assignment_op Str
          | Variable_name assignment_op terinary;

conditionals: if_condition
            | if_then_else;

if_condition: 'if' boolexpr ':' '\n' (computation)+
            | 'if' boolexpr ':' '\n' (computation)+ '\n' 'else' ':' '\n' (computation)+
            | 'if' boolexpr ':' '\n' (computation)+ '\n' elif_part '\n' 'else' ':' '\n' (computation)+ ;

elif_part: elif_part '\n' elif_part
          | 'elif' ':' '\n' (computation)+ ;

if_then_else: 'if' boolexpr 'then' (computation)+ 'else' (computation)+ ;

terinary: boolexpr '?' arthexpr ':' arthexpr ;

loops: for_loop
     | while_loop
     | for_inrange ;

for_loop: 'for' '(' computation ';' arthexpr ';' arthexpr ')' '\n' '\t' (computation)+ ;

for_inrange: 'for' Variable_name 'in' 'range' '(' Int ',' Int ')' ':' (computation)+
            | 'for' Variable_name 'in' 'range' '(' Variable_name ',' Variable_name ')' ':' (computation)+;

while_loop: 'while' boolexpr ':' '\n' '\t' (computation)+ ;

expression: boolexpr
            | arthexpr ;

boolexpr: 'true'
        | 'false'
        | arthexpr '==' arthexpr
        | 'not' boolexpr
        | arthexpr 'and' arthexpr
        | arthexpr 'or' arthexpr
        | arthexpr '>' arthexpr
        | arthexpr '<' arthexpr
        | arthexpr '>=' arthexpr
        | arthexpr '<=' arthexpr
        | arthexpr '!=' arthexpr
        | '(' boolexpr ')' ;

arthexpr: arthexpr '+' arthexpr
        | arthexpr '-' arthexpr
        | arthexpr '*' arthexpr
        | arthexpr '/' arthexpr
        | arthexpr '++'
        | arthexpr '--'
        | '++' arthexpr
        | '--' arthexpr
        | Variable_name
        | Int ;


assignment_op: '=' ;
Variable_name: [a-zA-Z][a-zA-Z0-9]* ;
Str: '"' (~["])* '"' ;
Int: [0-9]+;
WHITESPACE: [ \t\n\r]+ -> skip;
COMMENT
    :  '#' ~[\r\n]* -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;

