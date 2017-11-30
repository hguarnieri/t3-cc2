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

decl_site
    : decl_autor* 
    | site
    ;

site
    : 'site' '(' parametros ')' estruturas;

parametros
    : 'tipo=' tiposite ',' 'titulo=' titulo ',' 'autor=' autor_id
    ;

decl_autor
    : 'autor' '(' autor ')' | site
    ;

autor_id
    : NUM_INT
    ;

autor
    : 'id=' autor_id ',' 'nome=' nome ',' 'contato=' contato ',' 'descricao=' descricao
    ;

tiposite returns [String tipo]
    : 'blog' { $tipo = "blog"; } | 'cv' { $tipo = "cv"; }
;

titulo
    : CADEIA;

descricao
    : CADEIA;

nome
    : CADEIA;

conteudo
    : CADEIA;

contato
    : EMAIL | CADEIA;

estruturas
    : estruturablog | estruturacv;

estruturablog
    : (post)+;

post
    : 'post' '(' 'autor=' autor_id ',' 'titulo=' titulo ',' 'data=' DATA ',' 'conteudo=' conteudo ')';

estruturacv
    : (secoes)+
    ;

secoes
    : secaoExperiencia | secaoAtividade;

secaoExperiencia
    : 'experiencia' '(' 'id=' experiencia_id ',' 'tipo=' tipoexperiencia ',' 'periodo=' periodo ',' 
        'organizacao=' organizacao ',' 'atividade=' atividade ')';

tipoexperiencia returns [int tipo]
    : 'profissional' { $tipo = 1; } | 'educacional' { $tipo = 2; };

organizacao
    : CADEIA;

atividade
    : CADEIA;

periodo
    : DATA ',' DATA;

secaoAtividade
    : 'atividade' '(' 'titulo=' titulo ',' 'descricao=' descricao ',' 'experiencia=' experiencia_id ')';

experiencia_id
    : NUM_INT;

ERROR: . { throw new ParseCancellationException("Linha " + getLine() + ": "+ getText() +" - simbolo nao identificado"); };