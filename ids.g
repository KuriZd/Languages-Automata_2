grammar ids;

inicio          : identificadores ;
identificadores : ID+ ;
ID              : ('a'..'z' | 'A'..'Z') ;
WS              : (' ' | '\n' | '\t' | '\r')+ { $channel=HIDDEN; } ;
