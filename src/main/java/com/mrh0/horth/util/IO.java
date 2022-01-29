package com.mrh0.horth.util;

import com.mrh0.horth.Main;
import com.mrh0.horth.ast.Loc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class IO {
    public static File getResource(String path) {
        try {
            return Paths.get(Main.class.getResource(path).toURI()).toFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(File file, String text) {
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File getFile(String file) throws URISyntaxException {
        return Paths.get(new URI(file)).toFile();
    }

    public static void warn(String text, Loc location) {
        System.out.println("[WARN]: " + text + (location == null ? "" : "\n\tat: " + location.toString()));
    }
}
