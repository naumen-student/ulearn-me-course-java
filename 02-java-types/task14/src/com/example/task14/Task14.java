package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String result = new StringBuilder(Integer.toString(value)).reverse().toString();
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
    }
}
