/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3.project;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import trab3.linguagem.T3BaseListener;
import trab3.linguagem.T3Parser;

/**
 *
 * @author Henrique
 */
public class GeradorCodigo extends T3BaseListener {

    SaidaParser sp;
    Multimap<String, Object> properties = ArrayListMultimap.create();

    GeradorCodigo(SaidaParser sp) {
        this.sp = sp;
    }

    @Override
    public void exitSite(T3Parser.SiteContext ctx) {
        String titulo = (String) properties.get("titulo").toArray()[0];
        String autorNome = (String) properties.get("autorNome").toArray()[0];
        String autorContato = (String) properties.get("autorContato").toArray()[0];
        String autorDescricao = (String) properties.get("autorDescricao").toArray()[0];
        
        StringBuilder educacao = new StringBuilder();
        StringBuilder profissional = new StringBuilder();
        StringBuilder adicional = new StringBuilder();
        
        properties.get("secaoExperiencia").forEach(secao -> {
            SecaoExperiencia exp = (SecaoExperiencia) secao;
            if (exp.tipo == 1) {
                profissional.append("<article>");
                profissional.append("<h2>").append(exp.organizacao).append("</h2>");
                profissional.append("<p class=\"subDetails\">").append(exp.periodoInicio).append(" - ").append(exp.periodoFim).append("</p>");
                profissional.append("<p>").append(exp.atividade).append("</p>");
                profissional.append("</article>");
            }
        });
        
        properties.get("secaoExperiencia").forEach(secao -> {
            SecaoExperiencia exp = (SecaoExperiencia) secao;
            if (exp.tipo == 2) {
                educacao.append("<article>");
                educacao.append("<h2>").append(exp.organizacao).append("</h2>");
                educacao.append("<p class=\"subDetails\">").append(exp.periodoInicio).append(" - ").append(exp.periodoFim).append("</p>");
                educacao.append("<p>").append(exp.atividade).append("</p>");
                educacao.append("</article>");
            }
        });
        
        properties.get("secaoAdicional").forEach(secao -> { 
            SecaoAdicional item = (SecaoAdicional) secao;
            adicional.append("<li>").append(item.titulo).append(" - ").append(item.descricao).append("</li>");
        });
        
        String site = String.format(
                readFile("src/trab3/casosDeTeste/site/CV/index.html"),
                titulo,
                autorNome,
                autorContato,
                autorDescricao,
                educacao.toString(),
                profissional.toString(),
                adicional.toString());
        
        createFile("src/trab3/casosDeTeste/site/CV/gerado.html", site);
        
        sp.println(site);

        super.exitSite(ctx);
    }

    @Override
    public void enterTitulo(T3Parser.TituloContext ctx) {
        properties.put("titulo", ctx.CADEIA().toString().replace("\"", ""));
        super.enterTitulo(ctx);
    }

    @Override
    public void enterAutor(T3Parser.AutorContext ctx) {
        properties.put("autorNome", ctx.nome().CADEIA().toString().replace("\"", ""));
        properties.put("autorContato", ctx.contato().CADEIA().toString().replace("\"", ""));
        properties.put("autorDescricao", ctx.descricao().CADEIA().toString().replace("\"", ""));
        super.enterAutor(ctx);
    }

    @Override
    public void enterSecaoExperiencia(T3Parser.SecaoExperienciaContext ctx) {
        String organizacao = ctx.organizacao().CADEIA().toString().replace("\"", "");
        String atividade = ctx.atividade().CADEIA().toString().replace("\"", "");
        String periodoInicio = ctx.periodo().DATA(0).toString();
        String periodoFim = ctx.periodo().DATA(1).toString();
        int tipo = ctx.tipoexperiencia().tipo;

        SecaoExperiencia secao = new SecaoExperiencia(
                organizacao, 
                atividade, 
                periodoInicio, 
                periodoFim, 
                tipo
        );

        properties.put("secaoExperiencia", secao);

        super.enterSecaoExperiencia(ctx);
    }

    @Override
    public void enterSecaoInfoAdicional(T3Parser.SecaoInfoAdicionalContext ctx) {
        SecaoAdicional secao = new SecaoAdicional(
                ctx.CADEIA().get(0).toString().replace("\"", ""),
                ctx.CADEIA().get(1).toString().replace("\"", "")
        );
        
        properties.put("secaoAdicional", secao);
        
        super.enterSecaoInfoAdicional(ctx);
    }

    private String readFile(String path) {
        try {
            InputStream is = new FileInputStream(path);
        
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));
            String line = buf.readLine();
            StringBuilder sb = new StringBuilder();
            while (line != null) {
                sb.append(line).append("\n");
                line = buf.readLine();
            }
            String fileAsString = sb.toString();

            return fileAsString;
        
        } catch (Exception ex) {
            Logger.getLogger(GeradorCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }
    
    public static void createFile(String path, String conteudo) {
        try{
            // Create new file
            File file = new File(path);

            // If file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.write(conteudo);

            // Close connection
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    class SecaoAdicional {
        public String titulo;
        public String descricao;

        public SecaoAdicional(String titulo, String descricao) {
            this.titulo = titulo;
            this.descricao = descricao;
        }
    }

    public class SecaoExperiencia {

        public String organizacao;
        public String atividade;
        public String periodoInicio;
        public String periodoFim;
        public int tipo;

        public SecaoExperiencia(String organizacao, String atividade, String periodoInicial, String periodoFinal, int tipo) {
            this.organizacao = organizacao;
            this.atividade = atividade;
            this.periodoInicio = periodoInicial;
            this.periodoFim = periodoFinal;
            this.tipo = tipo;
        }
        
    }

}
