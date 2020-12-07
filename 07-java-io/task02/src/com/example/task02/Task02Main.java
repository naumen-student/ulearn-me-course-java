package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        int first = input.read();
        while (first > - 1){
            int second = input.read();
            if (second == 10 && first == 13) {
                System.out.write(second);
                first = input.read();
            } else {
                System.out.write(first);
                first = second;
            }
        }
    }
}
