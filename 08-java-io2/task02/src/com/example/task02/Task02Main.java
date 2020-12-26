package com.example.task02;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.*;
import java.util.ArrayList;

public class Task02Main {

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {

        List<Path> res = new ArrayList<>();
        FillFilesList(rootDir, res);
        return res;

    }

    public static void FillFilesList(Path rootDir, List<Path> paths) throws IOException, InterruptedException {

        DirectoryStream<Path> dirStream = Files.newDirectoryStream(rootDir);

        for (Path e : dirStream) {
            if (Files.isDirectory(e))
                FillFilesList(e, paths);
            else
                paths.add(e);
        }
    }
}
