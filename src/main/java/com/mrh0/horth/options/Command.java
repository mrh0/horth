package com.mrh0.horth.options;

import com.mrh0.horth.Horth;
import com.mrh0.horth.util.IO;
import com.mrh0.horth.util.Log;

import java.util.List;

public class Command {
    public enum Mode {

    }

    public static void eval(Config config, String[] args) {
        if(args.length == 0)
            throw new IllegalArgumentException("No arguments provided");

        for(int i = 0; i < args.length; i++) {
            String arg = args[i];
            if(arg.length() == 0)
                continue;
            switch(arg) {
                case "?":
                case "--help":
                    System.out.println(IO.readFile(IO.getResource("/help.txt")));
                    System.exit(0);
                    break;
                case "-c":
                case "--compile":
                    config.setInput(args[++i]);
                    break;
                case "-o":
                case "--output":
                    config.setOutput(args[++i]);
                    break;
                case "-ll":
                case "--log-level":
                    config.setLogLevel(args[++i]);
                    break;
                case "-d":
                case "--debug":
                    config.setLogLevel("all");
                    break;
                case "-i":
                case "--include":
                    config.addIncluded(args[++i]);
                    break;
                case "-ia":
                case "--include-all":
                    config.addIncluded("**/*.horth");
                    break;
                case "-v":
                case "--version":
                    System.out.println("Version: " + Horth.version);
                    System.exit(0);
                    break;
                default:
                    throw new IllegalArgumentException(arg);
            }
        }
    }
}
