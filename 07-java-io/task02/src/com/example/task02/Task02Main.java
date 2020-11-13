package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int cur = System.in.read();
        while (cur > -1){
            int next = System.in.read();
            if (!(cur == 13 && next == 10)){
                System.out.write(cur);
            }
            cur = next;
            System.out.flush();
        }

    }
}
