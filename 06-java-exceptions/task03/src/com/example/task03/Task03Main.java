package com.example.task03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task03Main {
    public static void main(String[] args) {

    }

    public static void throwCheckedException() throws FileNotFoundException {
        File file = new File("not_existing_file.txt");
        FileInputStream stream = new FileInputStream(file);
    }
}