package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previous = System.in.read();
        int current;
        while (previous >= 0) {
            current = System.in.read();
            if (current != 10  ||  previous != 13)
                System.out.write(previous);
            previous = current;
        }
        System.out.flush();
    }
}
