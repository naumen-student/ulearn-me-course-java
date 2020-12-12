package com.example.task03;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Task03Main {
    public static void main(String[] args) throws IOException {

        throwCheckedException();

    }

    public static void throwCheckedException() throws IOException {
        throw new IOException();

    }
}