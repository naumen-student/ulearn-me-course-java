package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
        */

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException{
        List<Path> paths = new ArrayList<>();
        lookAtFiles(rootDir.toFile(), paths);
        return paths;
    }

    private static void lookAtFiles(File rootDirectory, List<Path> paths){
        for (File file : Objects.requireNonNull(rootDirectory.listFiles())) {
            if ( file.isDirectory() ) {
                lookAtFiles(file, paths);
            }
            else{
                paths.add(file.toPath());
            }
        }
    }
}
