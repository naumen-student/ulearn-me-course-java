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
        RootVisitor visitor = new RootVisitor();
        Files.walkFileTree(rootDir, new RootVisitor());
        return visitor.filesRoot;
    }
}

class  RootVisitor extends SimpleFileVisitor<Path>
{
    public  final List<Path> filesRoot = new ArrayList<>();
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
    {
        filesRoot.add(( file.normalize()));
        return super.visitFile(file, attrs);
    }
}