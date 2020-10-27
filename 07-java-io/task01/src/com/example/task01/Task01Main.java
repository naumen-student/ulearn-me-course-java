package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) throw new IllegalArgumentException();
        int lastByte = inputStream.read();
        int resultSum = 0;
        while (lastByte != -1) {
            resultSum = Integer.rotateLeft(resultSum, 1) ^ lastByte;
            lastByte = inputStream.read();
        }
        return resultSum;
    }
}
