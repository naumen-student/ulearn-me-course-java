package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        Scanner scanner = new Scanner(inputStreamReader);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNext())
            builder.append(scanner.next());

        inputStreamReader.close();

        return builder.toString();
    }
}
