package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String reversed = Integer.toString(value);
        reversed = new StringBuilder(reversed).reverse().toString();
        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
