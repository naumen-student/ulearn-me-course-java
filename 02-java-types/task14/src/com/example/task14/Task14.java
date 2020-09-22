package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        StringBuilder str  = new StringBuilder(Integer.toString(value));
        str.reverse();
        return  Integer.parseInt(str.toString());


    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
