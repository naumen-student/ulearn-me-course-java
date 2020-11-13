package com.example.task02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        System.out.println(listFiles(Paths.get("08-java-io2/task02/src/main/resources/")));
    }

    public static List<Path> listFiles(Path rootDir) throws IOException {
        ArrayList<Path> result = new ArrayList<>();
        for(Path child: Files.newDirectoryStream(rootDir)) {
            if(Files.isRegularFile(child)) {
                result.add(child);
            } else {
                result.addAll(listFiles(child));
            }
        }
        return result;
    }
}
