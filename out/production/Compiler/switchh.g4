grammar switchh;
start:stat*;
stat: assignment| if_stat| for_stat|while_stat|command|incrementt|switchhy ;
switchhy:SWITCH OPAR ID CPAR OBRACE (case_statement+ default_stat?) CBRACE;
case_statement:CASE val ':' ((assignment|incrementt|expr)*  |command?);
default_stat:DEFAULT  ':' (assignment|incrementt|expr)*;
incrementt: (ID '++' |ID '--' |'++'ID |'--'ID  )SCOL;
while_stat: WHILE condition_block ;
for_stat: FOR exprfor stat_block;
assignment: DType ID ASSIGN expr (COMMA ID ASSIGN expr)* SCOL;
if_stat: IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?;
condition_block: (expr stat_block);
block: stat*|(ident SCOL);
stat_block: OBRACE block CBRACE | stat;
exprfor: OPAR(((ident (COMMA assign_value)*)? SCOL cond* SCOL (chang(COMMA chang)*)?) | TRUE)CPAR;
ident: (DType assign_value );
assign_value:ID ASSIGN (val);
val:INT|FLOAT|STRING;
command:(BREAK|CONTINUE) SCOL;
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
WHILE:'while';
SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
BREAK:'break';
TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
FOR : 'for';
LOG : 'log';
SWITCH:'switch';
CASE: 'case';
COMMA:',';
CONTINUE:'continue';
DEFAULT:'default';
ID: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

INT: [0-9]+;

FLOAT: [0-9]+ '.' [0-9]*| '.' [0-9]+;

STRING: '"' (~["\r\n] | '""')* '"';

COMMENT: '#' ~[\r\n]* -> skip;

SPACE: [ \t\r\n] -> skip;

OTHER: .;
