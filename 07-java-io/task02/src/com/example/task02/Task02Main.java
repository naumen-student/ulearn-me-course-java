package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prev = System.in.read();
        int curr;
        while (prev != -1) {
            curr = System.in.read();
            if (prev != 13 || curr != 10)
                System.out.write(prev);
            prev = curr;
        }
        System.out.flush();
    }
}
