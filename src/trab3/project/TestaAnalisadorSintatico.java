package trab3.project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import trab3.linguagem.T3Lexer;
import trab3.linguagem.T3Parser;

public class TestaAnalisadorSintatico {

    public static void main(String args[]) throws IOException, RecognitionException {
        SaidaParser sp = new SaidaParser();

        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
            T3Lexer lexer = new T3Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            T3Parser parser = new T3Parser(tokens);
            parser.addErrorListener(new T3ErrorListener(sp));
            
            // Faz a análise sintática
            T3Parser.Decl_siteContext arvore = parser.decl_site();
            
            // Se passou na análise sintática, faz a semântica
            if (!sp.isModificado()) {
                ParseTreeWalker walker = new ParseTreeWalker();
                AnalisadorSemantico listener = new AnalisadorSemantico(sp);
                walker.walk(listener, arvore);
            }
        } catch (ParseCancellationException pce) {
            if (pce.getMessage() != null) { 
                  sp.println(pce.getMessage());
            }
        }
        
        System.out.println(sp.toString());
    }
}