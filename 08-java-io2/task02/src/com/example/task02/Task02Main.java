package com.example.task02;

import java.io.IOException;
import java.util.List;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
        }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> files = new ArrayList<>();
        Files.walkFileTree(rootDir, new SimpleFileVisitor<Path>() {
            public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
                files.add(file);
                return FileVisitResult.CONTINUE;
            }
        });
        return files;
    }
}