grammar IfStatement;
stat: if_stat|assignment|while_stat;
while_stat: WHILE expr stat_block;
assignment:TYPE ID  ASSIGN expr SCOL;
if_stat:IF condition_block  (ELSE IF condition_block)* (ELSE stat_block)?;
condition_block:expr stat_block;
block:stat*;
stat_block:OBRACE block CBRACE|stat;

expr:
expr POW <assoc=right> expr
|MINUS expr
|NOT expr
|expr op=(MULT|DIV|MOD)expr
|expr op=(PLUS|MINUS)expr
|expr op=(LT|GL|LTEQ|GTEQ)expr
|expr op=(EQ|NEQ)expr
|expr AND expr
|expr OR expr
|atom

;
atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom;
OR:'||';
AND:'&&';
EQ:'==';
NEQ:'!=';
GL:'>';
LT:'<';
GTEQ:'>=';
LTEQ:'<=';
PLUS:'+';
MINUS:'-';
MULT:'*';
DIV:'/';
MOD:'%';
POW:'^';
NOT:'!';
SCOL:';';
ASSIGN:'=';
OPAR:'(';
CPAR:')';
OBRACE:'{';
CBRACE:'}';
TRUE:'true';
FALSE:'false';
NIL:'nil';
IF:'if';
ELSE:'else';
WHILE:'while';

TYPE:'int'|'double'|'String';
ID:[a-zA-Z][a-zA-Z_0-9]*;

INT:[0-9]+;
FLOAT: [0-9]+ '.' [0-9]*| '.' [0-9]+;

STRING: '"' (~["\r\n] | '""')* '"';

COMMENT: '#' ~[\r\n]* -> skip;

SPACE: [ \t\r\n] -> skip;

OTHER: .;

