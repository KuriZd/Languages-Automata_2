grammar MiniJava;

program
  : classDecl+ EOF
  ;

classDecl
  : 'public' 'class' ID '{' classMember* '}'      #PublicClassDecl
  ;

classMember
  : attrDecl ';'                                   #AttrMember
  | methodDecl                                     #MethodMember
  ;

attrDecl
  : modifier? type varList                         #AttrDecl
  ;

methodDecl
  : modifier? typeOrVoid ID '(' paramList? ')' block  #MethodDecl
  ;

modifier
  : 'public'
  | 'private'
  | 'protected'
  ;

typeOrVoid
  : type
  | 'void'
  ;

type
  : 'int'
  | 'double'
  | 'bool'
  ;

paramList
  : param (',' param)*
  ;

param
  : type ID
  ;

varDecl
  : type varList ';'
  ;

varList
  : ID (',' ID)*
  ;

block
  : '{' varDecl* stmt* '}'
  ;

stmt
  : assign ';'                   #AssignStmt
  | ifStmt                       #IfStmtS
  | whileStmt                    #WhileStmtS
  | block                        #BlockStmtS
  | ';'                          #EmptyStmt
  ;

assign
  : ID '=' expr
  ;

ifStmt
  : 'if' '(' expr ')' stmt ('else' stmt)?
  ;

whileStmt
  : 'while' '(' expr ')' stmt
  ;

// ---- Expresiones con precedencia ----
expr
  : expr '||' expr               #OrExpr
  | expr '&&' expr               #AndExpr
  | expr relOp expr              #RelExpr
  | expr ('+'|'-') expr          #AddExpr
  | expr ('*'|'/') expr          #MulExpr
  | '!' expr                     #NotExpr
  | '(' expr ')'                 #ParenExpr
  | ID                           #IdExpr
  | INT_LIT                      #IntLitExpr
  | DOUBLE_LIT                   #DoubleLitExpr
  | BOOL_LIT                     #BoolLitExpr
  ;

relOp
  : '==' | '!=' | '<' | '<=' | '>' | '>='
  ;

// ---- Léxicos ----
BOOL_LIT  : 'true' | 'false' ;
INT_LIT   : [0-9]+ ;
DOUBLE_LIT: [0-9]+ '.' [0-9]+ ;
ID        : [a-zA-Z_] [a-zA-Z_0-9]* ;

WS        : [ \t\r\n\u000C]+ -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT: '/*' .*? '*/' -> skip ;
