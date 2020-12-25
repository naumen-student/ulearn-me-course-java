package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        return Integer.parseInt(new StringBuilder(String.valueOf(value)).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.print(reverse(12345));
    }
}
