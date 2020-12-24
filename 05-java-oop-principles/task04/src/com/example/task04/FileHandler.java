package com.example.task04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileHandler {
    String nameOfFile;

    public void setNameOfFile(String name){
        nameOfFile = name;
    }

    public void log(String message) throws FileNotFoundException {
        File file = new File(nameOfFile);
        PrintWriter print = new PrintWriter(file);
        print.println(message);
        print.close();
    }
}