package com.example.task02;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> result = new ArrayList<>();
        Files.walkFileTree(rootDir, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                result.add(file);
                return super.preVisitDirectory(file, attrs);
            }
        });
        return result;
    }
}
