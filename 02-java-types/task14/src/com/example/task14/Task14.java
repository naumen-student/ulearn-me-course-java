package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String line = Integer.toString(value);
        line = new StringBuilder(line).reverse().toString();
        return Integer.parseInt(line);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);
    }


}
