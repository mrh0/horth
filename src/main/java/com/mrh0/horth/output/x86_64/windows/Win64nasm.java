package com.mrh0.horth.output.x86_64.windows;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.output.Arch;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;
import com.mrh0.horth.util.IO;

import java.io.IOException;
import java.net.URISyntaxException;
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
                .label("main")
                .inst("mov").reg("r12").reg("rsp");

        Win64nasmIT it = new Win64nasmIT();

        List<LowInst> LLIR = new ArrayList<>();
        for(HighInst hi : HLIR)
            it.transform(LLIR, hi);

        StringBuilder lisb = new StringBuilder();
        for(LowInst li : LLIR)
            lisb.append(li.getClass().getSimpleName() + ", ");
        System.out.println(lisb.toString());

        //List<LowInst> optimizedLLIR = Optimizer.optimize(LLIR);

        //System.out.println("Optimized:\n" + optimizedLLIR);

        for(LowInst li : /*optimized*/LLIR)
            li.asm(ib, data);

        sb.append('\n');
        return sb;
    }

    public static void nasmCompile(String inputFilePath, String outputFilePath) throws IOException, URISyntaxException {
        var in = IO.getFile(inputFilePath);
        var out = IO.getFile(outputFilePath);

        Runtime rt = Runtime.getRuntime();
        var command = "nasm " + in.getAbsolutePath() + " -felf64 -o " + out.getAbsolutePath();
        System.out.println("EXEC: '" + command + "'");
        Process nasmProcess = rt.exec(command);
        try {
            nasmProcess.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("NASM finished with exit code " + nasmProcess.exitValue());

        /*command = out.getAbsolutePath();
        System.out.println("EXEC: '" + command + "'");
        Process runProcess = rt.exec(command);
        try {
            runProcess.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PROGRAM finished with exit code " + runProcess.exitValue());*/
    }
}
