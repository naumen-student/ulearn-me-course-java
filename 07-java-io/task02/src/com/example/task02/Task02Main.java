package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prevBy = System.in.read();
        int currBy;
        while (prevBy >= 0) {
            currBy = System.in.read();
            if (currBy != 10  ||  prevBy != 13)
                System.out.write(prevBy);
            prevBy = currBy;
        }
        System.out.flush();
    }
}
