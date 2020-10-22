package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String  num =Integer.toString(value);
        String res =new StringBuilder(num).reverse().toString();
        return Integer.parseInt(res);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);
    }


}
