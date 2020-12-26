package com.example.task02;

import java.nio.file.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
        */

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> result = new ArrayList<>();
        FillFilesList(rootDir, result);
        return result;
    }

    public static void FillFilesList(Path rootDir, List<Path> paths) throws IOException, InterruptedException {
        DirectoryStream<Path> dirStream = Files.newDirectoryStream(rootDir);
        for (Path child : dirStream) {
            if (Files.isDirectory(child))
                FillFilesList(child, paths);
            else
                paths.add(child);
        }
    }
}
