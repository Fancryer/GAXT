 grammar GAXT;
 
 program: expression* FINISH EOF;
 
 expression: loop
     | store_macro
     | stack_push
     | stack_op
     | print
     | direct_stack_op
     | service
     | flow
     | call_macro
     | label;
 
 label: SAVE
 	| LOAD;
 
 string: STRING_EDGE string_chars=string_char* STRING_EDGE;
 
 expr_in_string: loop
     | store_macro
     | VARIABLE
     | CONSTANT
     | DIGIT
     | stack_op
     | print
     | direct_stack_op
     | service
     | flow
     | call_macro
     | TOKEN;
 
 string_char: expr_in_string
     | formatter;
 
 formatter: Fmt_variable
     | Fmt_space
     | Fmt_tab
     | Fmt_new_line
     | Fmt_finish
     | fmt_expr;
 
 Fmt_variable: FORMAT VARIABLE;
 Fmt_space: FORMAT ' ';
 Fmt_tab: FORMAT '\t';
 Fmt_new_line: (FORMAT '\n') | '\'\\n';
 Fmt_finish: FORMAT '!';
 fmt_expr: AMPERSAND expression* AMPERSAND;
 AMPERSAND: '&';
 
 flow: full_branch
     | short_branch
     | BREAK
     | CONTINUE;
 
 full_branch: IF true_branch=expression* THEN false_branch=expression* ELSE;
 short_branch: IF true_branch=expression* ELSE;
 
 service: SWITCH;
 
 direct_stack_op: ASSIGN
     | CLEAR
     | REVERSE
     | SHAVE;
 
 print: PRINT_INT
     | PRINT_CHAR;
 
 stack_op: stack_math
     | stack_logical;
 
 stack_logical: NOR
     | LESS
     | EQUAL
     | GREATER;
 
 stack_math: ADD
     | SUB
     | MULT
     | DIV
     | CAT;
 
 stack_push: string
     | VARIABLE
     | CONSTANT
     | DIGIT;
 
 
 loop: REPEAT expression* UNTIL;
 
 macro: store_macro
     | call_macro;
 
 store_macro: READ expression* WRITE;
 
 call_macro: CALL;
 
 FINISH: '!';
 
 
 SPACE: [\r\n\t\u0020] -> skip;
 
 VARIABLE: [a-z];
 CONSTANT: [A-Z];
 DIGIT: [0-9];
 
 ADD: '+';
 SUB: '-';
 MULT: '*';
 DIV: '/';
 CAT: '_';
 
 NOR: '`';
 LESS: '<';
 EQUAL: '=';
 GREATER: '>';
 
 PRINT_INT: '?';
 PRINT_CHAR: '$';
 
 ASSIGN: ':';
 REVERSE: ';';
 SHAVE: '~';
 CLEAR: '%';
 
 IF: '{';
 THEN: '|';
 ELSE: '}';
 BREAK: '\\';
 CONTINUE: '^';
 
 READ: '(';
 WRITE: ')';
 CALL: '@';
 
 REPEAT: '[';
 UNTIL: ']';
 
 STRING_EDGE: '"';
 FORMAT: '\'';
 
 SAVE: '.';
 LOAD: ',';
 
 SWITCH: '#';
 
 PROGRAM_END: EOF;
 
 COMMENT: ~
     ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm'//variables a-m
     | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z'//variables n-z
     | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M'//constants A-M
     | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z'//constants N-Z
     | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'//digits
     | '+' | '-' | '*' | '/' | '_'//math
     | '`' | '<' | '=' | '>'//logical
     | '?' | '$'//print
     | ':' | ';' | '~' | '%'//direct_stack
     | '{' | '|' | '}' | '\\' | '^'//flow
     | '(' | ')' | '@'//macro
     | '[' | ']'//loop
     | '.' | ','//label
     | '#' | '!'//service
     | '"' | '\'' | '&'//string
     ) -> skip;