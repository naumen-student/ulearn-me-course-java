package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static List<Path> listFiles = new ArrayList<>();

    public static void main(String[] args) throws IOException, InterruptedException {
    }
    public static List<Path> listFiles(Path rootDirectory) throws IOException, InterruptedException {
        File rootDirFile = rootDirectory.toFile();
        return showFilesAndDirectoryes(rootDirFile);
    }
    public static List<Path> showFilesAndDirectoryes (File rootDirectory) throws IOException {
        File[] files = rootDirectory.listFiles();
        for (File file : files) {
            if (!file.isDirectory()) {
                Path path = Paths.get(file.getName());
                listFiles.add(path);
            }
            if (file.isDirectory ())
                try {
                    showFilesAndDirectoryes(file);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
        return listFiles;
    }
}
