package com.mrh0.horth.util;

import java.io.PrintStream;
import java.util.function.Function;

public class Log {
    private static PrintStream STREAM = System.out;
    private static PrintStream ERROR_STREAM = System.err;
    private static String SEPARATOR = " ";
    private static Level LEVEL = Level.NORMAL;

    public enum Level {
        ALL(t -> true),
        NORMAL(t -> t != Type.DEBUG),
        NONE(t -> false);

        private Function<Type, Boolean> allow;
        Level(Function<Type, Boolean> allow) {
            this.allow = allow;
        }

        public boolean isAllowed(Type type) {
            return this.allow.apply(type);
        }

        public static Level from(String name) {
            return switch(name.toLowerCase()) {
                case "all" -> ALL;
                case "none" -> NONE;
                default -> NORMAL;
            };
        }
    }

    public enum Type {
        WARN("[WARN]: "),
        DEBUG("[DEBUG]: "),
        LOG("[LOG]: ");

        public final String prefix;

        Type(String prefix) {
            this.prefix = prefix;
        }
    }

    private static void put(Type type, Object...objects) {
        if(!LEVEL.isAllowed(type))
            return;
        StringBuilder b = new StringBuilder();
        b.append(type.prefix);
        for(int i = 0; i < objects.length-1; i++) {
            b.append(objects[i]);
            b.append(SEPARATOR);
        }
        b.append(objects[objects.length-1]);
        STREAM.println(b.toString());
    }

    public static void log(Object...objects) {
        put(Type.LOG, objects);
    }

    public static void warn(Object...objects) {
        put(Type.WARN, objects);
    }

    public static void debug(Object...objects) {
        put(Type.DEBUG, objects);
    }

    public static void setLogLevel(Level level) {
        LEVEL = level;
    }

    public static void setLogLevel(String level) {
        LEVEL = Level.from(level);
    }

    public static void setSeparator(String separator) {
        SEPARATOR = separator;
    }

    public static void setStream(PrintStream stream) {
        STREAM = stream;
    }

    public static Level getLevel() {
        return LEVEL;
    }

    public static String getSeparator() {
        return SEPARATOR;
    }

    public static PrintStream getStream() {
        return STREAM;
    }
}
