package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        Scanner scanner = new Scanner(reader);
        StringBuilder res = new StringBuilder();
        while (scanner.hasNext())
            res.append(scanner.next());
        return res.toString();
    }
}
