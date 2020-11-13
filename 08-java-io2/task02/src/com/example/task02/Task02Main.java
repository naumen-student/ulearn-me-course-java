package com.example.task02;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
        */

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        ArrayList<Path> res = new ArrayList<>();
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(rootDir)){
            for (Path entry : directoryStream){
                if (Files.isRegularFile(entry)){
                    res.add(entry);
                } else{
                    res.addAll(listFiles(entry));
                }
            }
        }
        return res;
    }
}
