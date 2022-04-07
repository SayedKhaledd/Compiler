grammar Loop;

stat: assignment| if_stat| for_stat ;
for_stat: FOR exprfor stat_block;
assignment: DType ID ASSIGN expr SCOL;  //p=lllll|pp
if_stat: IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?;
condition_block: (expr stat_block);
block: stat*|(ident SCOL);
stat_block: OBRACE block CBRACE | stat;
exprfor: OPAR(((ident (Coma assign_value)*)? SCOL cond* SCOL (chang(Coma chang)*)?) | TRUE)CPAR;
ident: (DType assign_value );
assign_value:ID ASSIGN (val);
val:INT|FLOAT|STRING;
Coma:',';
cond: expr ;
chang: (ID PLUS PLUS)|(ID MINUS MINUS)|(PLUS PLUS ID)|(MINUS MINUS ID);
expr
 : expr POW<assoc=right> expr           #powExpr
 | MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
// |DType
 ;

atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 ;
DType: 'double'| 'int' | 'String';
OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
FOR : 'for';
LOG : 'log';

ID: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

INT: [0-9]+;

FLOAT: [0-9]+ '.' [0-9]*| '.' [0-9]+;

STRING: '"' (~["\r\n] | '""')* '"';

COMMENT: '#' ~[\r\n]* -> skip;

SPACE: [ \t\r\n] -> skip;

OTHER: .;

//options
//    {
//         language = Java;
//    }
//Whitespaces : [ \t\r\n]+ -> skip ;
//
//start: Type? exp Eol;
//Type:'int' | 'double';
//Id: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9'| '_')*;
//Assignment: '=';
//Numbers: ('0'..'9')+;
//Value: '-'? (Numbers| (Numbers('.')Numbers));
//Eol: ';';
//exp: Id ((Assignment (Value | Id)))?;
//// SPACES AND TAPS
//WS : [ \t]+ -> skip ;
//// IF CONDITIONS
//ifcon: 'if' '(' Cond ')' '{' exp '}';
//Cond: (Id|Numbers)  WS Assignment Assignment WS (Id|Numbers);
