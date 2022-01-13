package com.mrh0.horth.output.x86_64.windows;

import com.mrh0.horth.Main;
import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.output.Arch;
import com.mrh0.horth.output.instructions.InstructionTransformer;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;
import com.mrh0.horth.output.x86_64.windows.nasm.Optimizer;
import com.mrh0.horth.util.IO;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Win64nasm extends Arch {
    @Override
    public String getName() {
        return "win64nasm";
    }

    @Override
    public StringBuilder compile(List<HighInst> HLIR) throws CompileException {
        StringBuilder sb = new StringBuilder();
        InstructionBuilder ib = new InstructionBuilder(sb);
        CompileData data = new CompileData();

        ib      .inst("global").reg("main")
                .inst("section").reg(".text")
                .label("main");

        Win64nasmIT it = new Win64nasmIT();

        List<LowInst> LLIR = new ArrayList<>();
        for(HighInst hi : HLIR)
            it.transform(LLIR, hi);

        System.out.println(LLIR);

        //List<LowInst> optimizedLLIR = Optimizer.optimize(LLIR);

        //System.out.println("Optimized:\n" + optimizedLLIR);

        for(LowInst li : /*optimized*/LLIR)
            li.asm(ib, data);

        try {
            nasmCompile("file:///horthdev/test.asm", "file:///horthdev/output.exe");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return sb;
    }

    public void nasmCompile(String inputFilePath, String outputFilePath) throws IOException, URISyntaxException {
        var in = IO.getFile(inputFilePath);
        var out = IO.getFile(outputFilePath);

        Runtime rt = Runtime.getRuntime();
        System.out.println("nasm " + in.getAbsolutePath() + " -o " + out.getAbsolutePath());
        //Process nasmProcess = rt.exec();
    }
}
