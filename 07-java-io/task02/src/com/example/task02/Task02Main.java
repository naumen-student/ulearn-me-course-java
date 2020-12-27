package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prevByte = System.in.read();
        int currByte;
        while (prevByte > -1){
            currByte = System.in.read();
            if(prevByte != 13 || currByte != 10){
                System.out.write(prevByte);
            }
            prevByte = currByte;
            System.out.flush();
        }
    }
}
