package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
    }

    public static List<Path> listFiles(Path rootDir) {
        ArrayList<Path> listFiles= new ArrayList<>();
        if (rootDir.toFile().exists()) {
            if (rootDir.toFile().isDirectory()) {
                for (File file : rootDir.toFile().listFiles()) {
                    if (file.isDirectory())
                        listFiles.addAll(listFiles(file.toPath()));
                    else
                        listFiles.add(file.toPath());
                }
            }
            else
                return listFiles;
        }
        else
            return null;
        return listFiles;
    }
}