package com.example.task02;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        ArrayList<Path> result = new ArrayList<>();
        DirectoryStream<Path> dirStream = Files.newDirectoryStream(rootDir);
        for (Path child : dirStream) {
            if (Files.isRegularFile(child)) {
                result.add(child);
            } else {
                result.addAll(listFiles(child));
            }
        }
        return result;
    }
}