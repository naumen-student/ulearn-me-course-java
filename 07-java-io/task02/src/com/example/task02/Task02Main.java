package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int totalByte = System.in.read();
        while (totalByte != -1) {
            int nextByte = System.in.read();
            if (!(totalByte == 13 && nextByte == 10)) {
                System.out.write(totalByte);
            }
            totalByte = nextByte;
        }
        System.out.flush();
    }
}
