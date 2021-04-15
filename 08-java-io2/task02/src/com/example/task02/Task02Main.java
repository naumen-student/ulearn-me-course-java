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
        List<Path> allFiles = new ArrayList<>();
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(rootDir)) {
            for (Path childDirectory : directoryStream) {
                if (!Files.isDirectory(childDirectory)) {
                    allFiles.add(childDirectory);
                } else {
                    allFiles.addAll(listFiles(childDirectory));
                }
            }
        }
        return allFiles;
    }
}
