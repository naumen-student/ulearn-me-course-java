package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

       return (char) (c & 0x5f);

    }

    public static void main(String[] args) {

        char result = Character.toUpperCase('x');
        System.out.println(result);

    }

}
