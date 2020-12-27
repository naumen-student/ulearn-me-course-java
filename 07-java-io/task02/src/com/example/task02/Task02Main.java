package com.example.task02;

import java.io.IOException;
import static java.lang.System.out;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        byte[] allBytes = System.in.readAllBytes();
        for(int i = 0; i < allBytes.length; i++) {
            if (i != allBytes.length - 1) {
                if (allBytes[i] != 13 || allBytes[i + 1] != 10) {
                    out.write(allBytes[i]);
                } else {
                    out.write(10);
                    i++;
                }
            } else {
                out.write(allBytes[i]);
                break;
            }
        }
        out.flush();
    }
}
