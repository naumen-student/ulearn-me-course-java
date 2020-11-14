package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        // your implementation here
        if (inputStream == null) throw  new IllegalArgumentException();
        byte[] arr = inputStream.readAllBytes();
        if (arr == null || arr.length == 0) return 0;
        int controlSum = arr[0];
        for(int i = 1; i < arr.length; i++)
            controlSum = Integer.rotateLeft(controlSum, 1) ^ arr[i];
        return controlSum;
    }
}
