package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        @@ -15,7 +17,13 @@ public static void main(String[] args) throws IOException {
        }

        public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
            // your implementation here
            return "";

            if (inputStream == null || charset == null)
                throw new IllegalArgumentException();
            StringBuilder stringBuilder = new StringBuilder();
            Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
            while (scanner.hasNext())
                stringBuilder.append(scanner.next());
            return stringBuilder.toString();
        }
    }

