package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if(inputStream == null || charset == null)
            throw new IllegalArgumentException();
        StringBuilder result = new StringBuilder();
        Scanner val = new Scanner(inputStream, charset.name());
        while(val.hasNext()){
            result.append(val.next());
        }
        return result.toString();
    }
}
