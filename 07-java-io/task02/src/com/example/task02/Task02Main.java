package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int thisByte = System.in.read();
        while (thisByte != -1) {
            int nextByte = System.in.read();
            if (!(thisByte == 13 && nextByte == 10)) {
                System.out.write(thisByte);
            }
            thisByte = nextByte;
        }
        System.out.flush();
    }
}
