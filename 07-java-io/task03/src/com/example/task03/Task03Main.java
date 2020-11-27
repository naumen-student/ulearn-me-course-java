package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.io.FileInputStream;

public class Task03Main
{
    public static void main(String[] args) throws IOException
    {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException
    {
        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();

        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));

        while (scanner.hasNext())
        {
            result.append(scanner.next());
        }
        return result.toString();
    }
}