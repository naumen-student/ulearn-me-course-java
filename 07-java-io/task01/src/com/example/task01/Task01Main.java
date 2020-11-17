package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {}

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null){
            throw new IllegalArgumentException();
        }
        int currentByte = inputStream.read();
        int count = 0;
        while (currentByte >= -1){
            count = Integer.rotateLeft(count, 1) ^ currentByte;
            currentByte = inputStream.read();
        }
        return count;
    }
}
