package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {
        return (char) (c - 0x20);
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');
        System.out.println(result);
    }

}