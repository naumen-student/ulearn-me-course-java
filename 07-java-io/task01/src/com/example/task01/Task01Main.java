package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x33})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null)
            throw new IllegalArgumentException();
        int controlSum = 0;
        int lastByte = inputStream.read();
        while (lastByte >= 0) {
            controlSum = Integer.rotateLeft(controlSum, 1) ^ lastByte;
            lastByte = inputStream.read();
        }
        return controlSum;
    }
}