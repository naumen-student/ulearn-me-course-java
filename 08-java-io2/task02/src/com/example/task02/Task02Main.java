package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> aPath = new ArrayList<>();
        return FileExplore(rootDir.toFile());
    }

    private static List<Path> FileExplore(File rootDir){
        List<Path> res = new ArrayList<>();
        for (File f: Objects.requireNonNull(rootDir.listFiles())){
            if(f.isDirectory()){
                FileExplore(f, res);
            }
            else {
                res.add(f.toPath());
            }
        }
        return res;
    }

    private static void FileExplore(File rootDir, List<Path> paths) {
        for (File f: Objects.requireNonNull(rootDir.listFiles())){
            if(f.isDirectory()){
                FileExplore(f, paths);
            }
            else {
                paths.add(f.toPath());
            }
        }
    }
}
