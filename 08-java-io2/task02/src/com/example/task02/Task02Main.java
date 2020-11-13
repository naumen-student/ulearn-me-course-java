package com.example.task02;

import java.io.IOException;
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

        List<Path> fileTree = new ArrayList<>();
        try {
            for (Path entry : Files.newDirectoryStream(rootDir)) {
                if (Files.isRegularFile(entry))
                    fileTree.add(entry);
                else
                    fileTree.addAll(listFiles(entry));
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return fileTree;
    }
}
