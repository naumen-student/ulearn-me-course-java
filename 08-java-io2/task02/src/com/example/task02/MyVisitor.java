package com.example.task02;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.FileVisitResult;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class MyVisitor extends SimpleFileVisitor<Path>{
    public  final List<Path> allVisitedFiles = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
    {
        allVisitedFiles.add(( file.normalize()));
        return super.visitFile(file, attrs);
    }
}
