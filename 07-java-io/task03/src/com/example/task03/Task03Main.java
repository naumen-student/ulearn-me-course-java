package com.example.task03;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) throws IOException {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null)
            throw new IllegalArgumentException();
        Reader reader = new InputStreamReader(inputStream, charset);
        Scanner scanner = new Scanner(reader);
        return scanner.hasNext() ? scanner.next() : null;
    }
}
