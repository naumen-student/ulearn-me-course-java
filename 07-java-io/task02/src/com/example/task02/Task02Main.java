package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int next = System.in.read();
        int first = System.in.read();
        while (next != -1) {
            if (next != 13 || first != 10)
                System.out.write(next);
            next = first;
        }
        System.out.flush();
    }
}
