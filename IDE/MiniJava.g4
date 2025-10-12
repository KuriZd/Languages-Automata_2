// file: MiniJava.g4

grammar MiniJava;

program: classDecl+ EOF;

classDecl
  : 'public'? 'class' ID '{' memberDecl* '}'
  ;

memberDecl
  : fieldDecl
  | methodDecl
  ;

fieldDecl
  : modifier* type varList ';'
  ;

methodDecl
  : modifier* typeOrVoid ID '(' params? ')' block
  ;

params
  : param (',' param)*
  ;

param
  : type ID
  ;

varList
  : ID (',' ID)*
  ;

block
  : '{' stmt* '}'
  ;

stmt
  : varDecl
  | assignStmt ';'
  | ifStmt
  | whileStmt
  | block
  | ';'
  ;

varDecl
  : type varList ';'
  ;

assignStmt
  : ID '=' expr
  ;

ifStmt
  : 'if' '(' expr ')' stmt ('else' stmt)?
  ;

whileStmt
  : 'while' '(' expr ')' stmt
  ;

expr
  : expr op=('*'|'/') expr         # MulDiv
  | expr op=('+'|'-') expr         # AddSub
  | expr op=('<'|'>'|'<='|'>='|'=='|'!=') expr  # Cmp
  | expr op=('&&'|'||') expr       # BoolBin
  | '(' expr ')'                   # Paren
  | ID                             # IdRef
  | INT                            # IntLit
  | DOUBLE                         # DoubleLit
  | 'true'                         # TrueLit
  | 'false'                        # FalseLit
  ;

modifier: 'public' | 'private' | 'protected' ;

type: 'int' | 'double' | 'bool' ;

typeOrVoid: type | 'void' ;

ID: [a-zA-Z_] [a-zA-Z_0-9]* ;
INT: [0-9]+ ;
DOUBLE: [0-9]+ '.' [0-9]+ ;
WS: [ \t\r\n]+ -> skip ;
LINE_COMMENT: '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT: '/*' .*? '*/' -> skip ;