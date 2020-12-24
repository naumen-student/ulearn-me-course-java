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
//    public static void main(String[] args) throws IOException, InterruptedException {
        public static void main(String[] args) {
            //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
            // например вот так:

        /*
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
        */

        }

//        public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
//            // your implementation here
            public static List<Path> listFiles(Path rootDir) throws IOException
            {
                MyVisitor visitor = new MyVisitor();
                Files.walkFileTree(rootDir, visitor);
                return visitor.allVisitedFiles;
            }
        }

        class  MyVisitor extends SimpleFileVisitor<Path>
        {
            public  final List<Path> allVisitedFiles = new ArrayList<>();

//        return null;
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
            {
                allVisitedFiles.add(( file.normalize()));
                return super.visitFile(file, attrs);
            }
        }