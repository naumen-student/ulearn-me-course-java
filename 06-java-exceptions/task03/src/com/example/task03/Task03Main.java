package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void throwCheckedException() throws Exception {
        throw new Exception();
    }
}