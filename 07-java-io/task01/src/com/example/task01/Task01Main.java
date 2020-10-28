package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        Integer sum = 0;
        try {
            int readByte = inputStream.read();
            while (readByte != -1) {
                sum = Integer.rotateLeft(sum, 1) ^ readByte;
                readByte = inputStream.read();
            }
        }
        catch (IOException e){
            throw new IOException();
        }
        catch (RuntimeException e){
            throw new IllegalArgumentException();
        }
        return sum;
    }
}
