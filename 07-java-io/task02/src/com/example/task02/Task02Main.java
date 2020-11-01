package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int lastByte = System.in.read();
        while (lastByte != -1) {
            int nextByte = System.in.read();
            if (!(lastByte == 13) && (nextByte == 10)) {
                System.out.write(lastByte);
            }
            lastByte = nextByte;
        }
        System.out.flush();
    }
}
