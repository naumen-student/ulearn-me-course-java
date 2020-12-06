package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> result = new ArrayList<>();
        Walk(rootDir.toFile(), result);
        return result;
    }

    private static void Walk(File rootDir, List<Path> result) {
        for (File f : Objects.requireNonNull(rootDir.listFiles())) {
            if (f.isDirectory()) {
                Walk(f, result);
            } else {
                result.add(f.toPath());
            }
        }
    }
}