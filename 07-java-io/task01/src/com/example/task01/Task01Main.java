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

    @SuppressWarnings("ConstantConditions")
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) throw new IllegalArgumentException();
        int sum = 0;
        int streamRead = inputStream.read();
        while (streamRead != -1) {
            sum = Integer.rotateLeft(sum, 1) ^ streamRead;
            streamRead = inputStream.read();
        }
        return sum;
    }
}