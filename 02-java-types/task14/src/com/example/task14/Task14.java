package com.example.task14;

public class Task14 {
    public static int reverse(int value) {
        return Integer.valueOf(new StringBuilder(String.valueOf(value)).reverse().toString());
    }
}
