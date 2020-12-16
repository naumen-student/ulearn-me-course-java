package com.example.task02;
import java.io.BufferedInputStream;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        BufferedInputStream stream = new BufferedInputStream(System.in);
        int firstByte = stream.read();
        int secondByte = stream.read();

        while(firstByte != -1 || secondByte != -1) {
            if (firstByte == 13 && secondByte == 10) {
                System.out.write(secondByte);
                firstByte = stream.read();
            } else {
                System.out.write(firstByte);
                firstByte = secondByte;
            }
            secondByte = stream.read();
        }

        stream.close();
    }
}
