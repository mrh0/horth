package com.mrh0.horth;

import com.mrh0.horth.antlr.HorthLexer;
import com.mrh0.horth.antlr.HorthParser;
import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.ast.Visitor;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.Arch;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.x86_64.windows.Win64nasm;
import com.mrh0.horth.output.x86_64.windows.nasm.Optimizer;
import com.mrh0.horth.typechecker.TypeChecker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, HorthException {
        var inputFile = Paths.get(Main.class.getResource("/test/dev.hth").toURI()).toFile();

        InputStream inputStream = (inputFile == null) ? System.in : new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(inputStream);

        Arch.register(new Win64nasm());

        HorthLexer lexer = new HorthLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HorthParser parser = new HorthParser(tokens);

        var tree = parser.program();
        var t = new Visitor().visitProgram(tree);
        System.out.println(t.toString());

        List<HighInst> HLIR = new ArrayList<>(); // High Level Intermediate Representation
        t.expand(HLIR);

        System.out.println(HLIR);

        TypeChecker tc = new TypeChecker();
        tc.check(HLIR);
        tc.end();

        System.out.println(Arch.get("win64nasm").compile(HLIR).toString());
    }
}
