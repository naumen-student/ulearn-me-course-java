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
        if (inputStream == null)
            throw new IllegalArgumentException();

        byte[] allBytes = inputStream.readAllBytes();

        if (allBytes.length == 0)
            return 0;

        int controlSum = allBytes[0];
        for (int i = 1; i < allBytes.length; i ++) {
            controlSum = Integer.rotateLeft(controlSum, 1) ^ allBytes[i];
        }

        return controlSum;
    }
}
