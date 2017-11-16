/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3.project;

import trab3.linguagem.T3BaseListener;
import trab3.linguagem.T3Parser;

/**
 *
 * @author Henrique
 */
public class GeradorCodigo extends T3BaseListener {
    
    SaidaParser sp;

    GeradorCodigo(SaidaParser sp) {
        this.sp = sp;
    }

    @Override
    public void enterSite(T3Parser.SiteContext ctx) {
        sp.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "  <head>\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        super.enterSite(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitSite(T3Parser.SiteContext ctx) {
        sp.println("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "    <nav class=\"navbar navbar-default\">\n" +
                    "      <div class=\"container-fluid\">\n" +
                    "        <div class=\"navbar-header\">\n" +
                    "          <a class=\"navbar-brand\" href=\"#\">Compiladores 2</a>\n" +
                    "        </div>\n" +
                    "        <ul class=\"nav navbar-nav\">\n" +
                    "          <li class=\"active\"><a href=\"#\">Home</a></li>\n" +
                    "          <li><a href=\"#\">Page 1</a></li>\n" +
                    "          <li><a href=\"#\">Page 2</a></li>\n" +
                    "          <li><a href=\"#\">Page 3</a></li>\n" +
                    "        </ul>\n" +
                    "      </div>\n" +
                    "    </nav>\n" +
                    "    <h1>Hello, world!</h1>");
        sp.println("    <script src=\"js/jquery-3.2.1.min.js\"></script>\n" +
                    "    <script src=\"js/bootstrap.min.js\"></script>\n" +
                    "  </body>\n" +
                    "</html>");
        super.exitSite(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void enterTitulo(T3Parser.TituloContext ctx) {
        sp.println("<title>" + ctx.CADEIA() + "</title>");
        super.enterTitulo(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
