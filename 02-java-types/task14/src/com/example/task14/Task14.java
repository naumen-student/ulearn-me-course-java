package com.example.task14;

import org.junit.Assert;

public class Task14 {


    public static int reverse(int value) {
        String input = Integer.toString(value);
        if (input.isEmpty()) return 0;
        input = new StringBuilder(input).reverse().toString();
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
