package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        byte[] allBytes = System.in.readAllBytes();
        for(int i = 0; i < allBytes.length; i++) {
            if (i == allBytes.length - 1) {
                System.out.write(allBytes[i]);
                break;
            }
            if (allBytes[i] == 13 && allBytes[i + 1] == 10) {
                System.out.write(10);
                i++;
            }
            else System.out.write(allBytes[i]);
        }
        System.out.flush();
    }
}
