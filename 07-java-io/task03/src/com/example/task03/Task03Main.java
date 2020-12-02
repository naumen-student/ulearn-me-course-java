package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();
        StringBuilder builder = new StringBuilder();
        try (Scanner scanner = new Scanner(inputStream, charset.name())) {
            while (scanner.hasNext()){
                builder.append(scanner.next());
            }
        }
        return builder.toString();
    }
}
