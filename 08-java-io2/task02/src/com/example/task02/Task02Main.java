package com.example.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

class myVisitior extends SimpleFileVisitor<Path>{

    List<Path> paths;

    public myVisitior(){
        paths = new ArrayList<>();
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        paths.add(file);
        return FileVisitResult.CONTINUE;
    }
}

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(listFiles(Paths.get("/src/main/resources/")));
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        myVisitior visitior = new myVisitior();
        Files.walkFileTree(rootDir, visitior);
        return visitior.paths;
    }
}
