package com.example.task14;

public class Task14 {

    public static int reverse(int value) {
        StringBuilder builder = new StringBuilder(Integer.toString(value));
        return Integer.parseInt(builder.reverse().toString());
    }
}
