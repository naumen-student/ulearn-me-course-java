package com.example.task03;


import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();
        Reader reader = new InputStreamReader(inputStream, charset);
        Scanner scanner = new Scanner(reader);
        StringBuilder result = new StringBuilder();
        while (scanner.hasNext())
            result.append(scanner.next());
        return result.toString();
    }
}
