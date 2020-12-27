package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        StringBuilder str = new StringBuilder(Integer.toString(value));
        return Integer.parseInt(str.reverse().toString());
    }

    public static void main(String[] args) {
    }


}
