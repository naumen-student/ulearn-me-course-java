package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String num = new StringBuilder(Integer.toString(value)).reverse().toString();
        return Integer.parseInt(num);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
