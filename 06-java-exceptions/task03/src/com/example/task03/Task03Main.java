package com.example.task03;

import sun.jvm.hotspot.oops.CheckedExceptionElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        throwCheckedException();
    }

    public static void throwCheckedException() throws IOException {
        FileInputStream fileI = null;
        fileI = new FileInputStream(new File(""));
        fileI.close();
    }
}