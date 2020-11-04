package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException { }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null) throw new IllegalArgumentException();
        StringBuilder result = new StringBuilder();
        byte[] buffer = new byte[512];
        while ((inputStream.read(buffer)) != -1) result.append((new String(buffer, charset.name())));
        return result.toString().trim();
    }
}
