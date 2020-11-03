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
        if (inputStream == null)
            throw new IllegalArgumentException();
        Reader reader = new InputStreamReader(inputStream, charset);
        Scanner scanner = new Scanner(reader);
        StringWriter sw = new StringWriter();
        while (scanner.hasNext()) {
            sw.write(scanner.nextLine());
        }
        return sw.toString();
    }
}
