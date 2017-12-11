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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import trab3.linguagem.T3BaseListener;
import trab3.linguagem.T3Parser;

/**
 *
 * @author lucas
 */
public class AnalisadorSemanticoGeradorDeCodigo extends T3BaseListener {

    SaidaParser sp;
    List<Experiencia> experiencias = new ArrayList<>();
    List<Atividade> atividades = new ArrayList<>();
    List<Autor> autores = new ArrayList<>();
    List<Post> posts = new ArrayList<>();

    Multimap<String, String> properties = ArrayListMultimap.create();

    public AnalisadorSemanticoGeradorDeCodigo(SaidaParser sp) {
        this.sp = sp;
    }

    @Override
    public void enterSite(T3Parser.SiteContext ctx) {
        int autor_id = parseInt(ctx.parametros().autor_id().NUM_INT().toString());

        if (!existeAutor(autor_id)) {
            sp.println("Linha " + ctx.start.getLine() + ": autor id=" + autor_id + " nao declarado");
        }

        super.enterSite(ctx);
    }

    @Override
    public void exitSite(T3Parser.SiteContext ctx) {
        // Se existem erros semânticos, não gera o código
        if (sp.isModificado()) {
            return;
        }

        // Geração do código
        String titulo = (String) properties.get("titulo").toArray()[0];
        String tipoSite = (String) properties.get("tipoSite").toArray()[0];

        if (tipoSite.equals("cv")) {
            StringBuilder educacao = new StringBuilder(); // armazena HTML da seção de educação
            StringBuilder profissional = new StringBuilder(); // armazena o HTML da seção profissional
            StringBuilder adicional = new StringBuilder(); // armazena o HTML da seção adicional

            experiencias.forEach(exp -> {
                if (exp.tipo == TipoExperiencia.Profissional) {
                    profissional.append("<article>");
                    profissional.append("<h2>").append(exp.organizacao).append("</h2>");
                    profissional.append("<p class=\"subDetails\">").append(exp.periodo.formatted()).append("</p>");
                    profissional.append("<p>").append(exp.titulo).append("</p>");
                    profissional.append("</article>");
                } else if (exp.tipo == TipoExperiencia.Academico) {
                    educacao.append("<article>");
                    educacao.append("<h2>").append(exp.organizacao).append("</h2>");
                    educacao.append("<p class=\"subDetails\">").append(exp.periodo.formatted()).append("</p>");
                    educacao.append("<p>").append(exp.titulo).append("</p>");
                    educacao.append("</article>");
                }
            });

            atividades.forEach(atividade -> {
                Experiencia experiencia = getExperiencia(atividade.experiencia_id);
                adicional.append("<li>")
                        .append(atividade.titulo).append(" - ").append(atividade.descricao)
                        .append("<p class=\"subDetails\">")
                        .append(experiencia.organizacao).append(" - ")
                        .append(experiencia.titulo)
                        .append("</p>")
                        .append("</li>");
            });

            // faz o parse do html que está na pasta
            String site = String.format(
                    readFile("src/trab3/casosDeTeste/resultado_gerado/sites/CV/modelo.html"),
                    titulo,
                    autores.get(0).nome,
                    autores.get(0).contato,
                    autores.get(0).descricao,
                    educacao.toString(),
                    profissional.toString(),
                    adicional.toString());

            createFile("src/trab3/casosDeTeste/resultado_gerado/sites/CV/gerado.html", site);
        } else {
            StringBuilder htmlPosts = new StringBuilder();

            posts.forEach(p -> {
                Autor autor = getAutor(p.autor_id);
                htmlPosts.append("<article class=\"post\">")
                        .append("<div class=\"post-content\">")
                        .append("<time class=\"post-date\" pubdate=\"\">").append(formatted(p.data)).append("</time>")
                        .append("<h1 class=\"post-title\"><a href=\"#\">").append(p.titulo).append("</a></h1>")
                        .append("por ").append(autor.nome).append("")
                        .append("<p>").append(p.conteudo).append("</p>")
                        .append("</div>")
                        .append("</article>");
            });

            String site = String.format(
                    readFile("src/trab3/casosDeTeste/resultado_gerado/sites/Blog/modelo.html"),
                    titulo,
                    titulo,
                    htmlPosts.toString(),
                    autores.get(0).nome,
                    autores.get(0).contato,
                    autores.get(0).descricao);

            createFile("src/trab3/casosDeTeste/resultado_gerado/sites/Blog/gerado.html", site);
        }

        super.exitSite(ctx);
    }

    @Override
    public void enterTiposite(T3Parser.TipositeContext ctx) {
        properties.put("tipoSite", ctx.tipo);
        super.enterTiposite(ctx);
    }

    @Override
    public void enterPost(T3Parser.PostContext ctx) {
        // Para cada post encontrado
        int autor_id = parseInt(ctx.autor_id().NUM_INT().toString());
        Post post = new Post(
                autor_id,
                trim(ctx.titulo().CADEIA().toString()),
                parseDate(ctx.DATA().toString()),
                trim(ctx.conteudo().CADEIA().toString())
        );

        posts.add(post);

        if (!existeAutor(autor_id)) {
            sp.println("Linha " + ctx.start.getLine() + ": autor id=" + autor_id + " nao declarado");
        }

        super.enterPost(ctx);
    }

    @Override
    public void enterAutor(T3Parser.AutorContext ctx) {
        Autor autor = new Autor(
                parseInt(ctx.autor_id().NUM_INT().toString()),
                trim(ctx.nome().CADEIA().toString()),
                trim(ctx.contato().CADEIA().toString()),
                trim(ctx.descricao().CADEIA().toString())
        );

        autores.add(autor);

        super.enterAutor(ctx);
    }

