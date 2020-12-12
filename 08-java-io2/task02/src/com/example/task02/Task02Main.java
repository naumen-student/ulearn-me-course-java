package com.example.task02;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;
import java.util.ArrayList;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));


    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        ArrayList<Path> listOfFiles = new ArrayList<>();
        Files.walk(rootDir)
                .filter(Files::isRegularFile)
                .forEach(listOfFiles::add);
        return listOfFiles;
    }
}
