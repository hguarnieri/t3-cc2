/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3.project;

import java.util.ArrayList;
import java.util.List;
import trab3.linguagem.T3BaseListener;
import trab3.linguagem.T3Parser;

/**
 *
 * @author lucas
 */
public class AnalisadorSemantico extends T3BaseListener {
    
    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
    List<EntradaTabelaDeSimbolos> tabelaDeSimbolos = new ArrayList();
    SaidaParser sp;
    
    public AnalisadorSemantico(SaidaParser sp) {
        this.sp = sp;
    }

    @Override
    public void enterVar(T3Parser.VarContext ctx) {
        String nomeVar = ctx.identificador().IDENT().toString();
        TipoVar tipoVar = parseTipoVar(ctx.tipo_var().tipo);
        
        pilhaDeTabelas.topo().adicionarSimbolo(nomeVar, tipoVar.name());
        
        super.enterVar(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    enum TipoVar {
        Autor, Unknown;
    }
    
    private TipoVar parseTipoVar(int tipo) {
        switch(tipo) {
            case 1:
                return TipoVar.Autor;
            default:
                return TipoVar.Unknown;
        }
    }

    @Override
    public void enterSite(T3Parser.SiteContext ctx) {
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
        super.enterSite(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitSite(T3Parser.SiteContext ctx) {
        System.out.println(pilhaDeTabelas.getSimbolos());
        super.exitSite(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
