package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int next;
        int current = System.in.read();

        while (current > -1) {
            next = System.in.read();

            if (!(current == 13 && next == 10)) {
                System.out.write(current);
            }

            current = next;
            System.out.flush();
        }
    }
}
