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
        int sum = 0;

        try {
            int lastByte = inputStream.read();
            while (lastByte != -1) {
                sum = Integer.rotateLeft(sum,   1) ^ lastByte;
                lastByte = inputStream.read();
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
