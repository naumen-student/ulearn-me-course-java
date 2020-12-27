package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException
    {
        if (inputStream==null || charset==null)
            throw new IllegalArgumentException();
        StringBuilder stringBuilder= new StringBuilder();
        byte[] buffer = new byte[1024];
        while ((inputStream.read(buffer))!=-1)
            stringBuilder.append((new String(buffer, charset.name())).trim());
        return stringBuilder.toString();
    }
}