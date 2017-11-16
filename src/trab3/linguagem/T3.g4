grammar T3;

IDENT
    : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
    ;

CADEIA
    : '"' ~('\n' | '\r' | '"')* '"'
    ;

NUM_INT
    : ('0'..'9')+
    ;

NUM_REAL
    : ('0'..'9')+ '.' ('0'..'9')+
    ;

COMENTARIO
    : '{' ~('\n' | '\r' | '}')* '}' {skip();}
    ;
    

COMENTARIOERRO
    :   '{' (~('}'|'\n'))* '\n' {throw new ParseCancellationException("Linha "+getLine()+": comentario nao fechado");}
    ;
 

WS
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;

site:
	'site' ('(' parametros ')')? '{' menu? sidebar? banner? conteudo rodape? '}' EOF;

titulo_site:
    'titulo' '=' CADEIA;

titulo:
	'titulo' ('(' parametros ')')? '(' CADEIA ')';


ERROR: . { throw new ParseCancellationException("Linha " + getLine() + ": "+ getText() +" - simbolo nao identificado"); };