package com.example.task02;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        ArrayList<Path> result = new ArrayList<Path>();
        try(DirectoryStream<Path> dirStream = Files.newDirectoryStream(rootDir)) {
            for(Path newDir: dirStream) {
                if(Files.isRegularFile(newDir)) {
                    result.add(newDir);
                } else {
                    result.addAll(listFiles(newDir));
                }
            }
        }
        return result;
    }
}
