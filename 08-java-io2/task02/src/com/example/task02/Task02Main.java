package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        System.out.println(listFiles(Paths.get("08-java-io2/task02/src/main/resources/")));
    }

    public static List<Path> listFiles(Path rootDir) {
        List<Path> res = new ArrayList<>();
        for (File f : Objects.requireNonNull(rootDir.toFile().listFiles())) {
            if (f.isDirectory())
                listFiles(f.toPath(), res);
            else
                res.add(f.toPath());
        }
        return res;
    }

    private static void listFiles(Path rootDir, List<Path> paths) {
        for (File file : (Objects.requireNonNull(rootDir.toFile().listFiles()))) {
            if (file.isDirectory())
                listFiles(file.toPath(), paths);
            else
                paths.add(file.toPath());

        }
    }
}