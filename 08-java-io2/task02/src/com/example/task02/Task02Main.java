package com.example.task02;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    private static List<Path> listFiles = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(listFiles(Paths.get("08-java-io2/task02/src/main/resources/")));
    }
    public static List<Path> listFiles(Path rootDirectory) {
        File directory = rootDirectory.toFile();
        File[] files = directory.listFiles();
        for (File file : files)
            if (!file.isDirectory())
                addFile(file);
        for (File file : files)
            if (file.isDirectory())
                listFiles(Paths.get(file.getPath()));
        return listFiles;
    }
    public static void addFile (File file) {
        listFiles.add(Paths.get(file.getPath()));
    }
}
