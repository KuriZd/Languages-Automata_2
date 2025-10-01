grammar compilador;

@header{ }
@members{ }       

program: classes+;


classes  : accessmod CLASS ID 
                       OCURLYB
                             member*
                       CCURLYB ; 

member      :  method | property ;   

property    :  accessmod tipo ID  ( COMMA ID )*  SEMICOLON;

method      :  accessmod tipo ID '('  decl_args?    ')' 
                       OCURLYB  sentences*   CCURLYB;

decl_args   :  tipo ID (COMMA tipo ID)*;

decl_local  :  tipo ID (COMMA ID)* SEMICOLON;

sentences   : assignment | decl_local  ;


assignment  : ID '=' expr SEMICOLON             ;        
expr        : multExpr (('+' |'-' ) multExpr)*  ;
multExpr    : atom ('*' atom)*                  ;
atom        :   CINT 
              | CFLOAT
              | ID    
              | '(' expr ')'          ;

tipo      : INT | DOUBLE;
accessmod : PUBLIC | PRIVATE | PROTECTED ;

INT       : 'int'       ;
DOUBLE    : 'double'    ;
PUBLIC    : 'public'    ;
PRIVATE   : 'private'   ;
PROTECTED : 'protected' ;

OCURLYB   : '{' ;
CCURLYB   : '}' ;
CLASS     : 'class';

COMMA     :  ','   ;
SEMICOLON :  ';'   ;
DOT       :  '.'   ;
CFLOAT    :  CINT DOT CINT;
CINT      :  ('0'..'9')+  ;
ID        :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;
WS       :  (' ' | '\n' | '\t' | '\r' )+  {$channel=HIDDEN;} ;  

