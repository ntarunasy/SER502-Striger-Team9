grammar Grammar;

program : initializations '\n' conclusion* '\n' computations '\n' conclusion* ;

initializations: initialization '\n' initializations ;

initialization: variable_type variable_name asnmt_op expression
              | variable_type variable_name ;

computations: computation '\n' computations ;

computation: conditionals | loops | assignment ;

conclusion: print_statement ;

print_statement: 'print' variable_name
                | 'print' '(' variable_name ')'
                | 'print' '(' '"' str '"' ')'
                | 'print' '(' int ')'
                | 'print' '(' boolexpr ')' ;

conditionals: if_condition
            | if_then_else
            | terinary ;

if_condition: 'if' boolexpr ':' '\n' computations
            | 'if' boolexpr ':' '\n' computations '\n' 'else' ':' '\n' computations
            | 'if' boolexpr ':' '\n' computations '\n' elif_part '\n' 'else' ':' '\n' computations ;

elif_part: elif_part '\n' elif_part
          | 'elif' ':' '\n' computations ;

if_then_else: 'if' boolexpr 'then' computations 'else' computations ;

terinary: boolexpr '?' arthexpr ':' arthexpr ;

assignment: variable_name asnmt_op arthexpr ;

loops: for_loop
     | while_loop
     | for_inrange ;

for_loop: 'for' '(' initialization ';' arthexpr ';' arthexpr ')' '\n' '\t' computations ;

for_inrange: 'for' variable_name 'in' 'range' '(' int ',' int ')'
            | 'for' variable_name 'in' 'range' '(' variable_name ',' variable_name ')' ;

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
        | arthexpr '++'
        | arthexpr '--'
        | '++' arthexpr
        | '--' arthexpr
        | variable_name
        | int ;


variable_type: str | int ;
asnmt_op: '=' ;
variable_name: [a-zA-Z][a-zA-Z0-9]* ;
str: [a-zA-Z][a-zA-Z]*;
int: [0-9]+;
