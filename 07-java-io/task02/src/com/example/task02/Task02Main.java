package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int newData = System.in.read();
        int previous = -1;
        while (true) {
            if(newData == -1) break;
            previous = newData;
            newData = System.in.read();
            if (previous == 13 && newData == 10) {
                continue;
            } else {
                System.out.write(previous);
            }
        }
    }
}
