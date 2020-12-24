package com.example.task02;

import org.w3c.dom.ls.LSOutput;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        // your implementation here

        List<Path> res = new ArrayList<>();
        try(Stream<Path> walk = Files.walk(rootDir)){
            res = walk.filter(Files::isRegularFile).collect(Collectors.toList());
        }
        return res;
    }
}
