package com.example.task02;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        BufferedInputStream reader = new BufferedInputStream(System.in);

        int firstByte = reader.read();
        int secondByte = reader.read();

        while (firstByte != -1) {
            if (firstByte == 13 && secondByte == 10) {
                System.out.write(10);
                firstByte = reader.read();
            }
            else {
                System.out.write(firstByte);
                firstByte = secondByte;
            }
            secondByte = reader.read();
        }

        reader.close();
        System.out.flush();
    }
}
