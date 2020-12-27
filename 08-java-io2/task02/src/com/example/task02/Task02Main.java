package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> paths = new ArrayList<>();
        SetFilesList(rootDir.toFile(), paths);
        return paths;
    }

    private static void SetFilesList(File rootDirectory, List<Path> paths) {
        for (File file : rootDirectory.listFiles()) {
            if (file.isDirectory())
                SetFilesList(file, paths);
            else
                paths.add(file.toPath());
        }
    }
}
