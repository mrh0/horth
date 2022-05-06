package com.mrh0.horth.util;

import com.mrh0.horth.Main;
import com.mrh0.horth.ast.Loc;
import org.apache.tools.ant.DirectoryScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static String readFile(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
                sb.append('\n');
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static File getFile(String file) throws URISyntaxException {
        return Paths.get(new URI(file)).toFile();
    }

    public static Path getAbsolutePath(String path) {
        return Path.of(path).toAbsolutePath();
    }

    public static List<File> getIncludedFiles(List<String> includes) {
        return getIncludedFiles(includes.toArray(new String[includes.size()]));
    }

    public static List<File> getIncludedFiles(String includes[]) {
        String baseDir = Path.of(".").toAbsolutePath().toString();
        DirectoryScanner scanner = new DirectoryScanner();
        scanner.setIncludes(includes);
        scanner.setBasedir(baseDir);
        scanner.setCaseSensitive(false);
        scanner.scan();
        String[] paths = scanner.getIncludedFiles();
        List<File> files = new ArrayList<>();
        for(String path : paths) {
            Log.debug("Included:", path);
            files.add(new File(path));
        }
        return files;
    }
}
