package com.mrh0.horth.modules;

import com.mrh0.horth.antlr.HorthLexer;
import com.mrh0.horth.antlr.HorthParser;
import com.mrh0.horth.ast.Visitor;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.IExpanding;
import com.mrh0.horth.options.Config;
import com.mrh0.horth.typechecker.TypeChecker;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.util.Log;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class HorthModule {
    public HorthModule(File file, Config config, CompileData compileData) {

    }

    private static void load(File file, Config config, CompileData compileData) throws HorthException, IOException {
        InputStream inputStream = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        HorthLexer headerLexer = new HorthLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(headerLexer);

        HorthParser parser = new HorthParser(tokens);

        var tree = parser.program();
        var t = new Visitor(file, compileData).visitProgram(tree);
        Log.debug(t.toString());

        //PreTypeCheckExpanding
        List<HighInst> HLIR = new ArrayList<>(); // High Level Intermediate Representation
        t.expand(HLIR);
        Log.debug(HLIR);

        if(HLIR.size() == 0)
            return;

        //TypeChecking
        VirtualTypeStack stack = new VirtualTypeStack();
        TypeChecker.check(stack, compileData, HLIR);

        //PostTypeCheckExpanding
        List<HighInst> newHLIR = new ArrayList<>();
        IExpanding.expandAll(HLIR, newHLIR);

        HLIR = newHLIR;
        Log.debug(HLIR);
    }
}
