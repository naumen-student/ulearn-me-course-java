package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int inValue = System.in.read();
        while (inValue != -1) {
            int next = System.in.read();
            if (inValue != 13 || next != 10)
                System.out.write(inValue);
            inValue = next;
        }
        System.out.flush();
    }
}
