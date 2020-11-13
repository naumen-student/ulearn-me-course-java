package com.example.task02;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
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

    public static List<Path> listFiles(Path rootDir) throws IOException {
        ArrayList<Path> result = new ArrayList<>();
        DirectoryStream<Path> ds = Files.newDirectoryStream(rootDir);

        for (Path child : ds) {
            if (Files.isDirectory(child)) {
                result.addAll(listFiles(child));
            } else {
                result.add(child);
            }
        }

        ds.close();
        return result;
    }
}
