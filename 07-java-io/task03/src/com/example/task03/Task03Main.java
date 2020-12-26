package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) throws IOException {

        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset){
        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(inputStream, charset.name());
        while (scanner.hasNext()){
            stringBuilder.append(scanner.next());
        }
        return stringBuilder.toString();
    }
}
