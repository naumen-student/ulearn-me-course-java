package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String result = "";
        while (value != 0) {
            result += (value % 10);
            value /= 10;
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
    }


}
