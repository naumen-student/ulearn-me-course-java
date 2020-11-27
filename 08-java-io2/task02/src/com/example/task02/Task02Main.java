package com.example.task02;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(listFiles(Paths.get("08-java-io2/task02/src/main/resources/")));
    }
    public static List<Path> listFiles(Path directory) {
        List<Path> listFiles= new ArrayList<>();
        File path = directory.toFile();
        if (path.exists()) {
            if (path.isDirectory()) {
                for (File file : path.listFiles()) {
                    if (file.isDirectory())
                        listFiles.addAll(listFiles(file.toPath()));
                    else listFiles.add(file.toPath());
                }
            } else return listFiles;
        } else return null;
        return listFiles;
    }
}
