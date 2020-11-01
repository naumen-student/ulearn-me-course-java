package com.example.task02;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static List<Path> listFiles = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(listFiles(Paths.get("08-java-io2/task02/src/main/resources/")));
    }
    public static List<Path> listFiles(Path rootDirectory){
        File rootDirFile = rootDirectory.toFile();
        return showFilesAndDirectoryes(rootDirFile);
    }
    public static List<Path> showFilesAndDirectoryes (File rootDirectory) {
        File[] files = rootDirectory.listFiles();
        for (File file : files) {
            if (!file.isDirectory()) {
                listFiles.add(Paths.get(file.getPath()));
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
