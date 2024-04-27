grammar Striger;

program : initializations conclusion*   computations  conclusion* | conclusion;

initializations: ( initialization (conclusion)*)+ ;

initialization: 'String' Variable_name '=' Str
              | 'int' Variable_name '=' Int
              | 'int' Variable_name '=' arthexpr
              | 'int' Variable_name '=' terinary
              | 'bool' Variable_name '=' boolexpr
              | 'int' Variable_name
              | 'String' Variable_name
              | 'bool' Variable_name;

computations: ( computation )+  | '{' computations '}';

computation: conditionals | loops | assignment | conclusion;

conclusion: print_statement | ';';

print_statement: 'print' Variable_name
                | 'print' '(' Variable_name ')'
                | 'print' '(' Str ')'
                | 'print' '(' Int ')'
                | 'print' '(' boolexpr ')'
                | 'print'  Str
                | 'print'  Int
                | 'print'  boolexpr  ;

conditionals: if_condition
            | if_then_else;

if_condition: 'if' boolexpr '{'  computations '}'  (elif_part)* (else_part)?;


elif_part: 'elif' boolexpr '{' computations '}';

else_part: 'else' '{' computations '}';

if_then_else: 'if' boolexpr 'then' computations 'else' computations ;

terinary: boolexpr '?' arthexpr ':' arthexpr
        | boolexpr '?' Str ':' Str
        | boolexpr '?' Variable_name ':' Variable_name;

assignment: Variable_name '=' expression
          | Variable_name '=' terinary
          | Variable_name '++'
          | '++' Variable_name
          | Variable_name '--'
          | '--' Variable_name;

loops: for_loop
     | while_loop
     | for_inrange ;

for_loop: 'for' '(' initialization ';' boolexpr ';' assignment ')' '{' computations '}';

for_inrange: 'for' Variable_name 'in' 'range' '(' Int ',' Int ')' '{' computations '}'
            | 'for' Variable_name 'in' 'range' '(' Variable_name ',' Variable_name ')' '{' computations '}';

while_loop: 'while' boolexpr '{' computations '}';

expression: boolexpr
            | arthexpr ;

boolexpr: 'true'
        | 'false'
        | arthexpr '==' arthexpr
        | 'not' boolexpr
        | boolexpr 'and' boolexpr
        | boolexpr 'or' boolexpr
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
        | Int
        | '(' arthexpr ')' ;



Variable_name: [a-zA-Z][a-zA-Z0-9]* ;
Str: '"' (~["])* '"';
Int: [0-9]+;
WHITESPACE: [ \t\n\r]+ -> skip;
COMMENT
    :  '#' ~[\r\n]* -> skip
    ;
LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;