package com.example.task02;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.util.ArrayList;

public class Task02Main {
    public static void main(String[] args) {

    }

    public static List<Path> listFiles(Path rootDir) throws IOException {
        ArrayList<Path> list = new ArrayList<>();
        DirectoryStream<Path> stream = Files.newDirectoryStream(rootDir);
        for(Path child: stream) {
            if (Files.isRegularFile(child)) list.add(child);
            else list.addAll(listFiles(child));
        }
        return list;
    }
}
