package com.example.task03;

import jdk.incubator.jpackage.internal.IOUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Task03Main {
    public static void main(String[] args) throws IOException {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null) throw new IllegalArgumentException();
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder result = new StringBuilder();
        int newData = reader.read();
        while (newData != -1){
            result.append((char)newData);
            newData = reader.read();
        }
        return result.toString();
    }
}

