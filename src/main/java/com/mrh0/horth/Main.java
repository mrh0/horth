package com.mrh0.horth;

import com.mrh0.horth.antlr.HorthLexer;
import com.mrh0.horth.antlr.HorthParser;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.ast.Visitor;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.options.Command;
import com.mrh0.horth.options.Config;
import com.mrh0.horth.output.Arch;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.IExpanding;
import com.mrh0.horth.output.x86_64.linux.ArchElf64nasm;
import com.mrh0.horth.typechecker.TypeChecker;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.util.IO;
import com.mrh0.horth.util.Log;
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
    public static String version = "20220504a";

    public static void main(String[] args) throws IOException, URISyntaxException, HorthException {
        Log.log("Horth", "-", version);
        Config config = new Config();
        Command.parse(config, args);
        Log.setLogLevel(config.getLogLevel());

        Horth horth = new Horth();
        Log.log("Compiling...");
        horth.compile(config);
        Log.log("Finished.");
        System.exit(0);
    }
}
