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
        byte[] data = inputStream.readAllBytes();
        return data.length == 0 ? 0 : getControlSum(data);
    }

    private static int getControlSum(byte[] data) {
        int result = data[0];
        for (int i = 1; i < data.length; i++) {
            result = Integer.rotateLeft(result, 1) ^ data[i];
        }
        return result;
    }
}
