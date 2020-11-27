package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Task03Main{
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException{
        if ( inputStream == null || charset == null )
            throw new IllegalArgumentException();
        StringBuilder result = new StringBuilder();
        try (Scanner scanner = new Scanner(inputStream, charset.name())) {
            while (scanner.hasNext()) {
                result.append(scanner.next());
            }
        }
        return result.toString();
    }
}
