package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        return new StringBuilder().append(c).toString().toUpperCase().charAt(0);
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');

        System.out.println(result);

    }

}
