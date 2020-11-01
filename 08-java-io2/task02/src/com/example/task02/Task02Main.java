package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> paths = new ArrayList<Path>();
        File directory = rootDir.toFile();
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                paths.add(file.toPath());
            } else {
                paths.addAll(listFiles(file.toPath()));
            }
        }
        return paths;
    }
}
