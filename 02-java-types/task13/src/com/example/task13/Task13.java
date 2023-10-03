package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) throws IllegalArgumentException {
        if (c >= 'A' && c <= 'Z') return c;
        if (c < 'a' || c > 'z') throw new IllegalArgumentException("This is not an English letter: " + c);
        return Character.toUpperCase(c);
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');
        System.out.println(result);
    }

}
