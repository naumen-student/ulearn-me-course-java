package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int firstByte = System.in.read();
        int secondByte = System.in.read();
        while(firstByte != -1){
            if(firstByte == 13 && secondByte == 10){
                System.out.write(secondByte);
                secondByte = System.in.read();
            }
            else{
                System.out.write(firstByte);
            }
            firstByte = secondByte;
            secondByte = System.in.read();
        }
    }
}
