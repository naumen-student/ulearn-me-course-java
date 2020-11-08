package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prev = System.in.read();
        int cur;
        while(prev != -1){
            cur = System.in.read();
            if(prev != 13 || cur != 10)
                System.out.write(prev);
            prev = cur;
        }
        System.out.flush();
    }
}
