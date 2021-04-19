package com.example.task02;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(listFiles(Paths.get("C:\\Users\\User\\Ulearn\\ulearn-me-course-java\\08-java-io2\\task02\\src\\main\\resources")));
    }

    public static List<Path> listFiles(Path rootDir) {
        return listFiles(new ArrayList<>(), rootDir);
    }

    private static List<Path> listFiles(List<Path> fileNames, Path dir) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                if (path.toFile().isDirectory())
                    listFiles(fileNames, path);
                else
                    fileNames.add(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileNames;
    }
}
