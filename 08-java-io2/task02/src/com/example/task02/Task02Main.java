package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
        */

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        ArrayList<Path> paths = new ArrayList<>();
        FillListFiles(rootDir.toFile(), paths);
        return paths;
    }

    private static void FillListFiles(File rootDir, ArrayList<Path> paths) {
        for (File file : Objects.requireNonNull(rootDir.listFiles())) {

            if (file.isDirectory()) {
                FillListFiles(file, paths);
            } else {
                paths.add(file.toPath());
            }
        }
    }
}

