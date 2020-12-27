package com.example.task02;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
        */

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        // your implementation here

        return null;
        ArrayList<Path> result = new ArrayList<>();
        DirectoryStream<Path> dirStream = Files.newDirectoryStream(rootDir);
        for(Path child: dirStream) {
            if(Files.isRegularFile(child)) {
                result.add(child);
            }
            else {
                result.addAll(listFiles(child));
            }
        }
        return result;
    }
}
