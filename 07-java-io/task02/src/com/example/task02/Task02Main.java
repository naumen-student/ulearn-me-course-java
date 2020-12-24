package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prevByte = System.in.read();
        while (prevByte != -1) {
            int curByte = System.in.read();
            if (!(curByte == 10 && prevByte == 13))
                System.out.write(prevByte);
            prevByte = curByte;
        }
        System.out.flush();
    }
}
