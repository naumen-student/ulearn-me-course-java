package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int first, next = System.in.read();
        while (next != -1) {
            first = next;
            next = System.in.read();
            if (first == 13 && next == 10) {
                continue;
            } else {
                System.out.write(first);
            }
        }
    }
}
