package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int value1 = System.in.read();
        while (value1 != -1){
            int value2 = System.in.read();
            if(value1 == 13 && value2 == 10)
                continue;
            System.out.write(value1);
            value1 = value2;
        }
        System.out.flush();
    }
}
