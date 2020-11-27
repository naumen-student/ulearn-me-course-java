package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        int inputChar = inputStream.read();
        while (inputChar != -1) {
            int nextChar = inputStream.read();
            if (!(inputChar == 13 && nextChar == 10)) {
                System.out.write(inputChar);
            }
            inputChar = nextChar;
        }
        System.out.flush();
    }

}
