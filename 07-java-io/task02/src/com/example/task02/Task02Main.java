package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int first = System.in.read ();
        while (first != -1) {
            int second = System.in.read ();
            if (!(first == 13 && second == 10))
                System.out.write (first);
            first = second;
            System.out.flush();
        }
    }
}
