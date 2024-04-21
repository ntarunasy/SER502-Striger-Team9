grammar Grammar;

program : initializations   conclusion*   computations   conclusion* ;

initializations: ( initialization '\n')+ ;

initialization: 'String' Variable_name asnmt_op Str
              | 'int' Variable_name asnmt_op Int
              | 'int' Variable_name asnmt_op arthexpr
              | 'bool' Variable_name asnmt_op boolexpr
              | 'var' Variable_name
              | 'int' Variable_name asnmt_op terinary
              | 'Str' Variable_name asnmt_op terinary;

computations: ( computation )+;

computation: conditionals | loops | assignment | conclusion;

conclusion: print_statement | '\n';

print_statement: 'print' Variable_name
                | 'print' '(' Variable_name ')'
                | 'print' '(' Str ')'
                | 'print' '(' Int ')'
                | 'print' '(' boolexpr ')' ;

conditionals: if_condition
            | if_then_else;

if_condition: 'if' boolexpr ':' '\n' computations
            | 'if' boolexpr ':' '\n' computations '\n' 'else' ':' '\n' computations
            | 'if' boolexpr ':' '\n' computations '\n' elif_part '\n' 'else' ':' '\n' computations ;

elif_part: elif_part '\n' elif_part
          | 'elif' ':' '\n' computations ;

if_then_else: 'if' boolexpr 'then' computations 'else' computations ;

terinary: boolexpr '?' arthexpr ':' arthexpr
        | boolexpr '?' Str ':' Str
        | boolexpr '?' Variable_name ':' Variable_name;

assignment: Variable_name asnmt_op expression
          | Variable_name asnmt_op terinary
          | arthexpr '++'
          | '++' arthexpr
          | arthexpr '--'
          | '--' arthexpr;

loops: for_loop
     | while_loop
     | for_inrange ;

for_loop: 'for' '(' initialization ';' arthexpr ';' arthexpr ')' '\n' '\t' computations ;

for_inrange: 'for' Variable_name 'in' 'range' '(' Int ',' Int ')' ':' computations
            | 'for' Variable_name 'in' 'range' '(' Variable_name ',' Variable_name ')' ':' computations;

while_loop: 'while' boolexpr ':' '\n' '\t' computations ;

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
        | Variable_name
        | Int ;


asnmt_op: '=' ;
Variable_name: [a-zA-Z][a-zA-Z0-9]* ;
Str: '"' (~["])* '"'
    | [a-zA-z]+;
Int: [0-9]+;
WHITESPACE: [ \t\n\r]+ -> skip;
COMMENT
    :  '#' ~[\r\n]* -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;