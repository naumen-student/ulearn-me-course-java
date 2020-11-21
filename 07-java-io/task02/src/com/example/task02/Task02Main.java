package com.example.task02;
import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previousByte = System.in.read();

        while (previousByte != -1) {
            int currentByte = System.in.read();
            if (!(currentByte == 10 && previousByte == 13))
                System.out.write(previousByte);
            previousByte = currentByte;
        }
        System.out.flush();
    }
}
