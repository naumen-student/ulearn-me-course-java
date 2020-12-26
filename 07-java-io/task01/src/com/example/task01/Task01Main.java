package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        // your implementation here

        if (inputStream == null)
            throw new IllegalArgumentException();
        int currentByte = inputStream.read();
        int count = 0;
        while (currentByte != -1) {
            count = Integer.rotateLeft(count, 1) ^ currentByte;
            currentByte = inputStream.read();
        }
        return count;
    }
}
