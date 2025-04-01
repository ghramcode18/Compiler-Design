import AST.ASTVisitor;
import AST.Program;

import Grammar.ReactLexer;
import Grammar.ReactParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException {
        String source = "Tests/test4.txt";
        CharStream charStream = fromFileName(source);
        ReactLexer lexarFile = new ReactLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexarFile);
        ReactParser parserFile =  new ReactParser(tokens);
        ParseTree ast = parserFile.program();
        ASTVisitor exampleVisitor = new ASTVisitor();
        Program program = (Program) exampleVisitor.visit(ast);
        System.out.println(program);

    }
}