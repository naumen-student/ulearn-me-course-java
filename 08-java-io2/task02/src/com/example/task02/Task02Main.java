package com.example.task02;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        MyFileVisitor myFileVisitor = new MyFileVisitor();
        Files.walkFileTree(rootDir, myFileVisitor);
        return myFileVisitor.getFiles();
    }
}
