package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int next;
        int first = System.in.read();
        while (first != -1) {
            next = System.in.read();
            if (next != 10 || first != 13)
                System.out.write(first);
            first = next;
        }
        System.out.flush();
    }
}
