package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) throws IOException {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if(inputStream == null || charset == null)
            throw new IllegalArgumentException();
        StringWriter sw = new StringWriter();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        while (scanner.hasNext())
            sw.write(scanner.next());
        inputStream.close();
        return sw.toString();
    }
}
