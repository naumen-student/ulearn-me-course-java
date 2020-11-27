package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null)
            throw new IllegalArgumentException();
        ArrayList<Integer> bytes;
        try {
            bytes = new ArrayList<Integer>();
            for(int i = 0; i != -1; i = inputStream.read())
                bytes.add(i);
        }
        catch (IOException e){
            throw  new IOException();
        }
        return hashSum(0, bytes, -1,0);
    }

    public static int hashSum(int data, ArrayList<Integer> bytes, int count, int result){
        if (count == bytes.size() - 1)
            return result;
        result = Integer.rotateLeft(data, 1) ^ bytes.get(count + 1);
        return hashSum(result, bytes, count + 1, result);
    }
}
