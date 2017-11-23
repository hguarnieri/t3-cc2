grammar T3;

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
 

WS
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;


site:
	'site' '(' parametros ')' (estruturaSite | estruturaBlog | estruturaCV ); //adicionar palavras chaves para visualizacao de codigo


parametros:
    tiposite (',' titulo)?;

titulo:
    CADEIA;

tiposite:
        'blog' | 'cv' | 'site';

descricao:
    'descricao' '(' CADEIA ')';

infopessoal:
    'infopessoal' '(' nome ',' data ',' endereco ',' contato ')' | // cv
    'infopessoal' '(' nome ',' contato ',' perfil ')' ; // blog

nome:   
    CADEIA;

contato:
    '(' email | telefone ')';

perfil:
    CADEIA;

email: 
    EMAIL ;

telefone:
        NUM_INT;

endereco:
    CADEIA; 

box:													//semanticamente

    'boxBlog' '(' tiposite ',' titulo ',' conteudo ',' data ')' | //blog
    'boxCvAtividade' '(' tipobox ',' data ',' data ',' local ',' atividade ')' | //cv- educacao
    'boxCvItens' '(' tipobox ',' titulo ',' descricao ')' |  //cv-itens
    'boxSite' '(' titulo ',' conteudo ')' ; //site

tipobox:
    'post' | 'educacao' | 'experiencia' | 'infoadicional' | 'conteudo' ;

data:   
    '"' NUM_INT '/' NUM_INT '/' NUM_INT '"';

conteudo:
    CADEIA;

local:
    CADEIA;

curso:
    CADEIA;

funcao:
    CADEIA;


aviso:
    CADEIA;


    
ERROR: . { throw new ParseCancellationException("Linha " + getLine() + ": "+ getText() +" - simbolo nao identificado"); };
