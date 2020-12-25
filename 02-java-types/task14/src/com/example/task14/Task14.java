package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String number = String.valueOf(value);
        String a = new StringBuilder(number).reverse().toString();

        return Integer.valueOf(a);
    }

    public static void main(String[] args) {

        int result = reverse(123456789);
        System.out.println(result);

    }


}
