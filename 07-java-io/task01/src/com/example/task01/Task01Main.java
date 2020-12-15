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
        int sum = inputStream.read();
        int res = 0;
        while (sum != -1) {
            res = Integer.rotateLeft(res, 1) ^ sum;
            sum = inputStream.read();
        }
        return res;
    }
}
