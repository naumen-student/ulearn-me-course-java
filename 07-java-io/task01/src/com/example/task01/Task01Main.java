package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) throw new IllegalArgumentException();
        int res = 0;
        int lastByte = inputStream.read();
        while (lastByte != -1) {
            res = Integer.rotateLeft(res, 1) ^ lastByte;
            lastByte = inputStream.read();
        }
        return res;
    }
}
