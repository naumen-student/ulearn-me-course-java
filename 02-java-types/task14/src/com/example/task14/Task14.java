package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
       String b = new StringBuilder(value).reverse().toString();
       return Integer.parseInt(b);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
