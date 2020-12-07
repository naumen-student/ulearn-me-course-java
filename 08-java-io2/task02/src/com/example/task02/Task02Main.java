package com.example.task02;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        MyVisitor visitor = new MyVisitor();
        Files.walkFileTree(rootDir, visitor);
        return visitor.visitedFiles;
    }
}

class MyVisitor extends SimpleFileVisitor<Path> {

    public List<Path> visitedFiles = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        visitedFiles.add(file);
        return FileVisitResult.CONTINUE;
    }
}
