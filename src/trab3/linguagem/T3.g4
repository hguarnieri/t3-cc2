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

COMENTARIO
    : '{' ~('\n' | '\r' | '}')* '}' {skip();}
    ;
    
COMENTARIOERRO
    :   '{' (~('}'|'\n'))* '\n' {throw new ParseCancellationException("Linha "+getLine()+": comentario nao fechado");}
    ;

EMAIL
    :   ~('\n' | '\r' | '"')* '@' ~('\n' | '\r' | '"')* '.com' '.br'?
    ;

DATA
    : ('0'..'9')+ '/' ('0'..'9')+ '/' ('0'..'9')+
    ;

WS
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;

site
    : var* 'site' '(' parametros ')' estruturas;

parametros
    : 'tipo=' tiposite ',' 'titulo=' titulo ',' 'autor=' identificador
    ;

identificador
    : IDENT
    ;

var:
    'var' identificador ':' tipo_var '=' (autor);

tipo_var returns [int tipo]
    : 'autor' { $tipo=1; };

autor
    : '(' 'nome=' nome ',' 'contato=' contato ',' 'descricao=' descricao ')'
    ;

tiposite
    : 'blog' | 'cv' | 'site';

titulo
    : CADEIA;

descricao
    : CADEIA;

nome
    : CADEIA;

contato
    : EMAIL | CADEIA;

estruturas
    : estruturablog | estruturasite | estruturacv;

estruturablog
    : (post)*;

post
    : 'post' '(' 'titulo=' CADEIA ',' 'data=' DATA ',' 'conteudo=' CADEIA ')';

estruturasite
    : (item)*;

item
    : 'item' '(' 'titulo=' CADEIA ',' 'descricao=' CADEIA ')';

estruturacv
    : (secoes)+;

secoes
    : secaoExperiencia | secaoInfoAdicional;

secaoExperiencia
    : 'experiencia' '(' 'tipo=' tipoexperiencia ',' 'periodo=' periodo ',' 
        'organizacao=' organizacao ',' 'atividade=' atividade ')';

tipoexperiencia returns [int tipo]
    : 'profissional' { $tipo = 1; } | 'educacional' { $tipo = 2; };

organizacao
    : CADEIA;

atividade
    : CADEIA;

periodo
    : DATA ',' DATA;

secaoInfoAdicional
    : 'infoAdicional' '(' 'titulo=' CADEIA ',' 'descricao=' CADEIA ')';

ERROR: . { throw new ParseCancellationException("Linha " + getLine() + ": "+ getText() +" - simbolo nao identificado"); };