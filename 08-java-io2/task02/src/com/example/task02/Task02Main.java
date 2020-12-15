package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        ArrayList<Path> list = new ArrayList<>();
        if (!(rootDir.toFile().exists()))
            return list;
        else {
            if (!(rootDir.toFile().isDirectory())) {
                return null;
            }
            else
                for (File file : rootDir.toFile().listFiles()) {
                    if (file.isDirectory())
                        list.addAll(listFiles(file.toPath()));
                    else
                        list.add(file.toPath());
                }
        }
        return list;
    }
}
