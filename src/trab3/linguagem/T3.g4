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
    CADEIA '@' CADEIA '.com' '.br'?  ; //procurar uma regra lexica para email

telefone:
        NUM_INT;

endereco:
    CADEIA; 

box:							//resolver problema de amgiguidade criado uma unica regra box e tratar o resutado 								//semanticamente

    'box' '(' tiposite ',' titulo ',' conteudo ',' data ')' | //blog
    'box' '(' tipobox ',' data ',' data ',' local ',' curso ')' | //cv- educacao
    'box' '(' tipobox ','  data ',' data ',' local ',' funcao ')' | //cv- experiencia
    'box' '(' tipobox ',' titulo ',' descricao ')' |  //cv-itens
    'box' '(' titulo ',' conteudo ')' ; //site

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
