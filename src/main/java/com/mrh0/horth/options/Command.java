package com.mrh0.horth.options;

import java.util.List;

public class Command {
    public static void parse(Config config, String[] args) {
        String input = args[0];

        System.out.println(input);

        for(int i = 1; i < args.length; i++) {
            String arg = fromShorthand(args[i]);
            if(arg.length() == 0)
                continue;
            switch(arg) {
                case "output":
                    config.setOutput(args[++i]);
                    break;
                default:
                    throw new IllegalArgumentException(arg);
            }
        }
    }

    public static String fromShorthand(String shorthand) {
        return switch (shorthand) {
            case "-o" -> "output";
            default -> shorthand.replaceAll("--", "");
        };
    }
}
