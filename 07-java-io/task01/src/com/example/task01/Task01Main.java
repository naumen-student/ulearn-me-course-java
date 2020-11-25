package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main{

    public static int checkSumOfStream(InputStream inputStream) throws IOException{
        if ( inputStream == null )
            throw new IllegalArgumentException();
        int controlSum = 0;
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        while (read > 0) {
            controlSum = UpdateControlSum(bytes, read, controlSum);
            read = inputStream.read();
        }
        return controlSum;
    }

    private static int UpdateControlSum(byte[] bytes, int length, int controlSum){
        for (int i = 0; i < length; i++) {
            controlSum = Integer.rotateLeft(controlSum, 1) ^ bytes[i];
        }
        return controlSum;
    }
}
