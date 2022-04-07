grammar TestProgrammer;
start:TYPE;
TYPE:INTEGER|DOUBLE;
INTEGER: INTEGERTYPE  DECLERATION DIGITSEQ WS* K;
DOUBLE:DOUBLETYPE DECLERATION DOUBLESEQ WS* K;
INTEGERTYPE:('int'|'long'|'short') WS;
DOUBLETYPE:('double'|'float') WS;
DECLERATION: ID WS* ASSIGNMENT WS*;

ID:(('a' .. 'z')|('A' .. 'Z') | ('_'))(('a' .. 'z')|('A' .. 'Z')|('0' .. '9')|('_'))* ;
WS:(' '|'\n'|'r')+{skip();};

ASSIGNMENT:('=');

DOUBLESEQ:DIGITSEQ|DIGITSEQ('.')DIGITSEQ;
DIGITSEQ:('0'..'9')+  ;

K:(';');
