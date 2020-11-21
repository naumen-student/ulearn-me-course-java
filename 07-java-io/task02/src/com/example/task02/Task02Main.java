package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main{
    public static void main(String[] args) throws IOException{
        InputStream systemIn = System.in;
        OutputStream systemOut = System.out;
        int previous = systemIn.read();
        while (previous != -1) {
            int current = systemIn.read();
            if ( previous == 13 && current == 10 ) {
                systemOut.write(current);
                previous = systemIn.read();
            } else {
                systemOut.write(previous);
                previous = current;
            }
        }
    }
}
