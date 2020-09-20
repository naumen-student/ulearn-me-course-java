package com.example.task05;

public class Task05 {
    public static String solution(int x) {
        int integerPart = x;
        while (integerPart != 0) {
            if (integerPart % 2 != 0)
                return "FALSE";
            integerPart /= 10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(2468);
        System.out.println(result);
    }
}
