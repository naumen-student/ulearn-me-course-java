package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String reverseValue = new StringBuilder(String.valueOf(value)).reverse().toString();

        return Integer.parseInt(reverseValue);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }
}
