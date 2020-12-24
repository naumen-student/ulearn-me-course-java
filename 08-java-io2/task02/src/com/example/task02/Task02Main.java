package com.example.task02;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));

    }

    public static List<Path> listFiles(Path rootDir) throws IOException {
        ArrayList<Path> list = new ArrayList<>();
        DirectoryStream<Path> stream = Files.newDirectoryStream(rootDir);

        for(Path child: stream) {
            if(Files.isRegularFile(child)) {
                list.add(child);
            }
            else
                list.addAll(listFiles(child));
        }
        return list;
    }
}
