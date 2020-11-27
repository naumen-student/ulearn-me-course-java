package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prevByte = System.in.read();
        int currentByte;

        while (prevByte != -1) {
            currentByte = System.in.read();
            if (prevByte != 13 || currentByte != 10)
                System.out.write(prevByte);
            prevByte = currentByte;
        }
        System.out.flush();
    }
}