package com.example.task02;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.Files;
import java.util.stream.Collectors;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
        */

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> res = Files.walk(rootDir)
                .filter(file -> Files.isRegularFile(file))
                .collect(Collectors.toList());
        return res;
    }
}
