package com.mrh0.horth;

import com.mrh0.horth.antlr.HorthLexer;
import com.mrh0.horth.antlr.HorthParser;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.ast.Visitor;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.Arch;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.IExpanding;
import com.mrh0.horth.output.x86_64.linux.ArchElf64nasm;
import com.mrh0.horth.typechecker.TypeChecker;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.util.IO;
import com.mrh0.horth.util.Util;
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
        Arch.register(new ArchElf64nasm());

        //Select Arch
        Arch arch = Arch.get("win64nasm");

        //Antlr4
        HorthLexer lexer = new HorthLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HorthParser parser = new HorthParser(tokens);

        //Compile Data
        CompileData compileData = new CompileData(arch);

        var tree = parser.program();
        var t = new Visitor(inputFile).visitProgram(tree);
        System.out.println(t.toString());

        //PreTypeCheckExpanding
        List<HighInst> HLIR = new ArrayList<>(); // High Level Intermediate Representation
        t.expand(HLIR);

        System.out.println(HLIR);

        if(HLIR.size() == 0)
            return;

        //TypeChecking
        VirtualTypeStack stack = new VirtualTypeStack();
        TypeChecker.check(stack, compileData, HLIR);
        TypeChecker.end(stack, Util.lastOf(HLIR).token.getLocation());

        //PostTypeCheckExpanding
        List<HighInst> newHLIR = new ArrayList<>();
        IExpanding.expandAll(HLIR, newHLIR);

        HLIR = newHLIR;
        System.out.println(HLIR);


        //IDataChecked.checkAll(cd, HLIR);

        //win64nasm Arch Test
        var asmFile = "file:///horthdev/test.asm";
        var exeFile = "file:///horthdev/output.o";

        String outputnasm = arch.compile(compileData, HLIR).toString();

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
