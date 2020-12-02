package com.example.task02;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException { }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        ArrayList<Path> res = new ArrayList<>();
        Files.walkFileTree(rootDir, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile (Path file, BasicFileAttributes attributes) {
                res.add(file);
                return FileVisitResult.CONTINUE;
            }
        });
        return res;
    }
}
