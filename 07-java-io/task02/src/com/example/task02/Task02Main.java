package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previousB = System.in.read();
        int currentB;

        while(previousB != -1){
            currentB = System.in.read();
            if(currentB!=10 || previousB!=13){
                System.out.write(previousB);
            }
            previousB = currentB;
        }
        System.out.flush();
    }
}
