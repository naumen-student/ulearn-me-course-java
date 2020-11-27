package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) {
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null)
            throw new IllegalArgumentException();
        int sum = 0;
        int valueFromInputStream = inputStream.read();
        while (valueFromInputStream != -1) {
            sum = Integer.rotateLeft(sum, 1) ^ valueFromInputStream;
            valueFromInputStream = inputStream.read();
        }
        return sum;
    }
}
