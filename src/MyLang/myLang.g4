grammar myLang;

s  : imports* ('protected'|'public')? MC_CLASS IDF '{' (dec ';')* methode+ '}'  ;

imports : MC_IMPORT BIB ';' ;
methode : IDF '{' inst+ '}';

inst : affect ';'
     | input
     | output
     | dec ';'
     | si
     | while_
     ;

dec : type ((affect ',' | IDF ',')* (affect|IDF) ) ;

type: (MC_INT | MC_FLOAT | MC_STRING) ;

affect : IDF ':=' exp ;

si : 'if' '(' exp ')' si_a 'then' '{' inst+ '}' si_b ('else' '{' inst+ '}' )? ;
si_a : ; // HELPERS TO INSERT ROUTINS
si_b : ; //

while_ :'while' while_a '(' exp ')' while_b '{' inst+ '}';
while_a:;
while_b:;

exp : MINUS exp
    | NOT exp
    | exp MOD exp
    | exp (MUL|DIV) exp
    | exp (PLUS | MINUS)  exp
    | exp AND exp
    | exp OR  exp
    | exp EQ  exp
    | exp NEQ exp
    | exp LET exp
    | exp GET exp
    | exp GT  exp
    | exp LT  exp
    | '(' exp ')'
    | terminal
    ;

terminal: IDF
        | INT  | FLOAT | STRING
        | TRUE | FALSE
        ;

output : MC_OUT '(' STRING ',' (exp io_a ',')* exp ')' PV ;
input : MC_IN '('  STRING ',' (exp io_b ',')* exp ')' PV ;
io_a : ;
io_b : ;

MC_CLASS : 'class';

MC_INT :'int' ;
MC_FLOAT:'float' ;
MC_STRING :'string' ;
MC_IN:'In';
MC_OUT:'Out';
MC_IMPORT : 'import';

MC_IF :   'if' ;
MC_THENE :'then';
MC_ELSE : 'else';
MC_WHILE : 'while';



// vals
INT  : [0-9]+ ;
FLOAT: [0-9]+ '.' [0-9]* ;
STRING: '"'(~["]|'\\"')*'"';
TRUE : 'true';
FALSE: 'false';

ACO_D: '}' ;
ACO_G: '{' ;
PAR_D:')'  ;
PAR_G:'('  ;
// arithmetic
PLUS :'+'  ;
MINUS:'-'  ;
MUL  :'*'  ;
DIV  :'/'  ;
MOD  :'%'  ;
// Compare
EQ   :'=' ;
NEQ  :'!=';
GT   :'>'  ;
LT   :'<'  ;
LET  :'<=' ;
GET  :'>=' ;
// logical
AND  :'and';
OR   :'or' ;
NOT  :'not';


ASSIGN:':=' ;
PV    :';' ;

IDF : [a-zA-Z_][a-zA-Z0-9_]* ;

BIB : IDF ('.' IDF)?;





WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

/*
OUSSAMA {
  x = 5 ;
  y = 5+6 ;
  print x+(5 - 3 *(6 / y)) ;
}
*/
 // skip spaces, tabs, newlines hello fhfgj