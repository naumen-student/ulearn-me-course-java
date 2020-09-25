package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        int number = 0;
        while (x > 0) {
            number = x % 10;
            if (number % 2 == 1)
                return "FALSE";
            x = x / 10;
        }
            return "TRUE";
    }

    public static void main(String[] args) {

    }

}
