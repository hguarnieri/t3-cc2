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
	'site' '(' parametros ')';

parametros:
    tiposite ',' titulo?;

titulo:
    CADEIA;

tiposite:
//blog, cv, site

descricao:
    CADEIA;

info-pessoal:
    '(' nome ',' data_nascimento ',' endereco ',' contato ')';

contato:
    '(' email | telefone ')';

email: 
    CADEIA '@' CADEIA '.com' | 'br'  ;

telefone:
        NUM_INT;

box:
    'box' '(' tiposite ',' tipobox ',' | //obrigatorio para todos //blog,site,cv   //post,edu,exp,outros
              titulo ',' conteudo ',' data | //blog
              periodo ',' local ',' curso | //cv- educacao
              periodo ',' local ',' curso | //cv- experiencias
              titulo ',' conteudo | //site
              itens* ')'; //cv-itens
          
itens:
    CADEIA ;

tipobox:
//post,educacao,experiencias,outras_infos,site-content

data:   
    '"' NUM_INT ',' NUM_INT ',' NUM_INT '"';

conteudo:
    CADEIA;

local:
    CADEIA;

curso:
    CADEIA;

periodo:
    'Inicio:' data ',' 'Termino:' data ;




    
ERROR: . { throw new ParseCancellationException("Linha " + getLine() + ": "+ getText() +" - simbolo nao identificado"); };