package com.mrh0.horth;

import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.options.Command;
import com.mrh0.horth.options.Config;
import com.mrh0.horth.util.IO;
import com.mrh0.horth.util.Log;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, HorthException {
        //Log.log("Horth", "-", Horth.version);
        Config config = new Config();
        Command.eval(config, args);
        Log.setLogLevel(config.getLogLevel());
        IO.getIncludedFiles(config.getIncluded());

        Log.log(Log.getLevel());

        Horth horth = new Horth();
        Log.log("Compiling...");
        horth.compile(config);
        Log.log("Finished.");
        System.exit(0);
    }
}
