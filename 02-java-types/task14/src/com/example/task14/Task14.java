package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        return Integer.parseInt(new StringBuilder(Integer.toString(value)).reverse().toString());
    }

    public static void main(String[] args) {
        int result = reverse(123456789);
        System.out.println(result);
    }
}
