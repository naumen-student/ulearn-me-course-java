package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        for(int i = 0; i < String.valueOf(x).length() + 1; i++) {
            int number = x % 10;
            if (number % 2 != 0)
                return "FALSE";
            x = x / 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
