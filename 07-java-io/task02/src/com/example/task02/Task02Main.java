package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int last = System.in.read();
        int next;
        while (last > -1) {
            next = System.in.read();
            if (!(last == 13 && next == 10))
                System.out.write(last);
            last = next;
            System.out.flush();
        }
    }
}