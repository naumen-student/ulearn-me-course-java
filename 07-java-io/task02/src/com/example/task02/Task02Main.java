package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int currentByte = System.in.read();
        int nextByte = System.in.read();
        while (currentByte != -1){
            if (currentByte != 13 && nextByte != 10){
                System.out.write(currentByte);
            }
            currentByte = nextByte;
            System.out.flush();
        }
    }
}
