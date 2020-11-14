package com.example.task02;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
    }

    public static List<Path> listFiles(Path rootDir) {
        // your implementation here
        List<Path> paths = new ArrayList<>();
        lookAtFiles(rootDir.toFile(), paths);
        return paths;
    }

    private static void lookAtFiles(File rootDirectory, List<Path> paths) {
        for (File file : Objects.requireNonNull(rootDirectory.listFiles())) {
            if (file.isDirectory()) {
                lookAtFiles(file, paths);
            } else {
                paths.add(file.toPath());
            }
        }
    }
}
