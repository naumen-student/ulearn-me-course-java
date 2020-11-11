package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task02Main{

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException{
        List<Path> paths = new ArrayList<>();
        FillFilesList(rootDir.toFile(), paths);
        return paths;
    }

    private static void FillFilesList(File rootDirectory, List<Path> paths){
        for (File file : Objects.requireNonNull(rootDirectory.listFiles())) {
            if ( file.isDirectory() )
                FillFilesList(file, paths);
            else
                paths.add(file.toPath());
        }
    }
}
