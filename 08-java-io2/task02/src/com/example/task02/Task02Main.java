package com.example.task02;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.util.ArrayList;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {


    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException
    {
        ArrayList<Path> result = new ArrayList<>();
        DirectoryStream<Path> dirStream = Files.newDirectoryStream(rootDir);
        for (Path child : dirStream) {
            if (Files.isRegularFile(child)) result.add(child);
            else result.addAll(listFiles(child));
        }
        return result;
    }
}


