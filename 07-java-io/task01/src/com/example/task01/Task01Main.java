package com.example.task01;


import java.io.*;

public class Task01Main {
    public static void main(String[] args) throws IOException {

        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null)
            throw new IllegalArgumentException();
        int lastByte = inputStream.read();
        int sum_of_data = 0;
        while (lastByte != -1) {
            sum_of_data = Integer.rotateLeft(sum_of_data, 1) ^ lastByte;
            lastByte = inputStream.read();
        }
        return sum_of_data;
    }
}
