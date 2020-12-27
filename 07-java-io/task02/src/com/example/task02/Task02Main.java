package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previous, next = System.in.read();
        while (next != -1) {
            previous = next;
            next = System.in.read();
            if (next == 10 && previous == 13) {
                continue;
            } else {
                System.out.write(previous);
            }
        }
    }
}
