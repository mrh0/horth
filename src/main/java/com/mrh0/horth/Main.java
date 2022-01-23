package com.mrh0.horth;

import com.mrh0.horth.antlr.HorthLexer;
import com.mrh0.horth.antlr.HorthParser;
import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.ast.Visitor;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.Arch;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.IExpanding;
import com.mrh0.horth.output.x86_64.windows.Win64nasm;
import com.mrh0.horth.output.x86_64.windows.nasm.Optimizer;
import com.mrh0.horth.typechecker.TypeChecker;
import com.mrh0.horth.typechecker.VirtualStack;
import com.mrh0.horth.util.IO;
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

        //Register win64nasm
        Arch.register(new Win64nasm());

        //Antlr4
        HorthLexer lexer = new HorthLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HorthParser parser = new HorthParser(tokens);

        var tree = parser.program();
        var t = new Visitor(inputFile).visitProgram(tree);
        System.out.println(t.toString());

        //PreTypeCheckExpanding
        List<HighInst> HLIR = new ArrayList<>(); // High Level Intermediate Representation
        t.expand(HLIR);

        System.out.println(HLIR);

        //TypeChecking
        VirtualStack stack = new VirtualStack();
        TypeChecker.check(stack, HLIR);
        TypeChecker.end(stack);

        //PostTypeCheckExpanding
        List<HighInst> newHLIR = new ArrayList<>();
        for(HighInst hi : HLIR)
            if(hi instanceof IExpanding)
                ((IExpanding) hi).expand(newHLIR);
            else
                newHLIR.add(hi);

        HLIR = newHLIR;
        System.out.println(HLIR);

        //win64nasm Arch Test
        var asmFile = "file:///horthdev/test.asm";
        var exeFile = "file:///horthdev/output.o";

        String outputnasm = Arch.get("win64nasm").compile(HLIR).toString();

        //Output
        System.out.println(outputnasm);
        IO.writeFile(IO.getFile(asmFile), outputnasm);

        /*try {
            Win64nasm.nasmCompile(asmFile, exeFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }*/
    }
}
