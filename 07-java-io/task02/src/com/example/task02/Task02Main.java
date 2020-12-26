package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int val = System.in.read();
        while (val != -1) {
            int next = System.in.read();
            if (!(val == 13 && next == 10))
                System.out.write(val);
            val = next;
            System.out.flush();
        }
    }
}
