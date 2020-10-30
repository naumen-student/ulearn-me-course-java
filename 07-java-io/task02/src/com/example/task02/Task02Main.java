package com.example.task02;

import java.io.IOException;
import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previousByte = System.in.read();
        int currentByte = System.in.read();
        while (currentByte != -1) {
            if (currentByte == 10 & previousByte == 13) {
                continue;
            }
            System.out.write(previousByte);
            previousByte = currentByte;
            currentByte = System.in.read();
        }
        System.out.write(previousByte);
        System.out.flush();
    }

}
