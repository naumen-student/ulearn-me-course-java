package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }

        int elementCurr = inputStream.read();
        int contrSum = 0;
        while (elementCurr != -1) {
            contrSum = Integer.rotateLeft(contrSum, 1) ^ elementCurr;
            elementCurr = inputStream.read();
        }
        return contrSum;
    }
}

