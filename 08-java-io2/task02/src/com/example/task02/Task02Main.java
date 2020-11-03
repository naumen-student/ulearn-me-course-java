package com.example.task02;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.Files;

public class Task02Main {
    public static void main(String[] args) {
    }

    public static List<Path> listFiles(Path rootDir) throws IOException {
        MyVisitor visitor = new MyVisitor();
        Files.walkFileTree(rootDir, visitor);
        return visitor.allVisitedFiles;
    }
}
