package com.example.task02;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> result = new ArrayList<>();
        FillFilesList(rootDir, result);
        return result;
    }

    private static void FillFilesList(Path rootDir, List<Path> paths) throws IOException {
        DirectoryStream<Path> dirStream = Files.newDirectoryStream(rootDir);
        for (Path child : dirStream) {
            if (Files.isDirectory(child))
                FillFilesList(child, paths);
            else
                paths.add(child);
        }
    }
}
