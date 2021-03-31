package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String v = Integer.toString(value);
        return Integer.parseInt(new StringBuilder(v).reverse().toString());
    }

    public static void main(String[] args) {
    }


}
