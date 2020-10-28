package com.example.task01;

import java.io.*;

public class Task01Main
{
    public static int checkSumOfStream(InputStream inputStream) throws IOException
    {
        int sum = 0;
        try
        {
            for (int readByte = 0; readByte != -1; readByte = inputStream.read())
                sum = Integer.rotateLeft(sum, 1) ^ readByte;
        }

        catch (IOException e)
        {
            throw new IOException();
        }

        catch (Exception e)
        {
            throw new IllegalArgumentException();
        }
        return sum;
    }
}