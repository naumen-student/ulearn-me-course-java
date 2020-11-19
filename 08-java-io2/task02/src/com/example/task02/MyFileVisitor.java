package com.example.task02;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    private final ArrayList<Path> files = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.toFile().isFile()) {
            files.add(file);
        }
        return FileVisitResult.CONTINUE;
    }

    public ArrayList<Path> getFiles() {
        return files;
    }
}