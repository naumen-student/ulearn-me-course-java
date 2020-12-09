package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int current = System.in.read();
        while (current > -1){
            int next = System.in.read();
            if (!(next == 10 && current == 13))
                System.out.write(current);
            current = next;
            System.out.flush();
        }
    }
}
