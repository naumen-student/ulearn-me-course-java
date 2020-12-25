package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {


    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null)
            throw new IllegalArgumentException();
        int sum = 0;
        int read = inputStream.read();
        while (read > -1) {
            sum = Integer.rotateLeft(sum, 1)^read;
            read = inputStream.read();
        }
        return sum;
    }
}
