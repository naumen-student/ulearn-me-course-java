package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.ArrayList;
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
        List<Path> paths = new ArrayList<Path>();
        File directory = rootDir.toFile();
        if(!directory.isDirectory()){
            paths.add(directory.toPath());
            return paths;
        }
        else {
            for (File file : directory.listFiles()) {
                if (file.isFile()) {
                    paths.add(file.toPath());
                } else {
                    paths.addAll(listFiles(file.toPath()));
                }
            }
        }
        return paths;
    }
}
