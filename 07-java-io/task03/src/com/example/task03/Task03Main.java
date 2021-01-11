package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
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
        System.out.println(readAsString(new FileInputStream("07-java-io/task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        return "";
        public static String readAsString(InputStream inputStream, Charset charset) {
            if (inputStream == null || charset == null) throw new IllegalArgumentException();
            StringWriter result = new StringWriter();
            Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
            while (scanner.hasNext()) {
                result.write(scanner.next());
            }
            return result.toString();
        }
    }
}