    @Override
    public void enterTitulo(T3Parser.TituloContext ctx) {
        properties.put("titulo", trim(ctx.CADEIA().toString()));
        super.enterTitulo(ctx);
    }

    @Override
    public void enterSecaoExperiencia(T3Parser.SecaoExperienciaContext ctx) {
        // Para cada seção de experiencia
        Experiencia exp = new Experiencia(
                parseInt(ctx.experiencia_id().NUM_INT().toString()),
                TipoExperiencia.parse(ctx.tipoexperiencia().tipo),
                criaPeriodo(ctx.periodo().DATA(0).toString(), ctx.periodo().DATA(1).toString()),
                trim(ctx.organizacao().CADEIA().toString()),
                trim(ctx.atividade().CADEIA().toString())
        );

        experiencias.add(exp);

        super.enterSecaoExperiencia(ctx);
    }

    @Override
    public void enterSecaoAtividade(T3Parser.SecaoAtividadeContext ctx) {
        // Para cada seção de atividade
        Atividade atividade = new Atividade(
                trim(ctx.titulo().CADEIA().toString()),
                trim(ctx.descricao().CADEIA().toString()),
                parseInt(ctx.experiencia_id().NUM_INT().toString())
        );

        atividades.add(atividade);

        if (!existeExperiencia(atividade.experiencia_id)) {
            sp.println("Linha " + ctx.start.getLine() + ": experiencia id=" + atividade.experiencia_id + " nao declarada");
        }

        super.enterSecaoAtividade(ctx);
    }

    // Funções de suporte
    private String formatted(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.format(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new String();
    }

    private String trim(String value) {
        return value.replace("\"", "");
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
            Logger.getLogger(AnalisadorSemanticoGeradorDeCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    public static void createFile(String path, String conteudo) {
        try {
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
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private boolean existeExperiencia(int id) {
        return this.experiencias.stream().anyMatch(e -> e.id == id);
    }

    private Experiencia getExperiencia(int id) {
        return this.experiencias.stream().filter(e -> e.id == id).findFirst().get();
    }

    private boolean existeAutor(int id) {
        return this.autores.stream().anyMatch(a -> a.id == id);
    }

    private Autor getAutor(int id) {
        return this.autores.stream().filter(a -> a.id == id).findFirst().get();
    }

    private int parseInt(String value) {
        return Integer.parseInt(value);
    }

    private Date parseDate(String data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.parse(data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return new Date();
    }

    private Periodo criaPeriodo(String inicio, String fim) {
        return new Periodo(inicio, fim);
    }

    // Classes de suporte
    public enum TipoExperiencia {
        Profissional(1), Academico(2), Unknown(3);

        int value;

        TipoExperiencia(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static TipoExperiencia parse(int id) {
            Stream<TipoExperiencia> tipos = Arrays.stream(TipoExperiencia.values());
            return tipos.filter(t -> t.getValue() == id).findFirst().get();
        }
    }

    class Post {

        public int autor_id;
        public String titulo;
        public Date data;
        public String conteudo;

        public Post(int autor_id, String titulo, Date data, String conteudo) {
            this.autor_id = autor_id;
            this.titulo = titulo;
            this.data = data;
            this.conteudo = conteudo;
        }

        @Override
        public String toString() {
            return "Post{" + "autor_id=" + autor_id + ", titulo=" + titulo + ", data=" + data + ", conteudo=" + conteudo + '}';
        }
    }

    class Autor {

        public int id;
        public String nome;
        public String contato;
        public String descricao;

        public Autor(int id, String nome, String contato, String descricao) {
            this.id = id;
            this.nome = nome;
            this.contato = contato;
            this.descricao = descricao;
        }

        @Override
        public String toString() {
            return "Autor{" + "id=" + id + ", nome=" + nome + ", contato=" + contato + ", descricao=" + descricao + '}';
        }
    }

    class Experiencia {

        public int id;
        public TipoExperiencia tipo;
        public Periodo periodo;
        public String organizacao;
        public String titulo;

        public Experiencia(int id, TipoExperiencia tipo, Periodo periodo, String organizacao, String titulo) {
            this.id = id;
            this.tipo = tipo;
            this.periodo = periodo;
            this.organizacao = organizacao;
            this.titulo = titulo;
        }

        @Override
        public String toString() {
            return "Experiencia{" + "id=" + id + ", tipo=" + tipo + ", periodo=" + periodo + ", organizacao=" + organizacao + ", titulo=" + titulo + '}';
        }
    }

    class Atividade {

        public String titulo;
        public String descricao;
        public int experiencia_id;

        public Atividade(String titulo, String descricao, int experiencia_id) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.experiencia_id = experiencia_id;
        }

        @Override
        public String toString() {
            return "Atividade{" + "titulo=" + titulo + ", descricao=" + descricao + ", experiencia_id=" + experiencia_id + '}';
        }
    }

    class Periodo {

        public Date inicio;
        public Date fim;

        Periodo(String inicio, String fim) {
            this.inicio = parse(inicio);
            this.fim = parse(fim);
        }

        private Date parse(String data) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                return sdf.parse(data);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            return new Date();
        }

        private String formatted() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                return sdf.format(this.inicio) + " - " + sdf.format(this.fim);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return new String();
        }

        @Override
        public String toString() {
            return "Periodo{" + "inicio=" + inicio + ", fim=" + fim + '}';
        }
    }

}
