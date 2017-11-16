/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3.project;

import java.util.List;
/**
 *
 * @author daniel
 */
public class EntradaTabelaDeSimbolos {
    private String nome, tipo;
    
    public EntradaTabelaDeSimbolos(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTipo() {
        return tipo;
    }
}