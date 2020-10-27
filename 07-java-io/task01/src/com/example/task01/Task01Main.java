package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) throw new IllegalArgumentException();

        int lastByte = inputStream.read();
        int sum = lastByte == -1 ? 0 : lastByte;
        while (lastByte != -1) {
            lastByte = inputStream.read();
            if (lastByte != -1) {
                sum = Integer.rotateLeft(sum, 1) ^ lastByte;
            }
        }
        return sum;
    }
}