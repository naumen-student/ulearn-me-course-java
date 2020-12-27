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
        ArrayList<Path> listFiles = new ArrayList<>();

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(rootDir)) {
            for (Path path : directoryStream) {
                if (Files.isRegularFile(path))
                    listFiles.add(path);
                else
                    listFiles.addAll(listFiles(path));
            }
        }

        return listFiles;
    }
}
