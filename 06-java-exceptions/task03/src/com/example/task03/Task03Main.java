package com.example.task03;

import java.io.IOException;

public class Task03Main {
    public static void main (String[]args) throws IOException {
        throwCheckedException();
    }

    public static void throwCheckedException () throws IOException {
        throw new IOException("");
    }
}