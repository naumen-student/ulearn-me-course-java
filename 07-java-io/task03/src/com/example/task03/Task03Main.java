package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.InputStreamReader;


public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null ||charset == null)
            throw new IllegalArgumentException();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        StringBuilder result = new StringBuilder();
        while (scanner.hasNext()) {
            result.append(scanner.next());
        }
        return result.toString();
    }
}
