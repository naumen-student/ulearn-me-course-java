package com.example.task02;

import com.github.javaparser.utils.Pair;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prevByte = System.in.read();
        while (prevByte != -1){
            int currByte = System.in.read();
            if (prevByte != 13 || currByte != 10)
                System.out.write(prevByte);
            prevByte = currByte;
        }
        System.out.flush();
    }
}
