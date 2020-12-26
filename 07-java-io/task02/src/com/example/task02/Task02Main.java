package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int actual  = System.in.read();
        int next;
        while(actual != -1) {
            next = System.in.read();
            if (!(actual == 13 && next == 10))
                System.out.write(actual);
            actual = next;
            System.out.flush();
        }
    }
}
