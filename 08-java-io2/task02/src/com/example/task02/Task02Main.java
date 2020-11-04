package com.example.task02;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        MyVisitor visitor = new MyVisitor();
        Files.walkFileTree(rootDir, visitor);
        return visitor.allVisitedFiles;
    }
}

class  MyVisitor extends SimpleFileVisitor<Path>
{
    public  final List<Path> allVisitedFiles = new ArrayList<>();
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
    {
        allVisitedFiles.add((file.normalize()));
        return super.visitFile(file, attrs);
    }
}