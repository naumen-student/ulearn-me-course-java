package com.example.task02;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
    }

    public static List<Path> listFiles(Path rootDir) throws IOException {
        List<Path> files = new ArrayList<>();
        Files.walkFileTree(rootDir, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
                files.add(file);
                return FileVisitResult.CONTINUE;
            }
        });
        return files;
    }
}
