package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) throw new IllegalArgumentException();
        int result = 0;
        int newData = inputStream.read();
        while (newData != -1){
            result = Integer.rotateLeft(result, 1) ^ newData;
            newData = inputStream.read();
        }
        return result;
    }
}
