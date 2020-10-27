package com.example.task02;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.*;
import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) throws IOException
    {
        BufferedInputStream reader = new BufferedInputStream(System.in);

        int first=reader.read();
        int second = reader.read();

        while (first!=-1)
        {
            if (first==13 && second==10)
            {
                 System.out.write(10);
                 first=reader.read();
            }
            else
            {
                System.out.write(first);
                first=second;
            }
            second = reader.read();
        }

        reader.close();
        System.out.flush();
    }
}
