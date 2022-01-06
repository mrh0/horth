package com.mrh0.horth;

import com.mrh0.horth.antlr.HorthLexer;
import com.mrh0.horth.antlr.HorthParser;
import com.mrh0.horth.ast.Visitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        var inputFile = Paths.get(Main.class.getResource("/test/dev.hth").toURI()).toFile();

        InputStream inputStream = (inputFile == null) ? System.in : new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(inputStream);

        HorthLexer lexer = new HorthLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HorthParser parser = new HorthParser(tokens);

        var tree = parser.program();
        var t = new Visitor().visitProgram(tree);
        System.out.println(t.toString());
    }
}
