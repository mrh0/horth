package com.mrh0.horth.options;

import com.mrh0.horth.util.IO;
import com.mrh0.horth.util.Log;

import java.util.List;

public class Command {
    public static void parse(Config config, String[] args) {
        if(args.length == 0)
            throw new IllegalArgumentException("Missing first argument: 'main file path'.");
        String input = args[0];

        Log.debug("Compiling: '", input, "'.");

        for(int i = 1; i < args.length; i++) {
            String arg = fromShorthand(args[i]);
            if(arg.length() == 0)
                continue;
            switch(arg) {
                case "output":
                    config.setOutput(args[++i]);
                    Log.debug(IO.getAbsolutePath(args[i]));
                    break;
                case "log-level":
                    config.setLogLevel(args[++i]);
                    break;
                default:
                    throw new IllegalArgumentException(arg);
            }
        }
    }

    public static String fromShorthand(String shorthand) {
        return switch (shorthand) {
            case "-o" -> "output";
            case "-ll" -> "log-level";
            default -> shorthand.replaceAll("--", "");
        };
    }
}
