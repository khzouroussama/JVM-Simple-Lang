grammar myLang;

s  : imports* ('protected'|'public')? MC_CLASS IDF '{' methode+ '}'  ;

imports : MC_IMPORT BIB ';' ;
methode : IDF '{' inst+ '}';

inst : affect ';'
     | input
     | output
     | dec ';'
     | si
     ;

dec : type ((affect ',' | IDF ',')* (affect|IDF) ) ;

type: (MC_INT | MC_FLOAT | MC_STRING) ;

affect : IDF ':=' exp ;

si : 'si' '(' exp ')' si_a 'alors' '{' inst+ '}' si_b ('sinon' '{' inst+ '}' )? ;
si_a : ; // HELPERS
si_b : ; //

exp : exp MUL exp
    | exp DIV exp
    | exp MOD exp
    | exp PLUS  exp
    | exp MINUS exp
    | exp AND exp
    | exp OR  exp
    | exp EQ  exp
    | exp NEQ exp
    | exp LET exp
    | exp GET exp
    | exp GT  exp
    | exp LT  exp
    | MINUS exp
    | NOT exp
    | '(' exp ')'
    | terminal
    ;

terminal: IDF
        | INT  | FLOAT | STRING
        | TRUE | FALSE
        ;

output : MC_OUT '(' STRING ',' (exp ',')* exp ')' PV ;
input : MC_IN '(' exp ')' PV ;


MC_CLASS : 'sj_class';

MC_INT :'sj_int' ;
MC_FLOAT:'sj_float' ;
MC_STRING :'sj_string' ;
MC_IN:'sj_In';
MC_OUT:'sj_Out';
MC_IMPORT : 'import';

MC_IF :   'si' ;
MC_THENE :'alors';
MC_ELSE : 'sinon';



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
NEQ  :'=/=';
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