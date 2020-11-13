package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {int in = System.in.read();
        while (in > -1) {
            int next = System.in.read();
            if (!(in == 13 && next == 10))
                System.out.write(in);
            in = next;
            System.out.flush();
        }
    }
}
